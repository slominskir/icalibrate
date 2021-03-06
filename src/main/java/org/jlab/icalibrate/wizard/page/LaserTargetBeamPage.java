package org.jlab.icalibrate.wizard.page;

import java.util.concurrent.CountDownLatch;
import javax.swing.SwingWorker;
import org.jlab.icalibrate.exception.ValidationException;
import org.jlab.icalibrate.model.Laser;
import org.jlab.icalibrate.model.CreateNewDatasetParameters;
import org.jlab.icalibrate.swing.document.SizeRestrictedDocument;
import org.jlab.icalibrate.swing.worker.BeamEstablishedLookupWorker;
import org.jlab.icalibrate.swing.worker.LaserLookupWorker;
import org.jlab.icalibrate.swing.worker.PassLookupWorker;
import org.jlab.icalibrate.swing.worker.TargetLookupWorker;
import org.jlab.icalibrate.wizard.Wizard;
import org.jlab.icalibrate.wizard.WizardPage;

/**
 * Prompts the operator to confirm the laser and target as well as confirm beam has been established
 * and add any additional notes.
 *
 * @author ryans
 */
public class LaserTargetBeamPage extends WizardPage<CreateNewDatasetParameters> {

    /**
     * Create a new LaserTargetBeamPage
     *
     * @param wizard The wizard
     */
    public LaserTargetBeamPage(Wizard<CreateNewDatasetParameters> wizard) {
        super(wizard, "Laser, Target, Beam");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        beamCurrentLabel = new javax.swing.JLabel();
        laserLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteInput = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        passInput = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        targetInput = new javax.swing.JTextPane();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Laser:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Target:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Beam Established:");

        beamCurrentLabel.setText("Unknown");

        laserLabel.setText("Unknown");

        noteInput.setDocument(new SizeRestrictedDocument(32));
        jScrollPane1.setViewportView(noteInput);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pass:");

        passInput.setDocument(new SizeRestrictedDocument(32));
        jScrollPane2.setViewportView(passInput);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Note:");

        targetInput.setDocument(new SizeRestrictedDocument(32));
        jScrollPane3.setViewportView(targetInput);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(beamCurrentLabel)
                    .addComponent(laserLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(laserLabel)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(beamCurrentLabel)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beamCurrentLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel laserLabel;
    private javax.swing.JTextPane noteInput;
    private javax.swing.JTextPane passInput;
    private javax.swing.JTextPane targetInput;
    // End of variables declaration//GEN-END:variables

    @Override
    public void enter() {
        Wizard<CreateNewDatasetParameters> wizard = getWizard();
        
        CountDownLatch doneLatch = new CountDownLatch(4);
        
        LaserLookupWorker laserWorker = new LaserLookupWorker(wizard, this, doneLatch);
        TargetLookupWorker targetWorker = new TargetLookupWorker(wizard, this, doneLatch);
        PassLookupWorker passWorker = new PassLookupWorker(wizard, this, doneLatch);
        BeamEstablishedLookupWorker beamWorker = new BeamEstablishedLookupWorker(wizard, this,
                doneLatch);
        SwingWorker<Void, Void> doneWorker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                doneLatch.await();
                
                return null;
            }
            
            @Override
            protected void done() {
                wizard.hideModalWait();
            }
        };
        
        wizard.queueShowModalWait();
        
        laserWorker.execute();
        targetWorker.execute();
        passWorker.execute();
        beamWorker.execute();
        doneWorker.execute();
    }
    
    @Override
    public void leave() throws ValidationException {
        CreateNewDatasetParameters params = getParameters();
        
        Laser laser = null;
        
        try {
            laser = Laser.valueOf(laserLabel.getText());
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new ValidationException("Laser could not be determined");
        }
        
        String target = targetInput.getText();
        String pass = passInput.getText();
        String note = noteInput.getText();
        
        params.setLaser(laser);
        params.setTarget(target);
        params.setPass(pass);
        params.setNote(note);
    }
    
    @Override
    public void reset() {
        laserLabel.setText("Unknown");
        targetInput.setText("Unknown");
        passInput.setText("Unknown");
        noteInput.setText("");
        beamCurrentLabel.setText("Unknown");
    }
    
    public void setLaser(Laser laser) {
        if (laser != null) {
            laserLabel.setText(laser.name());
        } else {
            laserLabel.setText("Unknown");
        }
    }
    
    public void setTarget(String target) {
        targetInput.setText(target);
    }
    
    public void setPass(String pass) {
        passInput.setText(pass);
    }
    
    public void setBeamEstablished(String beamEstablished) {
        beamCurrentLabel.setText(beamEstablished);
    }
}
