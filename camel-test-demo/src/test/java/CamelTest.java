import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelSpringJUnit4ClassRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@RunWith(CamelSpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CamelTest {
	@Autowired
    protected CamelContext camelContext;

	@Produce(uri = "direct:start")
    protected ProducerTemplate start;
	
	@EndpointInject(uri = "mock:result")
    protected MockEndpoint result;
	
	@Before
	public void reset() {
		result.reset();
	}
	
	@Test 
	public void testFilterWithExpectedHeader() throws Exception {
		String expectedBody = "<matched/>";

        result.expectedBodiesReceived(expectedBody);

        start.sendBodyAndHeader(expectedBody, "foo", "bar");

        result.assertIsSatisfied();
	}
	
	@Test 
	public void testFilterWithoutExpectedHeader() throws Exception {
		result.expectedMessageCount(0);

        start.sendBodyAndHeader("<notMatched/>", "foo", "notMatchedHeaderValue");

        result.assertIsSatisfied();
	}
}
