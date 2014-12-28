# zoj1049
import math

print "please input N number"
n = int(raw_input())
for i in range(1, n+1):
    print "please input x and y (float)"
    line = raw_input()
    input = line.split()
    x = float(input[0])
    y = float(input[1])
    k = 0
    area = 0
    while True:
        if(area*2/math.pi > x*x+y*y):
            break
        else:
            area += 50
        k += 1
    print "Property %d: This property will begin eroding in year %d."%(i, k)