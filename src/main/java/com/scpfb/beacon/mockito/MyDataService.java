package com.scpfb.beacon.mockito;

public class MyDataService {

	MyDatabase database;

	public MyDataService(MyDatabase database) {
		this.database = database;
	}

	public boolean connect() {
		return database.connectToLiveDB();
	}

	public static void main(String[] args) {
		MyDatabase database = new MyDatabase();

		MyDataService dataService = new MyDataService(database);
		System.out.println(dataService.connect());
	}
}
