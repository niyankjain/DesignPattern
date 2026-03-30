import java.util.Arrays;

public class AllPermutations {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    permutation(0, arr);
  }

  public static void permutation(int index, int[] arr) {
    if(index >= arr.length) {
      Arrays.stream(arr).forEach(element -> System.out.print(element+" "));
      System.out.println();
      return;
    }

    for(int i=index; i<arr.length; i++) {
      swap(i, index, arr);
      permutation(index+1, arr);
      swap(i, index, arr);
    }
  }

  public static void swap(int idx, int idx2, int[] arr) {
    int temp = arr[idx];
    arr[idx] = arr[idx2];
    arr[idx2] = temp;
  }
}
