package app.testingData;

import java.util.ArrayList;
import java.util.List;

public class MasinaData {

    public static List<Masina>getMasini(){
        List<Masina> masini = new ArrayList<>();

        masini.add(new Masina("BMW", 2000, 1500, true));
        masini.add(new Masina("Audi", 1800, 1400, false));
        masini.add(new Masina("Mercedes", 2200, 1600, true));
        masini.add(new Masina("Volkswagen", 1600, 1300, false));
        masini.add(new Masina("Toyota", 1500, 1250, true));
        masini.add(new Masina("Ford", 2000, 1550, false));
        masini.add(new Masina("Honda", 1400, 1200, true));
        masini.add(new Masina("Hyundai", 1600, 1350, false));
        masini.add(new Masina("Kia", 1700, 1400, true));
        masini.add(new Masina("Peugeot", 1500, 1300, false));
        return masini;
    }
}
