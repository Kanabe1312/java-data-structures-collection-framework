package app.collectionsJava;

import app.testingData.Masina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamExamples {


    public static void ex1(List<Masina>masini){


        masini.sort((m1,m2)->m1.getMarca().compareTo(m2.getMarca()));
        System.out.println("\n====Sortare dupa marca(crescator)===");
        Masina.afisareMasini(masini);

        masini.sort((m1,m2)->m2.getMarca().compareTo(m1.getMarca()));
        System.out.println("\n===Sortare dupa marca (descrescator)===");
        Masina.afisareMasini(masini);
    }


    public static void ex2(List<Masina>masini){
        masini.sort((m1,m2)->Integer.compare(m1.getMotor(),m2.getMotor()));
        System.out.println("\n===Sortare dupa motor(crescator)====");
        Masina.afisareMasini(masini);

       masini.sort((m1,m2)->Integer.compare(m2.getMotor(),m1.getMotor()));
        System.out.println("\n===Sortare dupa motor (descrescator)===");
        Masina.afisareMasini(masini);
    }

    public static void ex3(List<Masina>masini){

        System.out.println("\n===Sortare dupa greutate(Crescator)===");
        masini.stream().sorted((m1,m2)->Integer.compare(m1.getGreutate(),m2.getGreutate()))
                .forEach(System.out::println);

        Masina min = masini.stream().min((m1,m2)->Integer.compare(m1.getGreutate(),m2.getGreutate())).orElse(null);

        System.out.println("\n===Cea mai usoara masina===");
        System.out.println(min);

        Masina max = masini.stream().max((m1,m2)->Integer.compare(m1.getGreutate(),m2.getGreutate())).orElse(null);
        System.out.println("\n===Cea mai grea masina===");
        System.out.println(max);

    }

    public static void ex4(List<Masina>masini){
        masini.sort((m1,m2)->m1.getMarca().compareTo(m2.getMarca()));
        System.out.println("\n===Sortat dupa marca===");
        Masina.afisareMasini(masini);

        //inversare

        Collections.reverse(masini);
        System.out.println("\n===Reverse===");
        Masina.afisareMasini(masini);

    }
    public static void ex5(List<Masina>masini){
       for(int i = 1;i <= 3;i++){
           Collections.shuffle(masini);
           System.out.println("Shuffle"+i);
           Masina.afisareMasini(masini);
       }

    }
    public static void ex6(List<Masina>masini){
        Masina max = Collections.max(masini,(m1,m2)->Integer.compare(m1.getMotor(),m2.getMotor()));
        System.out.println("\n===Masina cu motorul cel mai mare===");
        System.out.println(max);
    }
    public static void ex7



}


