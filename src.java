import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;

enum Oper{加,减,乘,除,sqrt,lg,asin,acos,atan,sin,cos,tan,pow}
//enum OPer1{sqrt,lg,asin,acos,atan,sin,cos,tan,pow}

class MyExtendsJFrame extends JFrame implements ActionListener, KeyListener{
	JTextField text;//创建文本框对象
	JButton button1, button2,button3;
	JButton button_number1,button_number2,button_number3,button_number4,button_number5,button_number6,button_number7,button_number8,button_number9,button_number0,button_number10;
	JButton button_add,button_equ,button_sub,button_mul,button_div;
	JButton button_sqrt,button_lg,button_arcsin,button_arccos,button_arctan,button_sin,button_cos,button_tan,button_pow;
	double CurrentNumber;
	double num;
	int count=0;
	Oper oper;
	public MyExtendsJFrame(){
		setTitle("czy's NO.1 computer");
		setBounds(160,100,525,795);
		this.getContentPane().setBackground(Color.black);
		setLayout(null);		
		init();   //添加控件的操作封装成一个函数         
		setVisible(true);//放在添加组件后面执行
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	void init(){//添加的控件
	text=new JTextField(20);
	text.setBounds(5,5,495,95);//设置大小和位置 
    add(text);//添加到窗口
    text.addKeyListener(this);
    //button1.addActionListener(this);//添加关联
     
    //Icon icon2 = new ImageIcon("\\Backspace (3).png");
    button1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("Backspace (3).png")));
    //button1=new JButton(icon2);
    button1.setBounds(5,100,195,100);
    button1.setForeground(Color.red);
    //button1.setFont(new Font("宋体",Font.BOLD,24));
    button1.setBackground(Color.black);
    add(button1);
    button1.addActionListener(this);//添加关联
       
    button2=new JButton("CE");
    button2.setBounds(200,100,150,100);
    button2.setForeground(Color.red);
    button2.setFont(new Font("宋体",Font.BOLD,24));
    button2.setBackground(Color.black);
    add(button2);
    button2.addActionListener(this);//添加关联
       
    button3=new JButton("C");
    button3.setBounds(350,100,150,100);
    button3.setForeground(Color.red);
    button3.setFont(new Font("宋体",Font.BOLD,24));
    button3.setBackground(Color.black);
    add(button3);
    button3.addActionListener(this);//添加关联
       
    button_number1=new JButton("1");
    button_number1.setBounds(5,300,95,100);
    button_number1.setFont(new Font("宋体",Font.BOLD,24));
    button_number1.setBackground(Color.lightGray);
    add(button_number1);    
    button_number1.addActionListener(this);//添加关联
              
    button_number2=new JButton("2");
    button_number2.setBounds(100,300,100,100);
    button_number2.setFont(new Font("宋体",Font.BOLD,24));
    button_number2.setBackground(Color.lightGray);
    add(button_number2);       
    button_number2.addActionListener(this);//添加关联
  
       
    button_number3=new JButton("3");
    button_number3.setBounds(200,300,100,100);
    button_number3.setFont(new Font("宋体",Font.BOLD,24));
    button_number3.setBackground(Color.lightGray);
    add(button_number3);
    button_number3.addActionListener(this);
       
              
    button_number4=new JButton("4");
    button_number4.setBounds(5,400,95,100);
    button_number4.setFont(new Font("宋体",Font.BOLD,24));
    button_number4.setBackground(Color.lightGray);
    add(button_number4);
    button_number4.addActionListener(this);
       
    button_number5=new JButton("5");
    button_number5.setBounds(100,400,100,100);
    button_number5.setFont(new Font("宋体",Font.BOLD,24));
    button_number5.setBackground(Color.lightGray);
    add(button_number5);
    button_number5.addActionListener(this);
       
    button_number6=new JButton("6");
    button_number6.setBounds(200,400,100,100);
    button_number6.setFont(new Font("宋体",Font.BOLD,24));
    button_number6.setBackground(Color.lightGray);
    add(button_number6);
    button_number6.addActionListener(this);
       
