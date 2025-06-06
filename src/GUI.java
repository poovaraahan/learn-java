import javax.swing.JOptionPane;//using JOptionPane class for GUI dialogs
// This is a placeholder for the GUI class.
public class GUI {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("Wazzup Beijing?");
        // Displays the message in a dialog box. You got to type it in.
        JOptionPane.showMessageDialog(null, "Arigato Kosaimasu, " + message + " Chan! ʕ•ᴥ•ʔﾉ♡");
        // Displays the response in a dialog box.
        int rating = Integer.parseInt(JOptionPane.showInputDialog("On a scale of 1 to 10, how much do you like this program?"));
        // .showInputDialog can only take String input, so we convert it to an integer, using Integer.parseInt()
        JOptionPane.showMessageDialog(null, "Just " + rating + "? Ain't that too young? ( ͠° ͟ʖ ͡°)🔪");
        // Displays the rating in a dialog box.
        double money = Double.parseDouble(JOptionPane.showInputDialog("FBI open up! You are watching too much anime! (Bribe the officer with decimal money)"));
        //This is the procedure to get a double input from the user.
        JOptionPane.showMessageDialog(null, + money + " dollars? .·°՞(¯□¯)՞°·. Is that all you have (≖_≖)?" +
                " Liar (｡•̀ ⤙ •́ ｡) !!! I'm not sorry, you chose this. Any last words?" +
                "\n\n" +
                "Just kidding, Goodbye, and one more thing. I am your father(╥‸╥)");
    } 
    
}
