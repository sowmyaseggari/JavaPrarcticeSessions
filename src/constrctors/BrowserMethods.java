package constrctors;

import java.util.ArrayList;

public class BrowserMethods 
{

	public static void main(String[] args) 
	{
		BrowserMethods bm=new BrowserMethods();
		String s1=bm.getBrowserName();
		String s2=bm.getVendorName();
		int s3=bm.getCurrentVersion();
		System.out.println(s1+ " "+s2+ " "+s3);
		ArrayList<String> s4=bm.getListofplugins();
		System.out.println(s4);
	}
    public String getBrowserName(){
    	String BrowserName="chrome";
    	return BrowserName ;
    }
    public String getVendorName()
    {
    	String VendorName="abc";
    	return VendorName;
    }
    public int getCurrentVersion(){
    	int currentVersion=67;
    	return currentVersion;
    }
    public ArrayList<String> getListofplugins(){
    	ArrayList<String>plugins=new ArrayList<String>();
    	plugins.add("xpath");
    	plugins.add("chromepath");
    	return plugins;
    	
    }
}
