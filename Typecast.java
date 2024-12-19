class Typecast{
    public static void main(String[] args){

        double l=44.88;
        int i=(int)l;           // int>>> small
        System.out.println(i);


        float f=88f;
        short k=(short)f;         // short >> small
        System.out.println(k);

        long g=887L;
        byte p=(byte)g;   // byte>> small
        System.out.println(p);


        float j=997f;
        int d=(int)j;     // int>>> small
        System.out.println(d);


        double h=9995.8;
        long e=(long)h;   // long>> small
        System.out.println(e);

        int o=77;
        char t=(char)o; //char..>> small
        System.out.println(t);


        char z='o';
        short m=(short)z;
        System.out.println(m);  // short>> small


        short b=99;
        byte a=(byte)b;    // byte >> small
        System.out.print(a);


        long r=888L;
        float y=(float)r;
        System.out.println(y);  // float >> small


        // boolean cannot be casted
        // byte < short < char < boolean < int < float < long < double

    }
}