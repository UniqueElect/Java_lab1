
public class Task2 {
    public static void main(String[] args) {

       final String[] Felidae = {"cat", "tiger", "caracal", "jaguar", "puma", "bobcat",
               "panthera", "lion", "leopard", "serval"};

            int countA = 0;
            final int Flength = Felidae.length;

            for (int i = 0; i < Flength; i++)

          for (char letter : Felidae[i].toCharArray()) {

              if (letter == 'a') countA++;
          }
        System.out.println("Кiлькiсть букв a = " + countA);

    }
}
