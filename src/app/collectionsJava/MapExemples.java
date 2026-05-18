package app.collectionsJava;

import app.testingData.books.model.Book;

import java.util.*;

public class MapExemples {

    public void exempluUsual() {

        Map<String, Book> map = new HashMap<>();

        Book book1 = new Book(1, "Clean Code");

        Book book2 = new Book(2, "Atomic Habits");

        Book book3 = new Book(3, "Java Programming");

        Book book4 = new Book(4, "Design Patterns");

        Book book5 = new Book(5, "The Pragmatic Programmer");

        map.put("cleanCode", book1);      //todo key poate fi orice atata timp cat este String
        map.put("atomicHabits", book2);
        map.put("javaPrograming", book3);
        map.put("designPatterns", book4);
        map.put("thePragmaticProgrammer", book5);

        System.out.println(map.get("designPatterns"));
        System.out.println(map.containsKey("cleanCode"));
        System.out.println("\nInitial: ");
        System.out.println(map.size());
        map.remove("designPatterns");
        System.out.println("\nDupa remove: ");
        System.out.println(map.size());
        System.out.println(map.containsValue(book5));

        System.out.println("\nKey Set");//returneaza doar key
        System.out.println(map.keySet());

        System.out.println("\nValues");//returneaza doar values
        System.out.println(map.values());

        System.out.println("\nEntrySet");//returneaza key+values
        System.out.println(map.entrySet());

        System.out.println("\n");

        Set<Map.Entry<String, Book>> set = map.entrySet();

        set.forEach(key -> {
            System.out.println(key.getKey());
            System.out.println(key.getValue());
        });


    }

    public void Ex1() {

        String[] words = {"java", "map", "java", "set", "map", "java"};
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                int value = map.get(word);
                map.put(word, value + 1);
            }
            else {
                map.put(word,1);
            }
        }
        System.out.println(map);


    }

    public void Ex2(){
        Map<String,Integer>map = new HashMap<>();

        map.put("ana",10);
        map.put("bob",20);
        map.put("carl",30);

        Map<Integer ,String> reversed = new HashMap<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            reversed.put(entry.getValue(),entry.getKey());
        }

        System.out.println("\nReversed Map:" );
        System.out.println(reversed);
    }

    public void Ex3(){
        String []words = {"ana", "alex", "bob", "bella", "carl","francesca","carol"};

        Map<Character,List<String>>map = new HashMap<>();

        for(String word : words){
            char first = word.charAt(0);
            if(!map.containsKey(first)){
                map.put(first,new ArrayList<>());
            }
            map.get(first).add(word);
        }

        System.out.println(map);

    }

    public void Ex4(){


        Map<String,Integer>map = new HashMap<>();
        map.put("ana",85);
        map.put("bob",92);
        map.put("carl",78);

        int max = 0;
        for(Map.Entry<String,Integer>entry :map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            }

        }
        System.out.println("Max value : "+ max);
    }

    public void Ex5(){
        Map<String,Integer>map1 = new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);

        Map<String,Integer>map2 = new HashMap<>();
        map2.put("b",3);
        map2.put("c",4);

        Map<String , Integer>merged = new HashMap<>();

        for (Map.Entry<String,Integer> entry : map1.entrySet()){
            merged.put(entry.getKey(),entry.getValue());
        }
        for (Map.Entry<String,Integer> entry : map2.entrySet()) {

            if(merged.containsKey(entry.getKey())){

                int suma = merged.get(entry.getKey()) + entry.getValue();

                merged.put(entry.getKey(), suma);

            }

            else{

                merged.put(entry.getKey(), entry.getValue());

            }

        }
        System.out.println(merged);
    }

    public void Ex6(){
        Map<String,Integer>notes = new HashMap<>();
        notes.put("ana",9);
        notes.put("bob",4);
        notes.put("carl",7);
        notes.put("dan",3);

        Map<String,Integer>filtered = new HashMap<>();

        for(Map.Entry<String,Integer> entry : notes.entrySet()){
            if(entry.getValue() >= 5){
                filtered.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(filtered );
    }

    public void Ex7(){
        Map<String,Integer> map = new HashMap<>();

        map.put("ana",72);
        map.put("bob",95);
        map.put("carl",88);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());


        list.sort((a, b)->b.getValue()-a.getValue());

        Map<String,Integer>sorted = new LinkedHashMap<>();
        for (Map.Entry<String,Integer>entry:list){
            sorted.put(entry.getKey(),entry.getValue());
        }
        System.out.println(sorted);

    }

    public void Ex8(){

        String text = "aaabbbcccdecaab";

        Map<Character,Integer>freq = new HashMap<>();

        for (char c : text.toCharArray()){
            if (c != ' '){
                if(freq.containsKey(c)){
                    freq.put(c,freq.get(c)+1);
                }else {
                    freq.put(c,1);
                }

            }
        }
        System.out.println(freq);
    }

    public void Ex9(){
        String word1 = "listen";
        String word2 = "silent";

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char c : word1.toCharArray()){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }
            else{
                map1.put(c,1);
            }
        }
        for(char c : word2.toCharArray()){
            if(map2.containsKey(c)){
                if (map2.containsKey(c)){
                    map2.put(c,map2.get(c)+1);
                }
                else {
                    map2.put(c,1);
                }
            }
        }

        System.out.println(map1.equals(map2));
    }

    public void Ex10(){
      int[]numbers = {1,2,3,4,5,6};

      Map<String,List<Integer>>map = new HashMap<>();

      map.put("par",new ArrayList<>());
      map.put("impar",new ArrayList<>());

      for(int number : numbers){
          if(number % 2 == 0){
              map.get("par").add(number);
          }
          else {
              map.get("impar").add(number);
          }
      }
        System.out.println(map);
    }

    public void Ex11(){

        Map<String,Integer>map = new HashMap<>();

        map.put("ana",7);
        map.put("bob",12);
        map.put("carla",9);

        int max = Integer.MIN_VALUE;
        String best = " ";

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                best = entry.getKey();

            }
        }
        System.out.println(best);
    }

}





