package artSimpleWindow;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleWindow {

	    public static void main(String[] args) {
	        // Создаём и настраиваем окно
	        JFrame frame = new JFrame("Расширенное окно");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);
	        frame.setLocationRelativeTo(null);

	        // Создаём панель для размещения компонентов
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());

	        // Добавляем компоненты
	        JLabel label = new JLabel("Введите текст:");
	        JTextField textField = new JTextField(15);
	        JButton button = new JButton("Нажми меня");

	        // Размещаем компоненты на панели
	        panel.add(label);
	        panel.add(textField);
	        panel.add(button);

	        // Добавляем панель в окно
	        frame.getContentPane().add(panel);

	        // Отображаем окно
	        frame.setVisible(true);
	    }
}