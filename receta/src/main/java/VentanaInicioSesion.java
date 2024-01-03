import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicioSesion extends JFrame implements ActionListener {
  
  private JTextField campoUsuario;
  private JPasswordField campoContraseña;
  
  public VentanaInicioSesion() {
    // Título de la ventana
    setTitle("Inicio de sesión");
    
    // Panel para los componentes
    JPanel panel = new JPanel(new GridLayout(3, 1));
    
    // Componentes para el inicio de sesión
    JLabel etiquetaUsuario = new JLabel("Usuario:");
    campoUsuario = new JTextField(20);
    JLabel etiquetaContraseña = new JLabel("Contraseña:");
    campoContraseña = new JPasswordField(20);
    JButton botonIniciarSesion = new JButton("Iniciar sesión");
    botonIniciarSesion.addActionListener(this);
    
    // Añadir componentes al panel
    panel.add(etiquetaUsuario);
    panel.add(campoUsuario);
    panel.add(etiquetaContraseña);
    panel.add(campoContraseña);
    panel.add(new JPanel());
    panel.add(botonIniciarSesion);
    
    // Añadir panel a la ventana
    add(panel);
    
    // Tamaño de la ventana
    setSize(400, 300);
    
    // Posición de la ventana en la pantalla
    setLocationRelativeTo(null);
    
    // Acción a realizar al cerrar la ventana
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Mostrar la ventana
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) {
    String usuario = campoUsuario.getText();
    String contraseña = new String(campoContraseña.getPassword());
    
    if (usuario.equals("admin") && contraseña.equals("1234")) {
   
      System.out.println("Inicio de sesión exitoso");
    } else {
     
      System.out.println("Usuario o contraseña incorrectos");
    }
  }
  
  public static void main(String[] args) {
    new VentanaInicioSesion();
  }
}
