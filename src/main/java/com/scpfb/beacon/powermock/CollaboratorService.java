package com.scpfb.beacon.powermock;

public class CollaboratorService {

	public String greetings() {

		CollaboratoreWithFinalMethods collabortor = new CollaboratoreWithFinalMethods();
		String message = collabortor.helloMethod();

		return message;

	}

}
