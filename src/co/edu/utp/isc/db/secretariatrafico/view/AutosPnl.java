package co.edu.utp.isc.db.secretariatrafico.view;

import co.edu.utp.isc.db.secretariatrafico.controller.JpaController;
import co.edu.utp.isc.db.secretariatrafico.model.Autos;
import co.edu.utp.isc.db.secretariatrafico.model.Concesionarios;
import co.edu.utp.isc.db.secretariatrafico.model.Modelos;
import co.edu.utp.isc.db.secretariatrafico.model.Personas;
import co.edu.utp.isc.db.secretariatrafico.model.TiposVehiculos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esteban
 */
public class AutosPnl extends javax.swing.JPanel implements Crud {

    /**
     * Creates new form AutosPnl
     */
    public AutosPnl() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPersona = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbModelo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cmbConcesionario = new javax.swing.JComboBox<>();
        cmbTipoVehiculo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 210));

        jLabel10.setText("Capacidad:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setText("Tipo vehículo:");

        jLabel1.setText("Matrícula:");

        jLabel12.setText("ID persona:");

        jLabel13.setText("Concesionario:");

        jLabel14.setText("Modelo:");

        jLabel9.setText("Color:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbPersona, javax.swing.GroupLayout.Alignment.LEADING, 0, 343, Short.MAX_VALUE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipoVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtColor)
                    .addComponent(cmbModelo, 0, 344, Short.MAX_VALUE)
                    .addComponent(cmbConcesionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cmbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cmbConcesionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbConcesionario;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbPersona;
    private javax.swing.JComboBox<String> cmbTipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo = null;
    private Autos auto = new Autos();
    private Concesionarios c = new Concesionarios();
    private Modelos mo = new Modelos();
    private Personas p = new Personas();
    private TiposVehiculos t = new TiposVehiculos();
    private List<Autos> listaAutos;
    private List<Concesionarios> listaConcesionarios;
    private List<Modelos> listaModelos;
    private List<Personas> listaPersonas;
    private List<TiposVehiculos> listaTiposVehiculos;
    
    @Override
    public void cargarListas() {
        this.listaAutos = JpaController.getInstance().getAutosControlador().findAutosEntities();
        this.listaConcesionarios = JpaController.getInstance().getConcesionariosControlador().findConcesionariosEntities();
        this.listaModelos = JpaController.getInstance().getModelosControlador().findModelosEntities();
        this.listaPersonas = JpaController.getInstance().getPersonasControlador().findPersonasEntities();
        this.listaTiposVehiculos = JpaController.getInstance().getTiposVehiculosControlador().findTiposVehiculosEntities();
    }

    @Override
    public DefaultTableModel getModelo() {
        if (modelo == null) {
            try {
                modelo = (new DefaultTableModel(
                        null, new String[]{
                            "Matrícula", "Color", "Capacidad", "ID Concesionario",
                            "ID Tipo vehículo", "ID Modelo", "ID Persona",}) {
                    Class[] types = new Class[]{
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class,
                        java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false, false, false, false, false, false, false, false
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
            cmbConcesionario.removeAllItems();
            for (Concesionarios concesionario : listaConcesionarios) {
                cmbConcesionario.addItem(concesionario.getNombreConcesionario());
            }
            cmbConcesionario.setSelectedIndex(-1);
            
            cmbModelo.removeAllItems();
            for (Modelos modelo : listaModelos) {
                cmbModelo.addItem(modelo.getNombreModelo());
            }
            cmbModelo.setSelectedIndex(-1);
            
            cmbPersona.removeAllItems();
            for (Personas persona : listaPersonas) {
                cmbPersona.addItem(persona.getIdPersona().toString());
            }
            cmbPersona.setSelectedIndex(-1);
            
            cmbTipoVehiculo.removeAllItems();
            for (TiposVehiculos tipoVehiculo : listaTiposVehiculos) {
                cmbTipoVehiculo.addItem(tipoVehiculo.getNombreTipoVehiculo());
            }
            cmbTipoVehiculo.setSelectedIndex(-1);
            
            modelo.setRowCount(0);
            for (Autos a : listaAutos) {
                modelo.addRow(new Object[]{
                    a.getMatricula(),
                    a.getColorAuto(),
                    a.getCapacidadAuto(),
                    a.getIdConcesionario().getIdConcesionario(),
                    a.getIdTipoVehiculo().getNombreTipoVehiculo(),
                    a.getIdModelo().getNombreModelo(),
                    a.getIdPersona().getIdPersona(),
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void registrar() {
        auto.setMatricula(txtMatricula.getText().trim());
        auto.setColorAuto(txtColor.getText().trim());
        auto.setCapacidadAuto(txtCapacidad.getText().trim());
        
        c.setIdConcesionario(Integer.parseInt(cmbConcesionario.getSelectedItem().toString()));
        auto.setIdConcesionario(c);
        
        for (Concesionarios concesionario : listaConcesionarios) {
            if (concesionario.getNombreConcesionario().equals(cmbConcesionario.getSelectedItem().toString())) {
                auto.setIdConcesionario(concesionario);
            }
        }
        
        for (TiposVehiculos tipo : listaTiposVehiculos) {
            if (tipo.getNombreTipoVehiculo().equals(cmbTipoVehiculo.getSelectedItem().toString())) {
                auto.setIdTipoVehiculo(tipo);
            }
        }
        
        for (Modelos model : listaModelos) {
            if (model.getNombreModelo().equals(cmbModelo.getSelectedItem().toString())) {
                auto.setIdModelo(model);
            }
        }
        
        for (Personas persona : listaPersonas) {
            if (persona.getNombrePersona().equals(cmbPersona.getSelectedItem().toString())) {
                auto.setIdPersona(persona);
            }
        }
    }

    @Override
    public void guardar() {
        try {
            registrar();
            
            JpaController.getInstance().getAutosControlador().create(auto);
            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiarCampos();
            recargar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void seleccionar(JTable tblTabla) {
        txtMatricula.setText(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0).toString());
        txtColor.setText(tblTabla.getValueAt(tblTabla.getSelectedRow(), 1).toString());
        txtCapacidad.setText(tblTabla.getValueAt(tblTabla.getSelectedRow(), 2).toString());
        cmbConcesionario.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 3).toString());
        cmbTipoVehiculo.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 4).toString());
        cmbModelo.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 5).toString());
        cmbPersona.setSelectedItem(tblTabla.getValueAt(tblTabla.getSelectedRow(), 6).toString());
    }

    @Override
    public void actualizar() {
        try {
            registrar();

            JpaController.getInstance().getAutosControlador().edit(auto);
            JOptionPane.showMessageDialog(null, "Registro actualizado");
            limpiarCampos();
            recargar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void limpiarCampos() {
        txtMatricula.setText("");
        txtColor.setText("");
        txtCapacidad.setText("");
        cmbConcesionario.setSelectedIndex(-1);
        cmbTipoVehiculo.setSelectedIndex(-1);
        cmbModelo.setSelectedIndex(-1);
        cmbPersona.setSelectedIndex(-1);
    }

    @Override
    public void eliminar(JTable tblTabla) {
        String id = tblTabla.getValueAt(tblTabla.getSelectedRow(), 0).toString();
        try {
            JpaController.getInstance().getAutosControlador().destroy(id);
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
