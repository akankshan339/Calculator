import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener {
    double n1=0,n2=0,result=0;
    int calculation;
    
    JFrame frame=new JFrame("Akanksha ka Calculator"); //making obj of JFrame class frame
    JLabel label=new JLabel();  //making obj of JLabel class label
    JTextField textfield =new JTextField();
    JRadioButton onradiobutton=new JRadioButton("on");
    JRadioButton offradiobutton=new JRadioButton("off");
    JButton zero=new JButton("0");
    JButton one=new JButton("1");
    JButton two=new JButton("2");
    JButton three=new JButton("3");
    JButton four=new JButton("4");
    JButton five=new JButton("5");
    JButton six=new JButton("6");
    JButton seven=new JButton("7");
    JButton eight=new JButton("8");
    JButton nine=new JButton("9");
    JButton dot=new JButton(".");
    JButton equal=new JButton("=");
    JButton clear=new JButton("C");
    JButton del=new JButton("DEL");
    JButton pow=new JButton("x^Y");
    JButton mul=new JButton("X");
    JButton div=new JButton("/");
    JButton add=new JButton("+");
    JButton sub=new JButton("-");
    JButton perc=new JButton("%");
    JButton sq=new JButton("x\u00B2");  //make button obj sq from JButton class for square
    JButton reci=new JButton("1/X");
    JButton sqrt=new JButton("\u221A");     
    
    calculator()
    {
        prepareGui();
        applyComponents();
        addActionEvent();
        
    }
    public void prepareGui()
    {
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null); //set location of frae at center
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        }
        
        public void applyComponents()
        {
            label.setBounds(250,0,50,50);
            label.setForeground(Color.white);
            frame.add(label);
            
            textfield.setBounds(10,40,270,40); //start from 10 from left  upto 270 to right 30 from above and 50 width
            textfield.setFont(new Font("Arial",Font.BOLD,20));
            textfield.setEditable(false);
            textfield.setHorizontalAlignment(SwingConstants.RIGHT);
            frame.add(textfield);
            
            onradiobutton.setBounds(10,95,60,40);
            onradiobutton.setSelected(true);
            onradiobutton.setFont(new Font("Arial",Font.BOLD,14));
            onradiobutton.setBackground(Color.black);
            onradiobutton.setForeground(Color.white);
            onradiobutton.setFocusable(false);
            frame.add(onradiobutton);
            
            offradiobutton.setBounds(10,120,60,40);
            offradiobutton.setSelected(false);
            offradiobutton.setFont(new Font("Arial",Font.BOLD,14));
            offradiobutton.setBackground(Color.black);
            offradiobutton.setForeground(Color.white);
            offradiobutton.setFocusable(false);
            frame.add(offradiobutton);
            
            ButtonGroup buttongp=new ButtonGroup();
            buttongp.add(onradiobutton);
            buttongp.add(offradiobutton);
                        
            seven.setBounds(10,230,60,40);
            seven.setFont(new Font("Arial",Font.BOLD,20));
            seven.setFocusable(false);
            frame.add(seven);
            
            eight.setBounds(80,230,60,40);
            eight.setFont(new Font("Arial",Font.BOLD,20));
            eight.setFocusable(false);
            frame.add(eight);
            
            nine.setBounds(150,230,60,40);
            nine.setFont(new Font("Arial",Font.BOLD,20));
            nine.setFocusable(false);
            frame.add(nine);

            four.setBounds(10,290,60,40);
            four.setFont(new Font("Arial",Font.BOLD,20));
            four.setFocusable(false);
            frame.add(four);
            
            five.setBounds(80,290,60,40);
            five.setFont(new Font("Arial",Font.BOLD,20));
            five.setFocusable(false);
            frame.add(five);
            
            six.setBounds(150,290,60,40);
            six.setFont(new Font("Arial",Font.BOLD,20));
            six.setFocusable(false);
            frame.add(six);
            
            one.setBounds(10,350,60,40);
            one.setFont(new Font("Arial",Font.BOLD,20));
            one.setFocusable(false);
            frame.add(one);
            
            two.setBounds(80,350,60,40);
            two.setFont(new Font("Arial",Font.BOLD,20));
            two.setFocusable(false);
            frame.add(two);
            
            three.setBounds(150,350,60,40);
            three.setFont(new Font("Arial",Font.BOLD,20));
            three.setFocusable(false);
            frame.add(three);
            
            zero.setBounds(10,410,60,40);
            zero.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(zero);
            
            perc.setBounds(80,410,60,40);
            perc.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(perc);
            
            dot.setBounds(150,410,60,40);
            dot.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(dot);
            
            equal.setBounds(220,410,60,40);
            equal.setFont(new Font("Arial",Font.BOLD,20));
            equal.setBackground(new Color(239,188,2));
            frame.add(equal);
            
            pow.setBounds(220,110,60,40);
            pow.setFont(new Font("Arial",Font.BOLD,12));
            frame.add(pow);
            
            div.setBounds(220,170,60,40);
            div.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(div);
            
            mul.setBounds(220,230,60,40);
            mul.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(mul);
            
            sub.setBounds(220,290,60,40);
            sub.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(sub);
            
            add.setBounds(220,350,60,40);
            add.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(add);
            
            sqrt.setBounds(10,170,60,40);
            sqrt.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(sqrt);
        
            sq.setBounds(80,170,60,40);
            sq.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(sq);
            
            reci.setBounds(150,170,60,40);
            reci.setFont(new Font("Arial",Font.BOLD,15));
            frame.add(reci);
            
            clear.setBounds(80,110,60,40);
            clear.setFont(new Font("Arial",Font.BOLD,20));
            clear.setBackground(Color.red);
            clear.setForeground(Color.white);
            frame.add(clear);
            
            del.setBounds(150,110,60,40);
            del.setFont(new Font("Arial",Font.BOLD,12));
            del.setBackground(Color.red);
            del.setForeground(Color.white);
            frame.add(del);
            }
            
            public void addActionEvent()
            {
                onradiobutton.addActionListener(this);
                offradiobutton.addActionListener(this);
                zero.addActionListener(this);
                one.addActionListener(this);
                two.addActionListener(this);
                three.addActionListener(this);
                four.addActionListener(this);
                five.addActionListener(this);
                six.addActionListener(this);
                seven.addActionListener(this);
                eight.addActionListener(this);
                nine.addActionListener(this);
                add.addActionListener(this);
                sub.addActionListener(this);
                mul.addActionListener(this);
                div.addActionListener(this);
                perc.addActionListener(this);
                sq.addActionListener(this);
                sqrt.addActionListener(this);
                reci.addActionListener(this);
                dot.addActionListener(this);
                del.addActionListener(this);
                clear.addActionListener(this);
                pow.addActionListener(this);
                equal.addActionListener(this);
                
            }
