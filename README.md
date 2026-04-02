<div align="center">

# 🏭 neet-or-yeet

### **NeetCode Solutions — DSA through the lens of real systems**

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

## 🔨 → ⚡ → 🏆 The Approach Ladder

Every solution walks through the full evolution of thinking:

```
┌─────────────────────────────────────────────────────┐
│  🔨 BRUTE FORCE                                     │
│  The naive approach. Usually nested loops or         │
│  exhaustive search. Correct but slow.                │        
├─────────────────────────────────────────────────────┤
│  ⚡ OPTIMIZED                                        │
│  Key insight applied. Trading space for time,        │
│  or using a smarter data structure.                  │
├─────────────────────────────────────────────────────┤
│  🏆 BEST / OPTIMAL                                  │
│  The interview-ready solution. Clean, efficient,     │
│  handles all edge cases.                             │
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

<div align="center">

**⭐ Star this repo if you find the brute → optimal breakdowns useful!**

*Built with discipline, debugged with coffee* ☕

</div>
