package edu.yu.cs.com1320.project.Graphics;

import edu.yu.cs.com1320.project.Car;
import edu.yu.cs.com1320.project.MaintenanceJob;
import edu.yu.cs.com1320.project.Shop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class MaintanaceMarkDone implements ActionListener {


    JFrame frame;
    JButton markFinished;

    Hashtable<String,MaintenanceJob> MaintanaceHashTable = new Hashtable<>();

    Car car;
    MaintenanceJob jobSelected;

    public MaintanaceMarkDone(JFrame tmpFrame, Shop shop, Car car){
        frame = tmpFrame;
        frame.setLayout(new FlowLayout());
        this.car = car;
        paintGUI();


    }
    private void paintGUI(){
        markFinished = new JButton("Completed");

        for(MaintenanceJob job: car.getCurrentMaintenance()){
            MaintanaceHashTable.put(job.toString(),job);
        }
        JComboBox maintanceCurrent = new JComboBox(MaintanaceHashTable.keySet().toArray());
        maintanceCurrent.addActionListener(this);
        markFinished.addActionListener(this);

        //Set up the picture.
        frame.getContentPane().setFont(frame.getContentPane().getFont().deriveFont(Font.ITALIC));

        //The preferred size is hard-coded to be the width of the
        //widest image and the height of the tallest image + the border.
        //A real program would compute this.

        //Lay out the demo.

        frame.getContentPane().add(maintanceCurrent, BorderLayout.PAGE_START);
        frame.getContentPane().add(markFinished);
        frame.getContentPane().repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Object object = e.getSource();
        if(object instanceof JComboBox){
            JComboBox combo = (JComboBox)object;
            String maintananceJob = (String)combo.getSelectedItem();
            jobSelected = MaintanaceHashTable.get(maintananceJob);
        }
        if(object instanceof JButton) {
            JButton button = (JButton)object;
            String s = button.getActionCommand();
            if (s.equals("Completed")) {

                frame.getContentPane().removeAll();
                MaintanaceHashTable.remove(jobSelected.toString());
                car.removeCurrentMaintenance(jobSelected);
                car.addPreviousMaintenance(jobSelected);
                paintGUI();


            }
        }

    }
}