N = int(input())

def factorial(N):
    if N <= 1:
        solution = 1
        return solution
    else:
        solution = N * factorial(N-1)
        return solution


print(factorial(N))