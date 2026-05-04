package app.testingData;

import java.util.List;

public class Masina {
    private String marca;
    private int motor;
    private int greutate;
    private boolean automata;

    public Masina(String marca,int motor,int greutate,boolean automata){
        this.marca = marca;
        this.motor = motor;
        this.greutate =greutate;
        this.automata = automata;
    }
    public String getMarca() {
        return marca;
    }

    public int getMotor() {
        return motor;
    }

    public int getGreutate() {
        return greutate;
    }
    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", motor=" + motor +
                ", greutate=" + greutate +
                ", automata=" + automata +
                '}';
    }


    public static void afisareMasini(List<Masina>masini){
        for(Masina m : masini){
            System.out.println(m);
        }
    }



}
