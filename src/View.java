//****************************************************************************************
// CLASS: View (View.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2021
// Project Number: 4
//
// TEAM NAME: Y
// AUTHOR 1: Teodoro Salgado, tjsalgad, tsalgado96@gmail.com
// AUTHOR 2: Isaac Pena, ipena5, ippenaisaac@gmail.com
// AUTHOR 3: Stephen Elledge, saelledg, saelledg@asu.edu
// ****************************************************************************************

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The View class implements the GUI.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 180;

    // Declare instance variables
    private JButton         mClearButton;
    private JButton         mEvalButton;
    private JTextField      mInputText;
    private JButton         mExitButton;
    private Main            mMain;
    private JLabel          mResultLabel;

    /**
     * View()
     *
     * The View constructor creates the GUI interface and makes the frame visible at the end.
     */
    public View(Main pMain) {
        // Save a reference to the Main object pMain in mMain.
        mMain = pMain;

        // PSEUDOCODE:
        // Declare and create a JPanel named panelLabel using the default FlowLayout layout manager.
        JPanel panelLabel = new JPanel();
        // Create mResultLabel as a JLabel initialized to the empty string ""
        mResultLabel = new JLabel("");
        // Add mResultLabel to panelLabel
        panelLabel.add(mResultLabel);

        // PSEUDOCODE:
        // Declare and create a JPanel named panelInput using the default FlowLayout layout manager.
        JPanel panelInput = new JPanel();
        // Create mInputText as a JTextField initialized to 40 columns wide
        mInputText = new JTextField(40);
        // Add mInputText to panelInput
        panelInput.add(mInputText);


        // PSEUDOCODE:
        // Create a JPanel named panelButtons using FlowLayout.
        JPanel panelButtons = new JPanel();
        // Create the Clear button mClearButton.
        mClearButton = new JButton("Clear");
        // Make this View the action listener for mClearButton.
        mClearButton.addActionListener(this);
        // Add the  Clear button to the panel.
        panelButtons.add(mClearButton);
        // Repeat the three above statements for the Evaluate button.
        mEvalButton = new JButton("Evaluate");
        mEvalButton.addActionListener(this);
        panelButtons.add(mEvalButton);
        // Repeat the three above statements for the Exit button.
        mExitButton = new JButton("Exit");
        mExitButton.addActionListener(this);
        panelButtons.add(mExitButton);


        // PSEUDOCODE
        // Create a JPanel named panelMain using a vertical BoxLayout.
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        // Add some vertical glue to panelMain
        panelMain.add(Box.createVerticalGlue());
        // Add panelLabel to panelMain.
        panelMain.add(panelLabel);
        // Add panelInput to panelMain.
        panelMain.add(panelInput);
        // Add panelButtons to panelMain.
        panelMain.add(panelButtons);


        setTitle("Kalkutron-9001");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelMain);
        setVisible(true);
    }

    /**
     * actionPerformed()
     *
     * Called when one of the JButtons is clicked. Detects which button was clicked and handles it.
     *
     * PSEUDOCODE:
     * If the source of the event was mClearbutton Then
     *     Call clear()
     * ElseIf the source of the event was mEvalButton Then
     *     Call evaluate()
     * ElseIf the source of the event was mExitButton Then
     *     Call exit() on mMain.
     * End If
     */
    @Override
    public void actionPerformed(ActionEvent pEvent){
        // If the source of the event was mClearButton
        if (pEvent.getSource().equals(mClearButton)){
            clear();
        }
        // Else if the source of the event was mEvalButton
        else if (pEvent.getSource().equals(mEvalButton)){
            evaluate();
        }
        // Else if the source of the event was mExitButton
        else if (pEvent.getSource().equals(mExitButton)){
            mMain.exit();
        }
    }

    /**
     * clear() is called when the Clear button is clicked. Set the text in mInputText and mResultLabel to the
     * empty strings "".
     */
    private void clear(){
        mInputText.setText("");
        mResultLabel.setText("");
    }

    /**
     * evaluate() is called when the Evaluate button is clicked.
     *
     * PSEUDOCODE:
     * Retrieve the text string from mInputText
     * Declare and create an Expression object named expr passing the text string to the ctor
     * Call expr.evaluate() and assign the return value a Double object named result
     * Display result in mResultLabel (call toString on result)
     */
    private void evaluate(){
        // Retrieve the text string from mInputText
        // Declare and create an Expression object named expr passing the text string to the ctor
        Expression expr = new Expression(mInputText.getText());
        // Call expr.evaluate() and assign the return value a Double object named result
        Double result = expr.evaluate();
        // Display result in mResultLabel (call toString on result)
        mResultLabel.setText(result.toString());
    }

    /**
     * messageBox()
     *
     * Note that passing 'this' as the first arg causes the View to be the parent of the message
     * dialog window, so the dialog will be centered in the middle of the View. If we pass 'null'
     * as the argument, then the dialog does not have a parent frame and will be centered in the
     * middle of the display.
     */
    public void messageBox(String pMessage) {
        JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
    }

}
