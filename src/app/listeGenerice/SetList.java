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
    //todo:EX1--union
    public SetList<U> union (SetList<U> set2){
        SetList<U> nou = new SetList<>();
        Node<U> temp = head;

        while (temp != null) {
            nou.addNoDupes(temp.data);
            temp = temp.next;
        }
        temp = set2.head;
        while (temp != null) {
            nou.addNoDupes(temp.data);
            temp = temp.next;
        }
        return nou;
    }
    //--intersaction(comun)
    public SetList<U> intersection (SetList<U> set2){
        SetList<U> nou = new SetList<>();
        Node<U> temp = head;
        while (temp != null) {
            if(set2.contains(temp.data)){
                nou.addNoDupes(temp.data);
            }
            temp = temp.next;
        }
        return nou;
    }
    //--diff(scoate din a ceea ce se afla si in b)
    public SetList<U> difference (SetList<U> set2){
        SetList<U> nou = new SetList<>();
        Node<U> temp = head;
        while (temp != null) {
            if(!set2.contains(temp.data)){
                nou.addNoDupes(temp.data);
            }
            temp = temp.next;
        }
        return nou;
    }

    //todo:EX2
    public boolean isSubset (SetList<U> set2){
        Node<U> temp = head;
        while (temp != null) {
            if(!set2.contains(temp.data)){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    //todo:EX3
    public SetList<U> symDiff(SetList<U> set2){
        SetList<U> rezultat = new SetList<>();
        Node<U> temp = head;
        while (temp != null) {
            if(!set2.contains(temp.data)){
                rezultat.addNoDupes(temp.data);
            }
            temp = temp.next;
        }
        temp = set2.head;


        while(temp != null){
            if(!this.contains(temp.data)){
                rezultat.addNoDupes(temp.data);
            }
            temp = temp.next;

        }
        return rezultat;
    }
    //todo:EX4
    public static SetList<Integer> findDupes(int[] values){
    SetList<Integer>apare  = new SetList<>();
    SetList<Integer>dubluri = new SetList<>();

    for (int i = 0; i < values.length; i++) {
        if(apare.contains(values[i])){
            dubluri.addNoDupes(values[i]);
        }else{
            apare.addNoDupes(values[i]);
        }
    }
    return dubluri;

    }
    //todo:EX5
    public static char charUnic(String text){
        for(int i = 0; i < text.length(); i++){//ia fiecare caracter
            int count = 0;

            for(int j = 0; j < text.length(); j++){//compara litera curenta cu restu
                count++;

            }
          if(count == 1){//daca apare o data
              return text.charAt(i);//return caracteru unic
          }
        }
        return 0;

    }



}
