n = int(input())

movie = 666
movieCnt = 0

while True:
    if "666" in str(movie):
        movieCnt += 1
    if movieCnt == n:
        print(movie)
        break
    movie += 1