package app.collectionsJava;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.DelayQueue;

public class QueueExemples {
    public void fifoExemple(){
        Deque<String> queue = new ArrayDeque<>();

        queue.add("Andrei");
        queue.add("Ana");
        queue.add("Alex");
        queue.add("Emma");

        System.out.println(queue);
        String removed = queue.remove();
        System.out.println("\nRemoved : "+removed);
        System.out.println(queue);
    }

    public void lifoExample(){
        Deque<String>stack = new ArrayDeque<>();
        stack.push("BMW");
        stack.push("Audi");
        stack.push("Ford");
        stack.push("Dacia");
        System.out.println(stack);
        String removed = stack.pop();
        System.out.println("\nRemoved: "+removed);
        System.out.println(stack);
    }

    public void peekExample(){
        Deque<String>deque = new ArrayDeque<>();
        deque.add("Audi");
        deque.add("BMW");
        deque.add("Dacia");
        deque.add("Lambo");
        System.out.println(deque);
        System.out.println("\nFirst: "+deque.peekFirst());
        System.out.println("\nLast: "+deque.peekLast());
        System.out.println(deque);

    }

    public void firstLastExample(){
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Audi");
        deque.addFirst("BMW");
        deque.addFirst("Ford");
        deque.addFirst("Tesla");
        System.out.println(deque);
    }

    //TODO:EXERCITII PRACTICE LINK QUEUE

    public void Ex1(String text){
        Deque<Character>stack = new ArrayDeque<>();

       for(char c :text.toCharArray()){
           if(c == '('||c == '['||c == '{'){
               stack.push(c);
           }
           if(c == ')'){
               if(stack.isEmpty()){
                   System.out.println(false);
                   return;
               }
               if(stack.pop() != '('){
                   System.out.println(false);
                   return;
               }
           }

           if(c == ']'){
               if(stack.isEmpty()){
                   System.out.println(false);
                   return;
               }
               if(stack.pop() != '['){
                   System.out.println(false);
                   return;
               }
           }

           if(c == '}'){
               if(stack.isEmpty()){
                   System.out.println(false);
                   return;
               }
               if(stack.pop() !='{'){
                   System.out.println(false);
                   return;
               }
           }

       }

        System.out.println(stack.isEmpty());

    }

    public void Ex2(){

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Initial queue: ");
        System.out.println(queue);

        Deque<Integer>stack = new ArrayDeque<>();

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.println("Inverted queue :");
        System.out.println(queue);









    }

    public void Ex3(int n){
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("1");
        for (int i = 0 ;i < n ;i++){
            String current = queue.poll();
            System.out.println(current);

            queue.offer(current + "0");
            queue.offer(current + "1");

        }

    }

    public void Ex4(){

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Ana");
        queue.offer("Bob");
        queue.offer("Carol");
        queue.offer("Dan");
        queue.offer("Eva");
        int k = 3;
        while (queue.size()>1){
            for(int i = 1;i<k;i++){
                queue.offer(queue.poll());
            }
            System.out.println("Eliminated: "+queue.poll());
        }
        System.out.println("winner: "+queue.peek());



    }

    public void Ex5(){
        int[]numbers = {3, 1, 5, 12, 2, 11, 7};
        int k = 3;

        PriorityQueue<Integer>pq = new PriorityQueue<>();

        for(int number : numbers){
            if(pq.size()< k){
                pq.offer(number);
            }

            else if(number > pq.peek()){
                pq.poll();
                pq.offer(number);

            }
        }
        System.out.println(pq);

    }

    public void Ex9(){
        Queue<String>queue = new ArrayDeque<>();

        queue.offer("doc1");
        queue.offer("doc2");
        queue.offer("doc3");

        System.out.println("Initilal queue:");
        System.out.println(queue);

        System.out.println("\nPrinted: "+ queue.poll());
        System.out.println("Printed: "+ queue.poll());

        System.out.println("\nActual queue: ");
        System.out.println(queue);

        queue.offer("doc4");
        System.out.println("\nAfter adding:");
        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println("Printed: "+ queue.poll());
        }
    }

    public void Ex10() {

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        q1.offer(1);
        q1.offer(3);
        q1.offer(5);

        q2.offer(2);
        q2.offer(4);
        q2.offer(6);
        q2.offer(8);


        Queue<Integer> result = new ArrayDeque<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            result.offer(q1.poll());
            result.offer(q2.poll());
        }

        while (!q1.isEmpty()) {
            result.offer(q1.poll());
        }
        while (!q2.isEmpty()) {
            result.offer(q2.poll());
        }

        System.out.println(result);
    }

    public void Ex11(){
        Queue<String>tasks = new ArrayDeque<>();

        tasks.offer("build");
        tasks.offer("test");
        tasks.offer("deploy");

        System.out.println("Task queue: "+tasks);


        List<String>executed = new ArrayList<>();
        while (!tasks.isEmpty()){
            String curent = tasks.poll();
            executed.add(curent);
            System.out.println("Executed : "+curent);
        }

        System.out.println("\nExecution order: "+executed);




    }




}
