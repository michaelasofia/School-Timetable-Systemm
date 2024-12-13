package schooltimesystem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import schooltimesystem.DataBase;
import schooltimesystem.SchoolMethod;

public class SchoolTimeTableView extends javax.swing.JFrame {
  
    public SchoolTimeTableView() {
        initComponents();
    }

    public void clear(){
        txtID.setText("");
        txtTeacher.setText("");
        txtSubject.setText("");
        txtTime.setText("");
        txtRoom.setText("");
        txtCCode.setText("");
        txtDay.setText("");
        txtEnd.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTeacher = new javax.swing.JTextField();
        txtSubject = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtRoom = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Instructor:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Subject:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Room Number:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Start Time:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCreate)
                .addGap(98, 98, 98)
                .addComponent(btnRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(84, 84, 84)
                .addComponent(btnDelete)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "INSTRUCTOR", "SUBJECT", "COURSE CODE", "DAY OF WEEK", "ROOM", "START TIME", "END TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("School Timetable System");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Course Code:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Day Of Week:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("End Time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(254, 254, 254)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDay)
                            .addComponent(txtRoom)
                            .addComponent(txtEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtTime))
                        .addGap(55, 55, 55))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
                                           
    // Retrieve input values
    String instructor = txtTeacher.getText();
    String subject = txtSubject.getText();
    String time = txtTime.getText();
    String room = txtRoom.getText();
    String course = txtCCode.getText();
    String day = txtDay.getText();
    String end = txtEnd.getText();
    String id = txtID.getText();

    // Validate input fields
    if (instructor.isEmpty() || subject.isEmpty() || time.isEmpty() || room.isEmpty() 
            || course.isEmpty() || day.isEmpty() || end.isEmpty() || id.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        clear(); // Clear fields on error
        return;
    }

    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        // Establish database connection
        conn = DataBase.getConnection();

        // SQL query to insert data
        String sql = "INSERT INTO `studentdb`.`studenttbl` (`id`, `instructor`, `subject`, `courseCode`, `dayOfWeek`, `roomNumber`, `startTime`, `endTime`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = conn.prepareStatement(sql);

        // Set parameters for the prepared statement
        stmt.setString(1, id);
        stmt.setString(2, instructor);
        stmt.setString(3, subject);
        stmt.setString(4, course);
        stmt.setString(5, day);
        stmt.setString(6, room);
        stmt.setString(7, time);
        stmt.setString(8, end);

        // Execute the statement
        stmt.executeUpdate();

        // Notify the user of success
        JOptionPane.showMessageDialog(null, "Record added successfully!");

        // Add the new record to the table
        DefaultTableModel def = (DefaultTableModel) table.getModel();
        def.addRow(new Object[]{id, instructor, subject, course, day, room, time, end});

        // Clear input fields
        clear();

    } catch (SQLException s) {
        // Handle duplicate entry error (MySQL error code 1062)
        if (s.getErrorCode() == 1062) {
            JOptionPane.showMessageDialog(null, "Record already exists!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Database error: " + s.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, s);
    } catch (Exception ex) {
        // Handle general exceptions
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
    }



    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
                                        
    // SQL query to retrieve all data from the database
    String sql = "SELECT * FROM `studentdb`.`studenttbl`"; // Select all columns

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        // Establish database connection
        conn = DataBase.getConnection();

        // Prepare the statement
        stmt = conn.prepareStatement(sql);

        // Execute the query and get the result set
        rs = stmt.executeQuery();

        // Get the table model
        DefaultTableModel def = (DefaultTableModel) table.getModel();

        // Clear any existing rows before populating the table
        def.setRowCount(0);

        // Populate the table with the data from the database
        while (rs.next()) {
            // Retrieve data for each row
            String id = rs.getString("id");
            String instructor = rs.getString("instructor");
            String subject = rs.getString("subject");
            String courseCode = rs.getString("courseCode");
            String dayOfWeek = rs.getString("dayOfWeek");
            String roomNumber = rs.getString("roomNumber");
            String startTime = rs.getString("startTime");
            String endTime = rs.getString("endTime");

            // Add the retrieved data as a new row to the table
            def.addRow(new Object[]{id, instructor, subject, courseCode, dayOfWeek, roomNumber, startTime, endTime});
        }

        // Notify the user of success
        JOptionPane.showMessageDialog(null, "Data loaded successfully!");

    } catch (SQLException ex) {
        // Handle any SQL exceptions (e.g., if there's an issue with the database)
        JOptionPane.showMessageDialog(null, "Error loading data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
    }


    }//GEN-LAST:event_btnReadActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                                          
    // Get the selected row
    int selectedRow = table.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the table model
    DefaultTableModel def = (DefaultTableModel) table.getModel();

    // Retrieve the `id` value (primary key or unique identifier) from the selected row
    String id = (String) def.getValueAt(selectedRow, 0);

    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        // Establish database connection
        conn = DataBase.getConnection();

        // SQL query to delete the record
        String sql = "DELETE FROM `studentdb`.`studenttbl` WHERE id = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, id);

        // Execute the deletion
        int rowsDeleted = stmt.executeUpdate();

        if (rowsDeleted > 0) {
            // Remove the row from the table
            def.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Record deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Record not found in the database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
    }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                                         
    // Get the selected row
    int selectedRow = table.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a row to update!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the table model
    DefaultTableModel def = (DefaultTableModel) table.getModel();

    // Retrieve the original `id` value (primary key or unique identifier column)
    String Id = (String) def.getValueAt(selectedRow, 0);

    // Get updated values from input fields
    String instructor = txtTeacher.getText();
    String subject = txtSubject.getText();
    String course = txtCCode.getText();
    String day = txtDay.getText();
    String room = txtRoom.getText();
    String time = txtTime.getText();
    String end = txtEnd.getText();
    String id = txtID.getText();

    // Validate input fields
    if (instructor.isEmpty() || subject.isEmpty() || course.isEmpty() || day.isEmpty() || room.isEmpty()
            || time.isEmpty() || end.isEmpty() || id.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        // Establish database connection
        conn = DataBase.getConnection();

        // SQL query to update the record
        String sql = "UPDATE `studentdb`.`studenttbl` SET instructor = ?, subject = ?, courseCode = ?, dayOfWeek = ?, roomNumber = ?, startTime = ?, endTime = ? WHERE id = ?";
        stmt = conn.prepareStatement(sql);

        // Set the updated values in the prepared statement
        stmt.setString(1, instructor);
        stmt.setString(2, subject);
        stmt.setString(3, course);
        stmt.setString(4, day);
        stmt.setString(5, room);
        stmt.setString(6, time);
        stmt.setString(7, end);
        stmt.setString(8, Id); // Use the original `id` for the WHERE clause

        // Execute the update statement
        int rowsUpdated = stmt.executeUpdate();

        if (rowsUpdated > 0) {
            // Update the table model with the new data
            def.setValueAt(id, selectedRow, 0); // Update `id` column
            def.setValueAt(instructor, selectedRow, 1); // Update `instructor` column
            def.setValueAt(subject, selectedRow, 2); // Update `subject` column
            def.setValueAt(course, selectedRow, 3); // Update `courseCode` column
            def.setValueAt(day, selectedRow, 4); // Update `dayOfWeek` column
            def.setValueAt(room, selectedRow, 5); // Update `roomNumber` column
            def.setValueAt(time, selectedRow, 6); // Update `startTime` column
            def.setValueAt(end, selectedRow, 7); // Update `endTime` column

            JOptionPane.showMessageDialog(null, "Record updated successfully!");
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Record not found in the database!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error updating record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
    }


    }//GEN-LAST:event_btnUpdateActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCCode;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTeacher;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
