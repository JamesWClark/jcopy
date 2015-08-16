package jcopy;

import ui.MainGUI;

public class Logger {
    
    public static void log(String msg) {
        MainGUI.txtLog.append(msg + "\n");
    }
}
