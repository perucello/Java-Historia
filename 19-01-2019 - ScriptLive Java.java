-----------------------

package olamundo;
public class OlaMundo {
 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola Mundo");
        System.out.println("Testando novo PC com sucesso !!!");
        System.out.println("Não sofrerei com a Mísitica de não fazer Olá Mundo hahaha !!!");
    }
    
}

-------------------------

package idiomasistema;
 
import java.util.Locale;
 
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        System.out.println("Notebook Fábio Perucello");
        System.out.println("Seu sistema está em " + idioma);
    }    
}


-----------------------


package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;
 
public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int larg = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Minha resolução atual do Notebook é: " + larg + " x " + alt);
    }  
}


-------------------------

package testetipos;
/**
 *  
 * @author Perucello
 */
public class TesteTipos {

    public static void main(String[] args) {

      /*  int idade = 60;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
        String valor = "50";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f", idade);
    }
    
}


---------------------------


package tiposprimitivos;

import java.util.Scanner;
/** 
 *
 * @author Perucello
 */
public class TiposPrimitivos {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        
    }
    
}


----------------------------


package olamundo;
public class OlaMundo {
 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola Mundo");
        System.out.println("Testando novo PC com sucesso !!!");
        System.out.println("Não sofrerei com a Mísitica de não fazer Olá Mundo hahaha !!!");
    }
    
}

------------------------

package quehorassao;
import java.util.Date;
/**
 * 
 * @author Perucello
 */
public class Horacerta {

    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.print("Que dia é hoje e que horas são neste momento?   ");
        System.out.println(relogio.toString());
            }
    
}


-------------------------

package swing.olamundo;

public class OlaMundoJava extends javax.swing.JFrame {
/**
 * 
 * @author Perucello
 */
    public OlaMundoJava() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensagem.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(51, 0, 255));
        lblMensagem.setText("Mensagem - swing Olá Mundo");

        btnClick.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnClick.setText("Clique para Magia");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(btnClick))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblMensagem)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblMensagem)
                .addGap(61, 61, 61)
                .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        lblMensagem.setText("Olá, Mundo!");
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OlaMundoJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundoJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration                   
}

----------------------------------


package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Perucello
 */
public class telaIdade extends javax.swing.JFrame {

    public telaIdade() {
        initComponents();
        Date data = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("Y");
        String ano = dataFormatada.format(data);
        lblAnoAtual.setText(ano);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAnoAtual = new javax.swing.JLabel();
        txtAnoNascimento = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Idade");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Ano Atual:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Ano de Nascimento:");

        lblAnoAtual.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblAnoAtual.setForeground(new java.awt.Color(0, 0, 255));
        lblAnoAtual.setText("???");

        txtAnoNascimento.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAnoNascimento.setModel(new javax.swing.SpinnerNumberModel(1900, null, 2015, 1));

        btnCalc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora.png"))); // NOI18N
        btnCalc.setText("Calcular Idade");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("No final desse ano, sua idade será");

        lblIdade.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(0, 0, 255));
        lblIdade.setText("???");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\FP\\SysConecte\\quems era.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalc)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblAnoAtual))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(131, 131, 131)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lblIdade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int ano = Integer.parseInt(lblAnoAtual.getText());
        int nasc = Integer.parseInt(txtAnoNascimento.getValue().toString());
        int idade = ano - nasc;
        lblIdade.setText(Integer.toString(idade));
    }                                       

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaIdade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAnoAtual;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JSpinner txtAnoNascimento;
    // End of variables declaration                   
}


-----------------------------------