    button_number7=new JButton("7");
    button_number7.setBounds(5,500,95,100);
    button_number7.setFont(new Font("宋体",Font.BOLD,24));
    button_number7.setBackground(Color.lightGray);
    add(button_number7);
    button_number7.addActionListener(this);
       
    button_number8=new JButton("8");
    button_number8.setBounds(100,500,100,100);
    button_number8.setFont(new Font("宋体",Font.BOLD,24));
    button_number8.setBackground(Color.lightGray);
    add(button_number8);
    button_number8.addActionListener(this);
       
    button_number9=new JButton("9");
    button_number9.setBounds(200,500,100,100);
    button_number9.setFont(new Font("宋体",Font.BOLD,24));
    button_number9.setBackground(Color.lightGray);
    add(button_number9);
    button_number9.addActionListener(this);
       
    button_number0=new JButton("0");
    button_number0.setBounds(5,600,95,100);
    button_number0.setFont(new Font("宋体",Font.BOLD,24));
    button_number0.setBackground(Color.lightGray);
    add(button_number0);
    button_number0.addActionListener(this);
       
    button_number10=new JButton(".");
    button_number10.setBounds(100,600,100,100);
    button_number10.setFont(new Font("宋体",Font.BOLD,24));
    button_number10.setBackground(Color.lightGray);
    add(button_number10);
    button_number10.addActionListener(this);
       
    button_equ=new JButton("=");
    button_equ.setBounds(200,600,100,100);
    button_equ.setFont(new Font("宋体",Font.BOLD,24));
    button_equ.setBackground(Color.lightGray);
    add(button_equ);   
    button_equ.addActionListener(this);//添加关联   
       
       
    button_add=new JButton("+");
    button_add.setBounds(300,300,100,100);
    button_add.setFont(new Font("宋体",Font.BOLD,24));
    button_add.setBackground(Color.lightGray);
    add(button_add);
    button_add.addActionListener(this);//添加关联 
       
       
    button_sub=new JButton("-");
    button_sub.setBounds(300,400,100,100);
    button_sub.setFont(new Font("宋体",Font.BOLD,24));
    button_sub.setBackground(Color.lightGray);
    add(button_sub);
    button_sub.addActionListener(this);//添加关联 
       
    button_mul=new JButton("*");
    button_mul.setBounds(300,500,100,100);
    button_mul.setFont(new Font("宋体",Font.BOLD,24));
    button_mul.setBackground(Color.lightGray);
    add(button_mul);
    button_mul.addActionListener(this);//添加关联 
       
    button_div=new JButton("/");
    button_div.setBounds(300,600,100,100);
    button_div.setFont(new Font("宋体",Font.BOLD,24));
    button_div.setBackground(Color.lightGray);
    add(button_div);
    button_div.addActionListener(this);//添加关联 

    button_sqrt=new JButton("sqrt");
    button_sqrt.setBounds(5,200,95,100);
    button_sqrt.setForeground(Color.red);
    button_sqrt.setFont(new Font("宋体",Font.BOLD,24));
    button_sqrt.setBackground(Color.black);
    add(button_sqrt);
    button_sqrt.addActionListener(this);
    
    button_lg=new JButton("lg");
    button_lg.setBounds(100,200,100,100);
    button_lg.setForeground(Color.red);
    button_lg.setFont(new Font("宋体",Font.BOLD,24));
    button_lg.setBackground(Color.black);
    add(button_lg);
    button_lg.addActionListener(this);
    
    button_arcsin=new JButton("asin");
    button_arcsin.setBounds(200,200,100,100);
    button_arcsin.setForeground(Color.red);
    button_arcsin.setFont(new Font("宋体",Font.BOLD,24));
    button_arcsin.setBackground(Color.black);
    add(button_arcsin);
    button_arcsin.addActionListener(this);
    
