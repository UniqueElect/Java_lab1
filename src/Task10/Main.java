package Task10;
public class Main {
    public static void main(String[] args) {

        Weather w1 = new Weather("Lviv", "sunny", 10);
        Weather w2 = new Weather("Lviv", "rainy", 5);
        Weather w3 = new Weather("Lviv", "rainy",  -1);
        Weather w4 = new Weather("Lviv", "cloudy", 7);
        Weather w5 = new Weather("Lviv", "rainy", 0);
        Weather w6 = new Weather("Lviv", "foggy", 12);
        Weather w7 = new Weather("Lviv", "sunny", 14);

        Day[] a = new Day[7];
        a[0] = new Day("monday", w1);
        a[1] = new Day("tuesday", w2);
        a[2] = new Day("wednesday", w3);
        a[3] = new Day("thursday", w4);
        a[4] = new Day("friday", w5);
        a[5] = new Day("saturday", w6);
        a[6] = new Day("sunday", w7);

        for (int i = 0; i < 7; i++ )
            System.out.println(a[i].toString());
    }
}