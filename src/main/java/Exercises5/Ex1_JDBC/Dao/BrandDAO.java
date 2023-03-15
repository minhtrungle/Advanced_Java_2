package Exercises5.Ex1_JDBC.Dao;

import Exercises5.Ex1_JDBC.Connection.MyConnection;
import Exercises5.Ex1_JDBC.Model.Brand;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BrandDAO {
    public List<Brand> getAllBrand() throws SQLException {
        List<Brand> brandList = new ArrayList<>();
        Connection conn = MyConnection.getConnection();

        try {
            String sql =  "SELECT * FROM `brands`";

            Statement sta = conn.createStatement();

            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {
                Brand b = new Brand();
                b.setId(res.getInt("id"));
                b.setBrandName(res.getString("brand_name"));
                b.setBrandAddress(res.getString("brand_address"));


                brandList.add(b);
            }
            res.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return brandList;
    }

    public Brand getByID(int id) throws SQLException {
        Connection conn = MyConnection.getConnection();

        try {
            String sql =  "SELECT * FROM `brands` WHERE `id` = " + id;

            Statement sta = conn.createStatement();

            ResultSet res = sta.executeQuery(sql);

            Brand b = null;
            if (res.next()) {
                b = new Brand();
                b.setId(res.getInt("id"));
                b.setBrandName(res.getString("brand_name"));
                b.setBrandAddress(res.getString("brand_address"));
            }
            return b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insertBrand(Brand b) throws SQLException {
        Connection conn = MyConnection.getConnection();

        try {
            String sql =  String.format("INSERT INTO `brands` VALUES (NUll, '%s','%s')",
                    b.getBrandName(), b.getBrandAddress());

            Statement sta = conn.createStatement();

            int res = sta.executeUpdate(sql);

            if (res == 0) {
                System.out.println("Insert brands thất bại");
            }
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateBrand(Brand b, int id) throws SQLException {
        Connection conn = MyConnection.getConnection();
        BrandDAO brandDAO = new BrandDAO();
        Brand bra = brandDAO.getByID(id);
        if (bra == null) {
            System.out.println("Không có id phù hợp");
            return;
        }
        try {
            String sql =  String.format("UPDATE `brands` SET `brand_name` = `%s`, `brand_address` = `%s` WHERE `id` = %d",
                   b.getBrandName(), b.getBrandAddress(), id);

            Statement sta = conn.createStatement();

            int res = sta.executeUpdate(sql);

            if (res == 0) {
                System.out.printf("Update `brands` thất bại");
            }
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteBrand(int id) throws SQLException {
        Connection conn = MyConnection.getConnection();
        BrandDAO brandDAO = new BrandDAO();
        Brand bra = brandDAO.getByID(id);
        if (bra == null) {
            System.out.println("Không có id phù hợp");
            return;
        }
        try {
            String sql = "DELETE `brands` WHERE `id` = %d";

            Statement sta = conn.createStatement();

            int res = sta.executeUpdate(sql);

            if (res == 0) {
                System.out.println("Delete brands thất bại");
            }
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
