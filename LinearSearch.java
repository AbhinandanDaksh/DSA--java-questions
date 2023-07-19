public class  LinearSearch{
    public static int LinearSearch1(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,5,6,7,89,3};
        int key =99;
        int index =LinearSearch1(number, key);
        // System.out.println(LinearSearch1(number, key));
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(index);
        }
    }
}

// time complexity = O(n)
