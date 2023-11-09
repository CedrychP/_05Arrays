// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    Felder fn = new Felder();
    char[]abc = new char[26];
    abc = fn.erzeugeCharFeld(abc);
    for (char letter : abc) {
      System.out.print(letter + " ");
    }

    System.out.println("ArraysKopieren 2)");
    fn.arraysCopy(abc);
  }
}