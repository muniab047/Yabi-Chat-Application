/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package appComponent;

import java.awt.Color;

public class Chat_Right extends javax.swing.JPanel {

    
    public Chat_Right() {
        initComponents();
        txt.setBackground(new Color(204,220,139));
    }

    public void setText(String text) {
        if (text.equals("")) {
            //txt.hideText();
        } else {
            txt.setText(text);
        }
        
    }


    public void setTime() {
        txt.setTime("10:30 PM");    //  sample
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new appComponent.chat_item();

        txt.setBackground(new java.awt.Color(223, 233, 183));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private appComponent.chat_item txt;
    // End of variables declaration//GEN-END:variables
}
