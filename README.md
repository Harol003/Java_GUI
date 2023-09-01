# Java_GUI
EMail: Harol.Torres@Pi.edu.co
 POLITECNICO INTERNACIONAL | ROGRAMACIÓN I |  Ejemplos Basicos GUI Java


![login_background](https://github.com/Harol003/Java_GUI/assets/66041310/04e182d6-c82f-4c31-b857-1b6e16188a0c)

JFrame, una parte fundamental de la biblioteca de interfaz gráfica de usuario Java Swing, desempeña un papel esencial en la creación de interfaces visuales interactivas en aplicaciones Java. Sirve como una ventana personalizable donde se pueden organizar y presentar diversos componentes gráficos, como botones, etiquetas y campos de texto. Las características clave de JFrame incluyen la capacidad de establecer títulos, íconos y botones de cierre, así como la gestión de eventos de usuario, lo que permite interacciones dinámicas. Además, su versatilidad y extensibilidad permiten desarrollar aplicaciones desde las más simples hasta las más complejas, mediante la combinación de diferentes componentes y características.

A continuación, se presenta un ejemplo básico de cómo usar JFrame para construir una pequeña aplicación de calculadora en Java:

![11](https://github.com/Harol003/Java_GUI/assets/66041310/7242bfe6-ea44-4f25-9e7a-43e572d49dc6)



```java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraApp extends JFrame implements ActionListener {
    private JTextField display;
    
    public CalculadoraApp() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        display = new JTextField(15);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};
        
        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }
        
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        
        pack();
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.equals("=")) {
            // Realizar cálculos
        } else if (command.equals("C")) {
            display.setText("");
        } else {
            display.setText(display.getText() + command);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraApp().setVisible(true);
        });
    }
}


```

Este ejemplo crea una ventana de calculadora utilizando JFrame, donde los botones numéricos y de operaciones son componentes interactivos. Los eventos de clic en los botones se manejan para mostrar los números en el campo de texto y realizar cálculos básicos. La estructura general de JFrame se utiliza para establecer la interfaz gráfica y gestionar la interacción con el usuario. A continuacion la explicacion del codigo: 

1. Importar Libreriass: Aquí, se importan las clases necesarias de los paquetes javax.swing.* y java.awt.* que se utilizarán para crear la interfaz gráfica de usuario y gestionar los eventos.
2. Declaración de clase: Se define la clase CalculadoraApp, que extiende la clase JFrame y también implementa la interfaz ActionListener. Esto significa que la clase será capaz de actuar como una ventana y manejar eventos de acción.
3. Declaración de variable privada: Se declara una variable private JTextField display; que se utilizará para mostrar y editar los valores en la pantalla de la calculadora.
4. Constructor: Aquí se define el constructor de la clase CalculadoraApp. Dentro de este constructor se realiza la configuración inicial de la ventana. Se establece el título de la ventana como "Calculadora" y se configura la operación de cierre para que la aplicación se cierre correctamente al hacer clic en la 'X' de la ventana.
5. Configuración del campo de pantalla (display): Se crea un JTextField llamado display con una longitud de 15 caracteres visibles. Se establece como no editable y se alinea a la derecha para mostrar los valores como en una calculadora real.
6. Creación del panel de botones: Se crea un JPanel llamado buttonPanel que se utilizará para contener los botones de la calculadora. Se establece el diseño de cuadrícula (4 filas, 4 columnas) y un espacio de 5 píxeles entre los botones.
7. Definición de botones: Se define un arreglo de cadenas buttons que contiene las etiquetas de los botones que aparecerán en la calculadora.
8. Creación y adición de botones al panel: Se utiliza un bucle for-each para crear botones con las etiquetas definidas en el arreglo buttons. Cada botón se configura para escuchar eventos de acción usando btn.addActionListener(this). Luego, los botones se agregan al buttonPanel.
9. Organización de componentes en la ventana: Se agregan el display en la parte superior (norte) de la ventana y el buttonPanel en el centro de la ventana utilizando un diseño de borde (BorderLayout).
10. Empaquetado y ubicación de la ventana: Se utiliza pack() para ajustar automáticamente el tamaño de la ventana según su contenido. Luego, setLocationRelativeTo(null) se utiliza para centrar la ventana en la pantalla.
11. Método actionPerformed: Este método se implementa debido a la interfaz ActionListener. Aquí se manejan los eventos de acción generados por los botones. Si el comando del evento es "=" o "C", se realizan operaciones específicas (en este caso, se omite la operación de cálculo y se borra el display). De lo contrario, se concatena el comando al contenido actual del display.
12. Método main: Se utiliza SwingUtilities.invokeLater para asegurarse de que la creación y visualización de la ventana se realicen en el subproceso de interfaz gráfica. Se crea una instancia de CalculadoraApp y se hace visible.

De Esta forma, este código muestra cómo crear una calculadora básica utilizando JFrame y Java Swing. Los botones y el campo de texto se organizan en una ventana interactiva que permite la entrada y visualización de valores numéricos. Los eventos de clic en los botones se gestionan mediante el método actionPerformed para construir la lógica de la calculadora.
