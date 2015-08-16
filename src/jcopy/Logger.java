package jcopy;

import java.io.IOException;
import java.io.PrintWriter;
import ui.MainGUI;

public class Logger {
    
    public static void log(String msg) {
        msg = msg + "\n";
        MainGUI.txtLog.append(msg);
        try {
            PrintWriter out = new PrintWriter("jcopy.log");
            out.append(msg);
            out.close();
        } catch (IOException ex) {
            MainGUI.txtLog.append("\n\n" + ex.getMessage() + "\n\n");
        }
    }
}
