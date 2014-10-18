/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.processes.order.gui.gui_builder;

import de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox;
import de.linogistix.wmsprocesses.processes.order.gui.component.OrderTreeTableView;
import de.linogistix.wmsprocesses.processes.order.gui.object.OrderItem;
import de.linogistix.wmsprocesses.res.WMSProcessesBundleResolver;
import de.linogistix.common.gui.component.controls.LOSDateFormattedTextField;
import de.linogistix.common.gui.component.controls.LOSNumericFormattedTextField;
import de.linogistix.common.gui.component.controls.LosLabel;
import de.linogistix.common.gui.listener.TopComponentListener;
import de.linogistix.wmsprocesses.processes.order.gui.object.OrderTypeItem;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import org.mywms.model.Client;
import org.mywms.model.ItemData;
import org.mywms.model.Lot;
import org.openide.util.NbBundle;

/**
 *
 * @author  artur
 */
public abstract class AbstractCenterPanel extends javax.swing.JPanel implements TopComponentListener {

    protected OrderTreeTableView treeTable;
    
    private BOAutoFilteringComboBox<Client> clientComboBox = null;
    
    private BOAutoFilteringComboBox<ItemData> itemDataComboBox = null;

    private BOAutoFilteringComboBox<Lot> lotComboBox = null;
    
