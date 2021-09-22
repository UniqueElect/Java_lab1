
public class Task3 {
    public static void main(String[] args) {

        final int[] ArrayInt = new int[] { 7, 4, 5, 3, 7};
        final char[] ArrayChar = new char[] { 'R', 'N', '1', '3'};


        String Result = "";

        int maxsize = ArrayInt.length > ArrayChar.length ? ArrayInt.length : ArrayChar.length;

        for (int i = 0; i < maxsize; i++)

            Result += (i < ArrayInt.length ? String.valueOf(ArrayInt[i]) : "") +
                    (i < ArrayChar.length ? String.valueOf(ArrayChar[i]) : "");

        System.out.println(Result);

    }
}