    button_arccos=new JButton("acos");
    button_arccos.setBounds(300,200,100,100);
    button_arccos.setForeground(Color.red);
    button_arccos.setFont(new Font("宋体",Font.BOLD,24));
    button_arccos.setBackground(Color.black);
    add(button_arccos);
    button_arccos.addActionListener(this);
    
    button_arctan=new JButton("atan");
    button_arctan.setBounds(400,200,100,100);
    button_arctan.setForeground(Color.red);
    button_arctan.setFont(new Font("宋体",Font.BOLD,24));
    button_arctan.setBackground(Color.black);
    add(button_arctan);
    button_arctan.addActionListener(this);
    
    button_sin=new JButton("sin");
    button_sin.setBounds(400,300,100,100);
    button_sin.setForeground(Color.red);
    button_sin.setFont(new Font("宋体",Font.BOLD,24));
    button_sin.setBackground(Color.black);
    add(button_sin);
    button_sin.addActionListener(this);
    
    button_cos=new JButton("cos");
    button_cos.setBounds(400,400,100,100);
    button_cos.setForeground(Color.red);
    button_cos.setFont(new Font("宋体",Font.BOLD,24));
    button_cos.setBackground(Color.black);
    add(button_cos);
    button_cos.addActionListener(this);
    
    button_tan=new JButton("tan");
    button_tan.setBounds(400,500,100,100);
    button_tan.setForeground(Color.red);
    button_tan.setFont(new Font("宋体",Font.BOLD,24));
    button_tan.setBackground(Color.black);
    add(button_tan);
    button_tan.addActionListener(this);
    
    button_pow=new JButton("^");
    button_pow.setBounds(400,600,100,100);
    button_pow.setForeground(Color.red);
    button_pow.setFont(new Font("宋体",Font.BOLD,24));
    button_pow.setBackground(Color.black);
    add(button_pow);
    button_pow.addActionListener(this);
	
	JMenuBar menubar = new JMenuBar();
    JMenu menu1 = new JMenu("Mode");
    menu1.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem11 = new JMenuItem("Standord");
    menuitem11.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem12 = new JMenuItem("Science");
    menuitem12.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem13 = new JMenuItem("Program");
    menuitem13.setFont(new Font("宋体",Font.BOLD,24));

    JMenu menu2 = new JMenu("Edit");
    menu2.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem21 = new JMenuItem("Copy");
    menuitem21.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem22 = new JMenuItem("Paste");
    menuitem22.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem23 = new JMenuItem("History");
    menuitem23.setFont(new Font("宋体",Font.BOLD,24));

    JMenu menu3 = new JMenu("Help");
    menu3.setFont(new Font("宋体",Font.BOLD,24));
    JMenu menu31 = new JMenu("Content");
    menu31.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem311 = new JMenuItem("Contact");
    menuitem311.setFont(new Font("宋体",Font.BOLD,24));
    JMenuItem menuitem312 = new JMenuItem("Address");
    menuitem312.setFont(new Font("宋体",Font.BOLD,24));

    JMenuItem menuitem32 = new JMenuItem("About");
    menuitem32.setFont(new Font("宋体",Font.BOLD,24));

    setJMenuBar(menubar);
    menubar.add(menu1);
    menu1.add(menuitem11);
    menu1.add(menuitem12);
    menu1.add(menuitem13);

    menubar.add(menu2);
    menu2.add(menuitem21);
    menu2.add(menuitem22);
    menu2.addSeparator();
    menu2.add(menuitem23);

