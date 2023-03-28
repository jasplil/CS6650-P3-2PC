package server;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
	
	public int port;
	
	 public int[] servers = new int[5];
	 int[] ports = {1234, 2345, 3451, 1112, 1113};
	 
	public void ServerParseArgs(String[] args) throws Exception {
	 	 for (int i = 0 ; i < 5 ; i++)
	 	 {
	 	    servers[i] = ports[i];
	 	 }
		
	 }
	 
	 public static String getCurrentTimeStamp() {
	 	 return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(new Date());
	 }
	 
	 public void log(String message) {
	 	  System.out.println(getCurrentTimeStamp() + ": " + message);
	 }
	 
	 public void log(String format, Object[] objs)
	 {
		 System.out.println(String.format(format, objs));
	 }
}
