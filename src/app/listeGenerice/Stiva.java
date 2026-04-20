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
}
