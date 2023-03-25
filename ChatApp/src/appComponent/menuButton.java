
package appComponent;

import javax.swing.Icon;
import javax.swing.JButton;


public class menuButton extends JButton {
    public Icon getIconSimple(){
        return iconSimple;
    }
    
    public void setIconSimple (Icon iconSimple){
        this.iconSimple = iconSimple;
    }
    
    public Icon getIconSelected(){
        return iconSelected;
    }
    public void setIconSelected (Icon iconSelected){
        this.iconSelected=iconSelected;
    }
    private Icon iconSimple;
    private Icon iconSelected;
    public menuButton(){
    setContentAreaFilled(false);
    setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }
    
    @Override
    public void setSelected(boolean bln){
        super.setSelected(bln);
        if(bln){
            setIcon(iconSelected);
        }else{
            setIcon(iconSimple);
        }
        
    }
    
}
