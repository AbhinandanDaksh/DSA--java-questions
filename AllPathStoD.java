import java.util.*;

public class Day7 {
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
   
    public static void Dfs(ArrayList<Edge> graph[],int curr,boolean visited[],String path, int target ){
        if(curr==target){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.des]==false){
                visited[curr]=true;
                Dfs(graph,e.des,visited,path+e.des,target);
                visited[curr]=true;
            }
        }
    }
    public static void main(String[] args) {
        int V=7;int sour=0,target=5;

        ArrayList<Edge> graph[]=new ArrayList[V];
        CrrateGraph(graph);

        boolean visited[]=new boolean[V];
            Dfs(graph,sour,visited,"0",target);
       
    }
}
