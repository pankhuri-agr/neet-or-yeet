<div align="center">

# 🏭 neet-to-prod

### **From NeetCode to Production — DSA through the lens of real systems**

[![Progress](https://img.shields.io/badge/Progress-0%2F150-blue?style=for-the-badge)]()
[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)]()
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]()

*Not just another NeetCode solutions repo.*
*Every problem: brute force → optimized → best, with production system connections.*

---

</div>

## 🤔 Why This Repo Exists

There are **200+ NeetCode repos** on GitHub. Most are solution dumps. This one is different.

Every solution here includes:
- 🔨 **Brute Force** → ⚡ **Optimized** → 🏆 **Best** — full progression with complexity breakdown
- 🏗️ **Production Connection** — where this pattern shows up in real backend systems
- 🧠 **Pattern Recognition** — the reusable mental model, not just the code
- ⚠️ **Gotchas** — edge cases that interviews love and production systems hate

---

## 📊 Progress Tracker

| # | Category | Problems | Done | Status |
|---|----------|----------|------|--------|
| 1 | [Arrays & Hashing](./01-arrays-and-hashing/) | 9 | 0 | 🔲 |
| 2 | [Two Pointers](./02-two-pointers/) | 5 | 0 | 🔲 |
| 3 | [Sliding Window](./03-sliding-window/) | 6 | 0 | 🔲 |
| 4 | [Stack](./04-stack/) | 7 | 0 | 🔲 |
| 5 | [Binary Search](./05-binary-search/) | 7 | 0 | 🔲 |
| 6 | [Linked List](./06-linked-list/) | 11 | 0 | 🔲 |
| 7 | [Trees](./07-trees/) | 15 | 0 | 🔲 |
| 8 | [Heap / Priority Queue](./08-heap-priority-queue/) | 7 | 0 | 🔲 |
| 9 | [Backtracking](./09-backtracking/) | 9 | 0 | 🔲 |
| 10 | [Tries](./10-tries/) | 3 | 0 | 🔲 |
| 11 | [Graphs](./11-graphs/) | 13 | 0 | 🔲 |
| 12 | [Advanced Graphs](./12-advanced-graphs/) | 6 | 0 | 🔲 |
| 13 | [1-D Dynamic Programming](./13-1d-dynamic-programming/) | 12 | 0 | 🔲 |
| 14 | [2-D Dynamic Programming](./14-2d-dynamic-programming/) | 11 | 0 | 🔲 |
| 15 | [Greedy](./15-greedy/) | 8 | 0 | 🔲 |
| 16 | [Intervals](./16-intervals/) | 6 | 0 | 🔲 |
| 17 | [Math & Geometry](./17-math-and-geometry/) | 8 | 0 | 🔲 |
| 18 | [Bit Manipulation](./18-bit-manipulation/) | 7 | 0 | 🔲 |

**Total: 0 / 150** 🚀

---

## 🔨 → ⚡ → 🏆 The Approach Ladder

Every solution walks through the full evolution of thinking:

```
┌─────────────────────────────────────────────────────┐
│  🔨 BRUTE FORCE                                     │
│  The naive approach. Usually nested loops or         │
│  exhaustive search. Correct but slow.                │
│  Time: O(n²)  Space: O(1)                           │
├─────────────────────────────────────────────────────┤
│  ⚡ OPTIMIZED                                        │
│  Key insight applied. Trading space for time,        │
│  or using a smarter data structure.                  │
│  Time: O(n log n)  Space: O(n)                      │
├─────────────────────────────────────────────────────┤
│  🏆 BEST / OPTIMAL                                  │
│  The interview-ready solution. Clean, efficient,     │
│  handles all edge cases.                             │
│  Time: O(n)  Space: O(n)                            │
└─────────────────────────────────────────────────────┘
```

> **Why?** Interviewers don't just want the optimal answer — they want to see you *think your way there*. Starting brute force and improving shows strong problem-solving instinct.

---

## 🏗️ Production Connections

Each solution maps the algorithm to where it actually shows up in production:

```
📦 PRODUCTION CONNECTION
━━━━━━━━━━━━━━━━━━━━━━━
Pattern: Hash Map for O(1) lookups
Where it shows up:
  → Redis cache layers — every cache hit is a hash lookup
  → Kafka consumer idempotency — dedup processed message IDs
  → Database hash indexes — equality predicates in PostgreSQL
  → Rate limiting — sliding window counters keyed by client IP
```

---

## 📁 Repo Structure

```
neet-to-prod/
├── README.md
├── 01-arrays-and-hashing/
│   ├── README.md                          # Category overview + pattern cheatsheet
│   ├── 001-ContainsDuplicate.java
│   ├── 002-ValidAnagram.java
│   ├── 003-TwoSum.java
│   └── ...
├── 02-two-pointers/
│   ├── README.md
│   └── ...
├── ...
├── patterns/
│   └── PATTERNS.md                        # Cross-cutting pattern reference
└── templates/
    └── SolutionTemplate.java              # Template for each solution
```

---

## 🗺️ Pattern Cheatsheet

| Pattern | When to Use | Production System |
|---------|------------|-------------------|
| Hash Map | O(1) lookup / dedup / counting | Redis, DB indexes, caches |
| Two Pointers | Sorted array, pair search | Merge joins, diff algorithms |
| Sliding Window | Contiguous subarray/substring | Rate limiting, stream processing |
| Monotonic Stack | Next greater/smaller element | Expression parsing, query engines |
| Binary Search | Sorted data, search space reduction | B-tree lookups, git bisect |
| Fast & Slow Pointer | Cycle detection, middle of list | GC cycle detection, LRU caches |
| BFS/DFS | Tree/Graph traversal | File systems, dependency graphs |
| Topological Sort | Dependency resolution | CI/CD pipelines, build systems |
| DP (Memoization) | Overlapping subproblems | Route optimization, text diff |
| Greedy + Sorting | Interval scheduling | Job schedulers, load balancers |
| Trie | Prefix matching | Autocomplete, IP routing tables |
| Bit Tricks | XOR, bitmasks, counting | Feature flags, permissions, bloom filters |

---

## 🚀 How to Use

```bash
# Clone
git clone https://github.com/<your-username>/neet-to-prod.git
cd neet-to-prod

# Compile and run any solution
javac 01-arrays-and-hashing/003-TwoSum.java
java -cp 01-arrays-and-hashing TwoSum
```

---

## 🎯 Study Plan

| Week | Focus | Problems |
|------|-------|----------|
| 1 | Arrays & Hashing, Two Pointers | 14 |
| 2 | Sliding Window, Stack | 13 |
| 3 | Binary Search, Linked List | 18 |
| 4 | Trees | 15 |
| 5 | Heap, Backtracking, Tries | 19 |
| 6 | Graphs, Advanced Graphs | 19 |
| 7 | 1-D DP, 2-D DP | 23 |
| 8 | Greedy, Intervals, Math, Bits | 29 |

---

<div align="center">

**⭐ Star this repo if you find the brute → optimal breakdowns useful!**

*Built with discipline, debugged with coffee* ☕

</div>
