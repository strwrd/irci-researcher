package main;

public class DialogBox {

    private boolean isHide;
    private Message message;
    private Button cancelButton;

    public DialogBox(Message message, Button cancelButton) {
        this.message = message;
        this.cancelButton = cancelButton;

        this.isHide = true;
    }

    public void show(){
        // Display Dialog Box
        this.isHide = false;
    }

    public void hide(){
        // Close Dialog Box;
        this.isHide = true;
    }
}
