/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.errors;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Porras
 */
public class DataException extends Exception{
    
    public DataException()
    {
        super("Unknown Error");
    }
    
    public DataException(String message)
    {
        super(message);
    } 
    
    public void infoError(String titleBar,DataException error,JFrame frame)
    {
        JOptionPane message_window = new JOptionPane();
        message_window.showMessageDialog(frame, error.getMessage(), "Dialog: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        message_window.setVisible(true);
    }
}
