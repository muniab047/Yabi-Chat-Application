
package appComponent;

import java.awt.Color;
import javax.swing.JScrollBar;
import model.Model_Recieve_Message;
import model.Model_Send_Message;
import net.miginfocom.swing.MigLayout;


public class Chat_Body extends javax.swing.JPanel {

    
    public Chat_Body() {
        initComponents();
        init();
      
    }
    
    private void init(){
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new JScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
    
    
    
    public void addItemLeft(Model_Recieve_Message data){
        Chat_Left item = new Chat_Left();
        item.setText(data.getText());
        body.add(item, "wrap, w :: 80%"); // :: 80% set max width 80%
        repaint();
        revalidate();
    }
      public void addItemLeft(String text, String user){
        Chat_Left_with_profile item = new Chat_Left_with_profile();
        item.setText(text);
        item.setUserProfile(user);
        body.add(item, "wrap, w :: 80%"); // :: 80% set max width 80%
        body.repaint();
        body.revalidate();
    }
    
    public void addItemRight(Model_Send_Message data){
        Chat_Right item = new Chat_Right();
        item.setText(data.getText());
        body.add(item, "wrap, al right, w :: 80%");
        // :: 80% set max width 80%
        repaint();
        revalidate();
        item.setTime();
        
    }
    public void clearChat(){
        body.removeAll();
        repaint();
        revalidate();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(223, 233, 183));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
