package com.scpfb.beacon.mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyDataServiceTest {
	
	@Mock
	MyDatabase databaseMock;

	@Test
	public void testMyDataServiceConnection() {
		
		MyDataService myDataService  = new MyDataService(databaseMock);
		when(databaseMock.connectToLiveDB()).thenReturn(true);
		
		boolean check = myDataService.connect();
		
		assertTrue(check);
		
		verify(databaseMock).connectToLiveDB();
		

	}

}
