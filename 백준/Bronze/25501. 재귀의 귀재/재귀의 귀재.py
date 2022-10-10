N = int(input())

def recursion(s, l, r, stack):
    stack = stack+1
    if l >= r:
        return print(1, stack)
    elif s[l] != s[r]:
        return print(0, stack)
    else:
        return recursion(s, l+1, r-1, stack)

def isPalindrome(s):
    return recursion(s, 0, len(s)-1, 0)


sList = []

for i in range(N):
    sList.append(input())

for i in range(N):
    isPalindrome(sList[i])