/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_machine;
import atm_machine.BalancePage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Important!
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_db", "root", "Vaibhavi@25");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


