package Sakancom.adminFeatures;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.sql.*;
import java.util.Scanner;

public class acceptingHousings {
    String host = "localhost";
    int port = 3306;
    String database = "Sakancom";
    String username = "root";
    String password = "password";
    String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
    String UserName,Password,Role;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
   boolean houseflage = false;

    try

    {
        // Establish the database connection
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sakancom", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create a statement
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Execute the query
        try {
            resultSet = statement.executeQuery("SELECT * FROM admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        // @Given("admin logged in with {string} as username and {string} as password and dashboard appears")
    public void admin_logged_in_with_as_username_and_as_password_and_dashboard_appears(String username, String password ) throws SQLException {
                // Process the results
                while (resultSet.next()) {
                    // Retrieve data from the result set
                    String Username = String.valueOf(resultSet.getInt("username"));
                    String Password = resultSet.getString("password");
                    System.out.println("welcome as admin");

    }
    //@Given("selected {string} from dashboard and see the pending features")
    public void selected_from_dashboard_and_see_the_pending_features(String string) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter (1): ");
                int number = scanner.nextInt();
                if (number == 1){

                            try {


                                Statement statement = connection.createStatement();
                                String sqlQuery = "SELECT * FROM housing where accept = false";
                                ResultSet resultSet = statement.executeQuery(sqlQuery);

                                while (resultSet.next()) {
                                    String departmentname = resultSet.getString("departmentName");
                                    int numberOfdep = resultSet.getInt("ID");
                                    String acc = resultSet.getString("accept");
                                    System.out.println("department id " + numberOfdep);
                                    System.out.println("department name " + departmentname);
                                    System.out.println("accept " + acc);
                                    System.out.println("------------------------");
                                }

                                resultSet.close();
                                statement.close();
                                connection.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }

    }
  //  @Given("selected one of the pending housings")
    public void selected_one_of_the_pending_housings() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of department: ");
        int number = scanner.nextInt();
        try {


            String sqlQuery = "SELECT * FROM department when accept =False";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                int numberOfdep = resultSet.getInt("ID");
                String acc = resultSet.getString("accept");
                String q = "Update set accept = '"+houseflage+"'";
                if( number== numberOfdep ){
                  houseflage =true;
                    acc.equals(houseflage);
                }
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
/*  //  @Given("Selected {string} to accept the housing or {string} to rejects it")
    public void selected_to_accept_the_housing_or_to_rejects_it(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
  //  @Then("housing accepted or rejected")
    public void housing_accepted_or_rejected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

}
