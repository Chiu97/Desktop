# QuickSort
## Introduction
__QuickSort__ 是一种递归排序算法
## Process
1.从数组中选择一个pivot元素  
2.将数组分成三个子数组  
* 小于pivot组成的数组  
* pivot自身  
* 大于pivot组成的数组  

3.递归地quicksort第一个同第三个数组

## Pseudocode  
```{r, eval=FALSE}
QuickSort(A[1...n]):
if(n>1)
    Choose a pivot element A[p]
r ← Partition(A,p)
QuickSort(A[1...r-1])
QuickSort(A[r+1...n])
```