    menubar.add(menu3);
    menu3.add(menu31);
    menu31.add(menuitem311);
    menu31.add(menuitem312);
    menu3.addSeparator();
    menu3.add(menuitem32);
	}

	public void keyPressed (KeyEvent e)	{		
	}	
	public void keyReleased  (KeyEvent e){	
		int t = e.getKeyCode();
        if(t>=KeyEvent.VK_A&&t<=KeyEvent.VK_Z){
        	String text0=text.getText();
    		int i=text0.length();
    		if(i>0)
    		{
    			text0=text0.substring(0, i-1);
    			if(i==0){
    				text.setText("0");
    			}
    			else{
    			    text.setText(text0);
    			}
    		}
        	
        }

	}
	
	public void keyTyped(KeyEvent e){		
	}
	public void actionPerformed(ActionEvent e){	

	if(e.getSource()==button1){
		String text1=text.getText();
		int i=text1.length();
		if(i>0)
		{
			text1=text1.substring(0, i-1);
			if(i==0){
				text.setText("0");
			}else{
			text.setText(text1);
		    }
		}
	}
	
	if(e.getSource()==button2){
		text.setText("");
	}
	
	if(e.getSource()==button3){		
		CurrentNumber=0;
		num=0;
		count=0;
		text.setText("");
	}
	
	if(e.getSource()==button_number0){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"0");
	}
	if(e.getSource()==button_number1){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"1");
	}
	if(e.getSource()==button_number2){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"2");
	}	
	if(e.getSource()==button_number3){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"3");
	}
	if(e.getSource()==button_number4){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"4");
	}
	if(e.getSource()==button_number5){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"5");
	}
	if(e.getSource()==button_number6){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"6");
	}
	if(e.getSource()==button_number7){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"7");
	}
	if(e.getSource()==button_number8){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"8");
	}
	if(e.getSource()==button_number9){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+"9");
	}
	if(e.getSource()==button_number10){
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(text.getText()+".");
	}
	if(text.getText().indexOf("..")!=-1)
	{
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText("Cannot input like: .. ");
		//text.setText("");
	}
	if(e.getSource()==button_add){
		if(count==0) {
			num=Double.parseDouble(text.getText());
		    CurrentNumber=num;
            oper=Oper.加;
            text.setText("");
            count=count+1;
	     }
		else {
			switch(oper){
			case 加:num=num+Double.parseDouble(text.getText());break;
			case 减:num=num-Double.parseDouble(text.getText());break;
			case 乘:num=num*Double.parseDouble(text.getText());break;
			case 除:{
				if(Double.parseDouble(text.getText())==0.0){
					text.setText(String.valueOf("The last number cannot be a 0"));
					break;
				}				
				num=num/Double.parseDouble(text.getText());break;				
			  }	
			default:
				break;
		}
			CurrentNumber=num;
	        oper=Oper.加;
	        text.setText("");
	        count=count+1;
		 }
	}
	if(e.getSource()==button_sub){
		if(count==0) {
			num=Double.parseDouble(text.getText());
		    CurrentNumber=num;
            oper=Oper.减;
            text.setText("");
            count=count+1;
	     }
		else {
			switch(oper){
			case 加:num=num+Double.parseDouble(text.getText());break;
			case 减:num=num-Double.parseDouble(text.getText());break;
			case 乘:num=num*Double.parseDouble(text.getText());break;
			case 除:{
				if(Double.parseDouble(text.getText())==0.0){
					text.setText(String.valueOf("The last number cannot be a 0"));
					break;
				}				
				num=num/Double.parseDouble(text.getText());break;				
			  }	
			default:
				break;
		}
			CurrentNumber=num;
	        oper=Oper.减;
	        text.setText("");
	        count=count+1;
		}
			
		}
		
	if(e.getSource()==button_mul){
		if(count==0) {
		num=Double.parseDouble(text.getText());
	    CurrentNumber=num;
        oper=Oper.乘;
        text.setText("");
        count=count+1;
     }
	else {
		switch(oper){
		case 加:num=num+Double.parseDouble(text.getText());break;
		case 减:num=num-Double.parseDouble(text.getText());break;
		case 乘:num=num*Double.parseDouble(text.getText());break;
		case 除:{
			if(Double.parseDouble(text.getText())==0.0){
				text.setText(String.valueOf("The last number cannot be a 0"));
				break;
			}				
			num=num/Double.parseDouble(text.getText());break;				
		  }	
		default:
			break;
	}
		CurrentNumber=num;
        oper=Oper.乘;
        text.setText("");
        count=count+1;
	}
	}
	if(e.getSource()==button_div){
		if(count==0) {
			num=Double.parseDouble(text.getText());
		    CurrentNumber=num;
            oper=Oper.除;
            text.setText("");
            count=count+1;
	     }
		else {
			switch(oper){
			case 加:num=num+Double.parseDouble(text.getText());break;
			case 减:num=num-Double.parseDouble(text.getText());break;
			case 乘:num=num*Double.parseDouble(text.getText());break;
			case 除:{
				if(Double.parseDouble(text.getText())==0.0){
				text.setText(String.valueOf("The last number cannot be a 0"));
				   break;
				}				
				num=num/Double.parseDouble(text.getText());break;				
			  }	
			default:
				break;
		}
			CurrentNumber=num;
	        oper=Oper.除;
	        text.setText("");
	        count=count+1;	
	}
	}
	if(e.getSource()==button_sqrt){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.sqrt;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("sqrt");	
	}
	if(e.getSource()==button_lg){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.lg;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("lg");	
	}
	if(e.getSource()==button_arcsin){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.asin;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("asin");	
	}
	if(e.getSource()==button_arccos){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.acos;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("acos");	
	}
	if(e.getSource()==button_arctan){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.atan;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("atan");	
	}
	if(e.getSource()==button_sin){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.sin;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("sin");	
	}
	if(e.getSource()==button_cos){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.cos;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("cos");	
	}
	if(e.getSource()==button_tan){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.tan;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("tan");	
	}
	if(e.getSource()==button_pow){
		CurrentNumber=Double.parseDouble(text.getText());
        oper=Oper.pow;
        text.setFont(new Font("宋体",Font.BOLD,24));
        text.setText("^");
        text.setText("");
	}
	if(e.getSource()==button_equ){
	  switch(oper){
		case 加:
		double number1=Double.parseDouble(text.getText())+CurrentNumber;
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number1));
		CurrentNumber=number1;
		count++;
		break;
		
		case 减:	
		double number2=CurrentNumber+Double.parseDouble(text.getText());
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number2));
		CurrentNumber=number2;
		break;
		
		case 乘:	
		double number3=Double.parseDouble(text.getText())*CurrentNumber;
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number3));
		CurrentNumber=number3;
	    count=0;
		break;
		
		case 除:	
		if(Double.parseDouble(text.getText())==0){
			text.setFont(new Font("宋体",Font.BOLD,24));
			text.setText(String.valueOf("The last number cannot be a 0"));
			break;
		}
		double number4=CurrentNumber/Double.parseDouble(text.getText());
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number4));
		break;
		
		case sqrt:
		double number5=Math.sqrt(CurrentNumber);
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number5));
		CurrentNumber=number5;
		break;
		
		case lg:
		double number6=Math.log10(CurrentNumber);
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number6));
		CurrentNumber=number6;
		break;
		
		case asin:
		double number7=Math.asin(CurrentNumber);
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number7));
		CurrentNumber=number7;
		break;
		
		case acos:
		double number8=Math.acos(CurrentNumber);
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number8));
		CurrentNumber=number8;
		break;
		
		case atan:
		double number9=Math.atan(CurrentNumber);
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number9));
		CurrentNumber=number9;
		break;
		
		case sin:
		double number10=Math.sin(CurrentNumber);
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number10));
		CurrentNumber=number10;
		break;
		
		case cos:
		double number11=Math.cos(CurrentNumber);
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number11));
		CurrentNumber=number11;
		break;
		
		case pow:
		double number12=Math.pow(CurrentNumber, Double.parseDouble(text.getText()));
		text.setFont(new Font("宋体",Font.BOLD,24));
		text.setText(String.valueOf(number12));
		CurrentNumber=number12;
		break;
		
		default:
		break;
		}    		
	
	}	
	}
}
	
class compute {
		public static void main(String args[]) {    	
	      MyExtendsJFrame frame=new MyExtendsJFrame();
	    }
	}
