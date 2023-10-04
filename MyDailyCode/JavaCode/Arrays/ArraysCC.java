package Arrays;

public class ArraysCC {
    public static int trappedRainWater(int height[]){
        // calculate left max boundary arrray.
        // calculate right max boundary array
        // loop
        // waterlevel = min(left max bound , rightmax bound)
        // trapped water = water level height[]
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i<n;i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>= 0;i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for(int i = 0;i<n;i++) {
            int waterlevel = Math.min(leftmax[i], rightMax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
