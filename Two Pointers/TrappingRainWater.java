public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = getTrappedWater(height);
        System.out.println(ans);
    }

    static int getTrappedWater(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxLeft = 0, maxRight = 0;
        int water = 0;

        while(left <= right){
            if(height[left] < height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }
                else{
                    water += maxLeft - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }
                else{
                    water += maxRight - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
