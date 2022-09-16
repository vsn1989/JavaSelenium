package Selenium;

public class Indexsub {
        public static void main(String[] args) {
            String s1="mynameisnaveen";
            int index=s1.indexOf("n");
            int index1=s1.indexOf("s");
            String s2=s1.substring(index,index1+1);
            System.out.println(s2);
        }

    }
