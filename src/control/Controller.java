package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import model.InvoiceHeader;
import model.Item;
import view.InvoiceFream;

public class Controller implements ActionListener {
    private InvoiceFream fream;

    public Controller(InvoiceFream fream) {
        this.fream = fream;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       switch( e.getActionCommand()){
           case "Creat New Invoice":
               newInvoice();
               break;
           case "Delete Invoice":
               deleteInvoice();
               break;
           case "Save":
               saveItem();
               break;
           case "Delete":
               deleteItem();
               break;
           case "load file":
               fream.loadFile();
               break;
           case "save file":
               saveFile();
               break;
       }
    }

    private void newInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteItem()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    private void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
