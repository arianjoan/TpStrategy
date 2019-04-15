package pdo;

import models.Humano;

import java.sql.*;

public class TorneoPdo {

    public static boolean insertarTorneo(Humano campeon, Humano subcampeon){


        Connection conn = null;
        PreparedStatement stmt = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");



            conn = DriverManager.getConnection("jdbc:mysql://localhost/vikingosvsespartanos","root","");
            String sql;
            sql = "Insert into torneo (nombre_campeon, nombre_subcampeon, alcohol_en_sangre) values (?,?,?)";

            stmt = conn.prepareStatement(sql);

            stmt.setString(1,campeon.getNombre());
            stmt.setString(2,subcampeon.getNombre());
            stmt.setDouble(3,campeon.getCantidadBebida());

            stmt.executeUpdate();

            return true;


        }catch(SQLException se){

            System.out.println("error sql");
            se.printStackTrace();
            return false;
        }catch(Exception e){

            System.out.println("error classforname");
            e.printStackTrace();
            return false;
        }
    }
}


