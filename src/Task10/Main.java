package Task10;

public class Main {
    public static void main(String[] args) {

        Day[] a = new Day[7];
            a[0] = new Day("monday");
            a[1] = new Day("tuesday");
            a[2] = new Day("wednesday");
            a[3] = new Day("thursday");
            a[4] = new Day("friday");
            a[5] = new Day("saturday");
            a[6] = new Day("sunday");

            Weather[] b = new Weather[7];
            b[0] = new Weather("Lviv", "sunny", 10);
            b[1] = new Weather("Lviv", "rainy", 5);
            b[2] = new Weather("Lviv", "rainy",  -1);
            b[3] = new Weather("Lviv", "cloudy", 7);
            b[4] = new Weather("Lviv", "rainy", 0);
            b[5] = new Weather("Lviv", "foggy", 12);
            b[6] = new Weather("Lviv", "sunny", 14);


       for (int i = 0; i < 7; i++ )
           if(b[i].temperature > 0 )
           System.out.println(a[i].dow + ": " + b[i].city + " " + b[i].weathertype + " +" + b[i].temperature);
           else System.out.println(a[i].dow + ": " + b[i].city + " " + b[i].weathertype + " " + b[i].temperature);

    }
}
