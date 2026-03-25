package com.walking;

public class Counter {
    // Неизменяемые поля (final)
    private final String name;
    private final String measurement;

    // Изменяемое поле
    private double value;

    /**
     * Конструктор для создания счётчика
     * @param name наименование счётчика (неизменяемое)
     * @param measurement единицы измерения (неизменяемые)
     * @param начальноеЗначение начальное значение счётчика
     */
    public Counter(String name, String measurement, double startingValue) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название счётчика не может быть пустым");
        }
        if (measurement == null || measurement.trim().isEmpty()) {
            throw new IllegalArgumentException("Единицы измерения не могут быть пустыми");
        }

        this.name = name.trim();
        this.measurement = measurement.trim();
        this.value = startingValue >= 0 ? startingValue : 0;
    }

    // Геттеры для всех полей
    public String getname() {
        return name;
    }

    public String getMeasurement() {
        return measurement;
    }

    public double getValue() {
        return value;
    }

    // Сеттер только для изменяемого поля
    public void setValue(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Значение счётчика не может быть отрицательным");
        }
        this.value = value;
    }

    /**
     * Метод для увеличения значения счётчика на заданную величину
     * @param addValue величина, на которую увеличивается значение
     */
    public void add(double addValue) {
        if (addValue < 0) {
            throw new IllegalArgumentException("Прирост не может быть отрицательным");
        }
        this.value += addValue;
    }

    /**
     * Метод для сброса значения счётчика до нуля
     */
    public void reset() {
        this.value = 0;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f %s", name, value, measurement);
    }
}
