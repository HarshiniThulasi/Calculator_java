import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,plus,sub,mul,div,equal,clear;
    Calculator(){
        display = new TextField("");
        display.setBounds(50,40,220,40);


        btn7 = new Button("7");
        btn7.setBounds(50,90,40,40);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setBounds(110,90,40,40);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setBounds(170,90,40,40);
        btn9.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(230,90,40,40);
        plus.addActionListener(this);

        btn4 = new Button("4");
        btn4.setBounds(50,150,40,40);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setBounds(110,150,40,40);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setBounds(170,150,40,40);
        btn6.addActionListener(this);

        sub = new Button("-");
        sub.setBounds(230,150,40,40);
        sub.addActionListener(this);

        btn1 = new Button("1");
        btn1.setBounds(50,210,40,40);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(110,210,40,40);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setBounds(170,210,40,40);
        btn3.addActionListener(this);

        mul = new Button("X");
        mul.setBounds(230,210,40,40);
        mul.addActionListener(this);

        clear = new Button("C");
        clear.setBounds(50,270,40,40);
        clear.addActionListener(this);

        btn0 = new Button("0");
        btn0.setBounds(110,270,40,40);
        btn0.addActionListener(this);

        equal = new Button("=");
        equal.setBounds(170,270,40,40);
        equal.addActionListener(this);

        div = new Button("/");
        div.setBounds(230,270,40,40);
        div.addActionListener(this);



        add(display);
        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(mul);
        add(btn4);
        add(btn5);
        add(btn6);
        add(sub);
        add(btn7);
        add(btn8);
        add(btn9);
        add(plus);
        add(clear);
        add(equal);
        add(div);
        setLayout(null);
        setTitle("Calculator");
        setSize(400,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn0){
            String exp = display.getText();
            exp += "0";
            display.setText(exp);
        }
        if(e.getSource()==btn1){
            String exp = display.getText();
            exp += "1";
            display.setText(exp);
        }
        if(e.getSource()==btn2){
            String exp = display.getText();
            exp += "2";
            display.setText(exp);
        }
        if(e.getSource()==btn3){
            String exp = display.getText();
            exp += "3";
            display.setText(exp);
        }
        if(e.getSource()==btn4){
            String exp = display.getText();
            exp += "4";
            display.setText(exp);
        }
        if(e.getSource()==btn5){
            String exp = display.getText();
            exp += "5";
            display.setText(exp);
        }
        if(e.getSource()==btn6){
            String exp = display.getText();
            exp += "6";
            display.setText(exp);
        }
        if(e.getSource()==btn7){
            String exp = display.getText();
            exp += "7";
            display.setText(exp);
        }
        if(e.getSource()==btn8){
            String exp = display.getText();
            exp += "8";
            display.setText(exp);
        }
        if(e.getSource()==btn9){
            String exp = display.getText();
            exp += "9";
            display.setText(exp);
        }
        if(e.getSource()==clear){
            display.setText("");
        }
        if(e.getSource()==plus){
            String exp = display.getText();
            exp += "+";
            display.setText(exp);
        }
        if(e.getSource()==sub){
            String exp = display.getText();
            exp += "-";
            display.setText(exp);
        }
        if(e.getSource()==mul){
            String exp = display.getText();
            exp += "X";
            display.setText(exp);
        }
        if(e.getSource()==div){
            String exp = display.getText();
            exp += "/";
            display.setText(exp);
        }
        if(e.getSource()==equal){
            int a,b,i;
            char op=' ';
            String exp = display.getText();
            String tempA="",tempB="";
            for(i=0;i<exp.length();i++){
                if(Character.isDigit(exp.charAt(i))){
                    tempA+=exp.charAt(i);
                }
                else{
                    op = exp.charAt(i);
                    break;
                }
            }
            tempB = exp.substring(i+1);
            a = Integer.parseInt(tempA);
            b = Integer.parseInt(tempB);
            int result = switch (op) {
                case '+' -> a + b;
                case '-' -> a - b;
                case 'X' -> a * b;
                case '/' -> a / b;
                default -> 0;
            };
            display.setText(String.valueOf(result));
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
