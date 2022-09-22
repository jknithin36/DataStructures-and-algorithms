import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
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
  //BFS Traversal
  void bfsVist(GraphNode node){
    LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
    queue.add(node);
    while(!queue.isEmpty()){
      GraphNode currentNode = queue.remove(0);
      currentNode.isVisted=true;
      System.out.print(currentNode.name+" ");
      for(GraphNode neighbor: currentNode.neighbors){
        if(!neighbor.isVisted){
          queue.add(neighbor);
          neighbor.isVisted=true;
        }
      }
    }
  }
   void bfs(){
    for(GraphNode node : nodeList){
      if(!node.isVisted){
        bfsVist(node);
      }
    }
   }
//DFS Traversal

void dfsVisit(GraphNode node){
  Stack<GraphNode> stack = new Stack<>();
  stack.push(node);
  while(!stack.isEmpty()){
  GraphNode currentNode = stack.pop();
  currentNode.isVisted=true;
  System.out.print(currentNode.name+" ");
  for(GraphNode neighbor : currentNode.neighbors){
    if(!neighbor.isVisted){
      stack.push(neighbor);
      neighbor.isVisted=true;
    }
  }
  }
}

void dfs(){
  for(GraphNode node: nodeList){
    if(!node.isVisted){
      dfsVisit(node);
    }
  }
}
}
