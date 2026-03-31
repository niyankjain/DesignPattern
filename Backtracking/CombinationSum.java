import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {

  public static void main(String[] args) {
    int[] arr = {2,3,5};
    int target = 8;
    Set<List<Integer>> finalList = new HashSet<>();

    combinationSum(arr, 0, finalList, new ArrayList<>(), target);
    System.out.println(finalList);
  }

  public static void combinationSum(int[] arr, int index, Set<List<Integer>> finalList , List<Integer> combSum, int target) {

    if(index >= arr.length || target < 0) {
      return;
    }

    if(target == 0) {
      finalList.add(List.copyOf(combSum));
      return;
    }

    combSum.add(arr[index]);
    combinationSum(arr, index+1, finalList, combSum, target-arr[index]);
    combinationSum(arr, index, finalList, combSum, target-arr[index]);
    combSum.remove(combSum.size()-1);
    combinationSum(arr, index+1, finalList, combSum, target);

  }
}
