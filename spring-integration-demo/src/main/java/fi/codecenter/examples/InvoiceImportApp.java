package fi.codecenter.examples;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvoiceImportApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext(
				"META-INF/spring/integration/InvoiceImport.xml");
		context.registerShutdownHook(); 
	}
}
