package app.listeGenerice;

public class Coada <U extends Comparable<U>>{
    Node<U> head;

    public void display(){
        Node<U> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
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




}
