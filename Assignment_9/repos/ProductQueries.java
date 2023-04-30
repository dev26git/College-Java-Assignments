package PIJL_Assignments.Assignment_9.repos;

public class ProductQueries {
    // add new product query
    public static final String ADD_PRODUCT = "insert into products values(?,?,?,?)";
    // read all products
    public static final String GET_ALL_PRODUCTS = "select * from products";
    // read single product
    public static final String GET_PRODUCT_BY_ID = "select * from products where id = ?";
    // update price
    public static final String UPDATE_PRICE = "update products set price = ? where id = ?";
    // update quantity
    public static final String UPDATE_QUANTITY = "update products set quantity = ? where id = ?";
    // remove product
    public static final String REMOVE_PRODUCT = "delete from products where id = ?";
}