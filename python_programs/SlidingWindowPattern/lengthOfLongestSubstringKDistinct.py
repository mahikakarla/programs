from typing import List

class Solution:
    def longestSubstringWithKdistinct(k: int, s: str) -> str:
        lngstSbStrLngth=0
        left=0
        visitedItemsMaxIndex={}
        for right in range (0, len(s)):
            visitedItemsMaxIndex[s[right]]=visitedItemsMaxIndex.get(s[right],0)+1
            if len(visitedItemsMaxIndex) <= k:
                lngstSbStrLngth=max(lngstSbStrLngth,right-left+1)
            else:
                while len(visitedItemsMaxIndex) > k:
                    if visitedItemsMaxIndex[s[left]]==1:
                        del visitedItemsMaxIndex[s[left]]
                    else:
                        visitedItemsMaxIndex[s[left]]-=1
                    left+=1
        print (lngstSbStrLngth)
        return lngstSbStrLngth
    longestSubstringWithKdistinct(1, "")