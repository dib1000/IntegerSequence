public class Test {
  public static void main(String[] args) {
    System.out.println("TESTING LENGTH AND CONSTRUCTOR EXCEPTION");
    IntegerSequence x = new Range(10,20); //works
    System.out.println(x.length());
    IntegerSequence y = new Range(10,10); //works
    System.out.println(y.length());
    try {
        Range z = new Range(11,10);
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }
    System.out.println();

    System.out.println("TESTING ALL OF THE OTHER METHODS");
    System.out.println(x.next());
    System.out.println(x.next());
    System.out.println(x.next());
  }
}
