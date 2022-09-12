public class Forloopbreak {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
            if(sum==10)
            {
                break;
            }
        }
        System.out.println(sum);
    }

}
