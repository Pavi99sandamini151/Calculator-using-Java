import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel javaCalculator;
    private JTextField textdisplay;
    private JButton btnDevide;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnEquals;


    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textdisplay.getText());
        textdisplay.setText("");
    }

    public javaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textdisplay.getText() + btnOne.getText();
                textdisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textdisplay.getText() + btnTwo.getText();
                textdisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textdisplay.getText() + btnThree.getText();
                textdisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textdisplay.getText() + btnFour.getText();
                textdisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textdisplay.getText() + btnFive.getText();
                textdisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textdisplay.getText() + btnSix.getText();
                textdisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textdisplay.getText() + btnSeven.getText();
                textdisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textdisplay.getText() + btnEight.getText();
                textdisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textdisplay.getText() + btnNine.getText();
                textdisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textdisplay.getText() + btnZero.getText();
                textdisplay.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnDevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDevide.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                total2 = total1 + Double.parseDouble(textdisplay.getText());
                switch(math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(textdisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textdisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textdisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textdisplay.getText());
                        break;
                }
                textdisplay.setText(Double.toString(total2));
                total1 =0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textdisplay.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textdisplay.getText().equals("")){
                    textdisplay.setText("0.");
                }
                else if(textdisplay.getText().contains(".")){
                    btnPoint.setEnabled(false);
                }
                else{
                    String btnPointText = textdisplay.getText() + btnPoint.getText();
                    textdisplay.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("javaCalculator");
        frame.setContentPane(new javaCalculator().javaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
