package com.java.temperature;

class Temperature {
    float hitungSuhu(float suhu) {
        return 0;
    }
}

class Fahrenheit extends Temperature {
    @Override
    float hitungSuhu(float suhu) {
        return (float) ((9.0 * suhu) / 5.0 + 32.0);
    }
}

class Celcius extends Temperature {
    @Override
    float hitungSuhu(float suhu) {
        return (float) ((suhu - 32.0) * 5.0 / 9.0);
    }
}