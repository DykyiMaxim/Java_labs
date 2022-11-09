package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class Login_form extends JFrame {
    Font font14 = new Font("Times new roman", Font.ITALIC, 14);
    Font font16 = new Font("Times new roman", Font.ITALIC, 16);
    Font font18 = new Font("Times new roman", Font.TYPE1_FONT, 18);
    Font font20 = new Font("Times new roman", Font.BOLD, 20);
    Font font22 = new Font("Times new roman", Font.ITALIC, 22);
    Font font24 = new Font("Times new roman", Font.TYPE1_FONT, 22);
    Font font26 = new Font("Times new roman", Font.ITALIC, 26);
    Font font28 = new Font("Times new roman", Font.ITALIC, 28);
    Font font30 = new Font("Times new roman", Font.ITALIC, 30);

    Font fontreg = new Font("Times new roman", Font.BOLD, 30);
    Color BackgroundColor = new Color(0xC4BD97);
    Color RegisterColor = new Color(0x943634);
    Color EntranceColor = new Color(0x08013);
    Color Btn_Color = new Color(0x376092);





    private final JLabel lbl_Register = new JLabel("Реєстрація");
    private final JLabel lbl_acc = new JLabel("У Вас вже є акаунт ?");
    private final JLabel lbl_email = new JLabel("E-mail");
    private final JLabel lbl_password = new JLabel("Пароль");
    private final JTextField field_email = new JTextField();
    private final JPasswordField field_password = new JPasswordField();

    private final JLabel lbl_entrance = new JLabel("Вхід");
    private final JButton Reg_btn = new JButton("Зареєструватися");
    private final JLabel lbl_or_reg_from = new JLabel("Або зареєструватися через");
    private final JButton facebook_icon = new JButton();
    private final JButton gmail_icon = new JButton();
    private final JButton twitter_icon = new JButton();
    //private final JLabel Author_name = new JLabel("Дикий Максим 3 рочки. ПП-42");


    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D f = (Graphics2D) g;
        f.setColor(Btn_Color);
        f.fillRect(130,485,150,4);
        f.fillRect(510,485,150,4);

    }





    public Login_form(){

        setBackground(BackgroundColor);
        setTitle("Login_form");
        setSize(700,600);
        setLocation(new Point(300,200));
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground( BackgroundColor );


        initComponent();
        initEvent();
    }

    private void initComponent(){

        lbl_Register.setFont(fontreg);
        lbl_Register.setForeground(RegisterColor);
        lbl_Register.setBounds(350,20,180,100);

        lbl_acc.setFont(font20);
        lbl_acc.setBounds(250,80,200,100);

        lbl_entrance.setFont(font24);
        lbl_entrance.setForeground(EntranceColor);
        lbl_entrance.setBounds(500,80,100,100);

        lbl_email.setFont(font24);
        lbl_email.setBounds(110,170,100,100);

        field_email.setFont(font28);
        field_email.setBounds(210,190,350,50);


        lbl_password.setFont(font24);
        lbl_password.setBounds(110,260,100,100);

        field_password.setFont(font28);
        field_password.setBounds(210,280,350,50);

        Reg_btn.setBackground(Btn_Color);
        Reg_btn.setForeground(Color.WHITE);
        Reg_btn.setFont(font18);
        Reg_btn.setBounds(300,380,180,50);

        lbl_or_reg_from.setFont(font14);
        lbl_or_reg_from.setBounds(310,430,250,50);

        facebook_icon.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/fb.png"))));
        facebook_icon.setBounds(320,470,40,40);

        gmail_icon.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/gmail.png"))));
        gmail_icon.setBounds(380,470,45,40);

        twitter_icon.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/twiter.png"))));
        twitter_icon.setBounds(440,470,45,40);












        add(lbl_Register);
        add(lbl_acc);
        add(lbl_entrance);
        add(lbl_email);
        add(field_email);
        add(lbl_password);
        add(field_password);
        add(Reg_btn);
        add(lbl_or_reg_from);
        add(facebook_icon);
        add(gmail_icon);
        add(twitter_icon);




    }

    private void initEvent() {

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });



    }
}
