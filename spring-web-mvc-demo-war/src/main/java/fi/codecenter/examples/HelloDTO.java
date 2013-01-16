package fi.codecenter.examples;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloDTO {
	private String message;

	public HelloDTO() {
	}
	
	public HelloDTO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
