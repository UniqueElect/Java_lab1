public class test {
    public static void main(String[] args) {

       int whole = 100;
       double fractional = 201;

        double result = 0;

        if (fractional > 100) {
            whole += (fractional - (fractional % 100)) % 100;

            result += whole + (fractional/100);
        }
        else
            result += whole + (fractional/100);

        System.out.println(result);

        double a = 20.5;
        int b = 0;
        int c= 0;
        double d = 0;
        if (a%1 == 0){
            c += a;
            System.out.println(c);}

        else {
            b += a -(a%1);
            d = (a%1);
        System.out.println(b);
        System.out.println(d);
      }



    }
}