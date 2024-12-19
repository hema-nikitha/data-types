class Typecon{
    public static void main(String[] args){
        byte t=89;/*byte >> small */
        int n=78900;/*int >> large */ /*convert byte to int >> small to big  */
        int a=t;
        System.out.println(a +" ");
        
        
         

        int l=99;
        float p=l; /*float>> large */
        System.out.println(p +" ");


        float g=8.99f;
        double r=g;
        System.out.println(r);/*double >> large */

        long j=778L;
        double o=j;/*double>> large */
        System.out.println(o);

        byte v=99;
        short m=v;/*short>> large */
        System.out.println(m);

        char x='q';
        int q=x;   /*int>> large */
        System.out.println(q);


        // Cannot do type conversion for boolean >> true, false
        // we can convert into 0,1 throough mapping
        // double > long > float > int > char > short > byte



    }
}