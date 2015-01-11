__author__ = 'ub'


class QuickFind:
    id = []
    count = 0

    def __init__(self, n):
        self.count = n
        for i in range(n):
            self.id.append(i)

    def show(self):
        for i in self.id:
            print i
        print "-----------"

    def count(self):
        return self.id

    def connected(self, p, q):
        return self.find(self, p) == self.find(self, q)

    def find(self, p):
        if p >= self.count:
            print "find input error"
            return
        return self.id[p]

    def union(self, p, q):
        pId = self.find(p)
        qId = self.find(q)
        if pId == qId:
            return
        else:
            for i in range(self.count):
                if self.id[i] == pId:
                    self.id[i] = qId




c = QuickFind(4)
c.show()
c.union(1, 2)
c.show()