public static void main(String args[])
{
    calculator calc=new calculator();
}
   @Override 
   public void actionPerformed(ActionEvent e)
   {
       Object source=e.getSource();
       if(source == onradiobutton)
       enable();
       else if(source == offradiobutton)
       disable();
       else if(source == clear)
       {
       label.setText("");
       textfield.setText("");
    }
       else if(source == del)
       {
           int len=textfield.getText().length();
           int no=len-1;
           if(len > 0)
           {
               StringBuilder back =new StringBuilder(textfield.getText());
               back.deleteCharAt(no);
               textfield.setText(back.toString());
           }
           if(textfield.getText().endsWith("")) {
               label.setText("");
           }
        }
           else if(source == zero)
           {
               if(textfield.getText().equals("0"))
                   return ;
               else
               textfield.setText(textfield.getText()+"0");
            }
            else if(source == one)
           {
               textfield.setText(textfield.getText()+"1");
            }
            else if(source == two)
           {
               textfield.setText(textfield.getText()+"2");
            }
            else if(source == three)
           {
               textfield.setText(textfield.getText()+"3");
            }
            else if(source == four)
           {
               textfield.setText(textfield.getText()+"4");
            }
            else if(source == five)
           {
               textfield.setText(textfield.getText()+"5");
            }
            else if(source == six)
           {
               textfield.setText(textfield.getText()+"6");
            }
            else if(source == seven)
           {
               textfield.setText(textfield.getText()+"7");
            }
            else if(source == eight)
           {
               textfield.setText(textfield.getText()+"8");
            }
            else if(source == nine)
           {
               textfield.setText(textfield.getText()+"9");
            }
            else if(source == dot)
           {
               if(textfield.getText().contains("."))
                   return; 
               else
                   textfield.setText(textfield.getText()+".");
            }
             else if(source == add)
           {
               String str=textfield.getText();
               n1=Double.parseDouble(textfield.getText());
               calculation=1;
               textfield.setText("");
               label.setText(str + "+");
            }
                else if(source == sub)
           {
               String str=textfield.getText();
               n1=Double.parseDouble(textfield.getText());
               calculation=2;
               textfield.setText("");
               label.setText(str + "-");
            }
               else if(source == mul)
           {
               String str=textfield.getText();
               n1=Double.parseDouble(textfield.getText());
               calculation=3;
               textfield.setText("");
               label.setText(str + "X");
            }
              else if(source == div)
           {
               String str=textfield.getText();
               n1=Double.parseDouble(textfield.getText());
               calculation=4;
               textfield.setText("");
               label.setText(str + "/");
            }
            else if(source == perc)
            {
               String str=textfield.getText();
               n1=Double.parseDouble(textfield.getText());
               calculation=5;
               textfield.setText("");
               label.setText(str + "%");
            }
             else if(source == pow)
            {
              String str=textfield.getText();
              n1=Double.parseDouble(textfield.getText());
              calculation=6;
               textfield.setText("");
               label.setText(str + "^");
            }
             else if(source == sq)
           {
               n1=Double.parseDouble(textfield.getText());
               double square=Math.pow(n1,2);
               String s=Double.toString(square);
               if(s.endsWith(".0"))
                   textfield.setText(s.replace(".0" , ""));
               else
                   textfield.setText(s);
            }
              else if(source == sqrt)
            {
              n1=Double.parseDouble(textfield.getText());
               double squareroot=Math.sqrt(n1);
               textfield.setText(Double.toString(squareroot));
            }
              /* else if(source == pow)
            {
              n1=Double.parseDouble(textfield.getText());
              n2=Double.parseDouble(textfield.getText());
               double power=Math.pow(n1,n2);
               textfield.setText(Double.toString(power));
            }*/
            else if(source == reci)
            {
                n1=Double.parseDouble(textfield.getText());
               double recipro=1/n1;
               String s=Double.toString(recipro);
               if(s.endsWith(".0"))
                   textfield.setText(s.replace(".0" , ""));
               else
                   textfield.setText(s);
            }
             else if(source == equal)
            {
                n2=Double.parseDouble(textfield.getText());
                switch(calculation)
                {
                    case 1:
                        result=n1+n2;
                        break;
                    case 2:
                        result=n1-n2;
                        break;
                    case 3:
                        result=n1*n2;
                        break;
                    case 4:
                        result=n1/n2;
                        break;
                    case 5:
                        result=(n1/100)*n2;
                        break;
                    case 6:
                        result=Math.pow(n1,n2);
                        break;
                }
                if(Double.toString(result).endsWith(".0"))
                    textfield.setText(Double.toString(result).replace(".0" , ""));
                else
                {
                    textfield.setText(Double.toString(result));
                }
                label.setText("");
                n1=result;
            }
                
}
   
    public void enable()
   {
       onradiobutton.setEnabled(false);
       offradiobutton.setEnabled(true);
       textfield.setEnabled(true);
       label.setEnabled(true);
       zero.setEnabled(true);
       one.setEnabled(true);
       two.setEnabled(true);
       three.setEnabled(true);
       four.setEnabled(true);
       five.setEnabled(true);
       six.setEnabled(true);
       seven.setEnabled(true);
       eight.setEnabled(true);
       nine.setEnabled(true);
       div.setEnabled(true);
       mul.setEnabled(true);
       sub.setEnabled(true);
       add.setEnabled(true);
       perc.setEnabled(true);
       sq.setEnabled(true);
       sqrt.setEnabled(true);
       reci.setEnabled(true);
       dot.setEnabled(true);
       pow.setEnabled(true);
       clear.setEnabled(true);
       del.setEnabled(true);
       equal.setEnabled(true);
       
       
   }
   
   public void disable()
   {
       onradiobutton.setEnabled(true);
       offradiobutton.setEnabled(false);
       textfield.setEnabled(false);
       label.setEnabled(false);
       zero.setEnabled(false);
       one.setEnabled(false);
       two.setEnabled(false);
       three.setEnabled(false);
       four.setEnabled(false);
       five.setEnabled(false);
       six.setEnabled(false);
       seven.setEnabled(false);
       eight.setEnabled(false);
       nine.setEnabled(false);
       div.setEnabled(false);
       mul.setEnabled(false);
       sub.setEnabled(false);
       add.setEnabled(false);
       perc.setEnabled(false);
       sq.setEnabled(false);
       sqrt.setEnabled(false);
       reci.setEnabled(false);
       dot.setEnabled(false);
       pow.setEnabled(false);
       clear.setEnabled(false);
       del.setEnabled(false);
       equal.setEnabled(false);
       
   }

}

