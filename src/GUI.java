import javax.swing.JOptionPane;//using JOptionPane class for GUI dialogs
// This is a placeholder for the GUI class.
public class GUI {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("Wazzup Beijing?");
        // Displays the message in a dialog box. You got to type it in.
        JOptionPane.showMessageDialog(null, "Arigato Kosaimasu, " + message + " Chan! ʕ•ᴥ•ʔﾉ♡");
        // Displays the response in a dialog box.
        System.exit(0);
    }
    
}
