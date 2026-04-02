/*
 * ============================================================================
 * Problem  : Two Sum
 * LeetCode : https://leetcode.com/problems/two-sum/
 * NeetCode : Arrays & Hashing
 * Difficulty: Easy
 * ============================================================================
 *
 * Given an array of integers nums and an integer target, return indices
 * of the two numbers such that they add up to target.
 * Assume exactly one solution exists. Cannot use the same element twice.
 *
 * ━━━ APPROACH 1: BRUTE FORCE ━━━
 * Check every pair (i, j) where i < j.
 * If nums[i] + nums[j] == target, return {i, j}.
 *
 * Time:  O(n²)  — two nested loops over all pairs
 * Space: O(1)   — no extra storage
 * Why it works but isn't great: Examines n*(n-1)/2 pairs.
 *
 * ━━━ APPROACH 2: HASH MAP (OPTIMAL) ━━━
 * Single pass: for each element, compute complement = target - nums[i].
 * Check if complement already exists in a HashMap. If yes → return
 * both indices. If no → store {nums[i]: i} in the map.
 *
 * Time:  O(n)  — single pass, O(1) amortized HashMap lookups
 * Space: O(n)  — HashMap stores up to n entries
 * Why this is optimal: Must examine each element at least once → O(n)
 * lower bound. Can't do better than one pass + hash map.
 *
 * Note: A sorting-based approach (O(n log n)) exists using two pointers
 * on a sorted copy, but it complicates index tracking and isn't faster
 * than the hash map approach. Skipped here as it's not a useful middle
 * step for this specific problem.
 *
 * ━━━ PRODUCTION CONNECTION ━━━
 * Pattern   : Complement lookup via hash map
 * Real-world:
 *   → Payment reconciliation: given a list of debits, find the matching
 *     credit that sums to zero. Reconciliation engines hash transaction
 *     amounts and match complements across millions of records.
 *   → Order matching engines: exchanges match buy/sell orders where
 *     bid + ask meets a threshold — same complement pattern on streams.
 *   → Database join optimization: hash joins build a hash table on the
 *     smaller relation, probe with the larger one — identical principle.
 *
 * ━━━ GOTCHAS ━━━
 * - Can't reuse the same element (i != j)
 * - Problem guarantees exactly one solution — no need for multi-match
 * - In production with streaming data, use a windowed hash map with TTL
 *   to avoid unbounded memory growth
 * - Watch out for integer overflow: (target - nums[i]) can overflow if
 *   values are near Integer.MAX_VALUE
 * ============================================================================
 */

import java.util.*;

public class TwoSum {

    // ━━━ APPROACH 1: BRUTE FORCE ━━━
    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};  // unreachable if guaranteed solution
    }

    // ━━━ APPROACH 2: HASH MAP (OPTIMAL) ━━━
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();  // value -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};  // unreachable if guaranteed solution
    }

    // ━━━ TEST CASES ━━━
    public static void main(String[] args) {
        // --- Brute Force ---
        assert Arrays.equals(twoSumBrute(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assert Arrays.equals(twoSumBrute(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assert Arrays.equals(twoSumBrute(new int[]{3, 3}, 6), new int[]{0, 1});

        // --- Hash Map (Optimal) ---
        assert Arrays.equals(twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assert Arrays.equals(twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assert Arrays.equals(twoSum(new int[]{3, 3}, 6), new int[]{0, 1});

        System.out.println("✅ All tests passed");
    }
}
