import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();

  @Test
  void spiralOrderExample1() {
    assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), sol.spiralOrder(
        new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }
    ));
  }

  @Test
  void spiralOrderExample2() {
    assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), sol.spiralOrder(
        new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        }
    ));
  }
}