package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.increaseStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeUnderMin2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldDecreaseStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.getCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }
}