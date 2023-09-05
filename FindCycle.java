import java.util.*;

public class FindCycle{
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
            graph[i]=new ArrayList<>();
        }

        
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4 ));

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
    public static boolean Dfs(ArrayList<Edge> graph[],int curr,boolean visited[],boolean res[]){
        visited[curr]=true;
        res[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(res[e.des]==true){
                return true;

            }
            else if(!visited[e.des]){
                if(Dfs(graph,e.des,visited,res)){
                    return true;
                }
            }

        }
        res[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int V=7 ;
        int curr=0;
        ArrayList<Edge> graph[]=new ArrayList[V];
        CrateGraph(graph);
        boolean visited[]=new boolean[V];
        boolean res[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                boolean iscycle=Dfs(graph, 0, visited, res);
                if(iscycle){
                    System.out.println(iscycle);
                    break;
                }
                
            }
        }
        
    }
    
}
