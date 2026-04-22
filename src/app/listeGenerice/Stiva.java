package app.listeGenerice;

public class Stiva <U extends Comparable<U>>{
    Node<U> head;

    public void addS(U data){//adauga in fata
        Node<U> n = new Node<>();
        n.data = data;
        n.next = head;
        head = n;

    }
    public void displayS(){
        Node<U> n = head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
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


    public void push ( U data){
        Node<U> n = new Node<>();
        n.data = data;
        n.next = head;
        head = n;
    }
    public U pop(){
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
    public boolean isEmpty(){
        return head == null;
    }



}
