/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int r = 0;
        ListNode current = result;
        while (l1 != null && l2 != null){
            //get int
            int num = l1.val + l2.val + r;
            r = 0;
            if (num > 9){
                num = num - 10;
                r = 1;
            }
            current.next = new ListNode(num);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            if (r == 0){
                current.next = l1;
                break;
            }
            //get int
            int num = l1.val + r;
            r = 0;
            if (num > 9){
                num = num - 10;
                r = 1;
            }
            current.next = new ListNode(num);
            current = current.next;
            l1 = l1.next;
        }
        while(l2 != null){
            if (r == 0){
                current.next = l2;
                break;
            }
            //get int
            int num = l2.val + r;
            r = 0;
            if (num > 9){
                num = num - 10;
                r = 1;
            }
            current.next = new ListNode(num);
            current = current.next;
            l2 = l2.next;
        }
        if (r == 1) current.next = new ListNode(1);
        return result.next;
    }
}


/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s, find the length of the longest substring without repeating characters.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //track the letters that have been seen.
        HashMap<Character, Integer> seenLetters = new HashMap<>();
        int startChar = 0;
        int size = 0;
        
        //itereate through each char
        int currentStartChar = 0;
        int currentSize = 0;
        for (int i = 0; i< s.length(); i++){
            //incriment size of current untill end of loop or     
            if (seenLetters.containsKey(s.charAt(i))){
                //update result
                if (currentSize > size){
                    startChar = currentStartChar;
                    size = currentSize;
                }
                //push back i
                i = seenLetters.get(s.charAt(i));
                //reset current
                currentStartChar = 0;
                currentSize = 0;
                //reset list
                seenLetters.clear();
            }
            else {
                currentSize++;
                seenLetters.put(s.charAt(i), i);
            }
        }
        return size;
    }
}



/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 * Given a string s, find the length of the longest substring without repeating characters.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //track the letters that have been seen.
        Integer[] chars = new Integer[128];
        int startChar = 0;
        int size = 0;
        
        //itereate through each char
        int currentStartChar = 0;
        int currentSize = 0;
        for (int i = 0; i< s.length(); i++){
            //incriment size of current untill end of loop or     
            if (chars[s.charAt(i)] != null){
                //update result
                if (currentSize > size){
                    startChar = currentStartChar;
                    size = currentSize;
                }
                //push back i
                i = chars[s.charAt(i)];
                //reset current
                currentStartChar = 0;
                currentSize = 0;
                //reset list
                for(int j=0;j<128;j++){chars[j] = null;}                
            }
            else {
                currentSize++;
                chars[s.charAt(i)] = i;
            }
        }
        if (currentSize > size){size = currentSize;}
        return size;
    }
}



/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //handle empty lists
        if (nums1.length== 0) {
            if (nums2.length % 2 == 0) return (double)(nums2[nums2.length / 2] + nums2[(nums2.length/2) - 1]) / 2;
            return nums2[nums2.length/2];
        }
        if (nums2.length == 0) {
            if (nums1.length % 2 == 0) return (double)(nums1[nums1.length / 2] + nums1[(nums1.length/2) - 1]) / 2;
            return nums1[nums1.length/2]; 
        }
        //ensure we are partioning the smaller list.
        int[] smaller;
        int[] larger;
        if (nums1.length > nums2.length) {
            smaller = new int[nums2.length];
            smaller = nums2;
            larger = new int[nums1.length];
            larger = nums1;
        }
        else{ 
            smaller = new int[nums1.length];
            smaller = nums1;
            larger = new int[nums2.length];
            larger = nums2;
        }
        //set vals
        boolean even = (nums1.length + nums2.length)%2 == 0 ? true : false;
        int half = (nums1.length + nums2.length) /2;
        int right = smaller.length;
        int left = 0;
        int middle = 0;
        int cut = 0;
        boolean continuing = true;
        
        //find the partition with a bianary search.
        while (continuing){
            continuing = false;
            middle = (left + right) / 2;
            cut = half - middle;
            
            System.out.printf("%d %d", middle, cut);
            
            //check that the cut isn't to far to the left
            if (smaller[middle] < larger[cut -1]){
                //if end off array is reached return
                if (middle == smaller.length -1){
                    if (even){
                        if (cut == 1) return (double)(larger[0] + smaller[middle]) /2;
                        return (double)(larger[cut -1] + larger[cut -2])/2;
                    }
                    return Math.max(larger[cut-1], smaller[middle]);
                }
                //otherwise move left and continue
                left = middle;
                continuing = true;
                continue;
            }
            
            //check that we haven't reached the begining of the array
            if (middle == 0){
                System.out.println("middle is 0");
                if (even){
                    if (cut == larger.length) return (double)(larger[cut-1] + smaller[0]) /2;
                    return (double)(larger[cut] + larger[cut+1])/2;
                }
                return Math.min(larger[cut], smaller[middle]);
            }
            
            //confirm we aren't too far to the right.
            if (middle-1 > cut){
                right = middle;
                continuing = true;
            }
        }
        System.out.println("found partition");
        if (even){
            System.out.println("in normal");
            int leftMean = Math.max(smaller[middle-1], larger[cut-1]);
            int rightMean = Math.min(smaller[middle], larger[cut]);
            return (double)(rightMean + leftMean)/2;
        }
        return Math.min(smaller[middle], larger[cut]);
    }
}
