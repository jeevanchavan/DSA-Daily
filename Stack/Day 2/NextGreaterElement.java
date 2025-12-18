public class NextGreaterElement {
    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = nextGreaterElement(nums1, nums2);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = -1;   // default

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {

                    // scan to the right
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                    break; // stop after finding nums1[i]
                }
            }
        }
        return ans;
    }
}

/*
Time Complexity (TC):

Let:
n = length of nums1
m = length of nums2

Worst case:
- For each element in nums1 (n),
  we scan nums2 (m),
  and then scan again to the right.

TC = O(n * m)

This is brute force, so it is slow but easy to understand.

-------------------------------------------------

Space Complexity (SC):

- Result array "ans" uses O(n) space
- No extra data structures are used

SC = O(n)
*/