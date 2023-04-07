import java.io.*;
import javax.swing.*;
 

 
// Main class
class Main {
 
    // Main driver method
    public static void main(String[] args)
    {
        testMain();
    }



    public static void testMain()
    {
         JFrame frame
            = new JFrame("counter"); // creating instance of JFrame
        JLabel myLabel = new JLabel();
        myLabel.setText("Counter");

        JPanel myPanel = new JPanel();
        JTextArea myTextArea = new JTextArea(10, 10);
        // text te = new text();
        // add label to panel
        myPanel.add(myLabel);
        myPanel.add(myTextArea);


        JButton button = new JButton(
            "+"); // creating instance of

        JButton button2 = new JButton(
            "-"); // creating instance of
                                   // JButton
        button.setBounds(
            100, 200, 100,
            50); // x axis, y axis, width, height

        button2.setBounds(
            250, 200, 100,
            50); // x axis, y axis, width, height
        // button2.addActionListener(te);
        // frame.add(button); // adding button in JFrame
        // frame.add(button2); // adding button in JFrame

        myPanel.add(button2);
        frame.add(myPanel); // adding button in JFrame
        
 
        frame.setSize(500, 600); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); // making the frame visible
        frame.show();
    }

    public static void testLabel()
    {
          // create a new frame to store text field and button
        JFrame f = new JFrame("label");
 
        // create a label to display text
        JLabel l = new JLabel();
 
        // add text to label
        l.setText("label text");
 
        // create a panel
        JPanel p = new JPanel();
 
        // add label to panel
        p.add(l);
 
        // add panel to frame
        f.add(p);
 
        // set the size of frame
        f.setSize(300, 300);
 
        f.show();
 
    }
}




class button  {
    // button() {
    //     Frame f = new Frame();
    //     Button b1 = new Button("OK");
    //     b1.setBounds(100, 50, 50, 50);
    //     f.add(b1);
    //     Button b2 = new Button("SUBMIT");
    //     b2.setBounds(100, 101, 50, 50);
    //     f.add(b2);
    //     Button b3 = new Button("CANCLE");
    //     b3.setBounds(100, 150, 80, 50);
    //     f.add(b3);
    //     f.setSize(500, 500);
    //     f.setLayout(null);
    //     f.setVisible(true);
    // }
 }