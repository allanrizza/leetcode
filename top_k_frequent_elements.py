from collections import defaultdict
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = dict()
        lis = []
        res = []
        for x in nums:
            if x in dic:
                dic[x]+=1
            else:
                dic[x]=1
        for i in dic.values():
            lis.append(i)
        lis.sort()
        lis=lis[-k:]
        for i in lis[:k]:
            for j in dic:
                if i == dic[j] and j not in res:
                    res.append(j)
        return res