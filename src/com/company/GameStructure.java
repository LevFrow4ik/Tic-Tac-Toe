package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Random;



public class GameStructure  {



    Boolean player1_turn;
    Icon backgr = new ImageIcon( "Background.png" );
    Random ran = new Random();
    Font fontB = new Font( "MV Boli", Font.BOLD, 35 );
    Font fontB1 = new Font( "MV Boli", Font.BOLD, 12 );
    Font fontT = new Font( "Montserat", Font.BOLD, 12 );
    Font fontT1 = new Font( "Montserat", Font.BOLD, 11 );
    public JFrame frame = new JFrame();
    JFrame frame1 = new JFrame();
    JPanel buttonsPanel = new JPanel();
    JPanel labelPanel;
    JLabel welcome;
    JButton b1, b2, ST, exit;
    JButton[] buttons = new JButton[9];
    JLabel fieldT = new JLabel();
    public int times;

    public GameStructure() {

            frame1.setTitle( "Tic tac toe" );
            frame1.setIconImage( Toolkit.getDefaultToolkit().getImage( getClass().getResource( "Логотип Tic-Tac-Toe.png" ) ) );
            frame1.setSize( 300, 300 );
            frame1.setResizable( false );
            frame1.setLocationRelativeTo( null );
            frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            frame1.getContentPane().setBackground( Color.BLACK );
            frame1.setVisible( true );

            welcome = new JLabel();
            welcome.setText( "  Tic-tac-toe" );
            welcome.setForeground( Color.YELLOW );
            welcome.setFont( fontB );
            frame1.add( welcome, BorderLayout.NORTH );

            b2 = new JButton();
            b2.setSize( 150, 30 );
            b2.setFont( fontT1 );
            b2.setText( "Game with computer" );
            b2.setLocation( 65, 120 );
            frame1.add( b2 );

            b1 = new JButton();
            b1.setSize( 150, 30 );
            b1.setFont( fontT );
            b1.setText( "Game for 2 players" );
            b1.setLocation( 65, 170 );
            frame1.add( b1 );

            b1.addActionListener( new forTwoPlayers() );
            b2.addActionListener( new forOnePlayer() );

    }

    private class forOnePlayer implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
          //  JOptionPane.showMessageDialog( null, "Данный режим пока что не работает!", "Ошибка", JOptionPane.ERROR_MESSAGE );
            frame1.hide();
           GameMain1 game = new GameMain1();
        }
    }
    private class forTwoPlayers implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.hide();
            GameMain game = new GameMain();
        }
    }
}

//class b2Action extends GameStructure implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog( null, "Данный режим пока что не работает!", "Ошибка", JOptionPane.ERROR_MESSAGE );
//    }
//
//
//}


