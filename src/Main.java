public class Main {
    static void main() {
        // siia tulen main stuff, nagu asjade loomine või meetotite käivitamine

        Screen screen = new Screen(800, 600); // algne näide, et balli saaks teha paremini
        Ball ball = new Ball((Math.random() * 10 + 1), 10, (Math.random() * 20 + 1));
        ball.setCoordinates((double) screen.getX() / 2, (double) screen.getY() / 2);

        // ma arvan, et tegelt gravitatsioon võiks olla füüsika all ja olenevalt, kas gravity on true
        // siis kasutab ühte meetodi versiooni, kui mitte, siis teist või on meetodi sees küsimus, kas on gravity siis
        // tagastab ühe vastuse, kui ei, siis teise, võib ka olla eraldi meetod, mis käivitab olenevalt gravitatsiooni
        // olemas olust ühe või teise meetodi
        if (UserInput.userAnswer()) {
            boolean gravity = true; // tegelt loob gravity objekti või physics objekti
        }
        else {
            boolean gravity = false; // kui on gravity objekt, siis seda ilmselt ei ole vaja physics objektil on vaja ja gravity false
        }
    }
}
