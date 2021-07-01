import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

class Framess extends Frame {
	Button btn1, btn2, btn3, btn4;
	Button btn5, btn6, btn7, btn8;
	Button btn9, btn0, btnadd, btnsub;
	Button btnmul, btndiv, btneq, btnclr;
	Label lblres;
	Panel pnl1, pnl2;
	JTextField txtpwd;
	String op1, op2, oprnd, res, disp;
	int cnt;
	boolean flag = true;
	Font f = new Font("Arial", Font.PLAIN, 50);

	Framess() {
		setLayout(null);
		setSize(500, 535);
		cnt = 0;
		op1 ="0";
		op2 ="0";
		int h, w;
		h = this.getHeight();
		w = this.getWidth();

		pnl1 = new Panel();
		pnl1.setLayout(null);
		pnl1.setBackground(Color.white);
		pnl1.setBounds(0, 20, 500, 180);
		add(pnl1);

		pnl2 = new Panel();
		pnl2.setLayout(null);
		pnl2.setBounds(0, 200, w, 2 * h / 3);
		pnl2.setBackground(Color.white);
		add(pnl2);

		ButtonEventHandlerr beh = new ButtonEventHandlerr(this);

		btn1 = new Button("7");
		btn1.setBounds(15, 0, 120, 80);
		btn1.setBackground(Color.white);
		btn1.setFont(f);
		btn1.setForeground(Color.black);
		btn1.addActionListener(beh);
		pnl2.add(btn1);

		btn2 = new Button("8");
		btn2.setBounds(135, 0, 120, 80);
		btn2.setBackground(Color.white);
		btn2.setFont(f);
		btn2.setForeground(Color.black);
		btn2.addActionListener(beh);
		pnl2.add(btn2);

		btn3 = new Button("9");
		btn3.setBounds(255, 0, 120, 80);
		btn3.setBackground(Color.white);
		btn3.setFont(f);
		btn3.setForeground(Color.black);
		btn3.addActionListener(beh);
		pnl2.add(btn3);

		btn4 = new Button("4");
		btn4.setBounds(15, 80, 120, 80);
		btn4.setBackground(Color.white);
		btn4.setFont(f);
		// btn4.setForeground(Color.black);
		btn4.addActionListener(beh);
		pnl2.add(btn4);

		btn5 = new Button("5");
		btn5.setBounds(135, 80, 120, 80);
		btn5.setBackground(Color.white);
		btn5.setFont(f);
		btn5.setForeground(Color.black);
		btn5.addActionListener(beh);
		pnl2.add(btn5);

		btn6 = new Button("6");
		btn6.setBounds(255, 80, 120, 80);
		btn6.setBackground(Color.white);
		btn6.setFont(f);
		btn6.setForeground(Color.black);
		btn6.addActionListener(beh);
		pnl2.add(btn6);

		btn7 = new Button("1");
		btn7.setBounds(15, 160, 120, 80);
		btn7.setBackground(Color.white);
		btn7.setFont(f);
		btn7.setForeground(Color.black);
		btn7.addActionListener(beh);
		pnl2.add(btn7);

		btn8 = new Button("2");
		btn8.setBounds(135, 160, 120, 80);
		btn8.setBackground(Color.white);
		btn8.setFont(f);
		btn8.setForeground(Color.black);
		btn8.addActionListener(beh);
		pnl2.add(btn8);

		btn9 = new Button("3");
		btn9.setBounds(255, 160, 120, 80);
		btn9.setBackground(Color.white);
		btn9.setFont(f);
		btn9.setForeground(Color.black);
		btn9.addActionListener(beh);
		pnl2.add(btn9);

		btn0 = new Button("0");
		btn0.setBounds(135, 240, 120, 80);
		btn0.setBackground(Color.white);
		btn0.setFont(f);
		btn0.setForeground(Color.black);
		btn0.addActionListener(beh);
		pnl2.add(btn0);

		btnadd = new Button("+");
		btnadd.setBounds(375, 0, 110, 80);
		btnadd.setBackground(Color.white);
		btnadd.setFont(f);
		btnadd.setForeground(Color.black);
		btnadd.addActionListener(beh);
		pnl2.add(btnadd);

		btnsub = new Button("-");
		btnsub.setBounds(375, 80, 110, 80);
		btnsub.setBackground(Color.white);
		btnsub.setFont(f);
		btnsub.setForeground(Color.black);
		btnsub.addActionListener(beh);
		pnl2.add(btnsub);

		btnmul = new Button("x");
		btnmul.setBounds(375, 160, 110, 80);
		btnmul.setBackground(Color.white);
		btnmul.setFont(f);
		btnmul.setForeground(Color.black);
		btnmul.addActionListener(beh);
		pnl2.add(btnmul);

		btndiv = new Button("/");
		btndiv.setBounds(375, 240, 110, 80);
		btndiv.setBackground(Color.white);
		btndiv.setFont(f);
		btndiv.setForeground(Color.black);
		btndiv.addActionListener(beh);
		pnl2.add(btndiv);

		btneq = new Button("=");
		btneq.setBounds(255, 240, 120, 80);
		btneq.setBackground(Color.white);
		btneq.setFont(f);
		btneq.setForeground(Color.black);
		btneq.addActionListener(beh);
		pnl2.add(btneq);

		btnclr = new Button("clr");
		btnclr.setBounds(15, 240, 120, 80);
		btnclr.setBackground(Color.white);
		btnclr.setFont(f);
		btnclr.setForeground(Color.black);
		btnclr.addActionListener(beh);
		pnl2.add(btnclr);

		lblres = new Label("0");
		lblres.setBounds(50, 200, 400, 80);

		lblres.setFont(f);
		lblres.setText("0");
		// lblres.setColor(Color.black);
		// pnl2.add(lblres);

		txtpwd = new JTextField("0");
		txtpwd.setForeground(Color.gray);
		txtpwd.setBounds(15, 40, 470, 185);
		txtpwd.setHorizontalAlignment(JTextField.RIGHT);
		txtpwd.setFont(f);
		pnl1.add(txtpwd);

		// pnl1.repaint();
	}
}

