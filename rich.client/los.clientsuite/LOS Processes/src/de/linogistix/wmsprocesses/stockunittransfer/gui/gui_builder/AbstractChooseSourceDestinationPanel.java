/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.stockunittransfer.gui.gui_builder;

import de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox;
import de.linogistix.common.gui.component.controls.LosLabel;
import de.linogistix.los.location.model.LOSUnitLoad;
import de.linogistix.wmsprocesses.res.WMSProcessesBundleResolver;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import org.mywms.model.StockUnit;
import org.openide.util.NbBundle;

/**
 *
 * @author  trautm
 */
public abstract class AbstractChooseSourceDestinationPanel extends javax.swing.JPanel {

    /** Creates new form AbstractCenterPanel */
    public AbstractChooseSourceDestinationPanel() {
        initComponents();
        
        getStockUnitRemoveLockLabel().setEnabled(true);
        getStockUnitRemoveLockLabel().setText();
//        getStockUnitRemoveLockLabel().setTitleText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeSuLock"));
        getStockUnitRemoveLockLabel().setTitleText("");
//        getStockUnitRemoveLockLabel().setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeSuLock"));
        getStockUnitRemoveLockLabel().setText("");

        getStockUnitRemoveLockField().setEnabled(false);
        getStockUnitRemoveLockField().setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeSuLock"));

//        suReserveCheckBox.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeSuLock"));
//        suLockCheckBox.setText( NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeReservationFromSu") );
                
        getStockUnitRemoveReservationLabel().setEnabled(true);
        getStockUnitRemoveReservationLabel().setText();
//        getStockUnitRemoveReservationLabel().setTitleText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeReservationFromSu"));
        getStockUnitRemoveReservationLabel().setTitleText("");
//        getStockUnitRemoveReservationLabel().setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeReservationFromSu"));
        getStockUnitRemoveReservationLabel().setText("");

        getStockUnitRemoveReservationField().setEnabled(false);
        getStockUnitRemoveReservationField().setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "removeReservationFromSu"));

        itemDataLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "itemData")+":");
        amountLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "amount")+":");
        unitLoadLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "unitLoad")+":");
        locationLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "location")+":");
        locationUlLabel.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "location")+":");

    }
       
    public LosLabel getStockUnitRemoveReservationLabel(){
        return (LosLabel) suReserveLabel;
    }
    public JCheckBox getStockUnitRemoveReservationField(){
        return suReserveCheckBox;
    }
    public LosLabel getStockUnitRemoveLockLabel(){
        return (LosLabel) suLockLabel;
    }
    public JCheckBox getStockUnitRemoveLockField(){
        return suLockCheckBox;
    }

    public JLabel getItemDataField() {
        return itemDataText;
    }
    public JLabel getAmountField() {
        return amountText;
    }
    public JLabel getUnitLoadField() {
        return unitLoadText;
    }
    public JLabel getLocationField() {
        return locationText;
    }
    public JLabel getLocationUlField() {
        return locationUlText;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        stockUnitAutoFilteringComboBox = new BOAutoFilteringComboBox(StockUnit.class);
        stockInfoPanel = new javax.swing.JPanel();
        itemDataLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        unitLoadLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        locationText = new javax.swing.JLabel();
        itemDataText = new javax.swing.JLabel();
        amountText = new javax.swing.JLabel();
        unitLoadText = new javax.swing.JLabel();
        unitLoadAutofilteringComboBox = new BOAutoFilteringComboBox(LOSUnitLoad.class);
        suReserveCheckBox = new javax.swing.JCheckBox();
        suLockCheckBox = new javax.swing.JCheckBox();
        suLockLabel = new LosLabel();
        suReserveLabel = new LosLabel();
        unitLoadInfoPanel = new javax.swing.JPanel();
        locationUlLabel = new javax.swing.JLabel();
        locationUlText = new javax.swing.JLabel();

        setAlignmentX(1.0F);
        setAlignmentY(0.0F);
        setAutoscrolls(true);
        setLayout(new java.awt.GridBagLayout());

        stockUnitAutoFilteringComboBox.setAlignmentX(0.0F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        add(stockUnitAutoFilteringComboBox, gridBagConstraints);

        stockInfoPanel.setMinimumSize(new java.awt.Dimension(400, 60));
        stockInfoPanel.setLayout(new java.awt.GridBagLayout());

        itemDataLabel.setForeground(new java.awt.Color(70, 70, 70));
        itemDataLabel.setText("DataLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(itemDataLabel, gridBagConstraints);

        amountLabel.setForeground(new java.awt.Color(70, 70, 70));
        amountLabel.setText("amountLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(amountLabel, gridBagConstraints);

        unitLoadLabel.setForeground(new java.awt.Color(70, 70, 70));
        unitLoadLabel.setText("unitLoadLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(unitLoadLabel, gridBagConstraints);

        locationLabel.setForeground(new java.awt.Color(70, 70, 70));
        locationLabel.setText("locationLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(locationLabel, gridBagConstraints);

        locationText.setForeground(new java.awt.Color(70, 70, 70));
        locationText.setText("location");
        locationText.setMinimumSize(new java.awt.Dimension(250, 15));
        locationText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(locationText, gridBagConstraints);

        itemDataText.setForeground(new java.awt.Color(70, 70, 70));
        itemDataText.setText("itemDataText");
        itemDataText.setMinimumSize(new java.awt.Dimension(300, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(itemDataText, gridBagConstraints);

        amountText.setForeground(new java.awt.Color(70, 70, 70));
        amountText.setText("amount");
        amountText.setMinimumSize(new java.awt.Dimension(250, 15));
        amountText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(amountText, gridBagConstraints);

        unitLoadText.setForeground(new java.awt.Color(70, 70, 70));
        unitLoadText.setText("unitLoad");
        unitLoadText.setMinimumSize(new java.awt.Dimension(250, 15));
        unitLoadText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        stockInfoPanel.add(unitLoadText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        add(stockInfoPanel, gridBagConstraints);

        unitLoadAutofilteringComboBox.setAlignmentX(0.0F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        add(unitLoadAutofilteringComboBox, gridBagConstraints);

        suReserveCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suReserveCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(suReserveCheckBox, gridBagConstraints);

        suLockCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suLockCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 15, 0);
        add(suLockCheckBox, gridBagConstraints);

        suLockLabel.setText("sulockLabel");
        suLockLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 15, 0);
        add(suLockLabel, gridBagConstraints);

        suReserveLabel.setText("suReserveLabel");
        suReserveLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(suReserveLabel, gridBagConstraints);

        unitLoadInfoPanel.setLayout(new java.awt.GridBagLayout());

        locationUlLabel.setForeground(new java.awt.Color(70, 70, 70));
        locationUlLabel.setText("locationLabel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        unitLoadInfoPanel.add(locationUlLabel, gridBagConstraints);

        locationUlText.setForeground(new java.awt.Color(70, 70, 70));
        locationUlText.setText("location");
        locationUlText.setMinimumSize(new java.awt.Dimension(250, 15));
        locationUlText.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        unitLoadInfoPanel.add(locationUlText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        add(unitLoadInfoPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


private void suReserveCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suReserveCheckBoxActionPerformed
        setRemoveReservationFromSu(suReserveCheckBox.isSelected());
}//GEN-LAST:event_suReserveCheckBoxActionPerformed

private void suLockCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suLockCheckBoxActionPerformed
        setRemoveLockFromSu(suLockCheckBox.isSelected());

}//GEN-LAST:event_suLockCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel amountText;
    private javax.swing.JLabel itemDataLabel;
    private javax.swing.JLabel itemDataText;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel locationText;
    private javax.swing.JLabel locationUlLabel;
    private javax.swing.JLabel locationUlText;
    private javax.swing.JPanel stockInfoPanel;
    protected javax.swing.JPanel stockUnitAutoFilteringComboBox;
    protected javax.swing.JCheckBox suLockCheckBox;
    protected javax.swing.JLabel suLockLabel;
    protected javax.swing.JCheckBox suReserveCheckBox;
    protected javax.swing.JLabel suReserveLabel;
    protected javax.swing.JPanel unitLoadAutofilteringComboBox;
    private javax.swing.JPanel unitLoadInfoPanel;
    private javax.swing.JLabel unitLoadLabel;
    private javax.swing.JLabel unitLoadText;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("unchecked")
    public BOAutoFilteringComboBox<StockUnit> getStockUnitAutoFilteringComboBox() {
        return (BOAutoFilteringComboBox<StockUnit>) stockUnitAutoFilteringComboBox;
    }

    @SuppressWarnings("unchecked")
    public BOAutoFilteringComboBox<LOSUnitLoad> getUnitLoadAutofilteringComboBox() {
        return (BOAutoFilteringComboBox<LOSUnitLoad>) unitLoadAutofilteringComboBox;
    }

    public abstract void setRemoveReservationFromSu(boolean removeReservationFromSu);

    public abstract void setRemoveLockFromSu(boolean removeLockFromSu);

}