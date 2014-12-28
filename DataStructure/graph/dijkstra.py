__author__ = 'ub'

_ = float("inf")

def dijkstra(graph, n):
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
        if k == 0:
            return
        flag[k] = True
        for i in range(n):
            if dist[i] > dist[k] + graph[k][i]:
                dist[i] = dist[k] + graph[k][i]
                pre[i] = k
    return dist, pre


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
    dis, pre = dijkstra(graph, n)
    print(dis)
    print(pre)
