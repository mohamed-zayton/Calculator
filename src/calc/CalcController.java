/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author EGYPT-LAPTOP
 * 
 */
public class CalcController implements Initializable  {

    @FXML
    TableView <Student>table;
    @FXML
    TableColumn <Student, Integer>c1;
    @FXML
    TableColumn <Student , String> c2;
    @FXML
    TableColumn <Student , String> c3;
    @FXML
    TableColumn <Student , String> c4;
    @FXML
    TextField idtxt;
    @FXML
    TextField fnametxt;
    @FXML
    TextField lnametxt; 
    @FXML
    TextField mobtxt;
    @FXML
    TextField search;
    int index;
    ObservableList<Student> list = FXCollections.observableArrayList(
        new Student(1,"mohamed","zayton","0200456456")
    );
    public void search(){
        
    }
    public void getSelected(){
        index = table.getSelectionModel().getSelectedIndex();
        if(index <= -1){
            return;
        }
        idtxt.setText(c1.getCellData(index).toString());
        fnametxt.setText(c2.getCellData(index));
        lnametxt.setText(c3.getCellData(index));
        mobtxt.setText(c4.getCellData(index));

    }
    public void edit(){
        int id = Integer.parseInt(idtxt.getText());
        String fname = fnametxt.getText();
        String lname = lnametxt.getText();
        String mob = mobtxt.getText();
        list.set(index,new Student(id,fname,lname,mob));
    }
    public void addStudent(){
        int id = Integer.parseInt(idtxt.getText());
        String fname = fnametxt.getText();
        String lname = lnametxt.getText();
        String mob = mobtxt.getText();
        table.getItems().add(new Student(id,fname,lname,mob));
    }
    public void Delete(){
        if(index <= -1){
            return;
        }
        table.getItems().remove(index);
        index = -1;
        idtxt.clear();
        fnametxt.clear();
        lnametxt.clear();
        mobtxt.clear();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        c1.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
        c2.setCellValueFactory(new PropertyValueFactory<Student,String>("fname"));
        c3.setCellValueFactory(new PropertyValueFactory<Student,String>("lname"));
        c4.setCellValueFactory(new PropertyValueFactory<Student,String>("tel1"));

        table.setItems(list);
    }
    
}    
    

