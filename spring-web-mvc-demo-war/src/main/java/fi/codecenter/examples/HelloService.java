package fi.codecenter.examples;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloService {
	@RequestMapping("/hello")
	public HelloDTO sayHello(
			@RequestParam(value = "name", required = false) String name) {
		StringBuilder response = new StringBuilder();
		response.append("Hello");
		if (StringUtils.hasText(name)) {
			response.append(' ');
			response.append(name);
		}
		response.append('!');

		System.out.printf("Response from sayHello: %s\n", response);
		return new HelloDTO(response.toString());
	}
}
