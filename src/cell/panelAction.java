
package cell;

public class panelAction extends javax.swing.JPanel {

    public panelAction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TAB_edit = new cell.actionButton();
        TAB_delete = new cell.actionButton();
        TAB_add = new cell.actionButton();

        TAB_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eye_13949477 (1).png"))); // NOI18N
        TAB_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_editActionPerformed(evt);
            }
        });

        TAB_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-24.png"))); // NOI18N

        TAB_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-24.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TAB_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TAB_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TAB_add, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB_add, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAB_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAB_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TAB_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TAB_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cell.actionButton TAB_add;
    private cell.actionButton TAB_delete;
    private cell.actionButton TAB_edit;
    // End of variables declaration//GEN-END:variables
}
