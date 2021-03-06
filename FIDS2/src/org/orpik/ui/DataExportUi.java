/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.orpik.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.orpik.data.QueryBuilder;
import org.orpik.data.export.ExcelExporter;
import org.orpik.location.Market;
import org.orpik.modular.DataEntry;
import org.orpik.modular.DataExport;
import org.orpik.settings.global.GuiManager;

/**
 *
 * @author Chemweno
 */
public class DataExportUi extends javax.swing.JDialog {

    private DefaultTableModel tbmDataExport = new DefaultTableModel();
    private QueryBuilder queryBuilder = new QueryBuilder();
    private DataExport dataExport = new DataExport();
    private ExcelExporter excelExporter;// = new ExcelExporter(null, null, rootPaneCheckingEnabled);
    private GuiManager guiManager = new GuiManager();
    private DataEntry dataEntry = new DataEntry();
    private Market market = new Market();
    private EachRowEditor rowEditor;
    private int width = 1082;
    private int height = 554;

    /**
     * Creates new form DataEntryUi
     */
    public DataExportUi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Allow Data Entry dialog to resize
        this.setResizable(true);
        //Dispose Data Entry dialog on close
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //Set size of Data Entry dialog
        guiManager.setDialogSize(this, width, height);
        //Center Data Entry dialog on screen
        guiManager.centerDialog(this, width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
	 /*
tblDataExport = new javax.swing.JTable(tbmDataExport){
 public Component prepareRenderer(TableCellRenderer renderer,int row, int col) {
      Component comp = super.prepareRenderer(renderer, row, col);
      if(row % 2 == 1){
      comp.setBackground(new java.awt.Color(238,233,233)); 
	  }else{
      comp.setBackground(Color.white);
	  } return comp; } public boolean
      isCellEditable(int row,int column){
      return false; 
	    } 
	  };	 
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgExportDataExportOptions = new javax.swing.ButtonGroup();
        btgExportDataExportBy = new javax.swing.ButtonGroup();
        pnlDataExportMarkets = new javax.swing.JPanel();
        scpDataExportMarkets = new javax.swing.JScrollPane();
        tblDataExport = new javax.swing.JTable();
        pnlDataExportMarketsTop = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbtDataExportAllData = new javax.swing.JRadioButton();
        rbtDataExportRangeData = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cboDataExportAllDataYear = new javax.swing.JComboBox();
        lblDataEntryMarketsYear1 = new javax.swing.JLabel();
        cboDataExportAllDataMonth = new javax.swing.JComboBox();
        lblDataEntryMarketsMonth1 = new javax.swing.JLabel();
        lblDataEntryMarketsYear = new javax.swing.JLabel();
        cboDataExportRangeDataFromYear = new javax.swing.JComboBox();
        cboDataExportRangeDataToYear = new javax.swing.JComboBox();
        lblDataEntryMarketsYear2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbtDataExportSlims = new javax.swing.JRadioButton();
        rbtDataExportMarkets = new javax.swing.JRadioButton();
        rbtDataExportMarketsAndSlims = new javax.swing.JRadioButton();
        btnDataExportData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DATA EXPORT");

        tblDataExport.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        tblDataExport.setModel(tbmDataExport);
        tblDataExport.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblDataExport.setCellSelectionEnabled(true);
        tblDataExport.setGridColor(Color.gray);
        tblDataExport.setRowHeight(20);
        tblDataExport.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tblDataExport.setSelectionForeground(new java.awt.Color(51, 102, 255));
        scpDataExportMarkets.setViewportView(tblDataExport);

        btgExportDataExportBy.add(rbtDataExportAllData);
        rbtDataExportAllData.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        rbtDataExportAllData.setSelected(true);
        rbtDataExportAllData.setText("Export all data by Month");
        rbtDataExportAllData.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtDataExportAllDataItemStateChanged(evt);
            }
        });
        rbtDataExportAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDataExportAllDataActionPerformed(evt);
            }
        });

        btgExportDataExportBy.add(rbtDataExportRangeData);
        rbtDataExportRangeData.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        rbtDataExportRangeData.setText("Export range of data by Month");
        rbtDataExportRangeData.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtDataExportRangeDataItemStateChanged(evt);
            }
        });
        rbtDataExportRangeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDataExportRangeDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtDataExportAllData)
                    .addComponent(rbtDataExportRangeData))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtDataExportAllData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtDataExportRangeData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cboDataExportAllDataYear.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        cboDataExportAllDataYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        cboDataExportAllDataYear.setSelectedItem(Calendar.getInstance().get(Calendar.YEAR));
        cboDataExportAllDataYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDataExportAllDataYearActionPerformed(evt);
            }
        });

        lblDataEntryMarketsYear1.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        lblDataEntryMarketsYear1.setLabelFor(cboDataExportRangeDataFromYear);
        lblDataEntryMarketsYear1.setText("Year");

        cboDataExportAllDataMonth.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        cboDataExportAllDataMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        lblDataEntryMarketsMonth1.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        lblDataEntryMarketsMonth1.setText("Month");

        lblDataEntryMarketsYear.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        lblDataEntryMarketsYear.setLabelFor(cboDataExportRangeDataFromYear);
        lblDataEntryMarketsYear.setText("From");

        cboDataExportRangeDataFromYear.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        cboDataExportRangeDataFromYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        cboDataExportRangeDataFromYear.setSelectedItem(Calendar.getInstance().get(Calendar.YEAR));
        cboDataExportRangeDataFromYear.setEnabled(false);

        cboDataExportRangeDataToYear.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        cboDataExportRangeDataToYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        cboDataExportRangeDataToYear.setSelectedItem(Calendar.getInstance().get(Calendar.YEAR));
        cboDataExportRangeDataToYear.setEnabled(false);

        lblDataEntryMarketsYear2.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        lblDataEntryMarketsYear2.setLabelFor(cboDataExportRangeDataFromYear);
        lblDataEntryMarketsYear2.setText("To");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDataEntryMarketsYear)
                        .addGap(2, 2, 2)
                        .addComponent(cboDataExportRangeDataFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDataEntryMarketsYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDataExportAllDataYear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDataEntryMarketsMonth1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDataExportAllDataMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDataEntryMarketsYear2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboDataExportRangeDataToYear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDataExportAllDataYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataEntryMarketsYear1)
                    .addComponent(lblDataEntryMarketsMonth1)
                    .addComponent(cboDataExportAllDataMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDataEntryMarketsYear2)
                        .addComponent(cboDataExportRangeDataToYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDataEntryMarketsYear)
                        .addComponent(cboDataExportRangeDataFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Export Data For", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Unicode MS", 0, 12))); // NOI18N

        btgExportDataExportOptions.add(rbtDataExportSlims);
        rbtDataExportSlims.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        rbtDataExportSlims.setText("SLIMS");
        rbtDataExportSlims.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDataExportSlimsActionPerformed(evt);
            }
        });

        btgExportDataExportOptions.add(rbtDataExportMarkets);
        rbtDataExportMarkets.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        rbtDataExportMarkets.setSelected(true);
        rbtDataExportMarkets.setText("Markets");

        btgExportDataExportOptions.add(rbtDataExportMarketsAndSlims);
        rbtDataExportMarketsAndSlims.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        rbtDataExportMarketsAndSlims.setText("Markets & SLIMS");
        rbtDataExportMarketsAndSlims.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDataExportMarketsAndSlimsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rbtDataExportMarkets)
                .addGap(18, 18, 18)
                .addComponent(rbtDataExportSlims)
                .addGap(18, 18, 18)
                .addComponent(rbtDataExportMarketsAndSlims)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtDataExportMarkets)
                    .addComponent(rbtDataExportSlims)
                    .addComponent(rbtDataExportMarketsAndSlims))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDataExportData.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        btnDataExportData.setMnemonic('E');
        btnDataExportData.setText("Export Data");
        btnDataExportData.setToolTipText("Populate table with already saved data. Prefer when viewing entered data or when sending already saved data.");
        btnDataExportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataExportDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDataExportMarketsTopLayout = new javax.swing.GroupLayout(pnlDataExportMarketsTop);
        pnlDataExportMarketsTop.setLayout(pnlDataExportMarketsTopLayout);
        pnlDataExportMarketsTopLayout.setHorizontalGroup(
            pnlDataExportMarketsTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataExportMarketsTopLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDataExportData)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlDataExportMarketsTopLayout.setVerticalGroup(
            pnlDataExportMarketsTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDataExportMarketsTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDataExportData))
        );

        javax.swing.GroupLayout pnlDataExportMarketsLayout = new javax.swing.GroupLayout(pnlDataExportMarkets);
        pnlDataExportMarkets.setLayout(pnlDataExportMarketsLayout);
        pnlDataExportMarketsLayout.setHorizontalGroup(
            pnlDataExportMarketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpDataExportMarkets, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
            .addComponent(pnlDataExportMarketsTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDataExportMarketsLayout.setVerticalGroup(
            pnlDataExportMarketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataExportMarketsLayout.createSequentialGroup()
                .addComponent(pnlDataExportMarketsTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpDataExportMarkets, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDataExportMarkets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDataExportMarkets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showConfirmDialog() {
        // Allow user to conmfirm whether they want to exit
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit?", JOptionPane.YES_NO_OPTION);
        if (result <= 0) {
            this.dispose();
        }
    }
private void fetchData(){
        //Fetch data
        int fromYear = 0;
        int toYear = 0;
        int allDataYear = 0;
        int month = 0;
        String exportOption = "";
        String exportType = "";
        try {
            pnlDataExportMarkets.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //Disable export data button
            btnDataExportData.setEnabled(false);
             fromYear = Integer.parseInt(cboDataExportRangeDataFromYear.getSelectedItem().toString());
             toYear = Integer.parseInt(cboDataExportRangeDataToYear.getSelectedItem().toString());
             allDataYear = Integer.parseInt(cboDataExportAllDataYear.getSelectedItem().toString());
             month = cboDataExportAllDataMonth.getSelectedIndex() + 1;
            
             if(rbtDataExportMarkets.isSelected()){
                 exportOption = "1";
             }else if (rbtDataExportSlims.isSelected()){
                 exportOption = "2";
             }else {
                 exportOption = "1,2";
             }
             
             //Get export type
             if(rbtDataExportAllData.isSelected()){
                 exportType = "all";
             }else{
                  exportType = "range";
             }
            dataExport.fetchData(tblDataExport, tbmDataExport, fromYear, toYear, allDataYear, month, exportOption, exportType);
            //On successful loading of data on table, enable export data button
            btnDataExportData.setEnabled(true);
        } catch (Exception exception) {
        }finally{
            pnlDataExportMarkets.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }    
}
    private void cboDataExportAllDataYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDataExportAllDataYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDataExportAllDataYearActionPerformed

    private void rbtDataExportSlimsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDataExportSlimsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtDataExportSlimsActionPerformed

    private void rbtDataExportMarketsAndSlimsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDataExportMarketsAndSlimsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtDataExportMarketsAndSlimsActionPerformed

    private void btnDataExportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataExportDataActionPerformed
    
        //Export Data
        fetchData();
        // Export data to excel
        excelExporter = new ExcelExporter(tblDataExport, "", true);
    }//GEN-LAST:event_btnDataExportDataActionPerformed

    private void rbtDataExportAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDataExportAllDataActionPerformed

    }//GEN-LAST:event_rbtDataExportAllDataActionPerformed

    private void rbtDataExportRangeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDataExportRangeDataActionPerformed
        // Enable export range data and disable export month data
        //restrictChoice(rbtDataExportRangeData, cboDataExportAllDataYear, 
        //        cboDataExportAllDataMonth, cboDataExportRangeDataFromYear, cboDataExportRangeDataToYear);

    }//GEN-LAST:event_rbtDataExportRangeDataActionPerformed

    private void rbtDataExportAllDataItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtDataExportAllDataItemStateChanged
        if(rbtDataExportAllData.isSelected()){
            cboDataExportAllDataYear.setEnabled(true);
            cboDataExportAllDataMonth.setEnabled(true);
            cboDataExportRangeDataFromYear.setEnabled(false);
            cboDataExportRangeDataToYear.setEnabled(false);            
        } else {
            cboDataExportAllDataYear.setEnabled(false);
            cboDataExportAllDataMonth.setEnabled(false);
            cboDataExportRangeDataFromYear.setEnabled(true);
            cboDataExportRangeDataToYear.setEnabled(true);  
        }
    }//GEN-LAST:event_rbtDataExportAllDataItemStateChanged

    private void rbtDataExportRangeDataItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtDataExportRangeDataItemStateChanged
        if(rbtDataExportRangeData.isSelected()){
            cboDataExportRangeDataFromYear.setEnabled(true);
            cboDataExportRangeDataToYear.setEnabled(true);
            cboDataExportAllDataYear.setEnabled(false);
            cboDataExportAllDataMonth.setEnabled(false);
        }else{
            cboDataExportRangeDataFromYear.setEnabled(false);
            cboDataExportRangeDataToYear.setEnabled(false);
            cboDataExportAllDataYear.setEnabled(true);
            cboDataExportAllDataMonth.setEnabled(true);
        }
    }//GEN-LAST:event_rbtDataExportRangeDataItemStateChanged
    private void restrictChoice(javax.swing.JRadioButton radioButtonOne, javax.swing.JComboBox cboOneToDisable, 
            javax.swing.JComboBox cboTwoToDisable, javax.swing.JComboBox cboOneToEnable, javax.swing.JComboBox cboTwoToEnable){
        try{
            if(radioButtonOne.isSelected()){
                cboOneToEnable.setEnabled(true);
                cboTwoToEnable.setEnabled(true);
            }else{
                cboOneToDisable.setEnabled(false);
                cboTwoToDisable.setEnabled(false);
            }
        }catch(Exception exception){            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataExportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataExportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataExportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataExportUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DataExportUi dialog = new DataExportUi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgExportDataExportBy;
    private javax.swing.ButtonGroup btgExportDataExportOptions;
    private javax.swing.JButton btnDataExportData;
    private javax.swing.JComboBox cboDataExportAllDataMonth;
    private javax.swing.JComboBox cboDataExportAllDataYear;
    private javax.swing.JComboBox cboDataExportRangeDataFromYear;
    private javax.swing.JComboBox cboDataExportRangeDataToYear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDataEntryMarketsMonth1;
    private javax.swing.JLabel lblDataEntryMarketsYear;
    private javax.swing.JLabel lblDataEntryMarketsYear1;
    private javax.swing.JLabel lblDataEntryMarketsYear2;
    public javax.swing.JPanel pnlDataExportMarkets;
    private javax.swing.JPanel pnlDataExportMarketsTop;
    private javax.swing.JRadioButton rbtDataExportAllData;
    private javax.swing.JRadioButton rbtDataExportMarkets;
    private javax.swing.JRadioButton rbtDataExportMarketsAndSlims;
    private javax.swing.JRadioButton rbtDataExportRangeData;
    private javax.swing.JRadioButton rbtDataExportSlims;
    private javax.swing.JScrollPane scpDataExportMarkets;
    private javax.swing.JTable tblDataExport;
    // End of variables declaration//GEN-END:variables
}
