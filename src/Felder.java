import java.util.Arrays;

public class Felder{
  public Felder(){

  }
  public char[] erzeugeCharFeld(char[] abc){

    for(int i = 0; i< 26; i++){
      abc[i]= (char) ('A' + i);
    }

    return abc;
  }
  public void arraysCopy(char[] abc){

    char[] arraycopy = new char[26];
    System.arraycopy(abc, 4, arraycopy, 4, 1);
    System.out.println("Erster Copy Versuch mit System.arraycopy: " + arraycopy[4]);
    arraycopy=Arrays.copyOf(abc, 4);
    System.out.println("Zweiter Copy Versuch mit Arrays.copyOF: " + arraycopy[3]);
  }

}
