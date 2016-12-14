package Attraction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Controller extends JPanel implements ActionListener {

  private String selectedMob = "";
  private Grid grid;
  JLabel selectedMobLabel;

  JButton warriorButton;
  JButton archerButton;

  JButton clearButton;
  JButton exitButton;

  public Controller(int width, int height) {
    setPreferredSize(new Dimension(width, height));
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    setBackground(Color.GRAY);

    //spacing between buttons
    add(Box.createRigidArea(new Dimension (50, 50)));

    selectedMobLabel = new JLabel("Selected Mob: None");
    add(selectedMobLabel);

    //spacing between buttons
    add(Box.createRigidArea(new Dimension (50, 50)));

    warriorButton = new JButton("Select Warrior");
    warriorButton.setBackground(new Color(239, 53, 53));
    warriorButton.setForeground(Color.WHITE);
    warriorButton.setFocusPainted(false);
    warriorButton.setFont(new Font("Tahoma", Font.BOLD, 12));
    add(warriorButton);
    warriorButton.addActionListener(this);

    //spacing between buttons
    add(Box.createRigidArea(new Dimension (20, 20)));

    archerButton = new JButton("Select Archer");
    archerButton.setBackground(new Color(59, 89, 182));
    archerButton.setForeground(Color.WHITE);
    archerButton.setFocusPainted(false);
    archerButton.setFont(new Font("Tahoma", Font.BOLD, 12));
    add(archerButton);
    archerButton.addActionListener(this);

    //spacing between buttons
    add(Box.createRigidArea(new Dimension (50, 50)));

    clearButton = new JButton("Clear");
    clearButton.setBackground(Color.WHITE);
    clearButton.setFocusPainted(false);
    clearButton.setFont(new Font("Tahoma", Font.BOLD, 12));
    add(clearButton);
    clearButton.addActionListener(this);

    //spacing between buttons
    add(Box.createRigidArea(new Dimension (50, 50)));

    exitButton = new JButton("Exit");
    exitButton.setBackground(Color.WHITE);
    exitButton.setFocusPainted(false);
    exitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
    add(exitButton);
    exitButton.addActionListener(this);
  }

  public void setGrid(Grid g) { this.grid = g; }

  public String getSelectedMob() { return selectedMob; }

  @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource() == clearButton) {
        grid.clearAll();
      }

      if(ae.getSource() == warriorButton) {
        selectedMob = "Warrior";
        selectedMobLabel.setText("Selected Mob: " + selectedMob);
      }

      if(ae.getSource() == archerButton) {
        selectedMob = "Archer";
        selectedMobLabel.setText("Selected Mob: " + selectedMob);
      }

      if(ae.getSource() == exitButton) {
        System.exit(0);
      }
    }
}
