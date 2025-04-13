package View;

import DAOs.SpecificDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author augustosimionato
 */
public class LoginView extends javax.swing.JFrame {

    private static LoginView tela;
    private static int idLogin;

    public static int getIdLogin() {
        return idLogin;
    }

    public LoginView() {
        SpecificDAO.CriaConexao();
        initComponents();
    }

    public static LoginView getLogin() {
        if (tela == null) {
            tela = new LoginView();
        }
        return tela;
    }

    public static void setLogin() {
        tela = null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GoHome = new javax.swing.JButton();
        EmailTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        imageLabel = new javax.swing.JLabel();
        GoNewAccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 576));

        GoHome.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        GoHome.setText("Entrar");
        GoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoHomeActionPerformed(evt);
            }
        });

        EmailTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EmailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/title.png"))); // NOI18N

        GoNewAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GoNewAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoNewAccount.setText("Criar Conta");
        GoNewAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoNewAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 393, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(PasswordField))
                .addGap(377, 377, 377))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imageLabel)
                        .addGap(341, 341, 341))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GoNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(455, 455, 455))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(imageLabel)
                .addGap(56, 56, 56)
                .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(GoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GoNewAccount)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1040, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoHomeActionPerformed
        if (!EmailTextField.getText().isEmpty() && !PasswordField.getText().isEmpty()) {
            if (SpecificDAO.logUsuario(EmailTextField.getText(), PasswordField.getText())) {
                try {
                    idLogin = SpecificDAO.getIdLoginBD();
                    new View.Home.HomeView().setVisible(true);
                    this.setVisible(false);
                } catch (SQLException ex) {
                    System.out.println("Erro ao carregar id: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível fazer o login, tente novamente.",
                        "Login",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Campos de e-mail ou senha estão vazios!",
                    "Login",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_GoHomeActionPerformed

    private void GoNewAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoNewAccountMouseClicked
        new View.NewAccountView().setVisible(true);
    }//GEN-LAST:event_GoNewAccountMouseClicked

    public void clearFields() {
        EmailTextField.setText("");
        PasswordField.setText("");
        EmailTextField.requestFocus();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField EmailTextField;
    private javax.swing.JButton GoHome;
    private javax.swing.JLabel GoNewAccount;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
