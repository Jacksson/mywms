/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.bobrowser.bo.editor;

import de.linogistix.common.bobrowser.bo.BO;
import de.linogistix.common.bobrowser.browse.BOBrowserNode;
import de.linogistix.common.res.CommonBundleResolver;
import de.linogistix.common.util.BundleResolve;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import org.openide.util.NbBundle;

/**
 *
 * @author  trautm
 */
public class BOEditorTypeChooser extends javax.swing.JPanel {
  
  private static final Logger log = Logger.getLogger(BOEditorTypeChooser.class.getName());
          
  Class type;
  
  /**
   * Creates new form BOEditorTypeChoser
   */
  public BOEditorTypeChooser() {
    initComponents();
    initTypeChooser();
  }
  
  private void initTypeChooser(){
    List types;
    typeChooserLabel.setText(NbBundle.getMessage(CommonBundleResolver.class, "BOCollectionTypeChooser.title"));
    // All types that are shown in Explorer Window
    List<BO> l = BOBrowserNode.getBOs();
    typeChooser.addItem(NbBundle.getMessage(CommonBundleResolver.class,"choose"));
    for (BO bo : l) {
      typeChooser.addItem(bo);
    }
    hintTextArea.setText(NbBundle.getMessage(CommonBundleResolver.class,"BOEditorTypeChoser.hint"));
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    hintPanel = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    hintTextArea = new javax.swing.JTextArea();
    typeChooserPanel = new javax.swing.JPanel();
    typeChooserLabel = new javax.swing.JLabel();
    typeChooser = new javax.swing.JComboBox();

    setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

    hintPanel.setLayout(new java.awt.BorderLayout());

    jScrollPane1.setBorder(null);

    hintTextArea.setBackground(new java.awt.Color(236, 233, 216));
    hintTextArea.setColumns(20);
    hintTextArea.setEditable(false);
    hintTextArea.setLineWrap(true);
    hintTextArea.setRows(5);
    hintTextArea.setWrapStyleWord(true);
    hintTextArea.setBorder(null);
    jScrollPane1.setViewportView(hintTextArea);

    hintPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

    add(hintPanel);

    typeChooserLabel.setText(NbBundle.getMessage(CommonBundleResolver.class,"BOEditorTypeChooser.typeChooserLabel")); // NOI18N
    typeChooserPanel.add(typeChooserLabel);

    typeChooser.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        typeChooserMouseClicked(evt);
      }
    });
    typeChooser.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        typeChooserItemStateChanged(evt);
      }
    });
    typeChooser.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        typeChooserKeyPressed(evt);
      }
      public void keyReleased(java.awt.event.KeyEvent evt) {
        typeChooserKeyReleased(evt);
      }
    });
    typeChooserPanel.add(typeChooser);

    add(typeChooserPanel);
  }// </editor-fold>//GEN-END:initComponents

  private void typeChooserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeChooserItemStateChanged
    if (typeChooser.getSelectedItem() instanceof BO){
      BO bo = (BO)typeChooser.getSelectedItem();
      this.type = bo.getBusinessObjectTemplate().getClass();
    }
  }//GEN-LAST:event_typeChooserItemStateChanged
  
  private void typeChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeChooserMouseClicked

  }//GEN-LAST:event_typeChooserMouseClicked
  
  private void typeChooserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeChooserKeyReleased
    
  }//GEN-LAST:event_typeChooserKeyReleased
  
  private void typeChooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeChooserKeyPressed

  }//GEN-LAST:event_typeChooserKeyPressed
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel hintPanel;
  private javax.swing.JTextArea hintTextArea;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JComboBox typeChooser;
  private javax.swing.JLabel typeChooserLabel;
  private javax.swing.JPanel typeChooserPanel;
  // End of variables declaration//GEN-END:variables
  
}
