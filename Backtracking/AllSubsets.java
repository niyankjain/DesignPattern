import java.util.ArrayList;
import java.util.List;

public class AllSubsets {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    List<Integer> subset = new ArrayList<>();
    printSubset(arr, 0, subset);

  }

  private static void printSubset(int[] arr, int i, List<Integer> subset) {
//    System.out.println("index: "+i);
    if(i >= arr.length) {
      System.out.println(subset);
      return;
    }
//    System.out.println("indexxx: "+i);
    subset.add(arr[i]);
    printSubset(arr, i+1, subset);
    subset.remove(subset.size()-1);
    printSubset(arr, i+1, subset);
  }
}
