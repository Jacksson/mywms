/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.bobrowser.bo.editor;

import de.linogistix.common.res.CommonBundleResolver;
import java.awt.Dialog;
import javax.swing.UIManager;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.NbBundle;

/**
 *
 * @author  trautm
 */
public class NoValueMessage extends javax.swing.JPanel {
  
  /**
   * Creates new form NoValueMessage
   */
  public NoValueMessage() {
    initComponents();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();

    setLayout(new java.awt.GridBagLayout());

    setEnabled(false);
    jLabel1.setIcon(UIManager.getIcon("OptionPane.warningIcon"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    add(jLabel1, gridBagConstraints);

    jScrollPane1.setBorder(null);
    jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
    jTextArea1.setColumns(20);
    jTextArea1.setEditable(false);
    jTextArea1.setLineWrap(true);
    jTextArea1.setRows(5);
    jTextArea1.setText(NbBundle.getMessage(CommonBundleResolver.class,"BusinessException.NoValue"));
    jTextArea1.setWrapStyleWord(true);
    jTextArea1.setAutoscrolls(false);
    jTextArea1.setBorder(null);
    jScrollPane1.setViewportView(jTextArea1);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
    add(jScrollPane1, gridBagConstraints);

  }// </editor-fold>//GEN-END:initComponents
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  // End of variables declaration//GEN-END:variables
  

}
