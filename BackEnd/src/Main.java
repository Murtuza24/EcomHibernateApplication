import com.hib.Dao.ProductDao;
import com.hib.Dao.UserDao;
import com.hib.entities.Product;
import com.hib.entities.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        List<Product> productList = productDao.getAllProducts();
        for (Product prod : productList) {
            System.out.println(prod.getProductID() + " " + prod.getProductName());
        }


        Product p = productDao.getProductById(2);
        System.out.println(p.getProductID() + " - " + p.getProductName());

        UserDao userDao = new UserDao();
        User user1 = new User();
        user1.setUserFirstName("Murtuza");
        user1.setUserLastName("Bhaiji");
        user1.setUserEmail("murtuza@gmail.com");
        user1.setUserPassword("user@123");
        user1.setUserAddress("Summit Avenue");
        user1.setUserState("Texas");
        user1.setUserCity("Arlington");
        user1.setUserCountry("US");

        userDao.registerUser(user1);


    }
}