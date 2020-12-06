public class Test {
  public static void main(String[] args) {
    Range x = new Range(10,20); //works
    Range y = new Range(10,10); //works
    Range z = new Range(11,10); //should throw error
  }
}
