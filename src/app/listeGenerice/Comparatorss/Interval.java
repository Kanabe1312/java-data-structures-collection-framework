package app.listeGenerice.Comparatorss;
//pt ex 7
public class Interval implements Comparable<Interval> {
   private int start;
   private int end;

    public Interval(int start,int end){
        this.start = start;
        this.end = end;
    }
    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

    @Override
    public int compareTo(Interval other){
        return this.start - other.start;
    }
    @Override
    public String toString(){
        return "("+start+","+end+")";
    }
}
