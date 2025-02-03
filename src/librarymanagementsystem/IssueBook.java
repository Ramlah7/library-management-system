package librarymanagementsystem;
import java.sql.ResultSet;
public class IssueBook extends javax.swing.JFrame {
    public IssueBook() {
        initComponents();
        fetchBookId();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        issuedateTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        issueBook = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        book_IDCOMBO = new javax.swing.JComboBox<>();
        bookTitle_txt = new javax.swing.JLabel();
        bookAuthor_txt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Book_Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("issue date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 140, 30));

        username_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_txt.setForeground(new java.awt.Color(102, 0, 102));
        username_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 450, 30));

        issuedateTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        issuedateTxt.setForeground(new java.awt.Color(102, 0, 102));
        issuedateTxt.setText("yyyy-mm-dd");
        issuedateTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        issuedateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuedateTxtActionPerformed(evt);
            }
        });
        getContentPane().add(issuedateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 450, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Issue a book");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 170, 40));

        issueBook.setText("Issue");
        issueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookActionPerformed(evt);
            }
        });
        getContentPane().add(issueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 100, 40));

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 100, 40));
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 230, 40));

        book_IDCOMBO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        book_IDCOMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_IDCOMBOActionPerformed(evt);
            }
        });
        getContentPane().add(book_IDCOMBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 450, 30));

        bookTitle_txt.setBackground(new java.awt.Color(255, 255, 255));
        bookTitle_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookTitle_txt.setForeground(new java.awt.Color(102, 0, 102));
        bookTitle_txt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        getContentPane().add(bookTitle_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 450, 30));

        bookAuthor_txt.setBackground(new java.awt.Color(255, 255, 255));
        bookAuthor_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookAuthor_txt.setForeground(new java.awt.Color(102, 0, 102));
        bookAuthor_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(bookAuthor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 450, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Book title");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("Book author");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/hoem bg.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issuedateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuedateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issuedateTxtActionPerformed

    private void issueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookActionPerformed
        // TODO add your handling code here:
        String book_Id= (String) book_IDCOMBO.getSelectedItem();
        String username=username_txt.getText();
        String issueDate=issuedateTxt.getText();
        String book_author = bookAuthor_txt.getText();
        String book_title = bookTitle_txt.getText();
        
        try {
            ConnectionClass obj=new ConnectionClass();
            String query="insert into issuedbooks (Book_id,Book_name,author ,username,issue_Date) values('"+book_Id+"','"+book_title+"','"+book_author+"','"+username+"','"+issueDate+"')";
            int rowschanged=obj.stmt.executeUpdate(query);
            if(rowschanged>0){
                message.setText("Book issued successfully.");
                try {
                String changeAvailability="update books set available = 0  where book_id='"+book_Id+"'";
                int rowschanged1=obj.stmt.executeUpdate(changeAvailability);
        }
        catch (Exception e) {
            message.setText("An error occurred while updating the book availability.");
            e.printStackTrace();
        }
            } else {
                message.setText("Book  did not issued successfully.");
            }
        }
        catch (Exception e) {
            message.setText("An error occurred while issuing the book.");
            e.printStackTrace();
        }
//        
        
    }//GEN-LAST:event_issueBookActionPerformed

    private void fetchBookId(){
        try {
            ConnectionClass obj = new ConnectionClass();
            String query = "select Book_id from books where available = 1 ";
            ResultSet result=obj.stmt.executeQuery(query);
            book_IDCOMBO.removeAllItems();
            while (result.next()){
                book_IDCOMBO.addItem(result.getString("Book_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void book_IDCOMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_IDCOMBOActionPerformed
        // TODO add your handling code here:
         String selectedBookId = (String) book_IDCOMBO.getSelectedItem();
            try {
                ConnectionClass obj = new ConnectionClass();
                String query = "SELECT Title, Author FROM books WHERE Book_id = '" + selectedBookId + "' AND available = 1";
                ResultSet result = obj.stmt.executeQuery(query);

                if (result.next()) {
                    String title = result.getString("Title");
                    String author = result.getString("Author");

                    bookTitle_txt.setText(title);
                    bookAuthor_txt.setText(author);
                }
            } catch (Exception e) {
            message.setText("An error occurred while fetching book details.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_book_IDCOMBOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new admin_home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

        
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookAuthor_txt;
    private javax.swing.JLabel bookTitle_txt;
    private javax.swing.JComboBox<String> book_IDCOMBO;
    private javax.swing.JButton issueBook;
    private javax.swing.JTextField issuedateTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel message;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
