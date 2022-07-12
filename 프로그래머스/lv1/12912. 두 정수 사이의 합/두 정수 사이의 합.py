def solution(a, b):
    c = [a, b]
    if a == b:
        return c[0]
    elif a!= b:
        d = list(range(min(c), max(c)+1))
        return sum(d)