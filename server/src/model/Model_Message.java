
package model;

public class Model_Message {

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @return the action
     */
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

    public Model_Message() {
    }

    public Model_Message(Object data, boolean action, String message) {
        this.data = data;
        this.action = action;
        this.message = message;
    }
    
    

   
    private Object data;
    private boolean action;
    private String message;
    
}
