package app.listeGenerice;

import java.util.Comparator;

public class Lista <U extends Comparable<U>>{
    Node<U> head;


    //todo ARRAYLIST

    public void display(){
        Node<U> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    //todo: functie ce ne returneaza dimensiunea listei
    public int size(){
        int count = 0;
        Node<U> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    //todo functie ce returneaza un node dupa pozitie
    public Node<U> getNode(int position){
        Node<U> temp = head;
        int i = 0;
        while (temp != null && i < position) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
    // todo interswchimbare doua noduri a si b    a-b-c -> a-c-b
    public void swap(int a, int b){
        Node<U> node1 = getNode(a);
        Node<U> node2 = getNode(b);
        if(node1 == null || node2 == null){
            return;
        }
        U aux = node1.data;
        node1.data = node2.data;
        node2.data = aux;
    }
    //todo-toate->sortare
    public void sort(){
        int n = size();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                Node<U> a = getNode(j);
                Node<U> b = getNode(j+1);
                if(a.data.compareTo(b.data) < 0){
                    swap(j, j+1);
                }
            }
        }
    }
    //sortare(greu)
    public void sort(Comparator<U> comaparator){
        int n = size();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                Node<U> a = getNode(j);
                Node<U> b = getNode(j+1);
                if(comaparator.compare(a.data,b.data) < 0){
                    swap(j, j+1);
                }
            }
        }
    }

    public void remove(int position){
        if(head == null){
            return;
        }
        if(position == 0){
            head = head.next;
            return;
        }
        Node<U> prev = getNode(position-1);
        if(prev == null || prev.next == null){
            return;
        }
        prev.next = prev.next.next;
    }

    public void addStart(U data){
        Node<U> n = new Node<>();
        n.data = data;
        if (head == null) {//--lista e goala primu element este head
            head = n;
            return;
        }
        n.next = head;//fiecare la locu lui
        head = n;
    }

    public void addEnd(U data){
        Node<U> n = new Node<>();
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
    //getter
    public U getFirst(){
        if(head == null){
            return null;
        }
        return head.data;
    }
    //setter
    public void set(U data,int position){
        Node<U> node = getNode(position);
        if(node == null){
            return;
        }
        node.data = data;
    }//inlocuieste pozitie a-b-c--->a-x-c
    //adaugare pe pozitie
    public void add(int position,U data){
        Node<U> n = new Node<>();
        n.data = data;

        if(position == 0){
            n.next = head;
            head = n;
            return;
        }
        Node<U>prev = getNode(position -1);
        if(prev == null )return;
        n.next = prev.next;
        prev.next = n;
    }

    //todo QUEUE!!

    public U dequeue(){//scoate din fata
        if(head == null){
            return null;
        }
        U data = head.data;
        head = head.next;
        return data;
    }//scoate din fata (fifo)

    public void enqueue(U data){//adauga la coada

        Node<U> n = new Node<>();
        n.data = data;
        if(head == null){
            head = n;
            return ;
        }
        Node<U> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }




    //todo : EXERCITII

    //EX1
    public void reverse() {

        int n = size();

        for (int i = 0; i < n / 2; i++) {

            swap(i, n - 1 - i);

        }
    }
    //EX2
    public boolean contains(U data) {
        Node<U> temp = head;

        while (temp != null) {

            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public Lista<U> removeDuplicates() {
        Lista<U> nou = new Lista<>();
        Node<U> temp = head;

        while (temp != null) {

            if (!nou.contains(temp.data)) {
                nou.addEnd(temp.data);
            }
            temp = temp.next;
        }
        return nou;
    }
    //EX3
    public void minMax(){
        if(head == null){
            return;
        }
        U min = head.data;
        U max = head.data;

        Node<U> temp = head.next;

        while(temp != null){

            if(temp.data.compareTo(min) < 0){
                min = temp.data;
            }

            if(temp.data.compareTo(max) > 0){
                max = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
    //EX4
    public boolean isPalindrome(){
        int i = 0;
        int j = size() - 1;

        while(i < j){
            U a = getNode(i).data;
            U b = getNode(j).data;

            if(!a.equals(b)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //EX5
    public Lista<U> merge(Lista<U> list2){
        Lista<U> nou = new Lista<>();

        int i = 0;
        int j = 0;
        while(i < this.size() && j < list2.size()){
            U a = this.getNode(i).data;
            U b = list2.getNode(j).data;

            if(a.compareTo(b) <= 0){
                nou.addEnd(a);
                i++;
            }else{
                nou.addEnd(b);
                j++;
            }
        }
        while(i < this.size()){
            nou.addEnd(this.getNode(i).data);
            i++;
        }
        while(j < list2.size()){
            nou.addEnd(list2.getNode(j).data);
            j++;
        }


        return nou;
    }
    //EX6
    public void rotateLeft(int k){
        int n = size();
        if(n == 0){
            return;
        }
        k = k % n;

        for(int i = 0; i < k; i++){
            U data = dequeue();
            enqueue(data);

        }
    }
    //EX7
    public void removeAll(U data){
        int i = 0;
        while(i < size()){
            U val = getNode(i).data;

            if(val.equals(data)){
                remove(i);
            }else{
                i++;
            }
        }
    }
    //EX8
    public Lista<U>[] impartireParImpar(){
        Lista<U>matching = new Lista<>();
        Lista<U>nonMatching = new Lista<>();

        Node<U> temp = head;
        while(temp != null){
            int val = temp.data.compareTo(temp.data);
            if(val % 2 == 0){
                matching.addEnd(temp.data);
            }else{
                nonMatching.addEnd(temp.data);
            }
            temp = temp.next;
        }
        Lista<U>[] rezultat = new Lista[2];
        rezultat[0] = matching;
        rezultat[1] = nonMatching;

        return rezultat;



    }

    //EX9
    public Lista<U> mergeSort(){
        if(size() <= 1){
            return this;
        }
        int mid = size() / 2;

        Lista<U> left = new Lista<>();
        Lista<U> right = new Lista<>();

        for(int i = 0; i < mid; i++){
            left.addEnd(getNode(i).data);
        }
        for(int i = mid; i < size(); i++){
            right.addEnd(getNode(i).data);
        }


        left = left.mergeSort();
        right = right.mergeSort();

        return left.merge(right);
    }




}
