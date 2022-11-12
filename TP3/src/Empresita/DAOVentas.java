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
public class DAOVentas implements DAOGeneral<DTOVentas> {

    @Override
    public void agregar(DTOVentas registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "INSERT INTO ventas(id, fecha) VALUES (?,?)";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setInt(1, registro.getId());
            ps.setDate(2, registro.getFecha());

        } catch (SQLException ex) {
            Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public void borrar(DTOVentas registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "DELETE FROM ventas WHERE id = ? ";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setInt(1, registro.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public void actualizar(DTOVentas registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "UPDATE ventas SET fecha=? WHERE id=?";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setDate(1, registro.getFecha());
            ps.setInt(2, registro.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public ArrayList<DTOVentas> obtenerTodo() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<DTOVentas> listAux = new ArrayList<>();

        try {
            String sql = "SELECT * FROM ventas";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                listAux.add((DTOVentas) DTOFactory.getInstance().getDTO("ventas", rs));
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
                Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listAux;
    }

    @Override
    public DTOVentas obtener(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM ventas WHERE id=?";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                return (DTOVentas) DTOFactory.getInstance().getDTO("ventas", rs);
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
                Logger.getLogger(DAOVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
