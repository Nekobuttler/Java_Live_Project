
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//gui interface


public class Stream implements ActionListener {
    
    int count =0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JTextField input;
    String a="";
    public Stream(){
   
    JButton button=new JButton("Click on me");    
    JButton button2=new JButton("Send");
    
    
    label =new JLabel("Number of clicks : 0");
    frame =new JFrame();
    panel =new JPanel();
    input=new JTextField("");
    
    
    
    button2.addActionListener(this);
    button.addActionListener(this);
    panel.setBorder(BorderFactory.createEmptyBorder(300,300,100,300));//top,bottom,left,right\
    panel.setLayout(new GridLayout(0,1));//search about this
    panel.add(button);
    panel.add(label);
    panel.add(input);
    panel.add(button2);
    
    frame.add(panel,BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Streamer service");
    frame.pack();
    frame.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("Number of clicks : "+count);
    }
   
    public void actionPerformed2(ActionEvent e){
        a=input.getText();
        System.out.println(a);
    }
    
}
