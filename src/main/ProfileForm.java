package main;

public class ProfileForm {

    private Button saveButton;
    private InputField nameField;

    public ProfileForm() {
        this.saveButton = new Button("Save");
        this.nameField = new InputField();
    }

    public void show() {
        // Display Profile Form
    }

    public InputField getNameField() {
        return this.nameField;
    }
}
