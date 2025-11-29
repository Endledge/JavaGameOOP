package com.ror.gameengine;

import com.ror.gamemodel.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public void createGameScreen(){
    titleNamePanel.setVisible(false);
    startButtonPanel.setVisible(false);

    // ---------- MAIN TEXT PANEL ----------
    mainTextPanel = new JPanel();
    mainTextPanel.setBounds(100, 100, 600, 250);
    mainTextPanel.setBackground(new Color(30,30,30,220)); // semi-transparent dark gray
    mainTextPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
    mainTextPanel.setLayout(new BorderLayout());
    con.add(mainTextPanel);

    mainTextArea = new JTextArea("This is the main text area. This game is going to be great. I'm sure of it!!!!!!!");
    mainTextArea.setBackground(new Color(0,0,0,0)); // transparent
    mainTextArea.setForeground(Color.LIGHT_GRAY);
    mainTextArea.setFont(new Font("Segoe UI", Font.PLAIN, 24));
    mainTextArea.setLineWrap(true);
    mainTextArea.setWrapStyleWord(true);
    mainTextArea.setEditable(false);
    mainTextArea.setMargin(new Insets(10,10,10,10));

    mainTextPanel.add(mainTextArea, BorderLayout.CENTER);

    // ---------- CHOICE BUTTON PANEL ----------
    choiceButtonPanel = new JPanel();
    choiceButtonPanel.setBounds(250, 370, 300, 180);
    choiceButtonPanel.setBackground(new Color(0,0,0,0));
    choiceButtonPanel.setLayout(new GridLayout(4,1,0,10));
    con.add(choiceButtonPanel);

    choice1 = createStyledButton("Choice 1", "c1");
    choice2 = createStyledButton("Choice 2", "c2");
    choice3 = createStyledButton("Choice 3", "c3");
    choice4 = createStyledButton("Choice 4", "c4");

    choiceButtonPanel.add(choice1);
    choiceButtonPanel.add(choice2);
    choiceButtonPanel.add(choice3);
    choiceButtonPanel.add(choice4);

    // ---------- PLAYER PANEL ----------
    playerPanel = new JPanel();
    playerPanel.setBounds(100, 15, 600, 50);
    playerPanel.setBackground(new Color(30,30,30,200));
    playerPanel.setLayout(new GridLayout(1,4,10,0));
    playerPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
    con.add(playerPanel);

    hpLabel = new JLabel("HP:");
    hpLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
    hpLabel.setForeground(Color.WHITE);
    playerPanel.add(hpLabel);

    hpLabelNumber = new JLabel();
    hpLabelNumber.setFont(new Font("Segoe UI", Font.BOLD, 24));
    hpLabelNumber.setForeground(Color.LIGHT_GRAY);
    playerPanel.add(hpLabelNumber);

    weaponLabel = new JLabel("Weapon:");
    weaponLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
    weaponLabel.setForeground(Color.WHITE);
    playerPanel.add(weaponLabel);

    weaponLabelName = new JLabel();
    weaponLabelName.setFont(new Font("Segoe UI", Font.BOLD, 24));
    weaponLabelName.setForeground(Color.LIGHT_GRAY);
    playerPanel.add(weaponLabelName);

    // Initialize player
    playerSetup();

    
}