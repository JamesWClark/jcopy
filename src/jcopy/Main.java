/**
 * What does jcopy do?
 * 
 * It's a command line application with commands like this...
 * 		
 * 
 */
package jcopy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		Options options = new Options(args);
		if(options.list != null) {
			InputStream is = new FileInputStream(options.list);
            InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while((line = br.readLine()) != null) {
            	try {
	            	String source = options.source.getAbsolutePath();
	            	String destination = "\\\\" + line + "\\" + options.destination;
	            	System.out.println("copying from: " + source);
	            	System.out.println("copying to: " + destination);
	            	long start = System.currentTimeMillis();
	            	FileUtils.copyFile(options.source, new File(destination));
	            	long finish = System.currentTimeMillis();
	            	System.out.println("finished copying to " + line + " in " + (finish-start) + " ms\n");
            	} catch (Exception ex) {
                	System.out.println("failed: " + line);
                	ex.printStackTrace();
                	System.out.println();
                }
            }
		} else {
			FileUtils.copyDirectory(options.source, options.destination);
		}
	}
}
