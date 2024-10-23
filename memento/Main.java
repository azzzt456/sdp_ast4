package memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Hello");
        history.save(editor);

        editor.setText("Hello, World!");
        history.save(editor);

        editor.setText("Hello, World!!!");

        System.out.println("Current Text: " + editor.getText());  // Output: Hello, World!!!
        history.undo(editor);
        System.out.println("After undo: " + editor.getText());    // Output: Hello, World!
        history.undo(editor);
        System.out.println("After another undo: " + editor.getText());  // Output: Hello
    }
}
