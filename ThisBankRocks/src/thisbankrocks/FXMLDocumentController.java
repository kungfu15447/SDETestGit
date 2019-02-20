/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisbankrocks;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Frederik Jensen
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private Label label;
    @FXML
    private Button btnDynamicSQL;

    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        String connectionString = "jdbc:sqlserver://10.176.111.31:1433;database=TheVeryBestBankEverDB_CS2018A11;user=CS2018A_11;password=CS2018A_11";

        Connection conn = null;
        Statement withdrawMoney = null;
        Statement depositMoney = null;

        String withdrawMoneySQL = "UPDATE BankAccount SET Balance = Balance - 1000 WHERE AccountID = 1";
        String depositMoneySQL = "UPDATE BankAccount SET Balance = Balance + 1000 WHERE AccountID = 2";

        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //Use SQL Server JDBC driver
            conn = DriverManager.getConnection(connectionString);

            conn.setAutoCommit(false);
            withdrawMoney = conn.createStatement();
            withdrawMoney.executeUpdate(withdrawMoneySQL);
            
            conn.close();

            depositMoney = conn.createStatement();
            depositMoney.executeUpdate(depositMoneySQL);

            conn.commit();
        } catch (Exception e)
        { 
            try
            {
                System.out.println("Doing rollback...");
                conn.rollback();
            } catch (SQLException ex)
            {
                
            }
            
            System.out.println("SQL Exception...");
        } 

    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

}
