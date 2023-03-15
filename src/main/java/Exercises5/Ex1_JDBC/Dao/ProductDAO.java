package Exercises5.Ex1_JDBC.Dao;

import Exercises5.Ex1_JDBC.Connection.MyConnection;
import Exercises5.Ex1_JDBC.Model.Product;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public List<Product> getAllProduct() throws SQLException {
        List<Product> productList = new ArrayList<>();
        Connection conn = MyConnection.getConnection();

         try {
            String sql =  "SELECT * FROM `products` INNER JOIN `brands` ON products.brand_id = brands.id";

            Statement sta = conn.createStatement();

            ResultSet res = sta.executeQuery(sql);
            
            while (res.next()) {
                Product p = new Product();
                p.setId(res.getInt("id"));
                p.setProductName(res.getString("product_name"));
                p.setProductPrice(res.getInt("product_price"));
                p.setProductSize(res.getString("product_size"));
                p.setProductColor(res.getString("product_color"));
                p.setBrandId(res.getInt("brand_id"));

                productList.add(p);
            }
            res.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         return productList;
    }

    public Product getByID(int id) throws SQLException {
        Connection conn = MyConnection.getConnection();

        try {
            String sql =  "SELECT * FROM `products` WHERE `id` = " + id;

            Statement sta = conn.createStatement();

            ResultSet res = sta.executeQuery(sql);

            Product p = null;
            if (res.next()) {
                p = new Product();
                p.setId(res.getInt("id"));
                p.setProductName(res.getString("product_name"));
                p.setProductPrice(res.getInt("product_price"));
                p.setProductSize(res.getString("product_size"));
                p.setProductColor(res.getString("product_color"));
                p.setBrandId(res.getInt("brand_id"));
            }
            return p;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insertProduct(Product p) throws SQLException {
        Connection conn = MyConnection.getConnection();

        try {
            String sql =  String.format("INSERT INTO `products` VALUES (NUll, '%s','%d','%s','%s','%d')",
                   p.getProductName(), p.getProductPrice(), p.getProductSize(), p.getProductColor(), p.getBrandId());

            Statement sta = conn.createStatement();

            int res = sta.executeUpdate(sql);

            if (res == 0) {
                System.out.println("Insert products thất bại");
            }
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateProduct(Product p, int id) throws SQLException {
        Connection conn = MyConnection.getConnection();
        ProductDAO productDAO = new ProductDAO();
        Product pro = productDAO.getByID(id);
        if (pro == null) {
            System.out.println("Không có id phù hợp");
            return;
        }
        try {
            String sql =  String.format("UPDATE `products` SET `product_name` = `%s`, `product_price` = `%d`, `product_size` = `%s`, `product_color` = `%s`, `brand_id` = `%d` WHERE `id` = %d",
                    p.getProductName(), p.getProductPrice(), p.getProductSize(), p.getProductColor(), p.getBrandId(), id);

            Statement sta = conn.createStatement();

            int res = sta.executeUpdate(sql);

            if (res == 0) {
                System.out.println("Update products thất bại");
            }
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteProduct(int id) throws SQLException {
        Connection conn = MyConnection.getConnection();
        ProductDAO productDAO = new ProductDAO();
        Product pro = productDAO.getByID(id);
        if (pro == null) {
            System.out.println("Không có id phù hợp");
            return;
        }
        try {
            String sql = "DELETE `products` WHERE `id` = %d";

            Statement sta = conn.createStatement();

            int res = sta.executeUpdate(sql);

            if (res == 0) {
                System.out.println("Delete products thất bại");
            }
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
