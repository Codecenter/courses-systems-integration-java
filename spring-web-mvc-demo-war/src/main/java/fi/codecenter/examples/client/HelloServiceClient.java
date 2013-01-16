package fi.codecenter.examples.client;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

import fi.codecenter.examples.HelloDTO;

public class HelloServiceClient {
	public static final String URL = "http://localhost:8080/spring-web-mvc-demo-war/rest/hello.xml";
	
	public static void main(String[] args) throws Exception {
		RestTemplate template = createRestTemplate();
		HelloDTO helloDTO = template.getForObject(URL, HelloDTO.class);
		System.out.println(helloDTO.getMessage());

		Map<String,String> params = new TreeMap<String,String>();
		params.put("name", "Thomas");
		helloDTO = template.getForObject(URL, HelloDTO.class, params);
		System.out.println(helloDTO.getMessage());
	}
	
	protected static RestTemplate createRestTemplate() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(HelloDTO.class);
		
		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new MarshallingHttpMessageConverter(marshaller));
		return template;
	}
}