    /** Creates new form AbstractCenterPanel */
    public AbstractCenterPanel() {
        initComponents();
        
        orderTypeLabel.setText(
                NbBundle.getMessage(WMSProcessesBundleResolver.class, "OrderCenterPanel.orderType")); // NOI18N
        
        orderNumberLabel.setText(
                NbBundle.getMessage(WMSProcessesBundleResolver.class, "OrderCenterPanel.orderNumber")); // NOI18N
        
        targetplaceLabel.setText(
                NbBundle.getMessage(WMSProcessesBundleResolver.class,"OrderCenterPanel.Targetplace")); // NOI18N
        
        documentLabel.setText(
                NbBundle.getMessage(WMSProcessesBundleResolver.class,"OrderCenterPanel.Document")); // NOI18N
        
        labelLabel.setText(
                NbBundle.getMessage(WMSProcessesBundleResolver.class,"OrderCenterPanel.Label")); // NOI18N
        
        positionPanel.setBorder(
                BorderFactory.createTitledBorder(
                NbBundle.getMessage(WMSProcessesBundleResolver.class,"OrderCenterPanel.Position"))); // NOI18N
        
        addButton.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "OrderCenterPanel.add")); // NOI18N
        addButton.setMnemonic(NbBundle.getMessage(WMSProcessesBundleResolver.class, "OrderCenterPanel.add.mnemonic").charAt(0));

        delButton.setText(NbBundle.getMessage(WMSProcessesBundleResolver.class, "OrderCenterPanel.remove")); // NOI18N
        delButton.setMnemonic(NbBundle.getMessage(WMSProcessesBundleResolver.class, "OrderCenterPanel.remove.mnemonic").charAt(0));
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        clientComboBoxPanel = new javax.swing.JPanel();
        deliveryDateTextField = new LOSDateFormattedTextField();
        orderDetailPanel = new javax.swing.JPanel();
        orderNumberLabel = new javax.swing.JLabel();
        orderNumberTextField = new javax.swing.JTextField();
        targetplaceLabel = new LosLabel();
        documentLabel = new LosLabel();
        documentTextField = new javax.swing.JTextField();
        labelTextField = new javax.swing.JTextField();
        labelLabel = new LosLabel();
        targetplaceComboBox = new javax.swing.JComboBox();
        orderTypeCombo = new javax.swing.JComboBox();
        orderTypeLabel = new javax.swing.JLabel();
        commentPanel = new javax.swing.JPanel();
        commentLabel = new javax.swing.JLabel();
        commentScrollPane = new javax.swing.JScrollPane();
        commentArea = new javax.swing.JTextArea();
        positionPanel = new javax.swing.JPanel();
        lotComboBoxPanel = new javax.swing.JPanel();
        itemComboBoxPanel = new javax.swing.JPanel();
        amountTextField = new LOSNumericFormattedTextField();
        addButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        treeTablePanel = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        clientComboBoxPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(clientComboBoxPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        add(deliveryDateTextField, gridBagConstraints);

        orderDetailPanel.setLayout(new java.awt.GridBagLayout());

        orderNumberLabel.setText("Order number"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        orderDetailPanel.add(orderNumberLabel, gridBagConstraints);

        orderNumberTextField.setText("");
        orderNumberTextField.setMinimumSize(new java.awt.Dimension(300, 22));
        orderNumberTextField.setPreferredSize(new java.awt.Dimension(300, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        orderDetailPanel.add(orderNumberTextField, gridBagConstraints);

        targetplaceLabel.setText("Targetplace"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        orderDetailPanel.add(targetplaceLabel, gridBagConstraints);

        documentLabel.setText("Document"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        orderDetailPanel.add(documentLabel, gridBagConstraints);

        documentTextField.setText("");
        documentTextField.setMinimumSize(new java.awt.Dimension(11, 22));
        documentTextField.setPreferredSize(new java.awt.Dimension(300, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        orderDetailPanel.add(documentTextField, gridBagConstraints);

        labelTextField.setText("");
        labelTextField.setMinimumSize(new java.awt.Dimension(11, 22));
        labelTextField.setPreferredSize(new java.awt.Dimension(300, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        orderDetailPanel.add(labelTextField, gridBagConstraints);

        labelLabel.setText("Label"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        orderDetailPanel.add(labelLabel, gridBagConstraints);

        targetplaceComboBox.setMinimumSize(new java.awt.Dimension(300, 22));
        targetplaceComboBox.setPreferredSize(new java.awt.Dimension(145, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        orderDetailPanel.add(targetplaceComboBox, gridBagConstraints);

        orderTypeCombo.setModel(new DefaultComboBoxModel(initOrderTypeCombo()));
        orderTypeCombo.setPreferredSize(new java.awt.Dimension(145, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        orderDetailPanel.add(orderTypeCombo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        orderDetailPanel.add(orderTypeLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(orderDetailPanel, gridBagConstraints);

        commentPanel.setLayout(new java.awt.GridBagLayout());

        commentLabel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "AbstractCenterPanel.commentLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        commentPanel.add(commentLabel, gridBagConstraints);

        commentScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        commentScrollPane.setRequestFocusEnabled(false);

        commentArea.setColumns(20);
        commentArea.setLineWrap(true);
        commentArea.setRows(5);
        commentArea.setWrapStyleWord(true);
        commentArea.setPreferredSize(null);
        commentScrollPane.setViewportView(commentArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        commentPanel.add(commentScrollPane, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 5, 0);
        add(commentPanel, gridBagConstraints);

        positionPanel.setLayout(new java.awt.GridBagLayout());

        lotComboBoxPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        positionPanel.add(lotComboBoxPanel, gridBagConstraints);

        itemComboBoxPanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 0);
        positionPanel.add(itemComboBoxPanel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 0);
        positionPanel.add(amountTextField, gridBagConstraints);

        addButton.setText("Add"); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        positionPanel.add(addButton, gridBagConstraints);

        delButton.setText("Remove"); // NOI18N
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        positionPanel.add(delButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(positionPanel, gridBagConstraints);

        treeTablePanel.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        add(treeTablePanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    addButtonActionPerformedListener(evt);
}//GEN-LAST:event_addButtonActionPerformed

private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
    delButtonActionPerformedListener(evt);
}//GEN-LAST:event_delButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    private javax.swing.JPanel amountTextField;
    protected javax.swing.JPanel clientComboBoxPanel;
    private javax.swing.JTextArea commentArea;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JPanel commentPanel;
    private javax.swing.JScrollPane commentScrollPane;
    private javax.swing.JButton delButton;
    private javax.swing.JPanel deliveryDateTextField;
    protected javax.swing.JLabel documentLabel;
    protected javax.swing.JTextField documentTextField;
    private javax.swing.JPanel itemComboBoxPanel;
    protected javax.swing.JLabel labelLabel;
    public javax.swing.JTextField labelTextField;
    private javax.swing.JPanel lotComboBoxPanel;
    private javax.swing.JPanel orderDetailPanel;
    private javax.swing.JLabel orderNumberLabel;
    protected javax.swing.JTextField orderNumberTextField;
    protected javax.swing.JComboBox orderTypeCombo;
    public javax.swing.JLabel orderTypeLabel;
    private javax.swing.JPanel positionPanel;
    protected javax.swing.JComboBox targetplaceComboBox;
    protected javax.swing.JLabel targetplaceLabel;
    protected javax.swing.JPanel treeTablePanel;
    // End of variables declaration//GEN-END:variables

    
    protected BOAutoFilteringComboBox<Client> getClientComboBox() {
        
        if(clientComboBox == null){
            clientComboBox = new BOAutoFilteringComboBox<Client>(Client.class);
            clientComboBoxPanel.add(clientComboBox, BorderLayout.WEST);
        }
        
        return clientComboBox;
    }

    protected BOAutoFilteringComboBox<Lot> getLotComboBox() {  
        
        if(lotComboBox == null){
            lotComboBox = new BOAutoFilteringComboBox<Lot>(Lot.class);
            lotComboBoxPanel.add(lotComboBox, BorderLayout.CENTER);
        }
        return lotComboBox;
    }

    protected BOAutoFilteringComboBox<ItemData> getItemDataComboBox() {
        
        if(itemDataComboBox == null){
            
            itemDataComboBox = new BOAutoFilteringComboBox<ItemData>(ItemData.class);
            itemComboBoxPanel.add(itemDataComboBox, BorderLayout.CENTER);
        }
        
        return itemDataComboBox;
    }
    
    protected LOSNumericFormattedTextField getAmountTextField(){
        return (LOSNumericFormattedTextField) amountTextField;
    }
    
    protected LOSDateFormattedTextField getDeliveryDateTextField(){
        return (LOSDateFormattedTextField) deliveryDateTextField;
    }

    protected JLabel getCommentLabel(){
        return commentLabel;
    }
    
    public JTextArea getCommentArea(){
        return commentArea;
    }
    
    public void initOrderTreeTable(){
        
        treeTable = new OrderTreeTableView();
        treeTablePanel.add(treeTable, BorderLayout.CENTER);
        List<OrderItem> l = new ArrayList<OrderItem>();
        treeTable.setNodes(l);
    }
    
    protected void addButtonActionPerformedListener(java.awt.event.ActionEvent evt) {
    }

    protected void delButtonActionPerformedListener(java.awt.event.ActionEvent evt) {
        treeTable.delSelectedRows();
    }

    public void componentActivated() {
    }

    public void componentClosed() {
    }

    public void componentDeactivated() {
    }

    public void componentHidden() {
    }

    public void componentOpened() {
        
    }

    public void componentShowing() {
    }

    protected abstract OrderTypeItem[] initOrderTypeCombo();
}
