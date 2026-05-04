package app;

import app.collectionsJava.StreamExamples;
import app.testingData.Masina;
import app.testingData.MasinaData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<Masina>masini = MasinaData.getMasini();
        StreamExamples.ex6(masini);


    }
}




