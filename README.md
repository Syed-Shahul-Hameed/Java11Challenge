# Java11Challenge and algorithms
A 100 days Java 11 programming challenge. Keep learning and keep shining
# Level - 1 Perform QuickSort for the given array
------------------------------------------------------------------------
# Level - 2 Problem: Implement Merge Sort on an Integer Array
  # Problem Statement:
    Given an unsorted array of integers, sort it in ascending order using the Merge Sort algorithm. Implement a clean, efficient Java 11 solution, document the approach, and analyze time and space complexities.

  Merge Sort is a classic divide-and-conquer algorithm.
  It guarantees a worst-case time complexity of (O(n \log n)), unlike QuickSort which can degrade to (O(n^2)).
  It works by recursively dividing the array and merging sorted subarrays.
  Introduces important concepts: recursion, merging two sorted arrays, stable sorting.
  Good contrast to QuickSort for reinforcing sorting techniques.
  
  # Merge Sort Explained
  **+ Divide :** Recursively split the array into two halves until the subarrays contain only one element (base case).  
  **+ Conquer :** Sort and merge two sorted halves.  
  __+ Combine :__ Gradually build up the sorted array by merging sorted subarrays.
  
  # Complexity Analysis
  | Aspect | Complexity & Explanation
  |---|---|
  |Time Complexity|(O(n \log n)) for all cases due to divide & merge. Each level divides and merges arrays of total size (n)|
  |Space Complexity|(O(n)) extra space for temporary arrays during merging (cannot be done fully in-place)|
  |Stability	Stable|Preserves order of equal elements|
  |Recursion Depth|(O(\log n)) recursive calls|
------------------------------------------------------------------------

