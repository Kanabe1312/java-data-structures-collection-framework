package app.listeGenerice;

public class SetList <U extends Comparable<U>>{
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


    public boolean contains(U data){//---------->Verificam daca contine
        Node<U> temp = head;
        while (temp != null) {
            if(temp.data.equals(data)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void addNoDupes(U data){
        if(contains(data)){
            return;
        }
        Node<U> temp = new Node<>();
        temp.data = data;

        if(head == null){
            head = temp;
            return;
        }
        if(data.compareTo(head.data) < 0){
            temp.next = head;
            head = temp;
            return;
        }
        Node<U> nou = head;
        while(nou.next != null && nou.next.data.compareTo(data) < 0){
            nou = nou.next;

        }
        temp.next = nou.next;
        nou.next = temp;
    }


}
