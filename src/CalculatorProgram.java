import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;

public class CalculatorProgram implements ActionListener {

    double number;
    int calculation;
    double answer;

    JButton settingsButton;
    JLabel label;
    JFrame frame;
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;
    JButton buttonFive;
    JButton buttonSix;
    JButton buttonSeven;
    JButton buttonEight;
    JButton dotButton;
    JButton buttonNine;
    JButton buttonZero;
    JButton multplicationButton;
    JButton plusButton;
    JButton divisionButton;
    JButton minusButton;
    JButton equalsButton;
    JButton clearButton;
    JButton delButton;
    JButton squareButton;
    JButton sqrtButton;
    JTextField textField;
    ImageIcon LogoIcon;

    CalculatorProgram() {
        windowFrame();
        addComponents();
        addActionEvent();
    }

    public void windowFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(401, 180, 250, 350);
        frame.setTitle("Calculator");
        LogoIcon = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\Calculator\\src\\logo.jpg");
        frame.setIconImage(LogoIcon.getImage());
        frame.getContentPane().setBackground(new Color(0xFF000B2B, true));
        frame.setLayout(null);
        frame.setResizable(false);

    }

    public void addComponents() {
        textField = new JTextField();
        textField.setBounds(0, 6, 249, 55);
        textField.setBackground(new Color(0xFF000B2B));
        textField.setEditable(false);
        textField.setForeground(Color.white);
        textField.setBorder(BorderFactory.createEtchedBorder(new Color(0xFF000B2B), null));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(textField);

        clearButton = new JButton("C");
        clearButton.setBounds(0, 67, 60, 40);
        clearButton.setBackground(Color.blue);
        clearButton.setForeground(Color.white);
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(clearButton);

        squareButton = new JButton("x²");
        squareButton.setBackground(Color.DARK_GRAY);
        squareButton.setFont(new Font("Arial", Font.BOLD, 20));
        squareButton.setForeground(Color.white);
        squareButton.setBounds(63, 67, 60, 40);
        frame.add(squareButton);

        delButton = new JButton("<<");
        delButton.setBackground(Color.DARK_GRAY);
        delButton.setForeground(Color.white);
        delButton.setFont(new Font("Arial", Font.BOLD, 20));
        delButton.setBounds(126, 67, 60, 40);
        frame.add(delButton);

        multplicationButton = new JButton("X");
        multplicationButton.setBackground(Color.DARK_GRAY);
        multplicationButton.setFont(new Font("Arial", Font.BOLD, 20));
        multplicationButton.setForeground(Color.white);
        multplicationButton.setBounds(189, 67, 60, 40);
        frame.add(multplicationButton);

        buttonSeven = new JButton("7");
        buttonSeven.setBackground(Color.gray);
        buttonSeven.setForeground(Color.white);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setBounds(0, 110, 60, 40);
        frame.add(buttonSeven);

        buttonEight = new JButton("8");
        buttonEight.setBackground(Color.gray);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setForeground(Color.white);
        buttonEight.setBounds(63, 110, 60, 40);
        frame.add(buttonEight);

        buttonNine = new JButton("9");
        buttonNine.setBackground(Color.gray);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setForeground(Color.white);
        buttonNine.setBounds(126, 110, 60, 40);
        frame.add(buttonNine);

        divisionButton = new JButton("/");
        divisionButton.setFont(new Font("Arial", Font.BOLD, 20));
        divisionButton.setBackground(Color.darkGray);
        divisionButton.setForeground(Color.white);
        divisionButton.setBounds(189, 110, 60, 40);
        frame.add(divisionButton);

        plusButton = new JButton("+");
        plusButton.setBackground(Color.darkGray);
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));
        plusButton.setForeground(Color.white);
        plusButton.setBounds(189, 153, 60, 40);
        frame.add(plusButton);

        minusButton = new JButton("-");
        minusButton.setBackground(Color.darkGray);
        minusButton.setForeground(Color.white);
        minusButton.setFont(new Font("Arial", Font.BOLD, 20));
        minusButton.setBounds(189, 196, 60, 40);
        frame.add(minusButton);

        equalsButton = new JButton("=");
        equalsButton.setForeground(Color.white);
        equalsButton.setFont(new Font("Arial", Font.BOLD, 20));
        equalsButton.setBackground(new Color(0xEF7508));
        equalsButton.setBounds(189, 239, 60, 40);
        frame.add(equalsButton);

        buttonSix = new JButton("6");
        buttonSix.setBackground(Color.gray);
        buttonSix.setForeground(Color.white);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setBounds(126, 153, 60, 40);
        frame.add(buttonSix);

        buttonFive = new JButton("5");
        buttonFive.setBackground(Color.gray);
        buttonFive.setForeground(Color.white);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setBounds(63, 153, 60, 40);
        frame.add(buttonFive);

        buttonFour = new JButton("4");
        buttonFour.setBackground(Color.gray);
        buttonFour.setForeground(Color.white);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setBounds(0, 153, 60, 40);
        frame.add(buttonFour);

        buttonThree = new JButton("3");
        buttonThree.setBackground(Color.gray);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setForeground(Color.white);
        buttonThree.setBounds(126, 196, 60, 40);
        frame.add(buttonThree);

        buttonTwo = new JButton("2");
        buttonTwo.setBackground(Color.gray);
        buttonTwo.setForeground(Color.white);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setBounds(63, 196, 60, 40);
        frame.add(buttonTwo);

        buttonOne = new JButton("1");
        buttonOne.setBackground(Color.gray);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setForeground(Color.white);
        buttonOne.setBounds(0, 196, 60, 40);
        frame.add(buttonOne);

        dotButton = new JButton(".");
        dotButton.setBackground(Color.gray);
        dotButton.setFont(new Font("Arial", Font.BOLD, 20));
        dotButton.setForeground(Color.white);
        dotButton.setBounds(126, 239, 60, 40);
        frame.add(dotButton);

        buttonZero = new JButton("0");
        buttonZero.setBackground(Color.gray);
        buttonZero.setForeground(Color.white);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setBounds(63, 239, 60, 40);
        frame.add(buttonZero);

        sqrtButton = new JButton("\u221A");
        sqrtButton.setBackground(Color.gray);
        sqrtButton.setFont(new Font("Arial", Font.BOLD, 20));
        sqrtButton.setForeground(Color.white);
        sqrtButton.setBounds(0, 239, 60, 40);
        frame.add(sqrtButton);

        label = new JLabel();
        label.setBounds(123, 279, 200, 40);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label);

        settingsButton = new JButton("Settings");
        settingsButton.setBounds(0,280,120,30);
        settingsButton.setForeground(Color.white);
        settingsButton.setBackground(new Color(0xFF000B2B));
        settingsButton.setBorder(BorderFactory.createEtchedBorder(new Color(0xFF000B2B), null));
        frame.add(settingsButton);

        frame.setVisible(true);
    }

    public void addActionEvent() {

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        divisionButton.addActionListener(this);
        equalsButton.addActionListener(this);
        multplicationButton.addActionListener(this);
        delButton.addActionListener(this);
        clearButton.addActionListener(this);
        textField.addActionListener(this);
        sqrtButton.addActionListener(this);
        squareButton.addActionListener(this);
        dotButton.addActionListener(this);

    }

    public static void main(String[] args) {

        new CalculatorProgram();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object buttonPressed = e.getSource();
            if (buttonPressed == clearButton) {
                label.setText("");
                textField.setText("");
            } else if (buttonPressed == delButton) {
                int length = textField.getText().length();
                int number = length - 1;

                if (length > 0) {
                    StringBuilder back = new StringBuilder(textField.getText());
                    back.deleteCharAt(number);
                    textField.setText(back.toString());

                }
                if (textField.getText().endsWith("")) {
                    label.setText("");
                }
            } else if (buttonPressed == buttonZero) {
                if (textField.getText().equals("0")) {
                    return;
                } else {
                    textField.setText(textField.getText() + "0");
                }
            }
            else if (buttonPressed == buttonOne) {
                textField.setText(textField.getText() + "1");
            } else if (buttonPressed == buttonTwo) {
                textField.setText(textField.getText() + "2");
            } else if (buttonPressed == buttonThree) {
                textField.setText(textField.getText() + "3");
            } else if (buttonPressed == buttonFour) {
                textField.setText(textField.getText() + "4");
            } else if (buttonPressed == buttonFive) {
                textField.setText(textField.getText() + "5");
            } else if (buttonPressed == buttonSix) {
                textField.setText(textField.getText() + "6");
            } else if (buttonPressed == buttonSeven) {
                textField.setText(textField.getText() + "7");
            } else if (buttonPressed == buttonEight) {
                textField.setText(textField.getText() + "8");
            } else if (buttonPressed == buttonNine) {
                textField.setText(textField.getText() + "9");
            } else if (buttonPressed == dotButton) {
                if (textField.getText().contains(".")) {
                    return;
                } else {
                    textField.setText(textField.getText() + ".");
                }

            } else if (buttonPressed == plusButton) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "+");
                calculation = 1;
            } else if (buttonPressed == minusButton) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "-");
                calculation = 2;
            } else if (buttonPressed == multplicationButton) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "X");
                calculation = 3;
            } else if (buttonPressed == divisionButton) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "/");
                calculation = 4;
            } else if (buttonPressed == sqrtButton) {
                number = Double.parseDouble(textField.getText());
                double sqrt = Math.sqrt(number);
                textField.setText(Double.toString(sqrt));

            } else if (buttonPressed == squareButton) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                double square = Math.pow(number, 2);
                String string = Double.toString(square);
                if (string.endsWith(".0")) {
                    textField.setText(string.replace(".0", ""));
                } else {
                    textField.setText(string);
                }
                label.setText("(sqr)" + str);
                if (string.endsWith(".0")) {
                    textField.setText(string.replace(".0", ""));
                } else {
                    textField.setText(string);
                }
            } else if (buttonPressed == equalsButton) {
                switch (calculation) {
                    case 1 -> {
                        answer = number + Double.parseDouble(textField.getText());
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                    }
                    case 2 -> {
                        answer = number - Double.parseDouble(textField.getText());
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                    }
                    case 3 -> {
                        answer = number * Double.parseDouble(textField.getText());
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                    }
                    case 4 -> {
                        answer = number / Double.parseDouble(textField.getText());
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("");
                    }
                }
            }
        }catch(Exception exp){
            label.setText("Error occurred..");
        }
    }
}

