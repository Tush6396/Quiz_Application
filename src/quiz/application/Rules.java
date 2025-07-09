package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back, start;
    Rules(String name){
    this.name=name;
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
        JLabel heading=new JLabel("Welcome" +"  " + name + "  " + "to Simple Minds");
        heading.setBounds(50, 20, 700, 35);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(60, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rules.setText(
        "<html>"+
                "1. The quiz consists of 10 questions"+"<br><br>"+
                "2. All questions are multiple-choice questions (MCQs)"+"<br><br>"+
                "3. Each question have a time limit 15 second per question."+"<br><br>"+
                "4. Correct Answer:+10 point, Wrong Answer:0 point, No Answer:0 point"+"<br><br>"+
                "5. Once an answer is submitted, it cannot be changed."+"<br><br>"+
                "6. You may not be allowed to go back to previous question."+"<br><br>"+
                "7. The quiz can be attempted only once per user/session."+"<br><br>"+
                "8. Use of external sources (books, phones, internet) during the quiz is strictly prohibited."+"<br><br>"+
                "9. If times run out, the quiz will be automatically submitted."+"<br><br>"+
                "10. Result may be shown immediately after quiz submission."+"<br><br>"+
        "<html>"        
        );
        add(rules);
        
        
        back=new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.blue);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
    
        start=new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.blue);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        
    setSize(800, 650);
    setLocation(350, 100);
    setVisible(true);
}
public void actionPerformed( ActionEvent ae){
    if(ae.getSource()==start){
        setVisible(false);
       new Quiz(name);
}
    else{
        setVisible(false);
        new Login();
        }
}

public static void main(String[] args){
     new Rules("user");
}
}