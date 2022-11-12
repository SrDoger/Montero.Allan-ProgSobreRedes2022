/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author allan
 */
public class DTOFactory {

    private static DTOFactory fabrica = null;
    private DTOGeneral dto = null;

    public DTOFactory() {
    }

    public static DTOFactory getInstance() {
        if (fabrica == null) {
            fabrica = new DTOFactory();
        }

        return fabrica;
    }

    public DTOGeneral getDTO(String tipo, ResultSet rs) throws SQLException {

        switch (tipo) {
            case "producto":
                dto = new DTOProducto(rs.getString("nombre"), rs.getInt("precio"), rs.getInt("id"));
                break;
            case "trabajador":
                dto = new DTOTrabajador(rs.getInt("salario"), rs.getInt("horasTrabajo"),rs.getInt("id"), rs.getString("oficio"), rs.getString("nombre"), rs.getString("sexo"), rs.getInt("edad"), rs.getInt("dni"));
                break;
            case "ventas":
                dto = new DTOVentas(rs.getDate("fecha"),rs.getInt("id"));
                break;
        }

        return dto;
    }
}
