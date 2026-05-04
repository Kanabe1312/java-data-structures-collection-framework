package app.implemented.listeGenerice;

public class Coada <U extends Comparable<U>>{
    Node<U> head;

    public void display(){
        Node<U> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void remove(U data){

        if(head == null){
            return;
        }

        if(head.data.equals(data)){
            head = head.next;
            return;
        }

        Node<U> temp = head;

        while(temp.next != null){

            if(temp.next.data.equals(data)){
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }
    public int size(){
        int count = 0;
        Node<U> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public Node<U> getNode(int position){
        Node<U> temp = head;
        int i = 0;
        while (temp != null && i < position) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public void enqueue(U data){
        Node<U> n= new Node<>();
        n.data = data;

        if(head == null){
            head = n;
            return;
        }
        Node<U> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;

    }
    public U dequeue(){
        if(head == null){
            return null;
        }
        U data = head.data;
        head = head.next;
        return data;

    }
    public U peek(){
        if(head == null){
            return null;
        }
        return head.data;
    }

    //todo : EX2
    public void inversare(){
        Stiva<U>stiva = new Stiva<>();
        while(head != null){
            stiva.push(dequeue());
        }
        while(!stiva.isEmpty()){
            enqueue(stiva.pop());
        }
    }
    //todo:ex3
    public static void nrBinare(int n){
        Coada<String> c = new Coada<>();
        c.enqueue("1");
        for(int i = 1; i<= n;i++){
            String curent = c.dequeue();
            System.out.println(curent);
            c.enqueue(curent + "0");// din 1->10
            c.enqueue(curent + "1");// 1-> 11,dupa il ia pe 10 si ii pune 1 si 0 ........

        }
    }
    //todo:EX4
    public static String potato(String[]nume,int k){
        Coada<String> c = new Coada<>();
        for(int i = 0; i < nume.length; i++){
            c.enqueue(nume[i]);
        }

        while(c.size() > 1){
            for(int i = 1; i < k; i++){
                c.enqueue(c.dequeue());
            }
            System.out.println("Eliminat: " + c.dequeue());
        }
        return c.dequeue();
    }
    //todo:EX5
    //se da k = 3,primele 3 cele mai mari elemente din array
    public void topK(int k){
        for(int j = 1;j<= k;j++) {
        if( head == null){
            return;
        }
        }

            Node<U> temp = head;
            U max = head.data;

            while(temp != null){
                if(temp.data.compareTo(max)>0){
                   max = temp.data;
                }
                temp = temp.next;
            }
        System.out.println(max);
            remove(max);

    }





}
