package neet150.arrays_and_hashing_01 ;

/*
 * ============================================================================
 * Problem  : Contains Duplicate
 * LeetCode : https://leetcode.com/problems/contains-duplicate/
 * NeetCode : https://neetcode.io/practice/practice/neetcode150
 * Difficulty: Easy
 * ============================================================================
 *
 * ━━━ APPROACH 1: BRUTE FORCE ━━━
 * Compare every pair of elements using two nested loops.
 *
 * Time:  O(n²)
 * Space: O(1)
 *
 * ━━━ APPROACH 2: SORTING ━━━
 * Sort the array. Duplicates become adjacent neighbours.
 *
 * Time:  O(n log n)
 * Space: O(1)
 *
 * ━━━ APPROACH 3: HASH SET ━━━
 * Single pass with a HashSet. add() returns false if already present.
 *
 * Time:  O(n)
 * Space: O(n)
 *
 * ━━━ APPROACH 4: BEST SOLUTION ━━━
 * This solution is only valid for datasets where values lie within 1<=val<=n where
 * n is the length of array.
 *
 * Time: O(n)
 * Space: O(1)
 *
 * ━━━ PRODUCTION CONNECTION ━━━
 * Pattern   : Hash Set for deduplication
 * Real-world: Kafka consumer idempotency, payment duplicate detection,
 *             API request dedup middleware
 *
 * ━━━ GOTCHAS ━━━
 * - Empty array or single element → always false
 * - Unbounded sets in production = memory leak. Use TTL-based caches.
 * ============================================================================
 */

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Function;

import static java.lang.Math.abs;

public class ContainsDuplicate {

    // ━━━ APPROACH 1: BRUTE FORCE ━━━
    public static boolean approach1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    // ━━━ APPROACH 2: SORTING ━━━
    public static boolean approach2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    // ━━━ APPROACH 3: HASH SET ━━━
    public static boolean approach3(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }

    // ━━━ APPROACH 4: Constrained dataset ━━━
    public static boolean approach4(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            // find index
            index = abs(nums[i])-1;
            // if value at index is negative - duplicate found
            if(nums[index]<0)
                return true;
            nums[index] = -nums[index];
        }
        return false;
    }

    // ━━━ TEST CASES ━━━
    private static int[][] getTestInputs() {
        return new int[][] {
                {1, 2, 3, 1},
                {1, 2, 3, 4},
                {1, 1, 1, 3, 3, 4, 3, 2, 4, 2},
                {},
                {1},
                {-1, -1, 1, 2},
                {1, 2, 4, 5},
                {100, 100, 100, 100}
        };
    }

    private static boolean[] getExpected() {
        return new boolean[] { true, false, true, false, false, true, false, true };
    }

    private static void runTests(String label, Function<int[], Boolean> method) {
        int[][] inputs = getTestInputs();
        boolean[] expected = getExpected();
        System.out.println("--- " + label + " ---");
        for (int i = 0; i < inputs.length; i++) {
            // clone so sorting approach doesn't affect other tests
            try {
                boolean result = method.apply(inputs[i].clone());
                String status = result == expected[i] ? "✅" : "❌";
                System.out.println("  " + status + " Input: " + Arrays.toString(inputs[i])
                        + " → " + result + " (expected " + expected[i] + ")");
            } catch (Exception exception) {
                System.out.println("  " +  "❌" + " Input: " + Arrays.toString(inputs[i])
                        + " → " + exception + " (expected " + expected[i] + ")");
            }
        }
    }

    public static void main(String[] args) {
        runTests("BRUTE FORCE  O(n²)",    ContainsDuplicate::approach1);
        runTests("SORTING      O(n logn)", ContainsDuplicate::approach2);
        runTests("HASH SET     O(n)",      ContainsDuplicate::approach3);
        runTests("DATA CONSTRAINED", ContainsDuplicate::approach4);
    }
}