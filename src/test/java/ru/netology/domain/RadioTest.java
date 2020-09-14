package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
        // создаем тест, который проверяет понижение громкости на 1 значение
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
        // создаем тест, который проверяет повышение громкости на 1 значение
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
        // создаем тест, который проверяет повышение номера текущей станции на 1 значение
    void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.increaseStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
        // создаем тест, который проверяет повышение громкости больше максимального значения
    void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
        // создаем тест, который проверяет понижение громкости ниже минимального значения
    void shouldDecreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
        // создаем тест, который проверяет понижение громкости ниже минимального значения 2
    void shouldDecreaseVolumeUnderMin2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
        // создаем тест, который проверяет переключение канала больше максимального значения
    void shouldIncreaseStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        // создаем тест, который проверяет переключение канала меньше минимального значения
    void shouldDecreaseStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.getCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }
}