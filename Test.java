public class Test {
  public static void main(String[] args) {
    IntegerSequence x = new Range(10,20); //works
    System.out.println(x.length());
    IntegerSequence y = new Range(10,10); //works
    System.out.println(y.length());
    //Range z = new Range(11,10); //should throw error
  }
}