class ButtonEventHandlerr implements ActionListener {
	Framess ref;
	int x=0,y=0,z=0;
	ButtonEventHandlerr(Framess temp) {
		ref = temp;
	}

	public void actionPerformed(ActionEvent e) {
		Button btntemp;
		btntemp = (Button) e.getSource();
		if (btntemp.getActionCommand().equals("1")) {
			if (ref.op2 == "0") {
				x =(10*x)+1;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y)+1;
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);
			}
			ref.flag = false;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("2")) {
			if (ref.op2 == "0") {
				x =10*x+2;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y)+2;
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);
				}
			ref.flag = false;
			System.out.println("clicked");
			} else if (btntemp.getActionCommand().equals("3")) {
				if (ref.op2 == "0") {
					x =10*x+3;					ref.op1 = ""+x;
					ref.txtpwd.setText(ref.op1);
					ref.cnt++;
				} else {
					y =(10*y)+3;
					ref.op2 = ""+y;
					ref.txtpwd.setText(ref.op2);
					}
				ref.flag = false;
				System.out.println("clicked");
				} else if (btntemp.getActionCommand().equals("4")) {
					if (ref.op2 == "0") {
						x =10*x+4;
						ref.op1 = ""+x;
						ref.txtpwd.setText(ref.op1);
						ref.cnt++;
					} else {
						y =(10*y)+4;
						ref.op2 = ""+y;
						ref.txtpwd.setText(ref.op2);
						}
					ref.flag = false;
					System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("5")) {
			if (ref.op2 == "0") {
				x =10*x+5;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y)+5;
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);
				}
			ref.flag = false;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("6")) {
			if (ref.op2 == "0") {
				x =10*x+6;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y)+6;
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);
				}
			ref.flag = false;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("7")) {
			if (ref.op2 == "0") {
				x =10*x+7;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y)+7;
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);
				}
			ref.flag = false;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("8")) {
			if (ref.op2 == "0") {
				x =10*x+8;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y)+8;
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);
				}
			ref.flag = false;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("9")) {
			if (ref.op2 == "0") {
				x =10*x+9;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y)+9;
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);
				}
			ref.flag = false;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("0")) {
			if (ref.op2 == "0") {
				x =10*x;
				ref.op1 = ""+x;
				ref.txtpwd.setText(ref.op1);
				ref.cnt++;
			} else {
				y =(10*y);
				ref.op2 = ""+y;
				ref.txtpwd.setText(ref.op2);}
			ref.flag = false;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("+") && ref.flag == false) {
			ref.oprnd = "+";
			ref.txtpwd.setText(ref.oprnd);
			ref.op2=""+-1;
			ref.flag = true;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("-") && ref.flag == false) {
			ref.oprnd = "-";
			ref.txtpwd.setText(ref.oprnd);
			ref.op2=""+-1;
			ref.flag = true;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("x") && ref.flag == false) {
			ref.oprnd = "x";
			ref.txtpwd.setText(ref.oprnd);
			ref.op2=""+-1;
			ref.flag = true;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("/") && ref.flag == false) {
			ref.oprnd = "/";
			ref.txtpwd.setText(ref.oprnd);
			ref.op2=""+-1;
			ref.flag = true;
			System.out.println("clicked");
		} else if (btntemp.getActionCommand().equals("clr") ) {
			ref.oprnd = "0";
			ref.txtpwd.setText(ref.oprnd);
                        x=y=z=0;
			ref.op2="0";
			ref.flag = true;
			System.out.println("clicked");
		}System.out.println("x ="+x+ref.op1);
		System.out.println("y ="+y+ref.op2);
		System.out.println("z ="+z+ref.res);
		if (btntemp.getActionCommand().equals("=") && ref.flag == false) {
			x = Integer.parseInt(ref.op1);
			y = Integer.parseInt(ref.op2);
				if(ref.oprnd.equals("+")){
					z = (x+y);
					ref.res = ""+z;
					ref.txtpwd.setText(ref.res);
				}else if(ref.oprnd.equals("-")){
					z = (x-y);
					ref.res = ""+z;
					ref.txtpwd.setText(ref.res);
				}else if(ref.oprnd.equals("x")){
					z = x*y;
					ref.res = ""+z;
					ref.txtpwd.setText(ref.res);
				}else if(ref.oprnd.equals("/")){
					z = (x/y);
					ref.res = ""+z;
					ref.txtpwd.setText(ref.res);
				}
				//ref.op1 = "-1";
				ref.op2 = "0";
				//ref.oprnd = "-1";
				System.out.println("x ="+x+ref.op1);
				System.out.println("y ="+y+ref.op2);
				System.out.println("z ="+z+ref.res);
				ref.flag = true;
				x=y=z=0;
		}
	}

}

class WindowHandlerr extends WindowAdapter {
	Framess ref;

	WindowHandlerr(Framess temp) {
		ref = temp;
	}

	public void windowClosing(WindowEvent e) {
		ref.flag = false;
		ref.dispose();
	}

}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Framess obj = new Framess();
		obj.setTitle("Calculator");
		obj.setLocationRelativeTo(null);
		obj.setVisible(true);
		WindowHandlerr wh = new WindowHandlerr(obj);
		obj.addWindowListener(wh);
		try {
			Thread.sleep(200000);
		} catch (InterruptedException ie) {

		}
	}

}
