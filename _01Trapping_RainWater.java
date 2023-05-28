
public class _01Trapping_RainWater {
    public static int Trapping_RainWater(int height[]) {
        int n = height.length;
        // Calculate left max boundry
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
            // left max boundry { 4,4,4,7,7,7,7}
        }
        // Calculate right max boundry
        int right_max[] = new int[n];
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
            // right max boundry {7,7,7,7,5,5,5}
        }
        // Loop
        int Trapped_Water = 0;
        for (int i = 0; i < n; i++) {
            // WaterLevel = min(Leftmaxbound - rightMaxbound)
            int Waterlevel = Math.min(left_max[i], right_max[i]);
            // Trappedwater = Trapped water + (waterlevel - height)
            Trapped_Water += (Waterlevel - height[i]);
        }
        return Trapped_Water;
    }

    public static void main(String[] args) {
        // index ={0,1,2,3,4,5,6}
        int height[] = { 4, 0, 2, 7, 4, 2, 5 };
        System.out.println(Trapping_RainWater(height));
    }
}
