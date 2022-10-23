package org.example.Day7;

public class Task1 {
        public static void main(String[] args) {
            Airplane airplane = new Airplane();
            airplane.setLength(565);
            Airplane airplane1 = new Airplane();
            airplane1.setLength(3565);
            Airplane.compareAirplanes(airplane, airplane1);
    }
}
