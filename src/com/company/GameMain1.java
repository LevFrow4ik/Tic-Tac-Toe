package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameMain1 extends GameStructure implements ActionListener {
    private boolean computer_turn;
    private boolean PCwin, PlayerWin;

    private int turns;

    public GameMain1() {
        frame1.hide();
        frame.setTitle( "Game" );
        frame.setIconImage( Toolkit.getDefaultToolkit().getImage( getClass().getResource( "Логотип Tic-Tac-Toe.png" ) ) );
        frame.setSize( 600, 600 );
        frame.setLocation( 1000, 200 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setBackground( Color.BLACK );
        frame.setVisible( true );

        fieldT.setBackground( Color.BLACK );
        fieldT.setForeground( Color.YELLOW );
        fieldT.setText( "            Tic-tac-toe" );
        fieldT.setFont( fontB );
        frame.add( fieldT );

        exit = new JButton();
        exit.setLocation( 0, 0 );
        exit.setBackground( Color.black );
        exit.setForeground( Color.YELLOW );
        exit.setSize( 70, 27 );
        exit.setFont( fontB1 );
        exit.setText( "Exit" );
        fieldT.add( exit );
        exit.addActionListener( new exitAction() );

        buttonsPanel.setBackground( Color.WHITE );
        buttonsPanel.setLayout( new GridLayout( 3, 3 ) );
        buttonsPanel.setVisible( true );
        frame.add( buttonsPanel );

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont( fontB );
            buttons[i].setSize( 25, 25 );
            buttons[i].setBackground( Color.WHITE );
            buttonsPanel.add( buttons[i] );
        }

        frame.add( fieldT, BorderLayout.NORTH );
        startGame();
    }

    public void startGame() {
        times += 1;
        System.out.println("new Game");
        PCwin = false;
        PlayerWin = false;
        try {
            Thread.sleep( 2000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            turns = new Random().nextInt(1,3);
            WalkGeneration();

    }


    public void PCwalk() {
        if (!PCwin && !PlayerWin) {
            fieldT.setText("              O turn");
      /*      try {
                Thread.sleep( 2000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            if (buttons[0].getText() == "X" && buttons[1].getText() == "X") { //скрипт защиты старт
                buttons[2].setText("O");
                buttons[2].setForeground(new Color(0, 0, 128));
        }    else if (buttons[2].getText() == "X" && buttons[1].getText() == "X") {
                buttons[0].setText("O");
                buttons[0].setForeground(new Color(0, 0, 128));
        }    else if (buttons[3].getText() == "X" && buttons[4].getText() == "X") {
                buttons[5].setText("O");
                buttons[5].setForeground(new Color(0, 0, 128));
        }    else if (buttons[4].getText() == "X" && buttons[5].getText() == "X") {
                buttons[3].setText("O");
                buttons[3].setForeground(new Color(0, 0, 128));
        }    else if (buttons[6].getText() == "X" && buttons[7].getText() == "X") {
                buttons[8].setText("O");
                buttons[8].setForeground(new Color(0, 0, 128));
        }    else if (buttons[8].getText() == "X" && buttons[7].getText() == "X") {
                buttons[6].setText("O");
                buttons[6].setForeground(new Color(0, 0, 128));
        }    else if (buttons[0].getText() == "X" && buttons[3].getText() == "X") {
                buttons[6].setText("O");
                buttons[6].setForeground(new Color(0, 0, 128));
        }    else if (buttons[3].getText() == "X" && buttons[6].getText() == "X") {
                buttons[0].setText("O");
                buttons[0].setForeground(new Color(0, 0, 128));
        }   else if (buttons[1].getText() == "X" && buttons[4].getText() == "X") {
                buttons[7].setText("O");
                buttons[7].setForeground(new Color(0, 0, 128));
        }   else if (buttons[4].getText() == "X" && buttons[7].getText() == "X") {
                buttons[1].setText("O");
                buttons[1].setForeground(new Color(0, 0, 128));
        }    else if (buttons[2].getText() == "X" && buttons[5].getText() == "X") {
                buttons[8].setText("O");
                buttons[8].setForeground(new Color(0, 0, 128));
        }  else if (buttons[5].getText() == "X" && buttons[8].getText() == "X") {
                buttons[2].setText("O");
                buttons[2].setForeground(new Color(0, 0, 128));
        }  else if (buttons[0].getText() == "X" && buttons[4].getText() == "X") {
                buttons[8].setText("O");
                buttons[8].setForeground(new Color(0, 0, 128));
        }  else if (buttons[4].getText() == "X" && buttons[8].getText() == "X") {
                buttons[0].setText("O");
                buttons[0].setForeground(new Color(0, 0, 128));
        }  else if (buttons[2].getText() == "X" && buttons[4].getText() == "X") {
                buttons[6].setText("O");
                buttons[6].setForeground(new Color(0, 0, 128));
        }   else if (buttons[6].getText() == "X" && buttons[4].getText() == "X") { //Скрипт защиты конец
                buttons[2].setText("O");
                buttons[2].setForeground(new Color(0, 0, 128));
        } else if (buttons[0].getText() == "O" && buttons[1].getText() == "O") { //скрипт атаки старт
                buttons[2].setText("O");
                buttons[2].setForeground(new Color(0, 0, 128));
        }   else if (buttons[2].getText() == "O" && buttons[1].getText() == "O") {
            buttons[0].setText("O");
                buttons[0].setForeground(new Color(0, 0, 128));
        }  else if (buttons[3].getText() == "O" && buttons[4].getText() == "O") {
                buttons[5].setText("O");
                buttons[5].setForeground(new Color(0, 0, 128));
        }   else if (buttons[4].getText() == "O" && buttons[5].getText() == "O") {
                buttons[3].setText("O");
                buttons[3].setForeground(new Color(0, 0, 128));
        }  else if (buttons[6].getText() == "O" && buttons[7].getText() == "O") {
                buttons[8].setText("O");
                buttons[8].setForeground(new Color(0, 0, 128));
        }  else if (buttons[8].getText() == "O" && buttons[7].getText() == "O") {
                buttons[6].setText("O");
                buttons[6].setForeground(new Color(0, 0, 128));
        }  else if (buttons[0].getText() == "O" && buttons[3].getText() == "O") {
                buttons[6].setText("O");
                buttons[6].setForeground(new Color(0, 0, 128));
        } else if (buttons[3].getText() == "O" && buttons[6].getText() == "O") {
                buttons[0].setText("O");
                buttons[0].setForeground(new Color(0, 0, 128));
        } else if (buttons[1].getText() == "O" && buttons[4].getText() == "O") {
                buttons[7].setText("O");
                buttons[7].setForeground(new Color(0, 0, 128));
        } else if (buttons[4].getText() == "O" && buttons[7].getText() == "O") {
                buttons[1].setText("O");
                buttons[1].setForeground(new Color(0, 0, 128));
        } else if (buttons[2].getText() == "O" && buttons[5].getText() == "O") {
                buttons[8].setText("O");
                buttons[8].setForeground(new Color(0, 0, 128));
        } else if (buttons[5].getText() == "O" && buttons[8].getText() == "O") {
                buttons[2].setText("O");
                buttons[2].setForeground(new Color(0, 0, 128));
            }   else if (buttons[0].getText() == "O" && buttons[4].getText() == "O") {
                buttons[8].setText("O");
                buttons[8].setForeground(new Color(0, 0, 128));
        }  else if (buttons[4].getText() == "O" && buttons[8].getText() == "X") {
                buttons[0].setText("O");
                buttons[0].setForeground(new Color(0, 0, 128));
        }  else if (buttons[2].getText() == "O" && buttons[4].getText() == "O") {
                buttons[6].setText("O");
                buttons[6].setForeground(new Color(0, 0, 128));
        } else if (buttons[6].getText() == "O" && buttons[4].getText() == "O") { //Скрипт атаки конец
                    buttons[2].setText("O");
                buttons[2].setForeground(new Color(0, 0, 128));
                }
           else if (buttons[0].getText() == "") {
                buttons[0].setText("O");
                buttons[0].setForeground(new Color(0, 0, 128));
        }  else if (buttons[1].getText() == "") {
                buttons[1].setText("O");
                buttons[1].setForeground(new Color(0, 0, 128));
        }  else if (buttons[2].getText() == "") {
                buttons[2].setText("O");
                buttons[2].setForeground(new Color(0, 0, 128));
        } else if (buttons[3].getText() == "") {
                buttons[3].setText("O");
                buttons[3].setForeground(new Color(0, 0, 128));
        } else if (buttons[4].getText() == "") {
                buttons[4].setText("O");
                buttons[4].setForeground(new Color(0, 0, 128));
            } else if (buttons[5].getText() == "") {
                buttons[5].setText("O");
                buttons[5].setForeground(new Color(0, 0, 128));
            } else if (buttons[6].getText() == "") {
                buttons[6].setText("O");
                buttons[6].setForeground(new Color(0, 0, 128));
            } else if (buttons[7].getText() == "") {
                buttons[7].setText("O");
                buttons[7].setForeground(new Color(0, 0, 128));
            } else if (buttons[8].getText() == "") {
                buttons[8].setText("O");
                buttons[8].setForeground(new Color(0, 0, 128));
            }
        }
            checkIsPCWin();
            turns = 2;
            WalkGeneration();
        }



//        if (buttons[butIndex].getText() == "X" || buttons[butIndex].getText() == "O") {
//
//            if (buttons[0].getText() == "") {
//                buttons[0].setForeground( new Color( 0, 0, 128 ) );
//                buttons[0].setText( "O" );
//                System.out.println( butIndex );
//                computer_turn = false;
//                fieldT.setText( "              X turn" );
//                checkIsPCWin();
//            }
//        }

//        if (buttons[1].getText() == "") {
//            buttons[1].setForeground( new Color( 0, 0, 128 ) );
//            buttons[1].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//
//        }
//        if (buttons[2].getText() == "") {
//            buttons[2].setForeground( new Color( 0, 0, 128 ) );
//            buttons[2].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }
//        if (buttons[3].getText() == "") {
//            buttons[3].setForeground( new Color( 0, 0, 128 ) );
//            buttons[3].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }
//        if (buttons[4].getText() == "") {
//            buttons[4].setForeground( new Color( 0, 0, 128 ) );
//            buttons[4].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }
//        if (buttons[5].getText() == "") {
//            buttons[5].setForeground( new Color( 0, 0, 128 ) );
//            buttons[5].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }
//        if (buttons[6].getText() == "") {
//            buttons[6].setForeground( new Color( 0, 0, 128 ) );
//            buttons[6].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }
//        if (buttons[7].getText() == "") {
//            buttons[7].setForeground( new Color( 0, 0, 128 ) );
//            buttons[7].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }
//        if (buttons[8].getText() == "") {
//            buttons[8].setForeground( new Color( 0, 0, 128 ) );
//            buttons[8].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }

//        if (buttons[butIndex].getText() == "") {
//            buttons[butIndex].setForeground( new Color( 0, 0, 128 ) );
//            buttons[butIndex].setText( "O" );
//            System.out.println( butIndex );
//            computer_turn = false;
//            fieldT.setText( "              X turn" );
//            checkIsPCWin();
//        }


    public void checkIsPlayerWin() {


        if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X") {
            buttons[0].setBackground(new Color(0, 255, 0));
            buttons[1].setBackground(new Color(0, 255, 0));
            buttons[2].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;
        } else if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X") {
            buttons[3].setBackground(new Color(0, 255, 0));
            buttons[4].setBackground(new Color(0, 255, 0));
            buttons[5].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;
        }
        else if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X") {
            buttons[6].setBackground(new Color(0, 255, 0));
            buttons[7].setBackground(new Color(0, 255, 0));
            buttons[8].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;
        }
        else if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X") {
            buttons[0].setBackground(new Color(0, 255, 0));
            buttons[3].setBackground(new Color(0, 255, 0));
            buttons[6].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;
        }
        else if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X") {
            buttons[1].setBackground(new Color(0, 255, 0));
            buttons[4].setBackground(new Color(0, 255, 0));
            buttons[7].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;
        }
        else if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X") {
            buttons[2].setBackground(new Color(0, 255, 0));
            buttons[5].setBackground(new Color(0, 255, 0));
            buttons[8].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;
        }
        else if (buttons[6].getText() == "X" && buttons[4].getText() == "X" && buttons[2].getText() == "X") {
            buttons[6].setBackground(new Color(0, 255, 0));
            buttons[4].setBackground(new Color(0, 255, 0));
            buttons[2].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;
        }
        else if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
            buttons[0].setBackground(new Color(0, 255, 0));
            buttons[4].setBackground(new Color(0, 255, 0));
            buttons[8].setBackground(new Color(0, 255, 0));
            Playerwins();
            PlayerWin = true;

        }

           /* if(buttons[0].getText() == "X" || buttons[0].getText() == "O" && buttons[1].getText() == "X" || buttons[1].getText() == "O"
                    && buttons[2].getText() == "X" || buttons[2].getText() == "O" && buttons[3].getText() == "X" || buttons[3].getText() == "O" &&
                    buttons[3].getText() == "X" || buttons[3].getText() == "O" && buttons[4].getText() == "X" || buttons[4].getText() == "O"
                    && buttons[5].getText() == "X" || buttons[5].getText() == "O" && buttons[6].getText() == "X" || buttons[6].getText() == "O"
                    && buttons[7].getText() == "X" || buttons[7].getText() == "O" && buttons[8].getText() == "X" || buttons[8].getText() == "O")*/
     /*  else {
            PlayerWin = true;
            PCwin = true;
            draw();
        }*/

    }


    public void checkIsPCWin() {

            if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[1].setBackground( new Color( 0, 255, 0 ) );
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }
            else if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O") {
                buttons[3].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[5].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }
            else if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O") {
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                buttons[7].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }
            else if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[3].setBackground( new Color( 0, 255, 0 ) );
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }
            else if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O") {
                buttons[1].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[7].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }
            else if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O") {
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                buttons[5].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }
            else if (buttons[6].getText() == "O" && buttons[4].getText() == "O" && buttons[2].getText() == "O") {
                buttons[6].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[2].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }
            else if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
                buttons[0].setBackground( new Color( 0, 255, 0 ) );
                buttons[4].setBackground( new Color( 0, 255, 0 ) );
                buttons[8].setBackground( new Color( 0, 255, 0 ) );
                PCwins();
                PCwin = true;
            }


     /*   if(buttons[0].getText() == "X" || buttons[0].getText() == "O" && buttons[1].getText() == "X" || buttons[1].getText() == "O"
                && buttons[2].getText() == "X" || buttons[2].getText() == "O" && buttons[3].getText() == "X" || buttons[3].getText() == "O" &&
                buttons[3].getText() == "X" || buttons[3].getText() == "O" && buttons[4].getText() == "X" || buttons[4].getText() == "O"
                && buttons[5].getText() == "X" || buttons[5].getText() == "O" && buttons[6].getText() == "X" || buttons[6].getText() == "O"
                && buttons[7].getText() == "X" || buttons[7].getText() == "O" && buttons[8].getText() == "X" || buttons[8].getText() == "O")*/ {
       /*     PlayerWin = true;
            PCwin = true;
            draw();*/
        }
    }

    public void draw() {
        fieldT.setText( "            It's draw!" );
        ST = new JButton();
        ST.setSize( 100, 27 );
        ST.setLocation( 485, 0 );
        ST.setBackground( Color.black );
        ST.setForeground( Color.YELLOW );
        ST.setFont( fontB1 );
        ST.setText( "Play again" );
        ST.addActionListener( new STaction() );
        fieldT.add( ST );
    }


    public void Playerwins() {
        fieldT.setText( "       You are the winner!" );
        ST = new JButton();
        ST.setSize( 100, 27 );
        ST.setLocation( 485, 0 );
        ST.setBackground( Color.black );
        ST.setForeground( Color.YELLOW );
        ST.setFont( fontB1 );
        ST.setText( "Play again" );
        ST.addActionListener( new STaction() );
        fieldT.add( ST );
        //  int ans = JOptionPane.showConfirmDialog( null, "Сыграем заново?", "Крестики-Нолики", JOptionPane.YES_NO_OPTION);
//        switch (ans) {
//            case 0:
//                frame.hide();
//                GameStructure game = new GameStructure();
//                break;
//            case 1:
//                frame.hide();
//                JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//                System.exit( 0 );
//
//        if(ns == JOptionPane.YES_OPTION) {
//            frame.hide();
//            GameStructure game = new GameStructure();
//
//        }
//        if(ans == JOptionPane.NO_OPTION) {
//            frame.hide();
//            JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//            System.exit( 0 );
//        }
    }



    public void PCwins() {
        fieldT.setText( "          PC is the winner!" );
        ST = new JButton();
        ST.setSize( 100, 27 );
        ST.setLocation( 485, 0 );
        ST.setBackground( Color.black );
        ST.setForeground( Color.YELLOW );
        ST.setFont( fontB1 );
        ST.setText( "Play again" );
        ST.addActionListener( new STaction() );
        fieldT.add( ST );
//        int ans = JOptionPane.showConfirmDialog( null, "Сыграем заново?", "Крестики-Нолики", JOptionPane.YES_NO_OPTION);
//        switch (ans) {
//            case 0:
//                frame.hide();
//                startGame();
//                break;
//            case 1:
//                frame.hide();
//                JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//                System.exit( 0 );
//
//       }
//        if(ans == JOptionPane.YES_OPTION) {
//            frame.hide();
//            GameStructure game = new GameStructure();
//        }
//        if(ans == JOptionPane.NO_OPTION) {
//            frame.hide();
//            JOptionPane.showMessageDialog( null, "Cпасибо за использование нашей игры! \n Ждём вас снова!", "Благодарим", JOptionPane.PLAIN_MESSAGE );
//            System.exit( 0 );
//        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (turns == 2) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground( new Color( 139, 0, 0 ) );
                        buttons[i].setText( "X" );
                        checkIsPlayerWin();
                        turns = 1;
                        WalkGeneration();
                    }
                }
            }
        }
    }
    public void WalkGeneration() {
        if(!PCwin && !PlayerWin ) {
            System.out.println(turns + " turns");
            //  System.out.println(times + " times" );
            if (turns == 1) {
                PCwalk();
            }

            if (turns == 2) {
                fieldT.setText("              X turn");
                for (int i = 0; i < 9; i++) {
                    buttons[i].addActionListener(this);
                }
            }
        }
    }


    private class STaction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 9; i++) {
                buttons[i].setText( "" );
                buttons[i].setBackground( Color.WHITE );
            }
            startGame();
        }
    }

    private class exitAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.hide();
            GameStructure gameAgain = new GameStructure();
        }
    }
}