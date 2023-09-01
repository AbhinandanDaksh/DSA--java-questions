class RottenOrange994 {
    static class Edge{
        int sor;
        int des;
        int min;
        Edge(int s,int d,int t){
            this.sor=s;
            this.des=d;
            this.min=t;
           
        }
    }
    public int orangesRotting(int[][] grid) {
        int time=0;int freash=0;
        Queue<Edge> q=new LinkedList<>();
        int[][] visited=new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Edge(i,j,0));
                        visited[i][j]=2;
                }
                else if(grid[i][j]==1){
                    freash++;
                }
                else{
                    visited[i][j]=0;
                }
            }
        }
        int ax[]={-1,0,1,0};
        int ay[]={0,1,0,-1};
        int curr=0;

        while(!q.isEmpty()){
            Edge e=q.poll();
            int x1=e.sor;
            int y1=e.des;
            int ans_time=e.min;
            time=Math.max(time,ans_time);

              
            for(int i=0;i<4;i++){
                int nrow=x1+ax[i];
                int ncol=y1+ay[i];

                if(nrow>=0 && nrow <grid.length && ncol>=0 && ncol<grid[0].length && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Edge(nrow,ncol,ans_time+1));
                    visited[nrow][ncol]=2;
                    curr++;
                }
               
            }
        }
         if(curr!=freash) return -1;
         return time;
       
    }
  public static void main(String argu[]){
    int[][] grid={[2,1,1],[0,1,1],[1,0,1]};
    System.out.println(orangesRotting(grid[][]));
    
}
