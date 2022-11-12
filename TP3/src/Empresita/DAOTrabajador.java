/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresita;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allan
 */
public class DAOTrabajador implements DAOGeneral<DTOTrabajador> {

    @Override
    public void agregar(DTOTrabajador registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {//to do
            String consulta = "INSERT INTO trabajador(salario, horasTrabajo, id, oficio, nombre, sexo, edad, dni) VALUES (?,?,?,?,?,?,?,?)";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setInt(1, registro.getSalario());
            ps.setInt(2, registro.getHorasTrabajo());
            ps.setInt(3, registro.getId());
            ps.setString(4, registro.getOficio());
            ps.setString(5, registro.getNombre());
            ps.setString(6, registro.getSexo());
            ps.setInt(7, registro.getEdad());
            ps.setInt(8, registro.getDni());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public void borrar(DTOTrabajador registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "DELETE FROM trabajador WHERE id = ? ";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setInt(1, registro.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public void actualizar(DTOTrabajador registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "UPDATE trabajador SET salario=?,horasTrabajo=?,oficio=?,nombre=?,sexo=?,edad=?,dni=? WHERE id=?";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setInt(1, registro.getSalario());
            ps.setInt(2, registro.getHorasTrabajo());
            ps.setString(3, registro.getOficio());
            ps.setString(4, registro.getNombre());
            ps.setString(5, registro.getSexo());
            ps.setInt(6, registro.getEdad());
            ps.setInt(7, registro.getDni());
            
            ps.setInt(8, registro.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public ArrayList<DTOTrabajador> obtenerTodo() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<DTOTrabajador> listAux = new ArrayList<>();

        try {
            String sql = "SELECT * FROM trabajador";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                listAux.add((DTOTrabajador) DTOFactory.getInstance().getDTO("trabajador", rs));
            }

        } catch (SQLException ex) {

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listAux;
    }

    @Override
    public DTOTrabajador obtener(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM trabajador WHERE id=?";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                return (DTOTrabajador) DTOFactory.getInstance().getDTO("trabajador", rs);
            }
        } catch (SQLException ex) {

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(DAOTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
