package main;

public class InsertMetadataForm {

    private boolean isHide;
    private InputField titleField;
    private InputField abstractField;
    private InputField yearField;
    private InputField keywordField;
    private InputField referencesField;
    private Button submitButton;

    public InsertMetadataForm() {
        this.titleField = new InputField();
        this.abstractField = new InputField();
        this.yearField = new InputField();
        this.keywordField = new InputField();
        this.referencesField = new InputField();
        this.submitButton = new Button("Submit");

        this.isHide = true;
    }

    public void show() {
        this.isHide = false;
    }

    public void hide() {
        this.isHide = true;
    }

    public String[] retrieveForm(){
        String [] forms = new String[5];

        forms[0] = this.titleField.getText();
        forms[1] = this.abstractField.getText();
        forms[2] = this.yearField.getText();
        forms[3] = this.keywordField.getText();
        forms[4] = this.referencesField.getText();

        return forms;
    }


}
