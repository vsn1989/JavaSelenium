public class Forloop {

        int output =0;
        public void add()
        {
            for(int i=1;i<=10;i++)
            {
                output=output+i;
            }
            System.out.println(output);
        }

    public static void main(String[] args) {
        Forloop obj=new Forloop();
        obj.add();

    }
}
