package gui;
import javax.swing.*;

class swingApplication{
    public static void main(String[] args) {
        JFrame jframe = new JFrame("mainWindow");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400,400);
        jframe.setVisible(true);

        JButton buttonOne = new JButton("click", null);
        buttonOne.setBounds(130, 100, 10, 10);

        jframe.add(buttonOne);
    }
}
