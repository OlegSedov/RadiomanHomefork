package ru.netology.domain;

public class Radio {
    private String name; // создаем переменную, содержащую имя радио
    private int maxVolume = 10; // создаем переменную, содержащую максимальную громкость
    private int minVolume = 0; // создаем переменную, содержащую минимальную громкость
    private int maxStation = 9; //создаем переменную, содержащую максимальный номер радиостанции
    private int minStation = 0; // создаем переменную, содержащую минимальный номер радиостанции
    private int currentVolume; // создаем переменную, содержащую текущую громкость
    private int currentStation; // создаем переменную, содержащую номер текущей радиостанции
    private boolean on; // создаем переменную, содержащую состояние включения

    // создаем метод, повышающий громкость
    public void increaseVolume() {
        if(currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    // создаем метод, понижающий громкость
    public void decreaseVolume() {
        if(currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    // создаем метод, повышающий номер радиостанции
    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation++;
        }
        else {
            currentStation = minStation;
        }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMaxVolume() { return maxVolume; }
    public void setMaxVolume(int maxVolume) { this.maxVolume = maxVolume; }

    public int getMinVolume() { return minVolume; }
    public void setMinVolume(int minVolume) { this.minVolume = minVolume; }

    public int getMaxStation() { return maxStation; }
    public void setMaxStation(int maxStation) { this.maxStation = maxStation; }

    public int getMinStation() { return minStation; }
    public void setMinStation(int minStation) { this.minStation = minStation; }

    public int getCurrentVolume() { return currentVolume; }
    public void setCurrentVolume(int currentVolume) {
        // если текущая громкость становится больше максимальной громкости,
        // то текущая громкость принимает значение максимальной громкости
        // и функция перестает выполняться
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        // если текущая громкость становится меньше минимальной громкости,
        // то текущая громкость принимает значение минимальной громкости
        // и функция перестает выполняться
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
        }

    public int getCurrentStation() { return currentStation; }
    public void setCurrentStation(int currentStation) {
        // если номер текущей станции становится больше максимального номера станций,
        // то номер текущей станции принимает значение максимального номера станций
        // и функция перестает выполняться
        if (currentStation < maxStation) {
            this.currentStation++;
        }
        else {
            currentStation = minStation;
        }
        // если номер текущей станции становится меньше минимального номера станций,
        // то номер текущей станции принимает значение минимального номера станций
        // и функция перестает выполняться
        if (currentStation > minStation) {
            this.currentStation--;
        }
        else {
            currentStation = maxStation;
        }
        this.currentStation = currentStation; }

    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }
}