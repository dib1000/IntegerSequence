public class ArrayTester {
  public static void main(String[] args) {
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println(as.length());
  }
}
