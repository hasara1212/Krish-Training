
package Algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    private LinkedList<Vertex> link;

    void addEdge(Vertex start, Vertex end) 
    {
        start.addEdge(end);
    }

    void BFS(Vertex s) 
    {
        Queue<Vertex> queue = new LinkedList<Vertex>();
        s.visited= true;
        queue.add(s);

        while (!queue.isEmpty()) {

            s = queue.poll();
            System.out.print(s.data + " ");

            
            for (Vertex edge : s.getEdges()) {
                if(!edge.visited){
                    s.visited = true;
                    queue.add(edge);
                }
            }   
           
        }
    }

    public static void main(String args[]) {

        Vertex v=new Vertex("A");
        Vertex v1=new Vertex("B");
        Vertex v2=new Vertex("C");
        Vertex v3=new Vertex("D");
        Vertex v4=new Vertex("E");
        Vertex v5=new Vertex("F");
        Vertex v6=new Vertex("G");

        Graph g=new Graph();
        
        g.addEdge(v, v1);
        g.addEdge(v, v2);
        g.addEdge(v1, v3);
        g.addEdge(v3, v1);
        g.addEdge(v1, v);
        g.addEdge(v2, v4);
        g.addEdge(v4, v5);
        g.addEdge(v2, v6);
        g.addEdge(v5, v4);
        g.addEdge(v4, v2);
        g.addEdge(v2, v);
        g.addEdge(v6, v2);
        g.addEdge(v2, v);

        System.out.println("Breadth First Search");
        g.BFS(v);
       
    }
} 