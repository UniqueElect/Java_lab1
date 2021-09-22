public class Task9 {

    static class CustomDouble {

        public int whole = 0;
        public double fractional = 0;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Task8.CustomDouble that = (Task8.CustomDouble) o;

            if (whole != that.whole) return false;
            return Double.compare(that.fractional, fractional) == 0;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = whole;
            temp = Double.doubleToLongBits(fractional);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        public double ToDouble() {

            double result = 0;

            result += whole + fractional;

            return result;
        }

        public void sum(CustomDouble a) {

            this.whole += a.whole;
            this.fractional += a.fractional;

        }

        public void dif(CustomDouble a) {

            this.whole -= a.whole;
            this.fractional -= a.fractional;

        }

        public double mnoj(CustomDouble a) {

            return this.ToDouble() * a.ToDouble();

        }

        public double divide(CustomDouble a) {

            return this.ToDouble() / a.ToDouble();
        }

        public void display() {


            if (whole < 0 && fractional < 0) {
               fractional *= -1;
                System.out.println( "whole = "+whole + " fractional = " + fractional); }
           if(whole > 0 && fractional < 0){
               fractional *= -1;  whole *= -1;
            System.out.println( "whole = "+whole + " fractional = " + fractional);}
            else System.out.println( "whole = "+whole + " fractional = " + fractional);

            }



        public static void main(String[] args) {

            CustomDouble a = new CustomDouble();
            CustomDouble b = new CustomDouble();

            a.whole = 11;
            a.fractional = 0.25;
            b.whole = 10;
            b.fractional = 0.5;

            a.dif(b);
            a.display();

            a.whole = 20;
            a.fractional = 0.5;
            b.whole = 0;
            b.fractional = 0.5;
            System.out.println(a.mnoj(b));
        }
    }
}