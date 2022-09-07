package AccessModifier1;

public class Public {
    public void add(int a, int b)
    {
        int c= a+b;
        System.out.println(c);
    }
    private void sub(int d,int e)  {
        int f=d-e;
        System.out.println(f);

    }
    protected void mul(int g,int h){
        int i= g*h;
        System.out.println(i);
    }
    public void div(int a,int b){
        sub(a,b);
        int d=a/b;
        System.out.println(d);
    }














}

