import java.util.*;
// import java.util.List;

public class FindNeighbourBFS {
    static class Edge{
        int src;
        int des;
        // int wgi;
        public Edge(int s,int d){
            this.src=s;
            this.des=d;
            // this.wgi=w;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
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
    public static void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer> queue=new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.add(0);//strting point of vertex

        while(!queue.isEmpty()){
            int curr =queue.remove();
            
            if(!visited[curr]){
                System.out.println("Visiting "+curr);
                visited[curr]= true;


                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    queue.add(e.des);
                }
        }
    }
}
    public static void main(String[] args) {
        int V=7;
        
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e=graph[2].get(i);
        //     System.out.println(e.des+" , ");
        // }
        bfs(graph, V);
        System.out.println();
    }
}
