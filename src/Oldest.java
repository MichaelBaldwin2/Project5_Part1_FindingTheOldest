import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Oldest {
public static void main(String[] args) {
    List<Person> members = new ArrayList<>();
    JPanel panel = new JPanel();
    JTextField nameField = new JTextField(15);
    JTextField ageField = new JTextField(3);


    panel.add(new JLabel("Name: ")); panel.add(nameField);
    panel.add(Box.createHorizontalStrut(15));
    panel.add(new JLabel("Age: ")); panel.add(ageField);

    while(name.equals("quit"))
    {

    }

    confirmCode = JOptionPane.showConfirmDialog(null, panel,
            "Finding the Oldest", JOptionPane.DEFAULT_OPTION);

    if(confirmCode == JOptionPane.OK_OPTION)
    {
        members.add(new Person(nameField.getText(), Integer.parseInt(ageField.getText())));
    }
}
}