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
public class DAOProducto implements DAOGeneral<DTOProducto> {

    @Override
    public void agregar(DTOProducto registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "INSERT INTO producto(nombre,precio) VALUES (?,?)";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setString(1, registro.getNombre());
            ps.setInt(2, registro.getPrecio());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public void borrar(DTOProducto registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "DELETE FROM producto WHERE id = ? ";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setInt(1, registro.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public void actualizar(DTOProducto registro) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            String consulta = "UPDATE producto SET nombre=? , precio=? WHERE id=?";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta);

            ps.setString(1, registro.getNombre());
            ps.setInt(2, registro.getPrecio());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public ArrayList<DTOProducto> obtenerTodo() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<DTOProducto> listAux = new ArrayList<>();

        try {
            String sql = "SELECT * FROM producto";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                listAux.add((DTOProducto) DTOFactory.getInstance().getDTO("producto", rs));
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
                Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listAux;
    }

    @Override
    public DTOProducto obtener(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM producto WHERE id=?";

            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                return (DTOProducto) DTOFactory.getInstance().getDTO("producto", rs);
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
                Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
