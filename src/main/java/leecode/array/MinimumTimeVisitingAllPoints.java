package leecode.array;

public class MinimumTimeVisitingAllPoints {
  public int minTimeToVisitAllPoints(int[][] points) {
    if (points.length == 0)
      return 0;
    int secs = 0;

    for (int i = 1; i < points.length; i++) {
      int x = Math.abs(points[i][0] - points[i - 1][0]);
      int y = Math.abs(points[i][1] - points[i - 1][1]);
      secs += Math.max(x, y);
    }
    return secs;
  }
}
