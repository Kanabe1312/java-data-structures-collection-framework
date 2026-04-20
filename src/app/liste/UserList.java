package app.liste;

import app.users.models.User;

public class UserList {
    private UserNode head;


    //todo:addStart

    public void addStart(User user) {
     if(head == null) {
         head = new UserNode(user);
         return;
     }
     UserNode newNode=new UserNode(user);
     newNode.setNext(head);
     head=newNode;
    }
    //todo afisare

    public void display() {
        UserNode aux=head;

        while(aux!=null) {
            System.out.println(aux.getUser());
            aux=aux.getNext();
        }
    }

    //todo :addEnd

    public void addEnd(User user) {
        if(head == null) {
            head = new UserNode(user);
            return;
        }
        UserNode aux=head;

        while(aux.getNext()!=null) {
            aux = aux.getNext();
        }
        aux.setNext(new UserNode(user));


    }


    //todo: STACK

    public void push(User user) {
        UserNode newNode = new UserNode(user);

        newNode.setNext(head);
        head = newNode;
    }
    //baga in fata

    public User pop() {
        if (head == null) {
            return null;
        }

        User removedUser = head.getUser();
        head = head.getNext();

        return removedUser;
    }
    //scoate primul,ia de "sus"



    //todo QUEUE

    public void enqueue(User user) {
        UserNode newNode = new UserNode(user);

        if (head == null) {
            head = newNode;
            return;
        }
        UserNode aux = head;

        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(newNode);
    }


    public User dequeue() {
        if (head == null) {
            return null;
        }

        User removedUser = head.getUser();
        head = head.getNext();

        return removedUser;
    }




}
