
package model;

public class Model_Message {

   
    public boolean isAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(boolean action) {
        this.action = action;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the data
     */
   
    public Model_Message() {
    }

    public Model_Message(boolean action, String message) {
        this.action = action;
        this.message = message;
        
    }
     
    

    private boolean action;
    private String message;
    
    
}
