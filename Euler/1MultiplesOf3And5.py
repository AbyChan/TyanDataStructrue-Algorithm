
number = input('The number is?')
rst = 0
for i in range(number):
    if i % 3 == 0 or i % 5 == 0:
        rst += i

print 'The result is ' + str(rst)
