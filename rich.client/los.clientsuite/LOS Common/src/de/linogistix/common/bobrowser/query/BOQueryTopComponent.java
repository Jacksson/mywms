/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.common.bobrowser.query;

import de.linogistix.common.bobrowser.action.RefreshBOBeanNodeAction;
import de.linogistix.common.bobrowser.bo.BONode;
import de.linogistix.common.res.CommonBundleResolver;
import de.linogistix.common.gui.component.other.TopComponentExt;
import de.linogistix.common.gui.gui_builder.AbstractFooterPanel;
import de.linogistix.common.gui.listener.TopComponentListener;
import de.linogistix.common.userlogin.LoginService;
import de.linogistix.common.util.BundleResolve;
import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.util.Lookup;
import org.openide.util.actions.SystemAction;
import org.openide.windows.TopComponent;

/**
 * Top component which displays queries of entities.
 */
public class BOQueryTopComponent extends TopComponentExt
        implements TopComponentListener, Lookup.Provider, ExplorerManager.Provider {

    private static final Logger log = Logger.getLogger(BOQueryTopComponent.class.getName());
    /** path to the icon used by the component and its open action */
//    static final String ICON_PATH = "de/linogistix/bobrowser/res/icon/Search.png";
    private String preferredId = "BOQueryTopComponent";
    private BOQueryPanel boQueryPanel;
    private BONode node;
    private BOQueryModel model;
    private boolean editabelDetail = false; 
                                      
    private JTabbedPane detailedTabbedPane;
    private JSplitPane jSplitPane1;
    private AbstractFooterPanel footerPanel;
    
    private boolean beenInitialized = false;
    
    public BOQueryTopComponent(BONode node) {
        this(node, false);
    }

    public BOQueryTopComponent(BONode node, boolean editabelDetail) {
        this.node = node;
        this.editabelDetail = editabelDetail;
        initComponents();
        initDecorations();
    }
    
    public BOQueryTopComponent(BONode node, BOQueryModel model, boolean editabelDetail) {
       
        this.node = node;
        this.editabelDetail = editabelDetail;
        this.model = model;
        initComponents();
        initDecorations();
    }

   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        centerPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        centerPanel.setLayout(new java.awt.BorderLayout());
        add(centerPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    // End of variables declaration//GEN-END:variables

//    /**
//     * Obtain the BOQueryTopComponent instance.
//     */
//    public static BOQueryTopComponent findInstance(BONode node) {
//        log.log(Level.FINE, "Looking for " + node.getName());
//        TopComponent win = WindowManager.getDefault().findTopComponent(node.getName());
//        if (win == null) {
//            BOQueryTopComponent c = new BOQueryTopComponent(node, true);
//            c.preferredId = WindowManager.getDefault().findTopComponentID(c);
//            return c;
//        }
//        if (win instanceof BOQueryTopComponent) {
//            return (BOQueryTopComponent) win;
//        }
//        ErrorManager.getDefault().log(ErrorManager.WARNING, "There seem to be multiple components with the '" + node.getName() + "' ID. That is a potential source of errors and unexpected behavior.");
//        return new BOQueryTopComponent(node, true);
//    }

    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_NEVER;
    }

    //-------------------------------------------------------------------------
    
    public void componentOpened() {
        
        if (!hasBeenInitialized()){
            
            LoginService login = (LoginService) Lookup.getDefault().lookup(LoginService.class);
            login.addLoginStateChangeListener(new PropertyChangeListener() {
                public void propertyChange(PropertyChangeEvent evt) {
                    close();
                }
            });
            
            initBOQueryPanel();
            postInit();
            setInitialized(true);
            boQueryPanel.reload();
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
//                    boQueryPanel.invalidate();
//                    boQueryPanel.validate();
                    invalidate();
                    validate();
                }
            }); 
        } else{
            boQueryPanel.reload();
        }
    }

    public void componentClosed() {
        this.boQueryPanel.clear();
        
    }

    public void componentActivated() {
    }

    public void componentDeactivated() {
    }

    public void componentHidden() {
    }

    public void componentShowing() {
    }

    //-------------------------------------------------------------------------
    
    public BOQueryPanel getBOQueryPanel() {
        return this.boQueryPanel;
    }

    public ExplorerManager getExplorerManager() {
        if (this.boQueryPanel != null && this.boQueryPanel.isInitialized()){
            return this.boQueryPanel.getExplorerManager();
        }
        
        return null;
    }

    public void setPreferredId(String findTopComponentID) {
        this.preferredId = findTopComponentID;
    }
    
    protected String preferredId() {
        return preferredId;
    }

    //-------------------------------------------------------------------------
    
    protected void initDecorations() {
        this.preferredId = this.node.getName();
        String descr = BundleResolve.resolve(
                new Class[]{this.node.getBo().getBundleResolver(), CommonBundleResolver.class, CommonBundleResolver.class},
                preferredId,
                null);
        setName(preferredId);
        setDisplayName(descr);
        setToolTipText(descr);
//        setIcon(Utilities.loadImage(ICON_PATH, true));

    }
    
    protected void initLookup() {
        ActionMap map = getActionMap();
        map.put("reload", SystemAction.get(RefreshBOBeanNodeAction.class));
        InputMap keys = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        keys.put(KeyStroke.getKeyStroke(""), "delete");

        try {        
            associateLookup(ExplorerUtils.createLookup(getExplorerManager(), map));
        } catch (IllegalStateException ex) {
            //already done!?
            log.log(Level.INFO, ex.getMessage(), ex);
            return;
        }
    }
    
     protected void initBOQueryPanel() {
        if (this.boQueryPanel == null){
            if (this.model == null){
                this.boQueryPanel = new BOQueryPanel(node, editabelDetail);
            } else{
                this.boQueryPanel = new BOQueryPanel(node, model, editabelDetail);
            }
//            boQueryPanel.reload();
            centerPanel.add(this.boQueryPanel, BorderLayout.CENTER);
            initLookup();
        }
//        invalidate();
//        validate();
        
    }
     
     protected void postInit(){
//         invalidate();
//         validate();
     }

    
    //-------------------------------------------------------------------------
     
     protected void createTabbedPane(){
        centerPanel.remove(boQueryPanel);
        
        jSplitPane1 = new javax.swing.JSplitPane();     
        detailedTabbedPane = new javax.swing.JTabbedPane();
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        
        jSplitPane1.setTopComponent(boQueryPanel);
        jSplitPane1.setRightComponent(detailedTabbedPane);
        jSplitPane1.setResizeWeight(0L);
        jSplitPane1.setDividerLocation(600);

        centerPanel.add(jSplitPane1, java.awt.BorderLayout.CENTER);

     }
     
     protected void addTab(String tile, JComponent component){
         detailedTabbedPane.add(tile, component);
     }
     
     
     protected void addFooterPanel(AbstractFooterPanel panel){
         this.footerPanel = panel;
         add(this.footerPanel, BorderLayout.SOUTH);
     }

    public boolean hasBeenInitialized() {
        return beenInitialized;
    }

    public void setInitialized(boolean beenInitialized) {
        this.beenInitialized = beenInitialized;
    }
}
