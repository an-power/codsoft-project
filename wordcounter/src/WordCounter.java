import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter extends JFrame implements ActionListener {
    JButton b;
    WordCounter() {
        b=new JButton("Word Counter");
        b.setBounds(90,150,150,30);
        b.addActionListener(this);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b) {
            String input = JOptionPane.showInputDialog("Enter text");
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter correct word");
            }else {
                String[] output = input.split(",|.\\s");
                JOptionPane.showMessageDialog(this, "Total word " + output.length);
            }
        }
    }
    public static void main(String[] args) {
        new WordCounter();
    }
}