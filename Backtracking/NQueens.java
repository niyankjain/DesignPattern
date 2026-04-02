import java.util.ArrayList;
import java.util.List;

//[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
public class NQueens {

  public static void main(String[] args) {
    int number = 5;
    List<String> queensPos = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      queensPos.add(".".repeat(number));
    }
    System.out.println(queensPos);

    List<List<String>> lists = solveNQueens(number);
    System.out.println(lists);
  }

  public static List<List<String>> solveNQueens(int n) {
    List<List<String>> board = new ArrayList<>();
    List<String> queensPos = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      queensPos.add(".".repeat(n));
    }
    placeQueen(board, queensPos, 0, n);
    return board;
  }

  public static void placeQueen(List<List<String>> board, List<String> queenPosition, int row, int n) {

    if (row == n) {
      board.add(List.copyOf(queenPosition));
      return;
    }


    for (int j = 0; j < n; j++) {
      if (isSafe(queenPosition, row, j, n)) {
        StringBuilder sb = new StringBuilder(queenPosition.get(row));
        sb.replace(j, j + 1, "Q");
        queenPosition.add(row, sb.toString());
        queenPosition.remove(row+1);
        placeQueen(board, queenPosition, row + 1, n);
        int q = sb.indexOf("Q");
        sb.replace(q, q + 1, ".");
        queenPosition.add(row, sb.toString());
        queenPosition.remove(row+1);
      }
    }
  }

  public static boolean isSafe(List<String> queenPosition, int row, int column, int n) {
    // case 1: for horizontally check row is safe or not
    for (int i = 0; i < n; i++) {
      if (queenPosition.get(row).charAt(i) == 'Q') {
        return false;
      }
    }

    // case 2: for Vertical check row is safe or not
    for (int i = row - 1; i >= 0; i--) {
      if (queenPosition.get(i).charAt(column) == 'Q') {
        return false;
      }
    }

    // Case 3: For left upside diagonally check
    for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
      if (queenPosition.get(i).charAt(j) == 'Q') {
        return false;
      }
    }

    // Case 4: For right upside diagonally check
    for (int i = row - 1, j = column + 1; i >= 0 && j < n; i--, j++) {
      if (queenPosition.get(i).charAt(j) == 'Q') {
        return false;
      }
    }
    return true;
  }
}
