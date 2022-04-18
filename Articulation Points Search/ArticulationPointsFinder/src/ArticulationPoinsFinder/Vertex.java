package ArticulationPoinsFinder;
 
import java.util.ArrayList;


public class Vertex {

    boolean visited;
    String data;
    Vertex next;
    Vertex previous;
    ArrayList<Vertex> al;
    ArrayList<Vertex> cn;

    public String getData() {
        return data;
    }

    public Vertex(String data) {
        this.data = data;
        this.al = new ArrayList<>();
        this.cn = new ArrayList<>();
    }

    public void setData(String data) {
        this.data = data;
    }
}   

