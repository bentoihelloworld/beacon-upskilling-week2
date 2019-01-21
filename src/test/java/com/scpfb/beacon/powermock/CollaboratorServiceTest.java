package com.scpfb.beacon.powermock;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({CollaboratoreWithFinalMethods.class, CollaboratorService.class})
public class CollaboratorServiceTest {
	
	@Mock
	CollaboratoreWithFinalMethods mock;

	@Test
	public void testFinalMethodReturnString() throws Exception {
	  whenNew(CollaboratoreWithFinalMethods.class).withAnyArguments().thenReturn(mock);
	  
	  CollaboratorService collaboratorService = new CollaboratorService();
	  when(mock.helloMethod()).thenReturn("Hello World!");
	  
	  String message = collaboratorService.greetings();
	  verify(mock).helloMethod();
	  
	  assertEquals("Hello World!", message);
	  
	}

}
