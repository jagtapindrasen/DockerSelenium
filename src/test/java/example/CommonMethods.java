package example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommonMethods {
	
	public static void runTerminal(String cmd, String text) {
		
		try {
			
			String path = System.getProperty("user.dir");
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c","cd \""+path+"\" && "+cmd);
			builder.redirectErrorStream(true);
			Process p = builder.start();
			Thread.sleep(15000);

//			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			String line;
//			while(true) {
//				line=r.readLine();
//				if (line.contains(text)) {
//					Thread.sleep(7000);
//					System.out.println(line);
//					break;
//				}
//			}
//			
			
		}catch (Exception e) {
		}
	}

}
