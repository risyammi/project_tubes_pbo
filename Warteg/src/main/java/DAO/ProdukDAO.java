/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import models.*;

/**
 *
 * @author laudz
 */
public class ProdukDAO {

    private Connection conn;

    public ProdukDAO(Connection conn) {
        this.conn = conn;
    }

 
    public void insert(Produk p) throws Exception {
        String sql = "INSERT INTO Produk (nama_produk, harga_produk, gambar_produk, kategori) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, p.getNama());
        ps.setFloat(2, p.getHarga());
        ps.setBytes(3, p.getGambar());
        ps.setString(4, p.getKategori());

        ps.executeUpdate();
    }

    public void update(Produk p) throws Exception {
        String sql = "UPDATE Produk SET nama_produk=?, harga_produk=?, gambar_produk=?, kategori=? WHERE id_produk=?";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, p.getNama());
        ps.setFloat(2, p.getHarga());
        ps.setBytes(3, p.getGambar());
        ps.setString(4, p.getKategori());
        ps.setInt(5, p.getId());

        ps.executeUpdate();
    }

    public void delete(int id) throws Exception {
        String sql = "DELETE FROM Produk WHERE id_produk=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public Produk getById(int id) throws Exception {
        String sql = "SELECT * FROM Produk WHERE id_produk=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Produk p = new Produk();
            p.setId(rs.getInt("id_produk"));
            p.setNama(rs.getString("nama_produk"));
            p.setHarga(rs.getFloat("harga_produk"));
            p.setGambar(rs.getBytes("gambar_produk"));
            p.setKategori(rs.getString("kategori"));
            return p;
        }
        return null;
    }
}
