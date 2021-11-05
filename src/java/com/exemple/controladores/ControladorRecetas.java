package com.exemple.controladorRecetas;

import com.exemple.modelos.Recetas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorRecetas {

    
   public ControladorRecetas() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorRecetas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private final String url = "jdbc:sqlserver://localhost;databaseName=farmacia";
    private final String usr = "sa";
    private final String pass = "123";

    public ArrayList<Recetas> traerRecetas() {
        ArrayList<Recetas> lst = new ArrayList<>();

        try (Connection cnn = DriverManager.getConnection(url, usr, pass);
                Statement smt = cnn.createStatement();
                ResultSet rs = smt.executeQuery("SELECT * FROM Recetas");) {

            while (rs.next()) {
                int idReceta = rs.getInt(1);
                int idCliente = rs.getInt(2);
                int idProfesional = rs.getInt(3);
                int idFormaPago = rs.getInt(4);
                int idSucursal = rs.getInt(5);
                Recetas r = new Recetas(idReceta, idCliente, idProfesional, idFormaPago, idSucursal);
                lst.add(r);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error de acceso a datos!");
            System.out.println(e);
        }

        return lst;
    }
    public void crerReceta(Recetas r) {
        try (Connection cnn2 = DriverManager.getConnection(url, usr, pass);
            PreparedStatement ps = cnn2.prepareStatement("INSERT INTO Recetas (id_cliente,id_profesional,id_forma_pago,id_sucursal) VALUES(?,?,?,?)")) {
            
            ps.setInt(1, r.getIdCliente());
            ps.setInt(2, r.getIdProfesional());
            ps.setInt(3, r.getIdMetodoPago());
            ps.setInt(4, r.getIdSucursal());
             
            int filasAlcanzadas = ps.executeUpdate();
            System.out.println(String.valueOf(filasAlcanzadas) + " Reparaciones Insertadas");

        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error en el acceso a datos!");
        }
    }
}
