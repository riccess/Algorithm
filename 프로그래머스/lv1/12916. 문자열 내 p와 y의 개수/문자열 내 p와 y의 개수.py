def solution(s):
    s = s.lower()
    x = s.count('p')
    y = s.count('y')
    if x==y:
        return True
    return False