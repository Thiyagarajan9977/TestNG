package org.cts.test.dataproviders;

import org.testng.annotations.DataProvider;

public class Datas {
		
	@DataProvider(name="login")
	public Object[][] getdata() {	
		Object[][] obj = new Object[][] {{"mano", "45678"},
									     {"Raja", "12345"},
									     {"Sekar","12354"}};
		return obj;
	}

}
