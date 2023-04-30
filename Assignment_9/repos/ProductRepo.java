package PIJL_Assignments.Assignment_9.repos;

import PIJL_Assignments.Assignment_9.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private Product convertRowToProduct(ResultSet resultSet) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setTitle(resultSet.getString("title"));
        product.setPrice(resultSet.getDouble("price"));
        product.setQuantity(resultSet.getInt("quantity"));
        return product;
    }
    public List<Product> getALlProducts() {
        List<Product> products = new ArrayList<>();
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement pst = connection.prepareStatement(ProductQueries.GET_ALL_PRODUCTS)) {
            ResultSet resultSet = pst.executeQuery();
            while(resultSet.next()) {
                Product product = convertRowToProduct(resultSet);
                products.add(product);
            }
            resultSet.close();
        }
        catch (SQLException ex){
            System.out.println("Problem:" + ex.getMessage());
        }

        return products;
    }
    public Product getProductById(int productId) {
        Product product = null;
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement pst = connection.prepareStatement(ProductQueries.GET_PRODUCT_BY_ID)) {

            System.out.println("flag1");
            // replacing ? in the statement
            pst.setInt(1, productId);

            System.out.println("flag2");
            ResultSet resultSet = pst.executeQuery();

            System.out.println("flag3");
            while(resultSet.next()) {
                product = convertRowToProduct(resultSet);
            }
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Problem in getting products. " + e.getMessage());
        }
        return product;
    }
    public boolean save(Product product) {
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement pst = connection.prepareStatement(ProductQueries.ADD_PRODUCT)) {

            pst.setInt(1, product.getId());
            pst.setString(2, product.getTitle());
            pst.setDouble(3, product.getPrice());
            pst.setInt(4, product.getQuantity());

            // executeUpdate() returns number of rows affected.
            return pst.executeUpdate() == 1;

        } catch (SQLException e) {
            throw new RuntimeException("Problem in getting products.");
        }
    }
    public boolean updateProductPrice(int productId, double newPrice) {
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement pst = connection.prepareStatement(ProductQueries.UPDATE_PRICE)) {
            pst.setDouble(1, newPrice);
            pst.setInt(2, productId);
            // executeUpdate() returns number of rows affected.
            return pst.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException("Problem in getting products.");
        }
    }
    public boolean updateProductQuantity(int productId, int newQuantity) {
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement pst = connection.prepareStatement(ProductQueries.UPDATE_QUANTITY)) {
            pst.setDouble(1, newQuantity);
            pst.setInt(2, productId);
            // executeUpdate() returns number of rows affected.
            return pst.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException("Problem in getting products.");
        }
    }
    public boolean remove(int productId) {
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement pst = connection.prepareStatement(ProductQueries.REMOVE_PRODUCT)) {
            pst.setInt(1, productId);
            // executeUpdate() returns number of rows affected.
            return pst.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException("Problem in getting products.");
        }
    }
}
