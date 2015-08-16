package jcopy;

import java.io.File;

public class Options {

	public File source;
	public File destination;
	public File list; // a list of computer netbios names
	public Options(String[] args) {
		for(int i = 0; i < args.length; i++) {
			if(args[i].toLowerCase().equals("-source") || args[i].equals("-s"))
				source = new File(args[i + 1]);
			if(args[i].toLowerCase().equals("-dest") || args[i].equals("-destination") || args[i].equals("-d"))
				destination = new File(args[i + 1]);
			if(args[i].toLowerCase().equals("-list"))
				list = new File(args[i + 1]);
		}
	}
}
