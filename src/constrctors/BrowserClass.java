package constrctors;

import java.util.ArrayList;

public class BrowserClass 
{
	String browserName;
    String vendorName;
    int currentVersion;
    ArrayList<String>Listofplugins;
    
	public BrowserClass(String vendorName, int currentVersion) {
		
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public BrowserClass(String browserName, String vendorName,int currentVersion) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public BrowserClass(String browserName, String vendorName) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
	}



	public BrowserClass(String browserName, String vendorName,int currentVersion, ArrayList<String> listofplugins) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		Listofplugins = listofplugins;
	}
	public BrowserClass(int currentVersion) {
		
		this.currentVersion = currentVersion;
	}
	public BrowserClass(String browserName) {
		
		this.browserName = browserName;
	}

	public static void main(String[] args)
	{
		ArrayList<String>plugins=new ArrayList<String>();
		plugins.add("chromepath");
		plugins.add("xpath");
	
		BrowserClass  br=new BrowserClass("FireFox");
		System.out.println(br.browserName);
		BrowserClass  br1=new BrowserClass("FireFox","abc");
		System.out.println(br1.browserName+ " "+br1.vendorName);
		BrowserClass  br2=new BrowserClass("chrome","abc",86);
		System.out.println(br2.browserName+ " "+br2.vendorName+ " "+br2.currentVersion);
		BrowserClass  br3=new BrowserClass("chrome","abc",86,plugins);
		System.out.println(br3.browserName+ " "+br3.vendorName+ " "+br3.currentVersion+ " "+br3.Listofplugins);
		
		
		
		
		
		
		
		

	}

}
