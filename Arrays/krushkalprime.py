# Kruskal's and Prim's Algorithms for MST

class DisjointSet:
    def __init__(self, n):
        self.parent = list(range(n))
        self.rank = [0] * n

    def find(self, u):
        if self.parent[u] != u:
            self.parent[u] = self.find(self.parent[u])
        return self.parent[u]

    def union(self, u, v):
        ru, rv = self.find(u), self.find(v)
        if ru != rv:
            if self.rank[ru] < self.rank[rv]:
                self.parent[ru] = rv
            elif self.rank[ru] > self.rank[rv]:
                self.parent[rv] = ru
            else:
                self.parent[rv] = ru
                self.rank[ru] += 1


def kruskal(n, edges):
    ds = DisjointSet(n)
    mst, cost = [], 0
    edges.sort(key=lambda x: x[2])
    for u, v, w in edges:
        if ds.find(u) != ds.find(v):
            ds.union(u, v)
            mst.append((u, v, w))
            cost += w
    return mst, cost


import heapq
def prim(n, graph):
    visited = [False] * n
    mst, cost = [], 0
    heap = [(0, 0, -1)]
    while heap:
        w, u, p = heapq.heappop(heap)
        if visited[u]: 
            continue
        visited[u] = True
        if p != -1:
            mst.append((p, u, w))
            cost += w
        for v, wt in graph[u]:
            if not visited[v]:
                heapq.heappush(heap, (wt, v, u))
    return mst, cost


if __name__ == "__main__":
    edges = [
        (0, 1, 4), (0, 2, 2), (1, 2, 1),
        (1, 3, 5), (2, 3, 8), (2, 4, 10), (3, 4, 2)
    ]
    n = 5
    graph = [[] for _ in range(n)]
    for u, v, w in edges:
        graph[u].append((v, w))
        graph[v].append((u, w))

    k_mst, k_cost = kruskal(n, edges)
    print("Kruskal's MST:")
    for u, v, w in k_mst:
        print(f"{u} -- {v} == {w}")
    print("Total cost:", k_cost)

    p_mst, p_cost = prim(n, graph)
    print("\nPrim's MST:")
    for u, v, w in p_mst:
        print(f"{u} -- {v} == {w}")
    print("Total cost:", p_cost)
