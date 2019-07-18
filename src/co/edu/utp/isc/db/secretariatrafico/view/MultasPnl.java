package co.edu.utp.isc.db.secretariatrafico.view;

import co.edu.utp.isc.db.secretariatrafico.controller.JpaController;
import co.edu.utp.isc.db.secretariatrafico.model.Agentes;
import co.edu.utp.isc.db.secretariatrafico.model.Autos;
import co.edu.utp.isc.db.secretariatrafico.model.Ciudades;
import co.edu.utp.isc.db.secretariatrafico.model.Infracciones;
import co.edu.utp.isc.db.secretariatrafico.model.Multas;
import co.edu.utp.isc.db.secretariatrafico.model.Personas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esteban
 */
public class MultasPnl extends javax.swing.JPanel implements Crud {

    /**
     * Creates new form MultasPnl
     */
    public MultasPnl() {
        initComponents();
        this.modelo = null;
        this.formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbMatricula = new javax.swing.JComboBox<>();
        cmbCiudad = new javax.swing.JComboBox<>();
        cmbInfraccion = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        chkAI = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cmbAgente = new javax.swing.JComboBox<>();
        cmbPersona = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Multas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 210));

        jLabel9.setText("Fecha infracción:");

        jLabel10.setText("Dirección infracción:");

        jLabel11.setText("Ciudad:");

        jLabel12.setText("Código infracción:");

        jLabel13.setText("ID persona:");

        jLabel14.setText("ID agente:");

        jLabel15.setText("Matrícula:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("ID multa:");

        chkAI.setPreferredSize(new java.awt.Dimension(24, 26));
        chkAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAIActionPerformed(evt);
            }
        });

        jLabel2.setText("AI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbInfraccion, javax.swing.GroupLayout.Alignment.LEADING, 0, 343, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addComponent(cmbMatricula, 0, 344, Short.MAX_VALUE)
                    .addComponent(cmbAgente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPersona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(chkAI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cmbInfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(cmbAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(cmbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAIActionPerformed
        if (chkAI.isSelected()) {
            txtMulta.setText("");
            txtMulta.setEnabled(false);
        } else {
            txtMulta.setEnabled(true);
        }
    }//GEN-LAST:event_chkAIActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAI;
    private javax.swing.JComboBox<String> cmbAgente;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JComboBox<String> cmbInfraccion;
    private javax.swing.JComboBox<String> cmbMatricula;
    private javax.swing.JComboBox<String> cmbPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMulta;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo = null;
    private final SimpleDateFormat formatoFecha;
    private Agentes a = new Agentes();
    private Autos au = new Autos();
    private Ciudades c = new Ciudades();
    private Infracciones i = new Infracciones();
    private Multas multa = new Multas();
    private Personas p = new Personas();
    private List<Agentes> listaAgentes;
    private List<Autos> listaAutos;
    private List<Ciudades> listaCiudades;
    private List<Infracciones> listaInfracciones;
    private List<Multas> listaMultas;
    private List<Personas> listaPersonas;
    
    @Override
    public void cargarListas() {
        this.listaAgentes = JpaController.getInstance().getAgentesControlador().findAgentesEntities();        
        this.listaAutos = JpaController.getInstance().getAutosControlador().findAutosEntities();
        this.listaCiudades = JpaController.getInstance().getCiudadesControlador().findCiudadesEntities();
        this.listaInfracciones = JpaController.getInstance().getInfraccionesControlador().findInfraccionesEntities();
        this.listaMultas = JpaController.getInstance().getMultasControlador().findMultasEntities();
        this.listaPersonas = JpaController.getInstance().getPersonasControlador().findPersonasEntities();
    }

    @Override
    public DefaultTableModel getModelo() {
        if (modelo == null) {
            try {
                modelo = (new DefaultTableModel(
                        null, new String[]{
                            "ID Multa", "Fecha Infraccion", "Direccion Infraccion",
                            "Ciudad", "Codigo Infraccion", "ID Persona",
                            "ID Agente", "Matricula"}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
                        java.util.Date.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false, false, false
                    };

                    @Override
                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    @Override
                    public boolean isCellEditable(int rowIndex, int colIndex) {
                        return canEdit[colIndex];
                    }
                });
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return modelo;
    }
     
    @Override
    public void cargarRegistros() {
        try {
            cmbAgente.removeAllItems();
            for (Agentes agente : listaAgentes) {
                cmbAgente.addItem(agente.getIdAgente().toString());
            }
            cmbAgente.setSelectedIndex(-1);
            
            cmbMatricula.removeAllItems();
            for (Autos auto : listaAutos) {
                cmbMatricula.addItem(auto.getMatricula());
            }
            cmbMatricula.setSelectedIndex(-1);
            
            cmbCiudad.removeAllItems();
            for (Ciudades ciudad : listaCiudades) {
                cmbCiudad.addItem(ciudad.getNombreCiudad());
            }
            cmbCiudad.setSelectedIndex(-1);
            
            cmbInfraccion.removeAllItems();
            for (Infracciones infraccion : listaInfracciones) {
                cmbInfraccion.addItem(infraccion.getCodigoInfraccion());
            }
            cmbInfraccion.setSelectedIndex(-1);
            
            cmbPersona.removeAllItems();
            for (Personas persona : listaPersonas) {
                cmbPersona.addItem(persona.getIdPersona().toString());
            }
            cmbPersona.setSelectedIndex(-1);
            
            modelo.setRowCount(0);
            for (Multas m : listaMultas) {
                modelo.addRow(new Object[]{
                    m.getIdMulta(),
                    m.getFechaInfraccion(),
                    m.getDireccionInfraccion(),
                    m.getIdCiudad().getNombreCiudad(),
                    m.getCodigoInfraccion().getCodigoInfraccion(),
                    m.getIdPersona().getIdPersona(),
                    m.getIdAgente().getIdAgente(),
                    m.getMatricula()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void registrar() {
        String getFecha = txtFecha.getText().trim();
        Date fecha;
        try {
            fecha = formatoFecha.parse(getFecha);
            multa.setFechaInfraccion(fecha);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        multa.setDireccionInfraccion(txtDireccion.getText().trim());

        for (Ciudades ciudad : listaCiudades) {
            if (ciudad.getNombreCiudad().equals(cmbCiudad.getSelectedItem().toString())) {
                multa.setIdCiudad(ciudad);
            }
        }

        i.setCodigoInfraccion(cmbInfraccion.getSelectedItem().toString());
        multa.setCodigoInfraccion(i);

        p.setIdPersona(Integer.parseInt(cmbPersona.getSelectedItem().toString()));
        multa.setIdPersona(p);

        a.setIdAgente(Integer.parseInt(cmbAgente.getSelectedItem().toString()));
        multa.setIdAgente(a);
        
        au.setMatricula(cmbMatricula.getSelectedItem().toString());
        multa.setMatricula(au);
    }
    
    @Override
    public void guardar() {
        try {
            if (txtMulta.getText().isEmpty()) {
                multa.setIdMulta(null);
            } else {
                multa.setIdMulta(Integer.parseInt(txtMulta.getText().trim()));
            }
            
            registrar();
            
            JpaController.getInstance().getMultasControlador().create(multa);
            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiarCampos();
            recargar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void seleccionar(JTable tblTabla) {
        chkAI.setEnabled(false);
        txtMulta.setText(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0).toString());
        txtFecha.setText(formatoFecha.format((Date) tblTabla.getValueAt(tblTabla.getSelectedRow(), 1)));
        txtDireccion.setText(tblTabla.getValueAt(tblTabla.getSelectedRow(), 2).toString());
        cmbCiudad.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 3).toString());
        cmbInfraccion.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 4).toString());
        cmbPersona.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 5).toString());
        cmbAgente.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 6).toString());
        cmbMatricula.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 7).toString());
    }

    @Override
    public void actualizar() {
        try {
            multa.setIdMulta(Integer.parseInt(txtMulta.getText().trim()));
            
            registrar();

            JpaController.getInstance().getMultasControlador().edit(multa);
            JOptionPane.showMessageDialog(null, "Registro actualizado");
            limpiarCampos();
            recargar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void limpiarCampos() {
        chkAI.setEnabled(true);
        chkAI.setSelected(false);
        txtMulta.setEnabled(true);
        txtMulta.setText("");
        txtFecha.setText("");
        txtDireccion.setText("");
        cmbAgente.setSelectedIndex(-1);
        cmbMatricula.setSelectedIndex(-1);
        cmbCiudad.setSelectedIndex(-1);
        cmbInfraccion.setSelectedIndex(-1);
        cmbPersona.setSelectedIndex(-1);
    }

    @Override
    public void eliminar(JTable tblTabla) {
        int id = (int) tblTabla.getValueAt(tblTabla.getSelectedRow(), 0);
        try {
            JpaController.getInstance().getMultasControlador().destroy(id);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            recargar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void recargar() {
        cargarListas();
        cargarRegistros();
    }
}
