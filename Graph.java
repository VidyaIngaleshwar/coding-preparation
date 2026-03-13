import java.util.*;
class Graph{
    private int v;
    private LinkedList<Integer> adj[];

    public Graph(int v){
        this.v=v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public void dfs(int start){
        boolean[] visited = new boolean[v];
        dfsRecursive(start, visited);
    }

    private void dfsRecursive(int node, boolean[] visited){
        visited[node] = true;
        System.out.println(node+"->");
        for(int neighbor: adj[node]){
            if(!visited[neighbor]){
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String args[]){
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);

        g.dfs(0);
    }
}