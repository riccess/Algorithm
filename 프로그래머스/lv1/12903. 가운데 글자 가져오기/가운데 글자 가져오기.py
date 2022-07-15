def solution(s):
    a = int(len(s)/2)
    if len(s)%2 == 0:
        return s[a-1]+s[a]
    return  s[round(a)]