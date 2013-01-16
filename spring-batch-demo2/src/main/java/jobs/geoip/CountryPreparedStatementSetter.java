package jobs.geoip;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

public class CountryPreparedStatementSetter implements ItemPreparedStatementSetter<Country> {
    @Override
    public void setValues(Country country, PreparedStatement ps) throws SQLException {
        ps.setString(1, country.getCode());
        ps.setString(2, country.getName());
    }
}
