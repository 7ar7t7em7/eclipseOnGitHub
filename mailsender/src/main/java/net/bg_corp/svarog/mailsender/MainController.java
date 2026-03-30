package net.bg_corp.svarog.mailsender;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {
    @FXML
    private TableView<Contact> tableView;
    @FXML
    private TableColumn<Contact, String> nameColumn;
    @FXML
    private TableColumn<Contact, String> emailColumn;
    @FXML
    private Button addButton;
    @FXML
    private Button editButton;
    @FXML
    private Button deleteButton;

    private ObservableList<Contact> data = FXCollections.observableArrayList();
    
    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        emailColumn.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
        loadDataFromFile();
        tableView.setItems(data);
        editButton.disableProperty().bind(tableView.getSelectionModel().selectedItemProperty().isNull());
        deleteButton.disableProperty().bind(tableView.getSelectionModel().selectedItemProperty().isNull());
    }

    private void loadDataFromFile() {     
    	String fileName = "contacts.csv";
    
    // Проверяем, существует ли файл
    if (!Files.exists(Paths.get(fileName))) {
        System.out.println("Файл " + fileName + " не найден. Создаём с тестовыми данными.");
        createDefaultFile();
        return;
    }
    
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length == 2) {
                data.add(new Contact(parts[0].trim(), parts[1].trim()));
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Ошибка при чтении файла: " + e.getMessage());
    }
    }
    private void createDefaultFile() {     
    	List<String> defaultData = List.of(
            "Иван Иванов,ivan@mail.com",
            "Пётр Петров,petr@gmail.com"
        );
        
        try {
            Files.write(Paths.get("contacts.csv"), defaultData);
            // После создания файла — читаем его
            loadDataFromFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Не удалось создать файл по умолчанию: " + e.getMessage());
        }
        
    }
    
    
    private void saveDataToFile() {     
    	try {
        List<String> lines = data.stream()
                .map(contact -> contact.getName() + ";" + contact.getEmail())
                .collect(java.util.stream.Collectors.toList());
            
            Files.write(Paths.get("contacts.csv"), lines);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при сохранении файла: " + e.getMessage());
        }
    	
    }

    @FXML
    private void handleAdd() { 
        data.add(new Contact("Новый контакт", ""));
        saveDataToFile(); // Сохраняем после добавления
    }
    @FXML
    private void handleEdit() {
        Contact selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            // Здесь можно добавить диалог редактирования
            System.out.println("Редактируем: " + selected.getName());
            saveDataToFile(); // Сохраняем после редактирования
        }
    }
    @FXML
    private void handleDelete() { 
        Contact selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            data.remove(selected);
            saveDataToFile(); // Сохраняем после удаления
        }
    }
}
