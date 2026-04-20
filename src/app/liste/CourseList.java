package app.liste;

import app.course.model.Course;

public class CourseList {
    private CourseNode head;

    public void addStart(Course course) {
        if(head == null){
            head = new CourseNode(null);
            return;
        }
        CourseNode newNode = new CourseNode(course);
        newNode.setNext(head);
        head = newNode;
    }

    public void display() {
        CourseNode current = head;
        while (current != null) {
            System.out.println(current.getCourse());
            current = current.getNext();
        }
    }

    public void addEnd(Course course) {
        if(head == null){
            head = new CourseNode(course);
            return;
        }
        CourseNode aux = head;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(new CourseNode(course));
    }


    //todo Stack
    public void push(Course course) {//----baga in fata
        CourseNode newNode = new CourseNode(course);

        newNode.setNext(head);
        head = newNode;
    }
    public Course pop() {//-----scoate din fata
        if (head == null) {
            return null;
        }
        Course removedCourse = head.getCourse();
        head = head.getNext();

        return removedCourse;
    }


    //todo QUEUE

    public void enqueue (Course course){//----baga in coada(spate)
        CourseNode newNode = new CourseNode(course);

        if(head == null){
            head = newNode;
            return;
        }
        CourseNode aux = head;
        while (aux.getNext() != null) {
            aux = aux.getNext();

        }
        aux.setNext(newNode);

    }

    public Course dequeue() {//-scoate din fata cozii
        if (head == null) {
            return null;
        }

        Course removedCourse = head.getCourse();
        head = head.getNext();

        return removedCourse;
    }




}
