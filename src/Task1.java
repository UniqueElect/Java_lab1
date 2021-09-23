
public class Task1 {
 public static void main(final String[] args) {

  final String[] Felidae = {
          "cat", "tiger", "caracal", "jaguar", "puma", "bobcat",
          "panthera", "lion", "leopard", "serval"};

  final int Flength = Felidae.length;
     System.out.println("Unsorted array\n");

        for (int i = 0; i < Flength; i++)
         System.out.println(Felidae[i]);
            System.out.println();

     for (int i = 0; i < Flength-1; i++) // Звичайний метод сортування Bubble sort

         for (int j = 0; j < Flength - i - 1; j++)

             if (Felidae[j].length() > Felidae[j+1].length()) {
                 String a = Felidae[j];
                Felidae[j] = Felidae[j+1];
                Felidae[j+1] = a;
            }

        System.out.println("Sorted array\n");

             for (int i = 0; i < Flength; i++)
            System.out.println(Felidae[i]);
 }
}