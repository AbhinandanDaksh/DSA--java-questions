import java.util.*;

public class ToplogicalSortingGarph {
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
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean visited[],Stack<Integer> stack){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(!visited[e.des]){
                topSortUtil(graph, e.des, visited, stack);
            }
        }
        stack.push(curr);
    }
    public static void topSort(ArrayList<Edge> graph[],int V){
        boolean visited[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<V;i++){
            if(!visited[i]){
                topSortUtil(graph, i, visited, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        CrateGraph(graph);
        
        topSort(graph, V);
        
    }
}
