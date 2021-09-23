public class Task8 {
    static class CustomDouble {

        public int whole = 0;
        public double fractional = 0;

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                CustomDouble that = (CustomDouble) o;

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

           public void sum(CustomDouble a) {

               this.whole += a.whole;
               this.fractional += a.fractional;

               if (this.fractional > 100){
                  this.whole += (this.fractional - (this.fractional % 100)) % 100;
                         this.fractional = this.fractional/100;
               }
           }

           public void dif(CustomDouble a) {

               this.whole -= a.whole;
               this.fractional -= a.fractional;

           }

            public double ToDouble(){

                double result = 0;

                result += whole + fractional;

                return result;
            }

        }

        public static void main(String[] args) {

            CustomDouble cust = new CustomDouble();
            CustomDouble cust1 = new CustomDouble();
            CustomDouble cust2 = new CustomDouble();

            cust1.fractional = 0.50;
            cust1.whole = 100;
            cust2.fractional = 0.50;
            cust2.whole = 100;
            cust.fractional = 0.10;
            cust.whole = 40;

            System.out.println(cust.ToDouble());
            System.out.println(cust1.ToDouble());
            System.out.println(cust2.ToDouble());

            cust1.dif(cust2);
            System.out.println(cust1.whole + cust1.fractional);
       }

}
