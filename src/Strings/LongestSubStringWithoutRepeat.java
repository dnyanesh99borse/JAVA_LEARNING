//package Strings;
//
//import java.util.*;
//public class LongestSubStringWithoutRepeat {
//    public static void main(String[] args){
//        String s = "pwwkew;
//        lengthOfLongestSubstring(s);
//    }
//
//        public static int lengthOfLongestSubstring(String s) {
//            int[] lastIndex = new int[256];   // store last seen index of each char
//            Arrays.fill(lastIndex, -1);       // initialize all as not seen
//
//            int left = 0, maxLen = 0;
//
//            for (int right = 0; right < s.length(); right++) {
//                char c = s.charAt(right);
//
//                // If character was seen & is inside the current window
//                if (lastIndex[c] >= left) {
//                    left = lastIndex[c] + 1;  // shrink window from the left
//                }
//
//                lastIndex[c] = right; // update last seen index of char
//                maxLen = Math.max(maxLen, right - left + 1);
//            }
//
//            return maxLen;
//        }
//    }
//
//
//
//
//
//
//
//
//    //======================SIH============================
////package Strings;
////
////import java.util.*;
////public class LongestSubStringWithoutRepeat {
////    public static void main(String[] args){
////        String s = "pwwkew;
////        lengthOfLongestSubstring(s);
////    }
////
////    public static int lengthOfLongestSubstring(String s) {
////        int[] lastIndex = new int[256];   // store last seen index of each char
////        Arrays.fill(lastIndex, -1);       // initialize all as not seen
////
////        int left = 0, maxLen = 0;
////
////        for (int right = 0; right < s.length(); right++) {
////            char c = s.charAt(right);
////
////            // If character was seen & is inside the current window
////            if (lastIndex[c] >= left) {
////                left = lastIndex[c] + 1;  // shrink window from the left
////            }
////
////            lastIndex[c] = right; // update last seen index of char
////            maxLen = Math.max(maxLen, right - left + 1);
////        }
////
////        return maxLen;
////    }
////}
