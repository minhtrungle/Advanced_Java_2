package Exercises5.Ex1_JDBC.Main;

import Exercises5.Ex1_JDBC.Dao.BrandDAO;
import Exercises5.Ex1_JDBC.Dao.ProductDAO;
import Exercises5.Ex1_JDBC.Model.Brand;
import Exercises5.Ex1_JDBC.Model.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void MeNu() {
        System.out.println("---- - QUẢN LÝ SẢN PHẨM ----");
        System.out.println("1. Danh sách sản phẩm theo bảng");
        System.out.println("2. Thêm sản phẩm (nhập từ bàn phím)");
        System.out.println("3. Xoá sản phẩm theo mã");
        System.out.println("4. Cập nhật thông tin sản phẩm");
        System.out.println("5. Lấy ra thông tin sau:");
        System.out.println("6. Lấy ra top 5 sản phẩm có giá cao nhất");
        System.out.println("7. Danh sách hãng sản xuất");
        System.out.println("8. Thêm hãng sản xuất");
        System.out.println("9. Xoá hãng sản xuất theo mã");
    }

    private static void option1() throws SQLException {
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.getAllProduct();
        System.out.printf("%20s %20s %20s %20s", "STT", "Tên sản phẩm", "Giá sản phẩm");
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            System.out.printf("%20d %20s %20d %20s\n", (i + 1), p.getProductName(), p.getProductPrice(), p.getProductColor());
        }
    }

    private static void option2(Scanner input) throws SQLException {
        ProductDAO productDAO = new ProductDAO();
        BrandDAO brandDAO = new BrandDAO();
        Product p = new Product();

        System.out.println("Nhập tên sp muốn thêm: ");
        String tenSP = input.nextLine();
        p.setProductName(tenSP);

        System.out.println("Nhập giá muốn thêm: ");
        int giaSP = input.nextInt();
        p.setProductPrice(giaSP);

        System.out.println("Nhập size muốn thêm: ");
        String sizeSP = input.nextLine();
        p.setProductSize(sizeSP);

        System.out.println("Nhập màu sắc muốn thêm: ");
        String mauSP = input.nextLine();
        p.setProductColor(mauSP);

        System.out.println("Danh sách hãng");
        List<Brand> brandList = brandDAO.getAllBrand();
        System.out.println(brandList);

        System.out.println("Nhập ID Brand muốn thêm: ");
        int idbrand = input.nextInt();
        p.setBrandId(idbrand);


        productDAO.insertProduct(p);
        System.out.println("Thêm sản phẩm thành công");
        input.close();
    }

    private static void option3(Scanner input) throws SQLException {
        ProductDAO productDAO = new ProductDAO();
        System.out.println("Nhập id saản phẩm muốn xóa: ");
        int idSP = Integer.parseInt(input.nextLine());

        productDAO.deleteProduct(idSP);
    }
    private static void option4(Scanner input) throws SQLException {
        ProductDAO productDAO = new ProductDAO();
        Product p = new Product();

        System.out.println("Nhập id sp muốn cập nhật: ");
        int idSP = Integer.parseInt(input.nextLine());
        p.setId(idSP);

        System.out.println("Nhập tên sp muốn cập nhật: ");
        String tenSP = input.nextLine();
        p.setProductName(tenSP);

        System.out.println("Nhập giá muốn cập nhật: ");
        int giaSP = input.nextInt();
        p.setProductPrice(giaSP);

        System.out.println("Nhập size muốn cập nhật: ");
        String sizeSP = input.nextLine();
        p.setProductSize(sizeSP);

        System.out.println("Nhập màu sắc muốn cập nhật: ");
        String mauSP = input.nextLine();
        p.setProductColor(mauSP);

        System.out.println("Nhập ID Brand muốn cập nhật: ");
        int idbrand = input.nextInt();
        p.setBrandId(idbrand);
        input.close();
        productDAO.updateProduct(p, idSP);
        System.out.println("Cập nhật sản phẩm thành công");
    }

    private static void option5() throws SQLException {

    }
    private static void option6() throws SQLException {

    }
    private static void option7() throws SQLException {

    }
    private static void option8(Scanner input) throws SQLException {
        BrandDAO brandDAO = new BrandDAO();
        Brand b = new Brand();

        System.out.println("Nhập tên hãng muốn thêm: ");
        String tenHang = input.nextLine();
        b.setBrandName(tenHang);

        System.out.println("Nhập địa chỉ muốn thêm: ");
        String diaChi = input.nextLine();
        b.setBrandAddress(diaChi);

        brandDAO.insertBrand(b);
        System.out.println("Thêm hãng thành công");

    }
    private static void option9() throws SQLException {

    }
    public static void main(String[] args) throws SQLException {
        MeNu();
        System.out.println("Chọn chức năng [1-9]");
        Scanner in = new Scanner(System.in);
        int index = -1;
        do {
            try {
                index = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Không có chức năng!");
            }
            if (index < 1 || index > 9) {
                System.out.println("Không có chức năng!");
                continue;
            }
            switch (index) {
                case 1:
                    System.out.println("1. Danh sách sản phẩm theo bảng");
                    option1();
                    break;
                case 2:
                    System.out.println("2. Thêm sản phẩm (nhập từ bàn phím)");
                    option2(in);
                    break;
                case 3:
                    System.out.println("3. Xoá sản phẩm theo mã");
                    option3(in);
                    break;
                case 4:
                    System.out.println("4. Cập nhật thông tin sản phẩm");
                    option4(in);
                    break;
                case 5:
                    System.out.println("5. Lấy ra thông tin sau:");
                    option5();
                    break;
//                case 6:
//                    System.out.println("6. Lấy ra top 5 sản phẩm có giá cao nhất");
//                    option6();
//                    break;
//                case 7:
//                    System.out.println("7. Danh sách hãng sản xuất");
//                    option7();
//                    break;
                case 8:
                    System.out.println("8. Thêm hãng sản xuất");
                    option8(in);
                    break;
                case 9:
                    System.out.println("9. Xoá hãng sản xuất theo mã");
                    //option9();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (index != 0);
    }
}
