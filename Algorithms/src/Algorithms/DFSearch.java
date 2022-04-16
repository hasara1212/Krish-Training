package Algorithms;
import java.util.Iterator;
import java.util.LinkedList;

 
  
class DFSearch {  
  private LinkedList<Integer> adj[]; 
  private boolean visited[];  
  
 
  DFSearch(int V)  
  {  
    adj = new LinkedList[V];  
    visited = new boolean[V];  
  
    for (int i = 0; i < V; i++)  
      adj[i] = new LinkedList<Integer>();  
  }  
   
  void insertEdge(int src, int dest) {  
    adj[src].add(dest);  
  }  
  
  void DFS(int vertex) {  
    visited[vertex] = true;
    System.out.print(vertex + " ");  
  
    Iterator<Integer> it = adj[vertex].listIterator();  
    while (it.hasNext()) {  
      int n = it.next();  
      if (!visited[n])  
        DFS(n);  
    }  
  }  
  
  public static void main(String args[]) {  
    DFSearch graph = new DFSearch(8);  
  
        graph.insertEdge(0, 3);    
        graph.insertEdge(3, 7);    
        graph.insertEdge(7, 4);    
        graph.insertEdge(4, 7);    
        graph.insertEdge(7, 3);  
        graph.insertEdge(3, 0);       
        graph.insertEdge(3, 5);    
        graph.insertEdge(5, 6);    
        graph.insertEdge(6, 2);    
        graph.insertEdge(2, 1); 
        graph.insertEdge(1, 2);
        graph.insertEdge(2, 6);
        graph.insertEdge(6, 5);
        graph.insertEdge(5, 3);
        
          
        System.out.println("Depth First Search");    
        graph.DFS(0);    
  }  
}  
