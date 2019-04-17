# <center>背包问题</center>
## 什么是0-1背包问题?
有贼入室盗窃,很多东西可以偷,而负重能力有限,偷哪些东西才最有价值
也就是给定一组n个物品,每个物品有自身的重量(w)和价值(v),在限定容量(C)内,选择其中若干件物品,设计选择方案使得物品的总价值最高  
![fomular](https://www.zhihu.com/equation?tex=%5Cmax+%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7Bx_iv_i%7D),
![fomular](https://www.zhihu.com/equation?tex=%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7Bx_iw_i%7D%5Cleq+C)  

在背包问题中贪婪算法一般无法取得最优解

考虑第 i 个物品，无外乎两种可能：选，或者不选。
不选的话，背包的容量不变，改变为问题 P(i-1,W);
选的话，背包的容量变小，改变为问题 P(i-1,w-1).
最优方案就是比较两种方案哪种好一些:  
![](https://www.zhihu.com/equation?tex=m%28i%2CW%29%3D%5Cmax%5C%7Bm%28i-1%2CW%29%2Cm%28i-1%2CW-w_i%29%2Bv_i%5C%7D)  
得到  __m__(i,W) =:
*                   0                           (if i = 0)
*                   0                           (if W = 0)
*                   m(i-1,W)                    (if w > W)
*                   max{m(i-1,W),v+m(i-1,W-w)}  (otherwise)

算法  
![](https://pic1.zhimg.com/80/v2-c320774be1bf28521ea7577bbb528fac_hd.jpg)

