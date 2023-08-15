class Solution(object):
    def isAnagram(self, s, t):
        for char in s:
            if char in t:
                t = t.replace(char, "",1)
                continue
            else:
                return False
        if t != "":
            return False
        return True
