public class Forloop3 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=10;i++)
        {
            if(i==4)
            {
                continue;
            }
            sum= sum+i;
        }
      System.out.println(sum);

    }
}
