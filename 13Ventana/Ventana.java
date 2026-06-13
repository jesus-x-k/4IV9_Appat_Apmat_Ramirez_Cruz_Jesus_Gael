import javax.swing.*;

public class Ventana {
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("");

        ventana.setSize(400, 160);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        
        ventana.add(panel);

        agragarComponentes(panel);

        ventana.setVisible(true);
    }

    private static void agragarComponentes(JPanel panel) {
        panel.setLayout(null);


        JLabel userlabel = new JLabel("Nombre de usuario");
        userlabel.setBounds(10, 20, 120, 50);
        panel.add(userlabel);

        JTextField usertext = new JTextField(20);
        usertext.setBounds(160, 10, 160, 25);
        panel.add(usertext);
    }

}   
