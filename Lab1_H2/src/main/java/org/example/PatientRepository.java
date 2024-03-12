package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;



public interface PatientRepository {
    Integer Insert(Patients doctor) throws SQLException;
    void Delete(Patients doctor) throws SQLException;
    void Update(Patients doctor, int id) throws SQLException;

    List<Patients> getList() throws  SQLException;
    Connection connectToDB() throws SQLException;
    Statement getStatement(Connection conn) throws SQLException;
}
