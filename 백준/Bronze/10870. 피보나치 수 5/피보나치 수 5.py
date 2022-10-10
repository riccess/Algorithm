N = int(input())

# N_1 + N_2 = N_3

def Fivonach(N):
    # 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
    # 0번째와 1번째는 계산이 필요없음
    if N == 0:
        solution = N
        return solution
    elif N ==1:
        solution = N
        return solution
    # 2번째부터 계산이 필요함.
    else:
        solution = Fivonach(N-2) + Fivonach(N-1)
        return solution
    
print(Fivonach(N))