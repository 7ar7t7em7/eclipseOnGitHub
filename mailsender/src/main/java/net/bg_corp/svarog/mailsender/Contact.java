package net.bg_corp.svarog.mailsender;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contact {
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty email = new SimpleStringProperty();

    public Contact(String name, String email) {
        this.name.set(name);
        this.email.set(email);
    }

    // Геттеры
    public String getName() { return name.get(); }
    public String getEmail() { return email.get(); }

    // Сеттеры
    public void setName(String value) { name.set(value); }
    public void setEmail(String value) { email.set(value); }

    // Свойства
    public StringProperty nameProperty() { return name; }
    public StringProperty emailProperty() { return email; }
}
