import sys

N = int(sys.stdin.readline())

li1 = []

for i in range(N):
    li1.append(int(sys.stdin.readline()))

li1.sort(reverse=False)

for i in range(0, len(li1)):
    print(li1[i])