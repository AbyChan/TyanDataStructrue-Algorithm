__author__ = 'ub'

def fixUp(a):
    k = len(a) - 1
    while k > 1 and a[k//2] < a[k]:
        a[k//2], a[k] = a[k], a[k//2]
        k //= 2

def fixDown(a):
    k = 1
    n = len(a) - 1
    while 2*k < n:
        j = 2*k
        if j < n and a[j] < a[j+1]:
            j += 1
        if a[k] < a[j]:
            a[k], a[j] = a[j], a[k]
            k = j
        else:
            break


def insert(a,elem):
    a.append(elem)
    fixUp(a)

def delMax(a):
    max = a[1]
    n = len(a)
    if n == 1:
        print "no more element!"
    if n == 2:
        return a[1]
    else:
        a[1] = a.pop()
        fixDown(a)
        return max


data=[-1,]
insert(data,26)
insert(data,5)
insert(data,77)
insert(data,1)
insert(data,61)
insert(data,11)
insert(data,59)
insert(data,15)
insert(data,48)
insert(data,19)

result=[]
N=len(data)-1
for i in range(N):
    print(data)
    result.append(delMax(data))
print(result)