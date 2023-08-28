import java.util.*;

public class FindNeighbourDFS{
    static class Edge{
        int ser;
        int des;
        public Edge(int s,int d){
            this.ser=s;
            this.des=d;
        }
    }
    public static void CrrateGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2,4 ));

        graph[3].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
    public static void Dfs(ArrayList<Edge> graph[],int curr,boolean visited[]){
        System.out.println("visited "+curr+" ");
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.des]==false){
                Dfs(graph,e.des,visited);
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        CrrateGraph(graph);

        boolean visited[]=new boolean[V];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                 Dfs(graph,i,visited);
            }
        }
       
    }
}
