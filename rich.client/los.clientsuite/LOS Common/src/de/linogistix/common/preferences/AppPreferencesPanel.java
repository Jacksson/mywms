/*
 * Copyright (c) 2006 LinogistiX GmbH. All rights reserved.
 *
 *<a href="http://www.linogistix.com/">browse for licence information</a>
 *
 */
package de.linogistix.common.preferences;

import de.linogistix.common.exception.InternalErrorException;
import de.linogistix.common.util.ExceptionAnnotator;
import javax.swing.JPanel;
import org.openide.explorer.propertysheet.PropertySheetView;
import org.openide.nodes.Node;
import org.openide.nodes.Node.Property;

final class AppPreferencesPanel extends javax.swing.JPanel{
    
    private final AppPreferencesController controller;    
    
    AppPreferencesPanel(AppPreferencesController controller) {
        this.controller = controller;
        try{
            initComponents();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            ExceptionAnnotator.annotate(new InternalErrorException(ex));
        }
    }
    
    public void update(){
        propertiesPanel = new JPanel();
        propertiesPanel.setLayout(new java.awt.BorderLayout());
        
        Property[] props = controller.getANode().pSets[0].getProperties();
        
        AppPreferenecesSheetView view = new AppPreferenecesSheetView(controller.getANode());
        view.setName(controller.getPropertyFileBaseName());
        propertiesPanel.add(view);
        jScrollPane1.setViewportView(propertiesPanel);
    }

    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        propertiesPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        setBackground(java.awt.Color.white);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        propertiesPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(propertiesPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
// TODO add your handling code here:
        System.out.println("#############formComponentShown");
    }//GEN-LAST:event_formComponentShown
    
    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel propertiesPanel;
    // End of variables declaration//GEN-END:variables
  
    
    
    
}
