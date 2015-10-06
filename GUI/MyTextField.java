package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Александр on 19.09.2015.
 */
public class MyTextField extends JTextField {

    public MyTextField() {
        setName("Введите имя");
        setForeground(new Color(240, 248, 255));
        requestFocus();


    }
}
