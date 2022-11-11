public class Count0 {
    public static void main(String[] args) {
        int n = 43000000;
        int count = 0;
        while(n!=0){
            n=n/10;
            if(n%10==0){
            count++;
            }

        }
        System.out.println(count);
    }
}

