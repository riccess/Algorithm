def solution(arr):
    br_li = []
    for i in range(0,len(arr)-1):
        if arr[i] == arr[i+1]:
            pass
        else:
            br_li.append(arr[i])
    br_li.append(arr[-1])
    return  br_li