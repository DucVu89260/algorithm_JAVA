# Java Algorithm Practice
## Array and String
### 1295_find_numbers_with_even_nunber_of_digits
Given an array nums of integers, return how many of them contain an even number of digits.

* #### Example 1:

    Input: nums = [12,345,2,6,7896]
    Output: 2<br>
* #### Explanation: <br>
    12 contains 2 digits (even number of digits). <br>
    345 contains 3 digits (odd number of digits). <br>
    2 contains 1 digit (odd number of digits). <br>
    6 contains 1 digit (odd number of digits). <br>
    7896 contains 4 digits (even number of digits). <br>
    Therefore only 12 and 7896 contain an even number of digits.<br>
* #### Example 2:<br>
    Input: nums = [555,901,482,1771]<br>
    Output: 1 <br>
    Explanation: <br>
    Only 1771 contains an even number of digits.<br>
 

* #### Constraints:<br>
    1 <= nums.length <= 500<br>
    1 <= nums[i] <= 105

### 88_merge_sorted_array
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

* #### Example 1:
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3<br>
    Output: [1,2,2,3,5,6]<br>
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].<br>
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
* #### Example 2:
    Input: nums1 = [1], m = 1, nums2 = [], n = 0<br>
    Output: [1]<br>
    Explanation: The arrays we are merging are [1] and [].<br>
    The result of the merge is [1].
* #### Example 3:
    Input: nums1 = [0], m = 0, nums2 = [1], n = 1<br>
    Output: [1]<br>
    Explanation: The arrays we are merging are [] and [1].<br>
    The result of the merge is [1].<br>
    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.