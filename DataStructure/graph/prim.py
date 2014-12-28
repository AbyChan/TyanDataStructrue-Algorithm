__author__ = 'ub'

_ = float("inf")

def prim(graph, n):
    dist = [0]*n
    pre = [0]*n
    flag = [False]*n
    flag[0] = True
    k = 0
    for i in range(n):
        dist[i] = graph[k][i]

    for j in range(n-1):
        min = _
        for i in range(n):
            if dist[i] < min and not flag[i]:
                min = dist[i]
                k = i
        if(k == 0):
            return
        flag[k] = True
        for i in range(n):
            if dist[i] > graph[k][i] and not flag[i]:
                dist[i] = graph[k][i]
                pre[i] = k
    return dist, pre

def minPath(dist, pre, s, t):
    n = t-1
    mp = 0
    while(True):
        if(n != s-1):
            print n+1
            n = pre[n]
        else:
            break
    print mp




if __name__ == "__main__":
    n = 6
    graph = [
            [0,6,3,_,_,_],
            [6,0,2,5,_,_],
            [3,2,0,3,4,_],
            [_,5,3,0,2,3],
            [_,_,4,2,0,5],
            [_,_,_,3,5,0],
            ]
    dist, pre = prim(graph, n)
    print(dist)
    print(pre)
    minPath(dist, pre, 1, 6)