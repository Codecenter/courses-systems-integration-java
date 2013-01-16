package jobs.geoip;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class GeoIPJobTest {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
    @Autowired
    protected JobLauncherTestUtils jobLauncherTestUtils;

    @Before
    public void createSpringBatchDatabaseSchema() throws Exception {
        String sql = readResourceAsString("/org/springframework/batch/core/schema-hsqldb.sql");
        jdbcTemplate.update(sql);
    }
    
    @Before
    public void createIPGeolocationDatabaseSchema() throws Exception {
        String sql = readResourceAsString("/jobs/geoip/schema-create-hsqldb.sql");
        jdbcTemplate.update(sql);
    }

    protected String readResourceAsString(String resource) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(resource),
                "UTF-8"));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append('\n');
        }
        return content.toString();
    }

    @After
    public void dropSpringBatchDatabaseSchema() throws Exception {
        jdbcTemplate.update(readResourceAsString("/org/springframework/batch/core/schema-drop-hsqldb.sql"));
    }    
    
    @Test
    public void testJob() throws Exception {
    	Map<String,JobParameter> jobParamsMap = new HashMap<String,JobParameter>();
    	jobParamsMap.put("geoIpFileSpec", new JobParameter("classpath:jobs/geoip/*.csv"));
    	JobParameters jobParams = new JobParameters(jobParamsMap);
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParams);

        assertEquals(ExitStatus.COMPLETED, jobExecution.getExitStatus());

        assertEquals(
            1,
            jdbcTemplate
                    .queryForInt("select count(*) from countries where code = 'RU' and name = 'Russian Federation'"));

        assertEquals(
            1,
            jdbcTemplate
                    .queryForInt("select count(*) from ip_geolocations where address_start = '5.43.240.0' and address_end = '5.43.247.255' and country_code = 'RU'"));
    }

    @After
    public void dropIPGeolocationsDatabaseSchema() throws Exception {
        String sql = readResourceAsString("/jobs/geoip/schema-drop-hsqldb.sql");
        jdbcTemplate.update(sql);
    }
}
