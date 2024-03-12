package org.example;

import org.example.PatientRepository;
import org.example.Patients;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientsRepository implements PatientRepository {
    @Override
    public Integer Insert(Patients client) throws SQLException {
        String str = String.format("INSERT INTO patients (surname, name, ot, id_doctor) VALUES ('%s', '%s', '%s', '%s')",
                client.getName(),
                client.getSurname(),
                client.getOt(),
                client.getIdDoctor().getId());
        Statement stmt = this.getStatement(this.connectToDB());
        stmt.execute(str);
        stmt.close();
        try (ResultSet rs = this.getStatement(this.connectToDB()).executeQuery("SELECT MAX(id) FROM Patients")) {
            while (rs.next()) {
                return rs.getInt(1);
            }
            return -1;
        }
    }

    @Override
    public void Delete(Patients client) throws SQLException {
        String str = String.format("DELETE FROM patients where id = %s" , client.getId());
        Statement stmt = this.getStatement(this.connectToDB());
        stmt.execute(str);
        stmt.close();
    }
    @Override
    public void Update(Patients client, int id) throws SQLException {
        String str = String.format("UPDATE patients SET id = %s, surname = '%s', name = '%s', ot = '%s', idStylists = %s WHERE id = %s" ,
                client.getId(),
                client.getSurname(),
                client.getName(),
                client.getOt(),
                client.getIdDoctor().getId(),
                id);
        Statement stmt = this.getStatement(this.connectToDB());
        stmt.execute(str);
        stmt.close();
    }
    @Override
    public List<Patients> getList() throws SQLException {
        Statement stmt = this.getStatement(this.connectToDB());
        ResultSet ms = stmt.executeQuery("SELECT cl.id,  cl.surname, cl.name, cl.ot, cl.id_Doctor, st.id, st.name, st.surname, st.ot FROM Patients AS cl JOIN Doctors AS st ON cl.id_Doctor = st.id");

        List<Patients> clients = new ArrayList<>();
        while(ms.next()) {
            clients.add(new Patients(ms.getInt("id"),
                    ms.getString("surname"),
                    ms.getString("name"),
                    ms.getString("ot"),
                    new Doctors(ms.getInt("Doctors.id"), ms.getString("Doctors.surname"), ms.getString("Doctors.name"), ms.getString("Doctors.OT"))));
        }
        this.closeConnection(stmt);

        return clients;
    }
    @Override
    public Connection connectToDB() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/mem:mydb", "sa", "");
        if (conn==null) {
            System.out.println("Error with connection with DataBase!");
            System.exit(0);
        }
        return conn;
    }
    @Override
    public Statement getStatement(Connection conn) throws SQLException {
        return conn.createStatement();
    }
    public void closeConnection(Statement stmt) throws SQLException {
        stmt.close();
    }
}

