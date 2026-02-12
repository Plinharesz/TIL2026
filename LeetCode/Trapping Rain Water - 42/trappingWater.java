public class trappingWater {
    public int trap(int[] heights) {

        int leftPointer = 0;
        int rightPointer = heights.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;

        while (leftPointer < rightPointer) {
            if (heights[leftPointer] <= heights[rightPointer]) {
                if (heights[leftPointer] >= maxLeft) {
                    maxLeft += heights[leftPointer];
                } else {
                    totalWater += maxLeft - heights[leftPointer];
                }
                leftPointer++;
            }
            else {
                if (heights[rightPointer] >= maxRight) {
                    maxRight = heights[rightPointer];
                } else {
                    totalWater += maxRight - heights[rightPointer];
                }
                rightPointer--;
            }
        }
        return totalWater;
    }
}
