public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = getMaxArea(height);
        System.out.println(maxArea);
    }

    static int getMaxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int area = 0;

        while(left < right){
            int width = right-left;
            int newArea = width * Math.min(height[left],height[right]);

            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }

            area = Math.max(area,newArea);
        }
        return area;
    }
}
