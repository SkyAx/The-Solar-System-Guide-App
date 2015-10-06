package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Александр on 19.09.2015.
 */
public class MyTextArea extends JTextArea {

    public MyTextArea () {
        setBackground(new Color(0, 64, 107));
        setForeground(new Color(240, 248, 255));
        setText("Здравствуйте, Вас приветствует Путеводитель по Солнечной системе.");
    }
}
