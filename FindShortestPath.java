class FindShortestPath{
public static float diresaction(String path) {
        int x=0;int y=0;
        for(int i=0;i<path.length();i++){
            char dir =path.charAt(i);
            if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                y--;
            }
        }
        float result = (float)Math.sqrt((x*x)+(y*y));
        return result;
    }
    public static void main(String[] args) {
        String path ="WNEENESENNN";
        System.out.print(diresaction(path));
    }
}
