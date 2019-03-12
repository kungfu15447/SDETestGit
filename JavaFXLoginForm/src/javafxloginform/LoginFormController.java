/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxloginform;

import com.jfoenix.controls.JFXTextField;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
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
public class LoginFormController implements Initializable
{

    private Label label;
    @FXML
    private Button btnLogIn;
    @FXML
    private JFXTextField txtUsername;
    @FXML
    private JFXTextField txtPassword;
    @FXML
    private Label lblInfo;

    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void handleUserLogIn(ActionEvent event)
    {
        if (!txtUsername.getText().isEmpty() && !txtPassword.getText().isEmpty())
        {
            String user = getUsernameFromDB();
            switch (user)
            {
                case "incorrect":
                    lblInfo.setText("The Username or Password is incorrect");
                    break;
                case "error":
                    lblInfo.setText("An error occured while connecting");
                    break;
                default:
                    lblInfo.setText("Welcome " + user + "!");
                    break;
            }
        } else
        {
            lblInfo.setText("Please fill out the username and password textfield");
        }
    }

    private Connection getConnectionToDB() throws SQLServerException
    {

        String SERVER_NAME = "10.176.111.31";
        String DATABASE_NAME = "SimpleLogin";
        String USER = "CS2018A_11";
        String PASSWORD = "CS2018A_11";

        SQLServerDataSource ds;
        ds = new SQLServerDataSource();
        ds.setServerName(SERVER_NAME);
        ds.setDatabaseName(DATABASE_NAME);
        ds.setUser(USER);
        ds.setPassword(PASSWORD);

        Connection con = ds.getConnection();
        return con;
    }

    private String getUsernameFromDB()
    {
        try (Connection con = getConnectionToDB())
        {
            String sql = "SELECT username FROM UserTable WHERE username = '" + txtUsername.getText() + "' AND password = '" + txtPassword.getText() + "';";

            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            if (!rs.next())
            {
                return "incorrect";
            } else
            {
                do
                {
                    String username = rs.getString(1);;
                    return username;
                } while (rs.next());
            }
        } catch (Exception ex)
        {
            return "error";
        }
    }

}
