package com.walking;

public class CounterService {
    // Единый массив (список) для хранения всех счётчиков
    private Counter[] counters;

    
    public CounterService(Counter... counters) {
        this.counters = counters;
    }
    /**
     * Метод для добавления нового счётчика в массив
     * @param счетчик объект счётчика для добавления
     */
    public Counter addCounter(Counter counter) {
        int newArrayLength = counters.length + 1;

        Counter[] newCounters = new Counter[newArrayLength];
        newCounters[newArrayLength - 1] = counter;

        counters = copyArray(counters, newCounters);

        return counters[counters.length - 1];
    }

    /**
     * Метод для вывода данных по каждому счётчику в формате "Счётчик: Значение"
     */
    public void displayAllCounters() {
        if (counters.length == 0) {
            System.out.println("Список счётчиков пуст");
            return;
        }

        System.out.println("=== ДАННЫЕ ПО СЧЁТЧИКАМ ===");
        for (Counter counter : counters) {
            // Формат: "Название: значение единицы измерения"
            System.out.println(counter.toString());
        }
        System.out.println("==========================");
    }

    /**
     * Дополнительный метод: получить количество счётчиков
     */
    public int getNumberOfCounters() {
        return counters.length;
    }

    /**
     * Дополнительный метод: поиск счётчика по названию
     * @param название название счётчика для поиска
     * @return найденный счётчик или null, если не найден
     */
    public Counter getByName(String name) {
        for (Counter counter : counters) {
            if (counter.getname().equalsIgnoreCase(name)) {
                return counter;
            }
        }
        return null;
    }
    
    private Counter[] copyArray(Counter[] oldArray, Counter[] newArray) {
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        return newArray;
    }
}

