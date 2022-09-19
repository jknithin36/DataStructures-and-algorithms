import java.util.*;
public class Graph {
  
  ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
  public Graph(ArrayList<GraphNode> nodeList){
    this.nodeList = nodeList;
  }

  public void addUndirectedEdge(int i , int j){
    GraphNode frist = nodeList.get(i);
    GraphNode second = nodeList.get(j);
    frist.neighbors.add(second);
    second.neighbors.add(frist);
  }
// pring Graph 
   public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
        if (j == nodeList.get(i).neighbors.size()-1 ) {
          s.append((nodeList.get(i).neighbors.get(j).name) );
        } else {
          s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
        }
      }
      s.append("\n");
    }
    return s.toString();
  }

}
