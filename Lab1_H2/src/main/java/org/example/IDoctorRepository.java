package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface IDoctorRepository {
    void Insert(Doctors doctor) throws SQLException;
    void Delete(Doctors doctor) throws SQLException;
    void Update(Doctors doctor, int id) throws SQLException;

    List<Doctors> getList() throws  SQLException;
    Connection connectToDB() throws SQLException;
    Statement getStatement(Connection conn) throws SQLException;
}