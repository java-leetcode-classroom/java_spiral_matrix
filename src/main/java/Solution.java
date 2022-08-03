import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    int top = 0, bottom = matrix.length;
    int left = 0, right = matrix[0].length;
    while (top < bottom && left < right) {
      for (int col = left ; col < right; col++) {
        result.add(matrix[top][col]);
      }
      top++;
      for (int row = top; row < bottom; row++) {
        result.add(matrix[row][right-1]);
      }
      right--;
      if (top == bottom || left == right) {
        break;
      }
      for (int col = right-1; col >= left; col--) {
        result.add(matrix[bottom-1][col]);
      }
      bottom--;
      for (int row = bottom-1; row >= top; row--) {
        result.add(matrix[row][left]);
      }
      left++;
    }
    return result;
  }
}
