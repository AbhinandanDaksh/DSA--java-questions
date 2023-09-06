import java.util.*;

public class UndirectedIsCycle{
    static class Edge{
        int sour;
        int des;
        public Edge(int s,int d){
            this.sour=s;
            this.des=d;
        }
    }
    public static void CrateGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }
    public static boolean isycycle(ArrayList<Edge> graph[],int curr,boolean visited[],int par){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.des] && e.des!=par){
                return true;
            }

            else if(!visited[e.des]){
                if(isycycle(graph, e.des, visited, curr)){
                return true;
                }
            }
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        CrateGraph(graph);
        boolean visited[]=new boolean[V];
        System.out.println(isycycle(graph, 0, visited, -1));
        
    }
}
