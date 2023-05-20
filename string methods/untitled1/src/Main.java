import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String word1 = "notebook";
                char letters1[] = new char[word1.length()];
                numArray(letters1, word1);
                String word2 = "garage";
                char letters2[] = new char[word2.length()];
                numArray(letters2, word2);
                String word3 = "torch";
                char letters3[] = new char[word3.length()];
                numArray(letters3, word3);
                System.out.println("Write several letters without spaces");
                String text = sc.nextLine();
                text.toLowerCase();
                char letters_pl[] = new char[text.length()];
                numArray(letters_pl, text);
                if(text.equals(word1)){
                    System.out.println("That's the same word how: " + word1);
                }
              else  if(text.equals(word2)){
                    System.out.println("That's the same word how: " + word2);
                }
                 else if(text.equals(word3)){
                      System.out.println("That's the same word how: " + word3);
                   }
                    else {
                        checkLetters(letters1, letters2, letters3, letters_pl);
                    }
            }
            public static void numArray(char[] a, String b) {
                for (int i = 0; i < b.length(); i++) {
                    a[i] = b.charAt(i);
                    System.out.println(a[i]);
                }
            }
            public static void checkLetters (char[] aN, char[] bG, char[] cT, char[] dPL) {
                 byte tSth1 = 0, tSth2 = 0, tSth3 = 0;
                 int word1_length = aN.length;
                int word2_length = bG.length;
                int word3_length = cT.length;
                int PLword_length = dPL.length;
                if(PLword_length == word1_length) {
                    tSth1 += 1;
                }
                if(PLword_length == word2_length) {
                    tSth2 += 1;
                }
                if(PLword_length == word3_length) {
                    tSth3 += 1;
                }

            }
            public static void checkL(char[] a, char[] b, byte c) {
        int index;
        if(c <= 1){index = 0;}
                for (int i = 0; i < b.length; i++) {
                    a[index].getText() == ;
                }
            }
        }

