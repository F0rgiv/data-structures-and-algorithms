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
        if (nums1.length == 1 && nums2.length ==1) return (double)(nums1[0] + nums2[0])/2;
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
                        return (double)(larger[cut -1] + Math.max(larger[cut -2], smaller[middle]))/2;
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
                    if (cut == larger.length - 1) return (double)(larger[cut-1] + Math.min(smaller[0], larger[cut])) /2;
                    if (larger[cut] > smaller[0]) return (double)(larger[cut-1] + Math.max(larger[cut-2], smaller[0]))/2;
                    if (larger[cut] < smaller[0]) return (double)(larger[cut] + larger[cut-1])/2;
                    return (double)(larger[cut] + larger[cut+1])/2;
                }
                return Math.min(larger[cut], smaller[middle]);
            }
            
            //confirm we aren't too far to the right.
            if (smaller[middle-1] > larger[cut]){
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
        if (smaller[middle] < larger[cut]) return smaller[middle];
        return Math.max(smaller[middle-1], larger[cut]);
    }
}


// https://leetcode.com/problems/zigzag-conversion/
class Solution {
    public String convert(String s, int numRows) {
        
        if (s.length() == 1 || numRows == 1) return s;
        
        char[][] rows = new char[numRows][s.length()];
        
        int charIndex = 0;
        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++){
            rows[row][charIndex] = s.charAt(i);            
            //move down or up aplicably
            if (down)row++;
            else row--;
            
            if (row == rows.length-1){
                down = false;
                charIndex++;
            }
            if (row == 0){
                down = true;
                charIndex++;
            }
        }
        char[] result = new char[s.length()];
        int current = 0;
        for (int i = 0; i < rows.length; i++){
            int j = 0;
            while(j < rows[0].length) {
                if (rows[i][j] == 0) {
                    j++;
                    continue;
                }
                result[current] =rows[i][j];
                j++;
                current++;
            }
        }
        return new String(result);
    }
}


/**
 * https://leetcode.com/problems/reverse-integer/submissions/
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
class Solution {
    public int reverse(int x) {
        int result = 0;
        //convirst to posetive
        boolean negative = false;
        if (x < 0){
            x = Math.abs(x);
            negative = true;
        }
        
        //reverse ints
        while (x > 0){
            //pop
            int newInt = x % 10;
            x = x /10;
            
            //check for overflow and return if needed
            if (Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && newInt > 7) return 0;
            
            result = result * 10 + newInt;
        }
        if (negative) return 0 - result;
        return result;
    }
}

/**
 * https://leetcode.com/problems/palindrome-number/
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 * 121 -> true
 * 1001 -> true
 * 1101 -> false
 * -12321 -> false
 * 12321 -> true
 * 100021 -> false
 */
class Solution {
    public boolean isPalindrome(int x) {
        //catch negative nums
        if (x < 0) return false; 
        
        //get count of ints
        int length = 1;
        int len = x;
        while (len > 9){
            len = len / 10;
            length++;
        }
        
        while (length > 1){            
            //pull
            int y = x;
            for (int i = 1; i<length; i++){
                y = y / 10;
            }
            int first = y % 10;
            length -= 2;

            //pop
            int last = x % 10;
            x = x / 10;
            
            //compare
            if (first != last) return false;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        // takenb from https://leetcode.com/problems/palindrome-number/
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }
}



/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (_removeNthFromEnd(head, n) == 0) return head.next;
        return head;
    }
    
    private int _removeNthFromEnd(ListNode node, int n){
        if (n == -1) return n;
        if (node == null) return n;
        n = _removeNthFromEnd(node.next, n);
        
        //remove node when nth is found
        if (n == 0) node.next = node.next.next;
        return n-1;
    }
}

