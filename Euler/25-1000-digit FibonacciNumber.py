
a = 1
b = 0
n = 1

while len(str(a)) != 1000:
    a, b = a+b, a
    n = n + 1
print "%d  \n has 1000 digits, n = %d" % (a, n)
