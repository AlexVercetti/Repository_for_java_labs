import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class LessMore implements ActionListener {
    Random random=new Random();
    JFrame frame=new JFrame();
    JFrame frame_2=new JFrame();
    JPanel title_panel=new JPanel();
    JLabel textfield_1=new JLabel();
    JLabel textfield_2=new JLabel();
    JLabel textfield_3=new JLabel();
    JLabel textfield_4=new JLabel();
    JLabel textfield_5=new JLabel();

    JButton button=new JButton();
    JTextField inputnumber_1=new JTextField();
    JTextField inputnumber_2=new JTextField();

    LessMore(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(242,196,196));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);


        textfield_1.setBackground(new Color(246,134,134));
        textfield_1.setForeground(new Color(255,255,255));
        textfield_1.setFont(new Font("Ink Free",Font.BOLD,30));
        textfield_1.setHorizontalAlignment(JLabel.CENTER);
        textfield_1.setText("Угадайка");
        textfield_1.setOpaque(true);


        textfield_2.setForeground(new Color(255,255,255));
        textfield_2.setFont(new Font("Ink Free",Font.BOLD,30));
        textfield_2.setBounds(0,300,400,40);
        textfield_2.setText("Загадывай число");

        textfield_3.setForeground(new Color(255,255,255));
        textfield_3.setFont(new Font("Ink Free",Font.BOLD,30));
        textfield_3.setBounds(0,350,200,40);
        textfield_3.setText("От");

        textfield_4.setForeground(new Color(255,255,255));
        textfield_4.setFont(new Font("Ink Free",Font.BOLD,30));
        textfield_4.setBounds(0,400,200,40);
        textfield_4.setText("До");

        inputnumber_1.setBounds(0,360,100,40);
        inputnumber_2.setBounds(0,410,100,40);
        inputnumber_1.setLayout(null);
        inputnumber_2.setLayout(null);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,50);
        title_panel.add(textfield_1);

        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(textfield_2);
        frame.add(textfield_3);
        frame.add(textfield_4);
        frame.add(inputnumber_1);
        frame.add(inputnumber_2);
    }

    public void search_number(){

    }

    public void answer(){

    }
    public void init_number(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
