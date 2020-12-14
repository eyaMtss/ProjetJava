/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author eyama
 */
public class ProjetJava extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        try{
            String driveName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driveName);
            String url="jdbc:oracle:thin:@localhost:1521:EYA";
            conn= DriverManager.getConnection(url, "ProjetJava", "ProjetJava");
            System.out.println("Successufully connected to the database");
        }catch(ClassNotFoundException e){
            System.out.println("Could not find the database driver"+e.getMessage());
        }catch (SQLException e){
             System.out.println("Could not find the database "+e.getMessage());
        }
        launch(args);
        
        
        /////
        /*try{
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select * from testing");
            while (rs.next()){
                int no=rs.getInt(1);
                String name=rs.getString(2).toString();
                System.out.println(""+no+"  "+name);
            }
            rs.close();
            }catch(Exception e)
            {
                e.printStackTrace();  //afficher donnees
        }*/
        
        
        
        
    }
   /* private Stage primaryStage;
        private AnchorPane rootLayout;
    @Override
    public void start(Stage primaryStage) throws Exception {
         
       this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
    }
    
    public void initRootLayout() throws IOException{
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ProjetJava.class.getResource("view/RootLayout.fxml"));
            rootLayout = (AnchorPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showPersonOverview() throws IOException{
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ProjetJava.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
           // rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public Stage getPrimaryStage() {
		return primaryStage;
	}*/

    @Override
    public void start(final Stage primaryStage)  {
       try {
      // Localisation du fichier FXML.
      final URL url = getClass().getResource("Login.fxml");
      // Création du loader.
      final FXMLLoader fxmlLoader = new FXMLLoader(url);
      // Chargement du FXML.
      final AnchorPane root = (AnchorPane) fxmlLoader.load();
      // Création de la scène.
      final Scene scene = new Scene(root, 600, 400);
      primaryStage.setScene(scene);
    } catch (IOException ex) {
      System.err.println("Erreur au chargement: " + ex);
    }
    primaryStage.setTitle("Login");
    primaryStage.show();
    }
}
