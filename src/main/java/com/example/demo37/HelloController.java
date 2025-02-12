package com.example.demo37;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML private TableView<Car> tableView;
    @FXML private TableColumn<Car, Integer> brandColumn;
    @FXML private TableColumn<Car, String> yearColumn;
    @FXML private TableColumn<Car, String> priceColumn;

    public void initialize() {
        brandColumn.setCellValueFactory(new PropertyValueFactory<>("brand"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableView.setItems(getUsers());
    }

    private ObservableList<Car> getUsers() {
        return FXCollections.observableArrayList(
                new Car("Toyota", 2019, 25000),
                new Car("Tesla", 2022, 54000),
                new Car("Civic", 2023, 40000)
        );
    }
}