package crm.chems.tp_evaluation.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import crm.chems.tp_evaluation.entity.Customer;
import crm.chems.tp_evaluation.entity.Orders;

@Repository
public class OrdersRepository {

    @Autowired
    private DataSource dataSource;

    public List<Orders> findAllCustomers(){
        List<Orders> orders = new ArrayList<Orders>();

        try (Connection connection = dataSource.getConnection()){
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM customer");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                orders.add(sqlToCustomer(rs));
            }
        } catch (SQLException e) {
            System.out.println("Repository Error");
            throw new RuntimeException(e);
        }
        return orders;
    }

    private Orders sqlToCustomer(ResultSet rs) throws SQLException {
        return new Orders(
            rs.getLong("id"),
            rs.getString("serviceType"),
            rs.getDouble("tva"),
            rs.getInt("nbDays"),
            rs.getDouble("totalExcludeTax"),
            rs.getInt("state"),
            rs.getString("comment")
            );
    }
}
