#Hackerrank Q.Find the Runner-Up Score!
"""if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

array = list(arr)
winner = max(array)
array = [i for i in array if i != winner]
print(max(array))"""

#Hackerrank Q.List Comprehensions
"""if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

l = list()
for i in range(x+1):
    for j in range(y+1):
        for k in range(z+1):
            if i+j+k != n:
                l.append([i,j,k])

print(l)"""

#CodeChef Q
T = int(input())
for i in range(T):
    x = input()
    y = input()

ans = False

for j in len(x):
    if j == j and j != '?' and j != '?':
        ans = True
        print(ans)

print(ans)
