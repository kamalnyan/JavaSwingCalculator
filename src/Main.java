import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame implements ActionListener {
    JTextArea t1 = new JTextArea();


    JButton bc= new JButton("C");
    JButton bp=new JButton("%");
    JButton bdiv= new JButton("/");
    JButton be=new JButton("=");


    JButton b9= new JButton("9");
    JButton b8=new JButton("8");
    JButton b7= new JButton("7");
    JButton badd=new JButton("+");


    JButton b6= new JButton("6");
    JButton b5=new JButton("5");
    JButton b4= new JButton("4");
    JButton bsub=new JButton("-");


    JButton b3= new JButton("3");
    JButton b2=new JButton("2");
    JButton b1=new JButton("1");
    JButton bmulti=new JButton("*");
    JButton b0=new JButton("0");
    JButton bdo=new JButton(".");

    public Main ()
    {
        setTitle("CALCULATOR");
        setSize(340,470);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        t1.setLineWrap(true);
        t1.setBackground(Color.GRAY);
        Font font = new Font("arial",Font.BOLD,33);
        t1.setFont(font);

        Font fontb = new Font("arial",Font.BOLD,21);
        b0.setFont(fontb);
        b1.setFont(fontb);
        b2.setFont(fontb);
        b3.setFont(fontb);
        b4.setFont(fontb);
        b5.setFont(fontb);
        b6.setFont(fontb);
        b7.setFont(fontb);
        b8.setFont(fontb);
        b9.setFont(fontb);
        bc.setFont(fontb);
        bp.setFont(fontb);
        be.setFont(fontb);
        bdiv.setFont(fontb);
        badd.setFont(fontb);
        bsub.setFont(fontb);
        bmulti.setFont(fontb);
        bdo.setFont(fontb);


        add(t1);

        add(bc);
        add(bp);
        add(bdiv);
        add(be);

        add(b9);
        add(b8);
        add(b7);
        add(badd);

        add(b6);
        add(b5);
        add(b4);
        add(bsub);

        add(b3);
        add(b2);
        add(b1);
        add(bmulti);
        add(b0);
        add(bdo);


        setLayout(null);

        t1.setBounds(15,30,300,60);

        bc.setBounds(15,120,60,35);
        bp.setBounds(90,120,60,35);
        bdiv.setBounds(170,120,60,35);
        be.setBounds(250,120,60,35);

        b9.setBounds(15,190,60,35);
        b8.setBounds(90,190,60,35);
        b7.setBounds(170,190,60,35);
        badd.setBounds(250,190,60,35);

        b6.setBounds(15,260,60,35);
        b5.setBounds(90,260,60,35);
        b4.setBounds(170,260,60,35);
        bsub.setBounds(250,260,60,35);

        b3.setBounds(15,330,60,35);
        b2.setBounds(90,330,60,35);
        b1.setBounds(170,330,60,35);
        bmulti.setBounds(250,330,60,35);

        b0.setBounds(100,390,120,30);
        bdo.setBounds(10,390,70,30);


        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmulti.addActionListener(this);
        bdiv.addActionListener(this);
        bc.addActionListener(this);
        bp.addActionListener(this);
        be.addActionListener(this);
        bdo.addActionListener(this);


    }
    double num1,num2,res;
    int add,div,sub,multi,p;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b0)
        {
            t1.append("0");
        }
        if (e.getSource()==b1)
        {
            t1.append("1");
        }
        if (e.getSource()==b2)
        {
            t1.append("2");
        }
        if (e.getSource()==b3)
        {
            t1.append("3");
        }
        if (e.getSource()==b4)
        {
            t1.append("4");
        }
        if (e.getSource()==b5)
        {
            t1.append("5");
        }
        if (e.getSource()==b6)
        {
            t1.append("6");
        }
        if (e.getSource()==b7)
        {
            t1.append("7");
        }
        if (e.getSource()==b8)
        {
            t1.append("8");
        }
        if (e.getSource()==b9)
        {
            t1.append("9");
        }

        if (e.getSource()==bdo)
        {
            t1.append(".");

        }
        if (e.getSource()==bc)
        {
            t1.setText("");
            num1=0;
            num2=0;

        }


        if (e.getSource()==badd )
        {
            num1=numr();
            t1.setText("");
            add=1;
            sub=0;
            multi=0;
            div=0;

        }
        if (e.getSource()==bsub)
        {

            num1=numr();
            t1.setText(" ");
            add=0;
            sub=1;
            multi=0;
            div=0;
        }
        if (e.getSource()==bmulti)
        {

            num1=numr();
            t1.setText("");
            add=0;
            sub=0;
            multi=1;
            div=0;
        }
        if (e.getSource()==bdiv)
        {

            num1=numr();
            t1.setText("");
            add=0;
            sub=0;
            multi=0;
            div=1;
        }
        if (e.getSource()==bp)
        {

            num1=numr();
            add=0;
            sub=0;
            multi=0;
            div=0;
            p=1;
        }
        if (e.getSource()==be)
        {

            num2=numr();
            if (add>0)
            {
                res=num1+num2;
                t1.setText(Double.toString(res));
            }
            if (sub>0)
            {
                res=num1-num2;
                t1.setText(Double.toString(res));
            }
            if (multi>0)
            {
                res=num1*num2;
                t1.setText(Double.toString(res));
            }
            if (div>0)
            {
                res=num1/num2;
                t1.setText(Double.toString(res));
            }
            if (p>0)
            {
                res=num1/100;
                t1.setText(Double.toString(res));
            }
        }
    }
    public double numr()
    {
        double ka;
        String na;
        na=t1.getText();
        ka=Double.valueOf(na);
        return ka;
    }

    public static void main(String[] args) throws ArithmeticException{
        Main p1 = new Main();
    }
}