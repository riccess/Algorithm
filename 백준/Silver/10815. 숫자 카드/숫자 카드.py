N = int(input())
nList = list(map(int, input().split(" ")))
M = int(input())
mList = list(map(int, input().split(" ")))

nList.sort()

def binary_search(array, target):
    start = 0
    end = len(array)-1
    while start <= end:
        mid = (start+end)//2

        if array[mid] == target:
            return True
        elif array[mid]>target:
            end = mid-1
        elif array[mid]<target:
            start = mid+1
    return False

for i in range(0, len(mList)):
    if binary_search(nList, mList[i]):
        mList[i] = 1
    else:
        mList[i] = 0


solution = " ".join(map(str, mList))

print(solution)