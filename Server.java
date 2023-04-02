
package chatting.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Server extends JFrame implements ActionListener{
JLabel lab1,back,Profile,Video;
JPanel p1;    
  ImageIcon img1,i4,i5,i6,i7,i8,i9,i10,i11,i12;
  //Image i2;
//constructor
    Server()
    {
        setLayout(null);
        getContentPane().setBackground(Color.blue);
        
        
        p1=new JPanel();
        p1.setBackground(Color.black); //or p1.setBackground(new Color(7,94,84)); for JVM
        add(p1);
        p1.setBounds(0,0,2000,60);//
        p1.setLayout(null);
      img1=new ImageIcon(ClassLoader.getSystemResource("icons/arrowleft1.png"));//arrow image 
        Image i2= img1.getImage().getScaledInstance(30,15,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      back = new JLabel(i3);
      back.setBounds(0,25,25,25);
      lab1 = new JLabel(img1);  
      p1.add(back);
      lab1.setBounds(10,0,25,25);
        p1.add(lab1);//we had to add it on pannel so we called p1 there
        
        //
         i4=new ImageIcon(ClassLoader.getSystemResource("icons/download.jpeg"));//User image 
        Image i5= i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);//Profile image
      ImageIcon i6 = new ImageIcon(i5);
      Profile = new JLabel(i6);
      Profile.setBounds(50,10,50,50);
      //lab1 = new JLabel(i4);  
      p1.add(Profile);
        //
        
         i7=new ImageIcon(ClassLoader.getSystemResource("icons/Video.png"));//Video img image 
        Image i8= i7.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
      ImageIcon i9 = new ImageIcon(i8);
      Video = new JLabel(i9);
      Video.setBounds(1300,10,30,50);
      //lab1 = new JLabel(img1);  
      p1.add(Video);
        //
        
        
        
        
         i10=new ImageIcon(ClassLoader.getSystemResource("icons/Video.png"));//Video img image 
        Image i11= i10.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
      ImageIcon i12 = new ImageIcon(i11);
      Video = new JLabel(i12);
      Video.setBounds(1300,10,30,50);
      //lab1 = new JLabel(img1);  
      p1.add(Video);
        
        
        back.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
            }
        });
        
        
        setVisible(true);
        setSize(2000,2000);
        //setLocation(200,50);
    }
    public void actionPerformed(ActionEvent ae){
        
    }

public static void main(String[]args)
{
new Server();
}
}