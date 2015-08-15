package ui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.TransferHandler;

//http://stackoverflow.com/questions/13597233/how-to-drag-and-drop-files-from-a-directory-in-java
public class TxtTransferHandler extends TransferHandler {
    private JList list;
    
    public TxtTransferHandler(JList list) {
        this.list = list;
    }
    
    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }
    
    public boolean canImport(TransferSupport support) {
        return support.isDataFlavorSupported(DataFlavor.javaFileListFlavor);
    }
    
    public boolean importData(TransferSupport support) {
        try {
            List data = (List) support.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
            if(data.size() < 1) {
                return false;
            }
            
            DefaultListModel listModel = new DefaultListModel();
            for(Object item : data) {
                File file = (File) item;
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        listModel.addElement(line);
                    }
                }
            }
            
            list.setModel(listModel);
            return true;
            
        } catch (UnsupportedFlavorException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }
}
