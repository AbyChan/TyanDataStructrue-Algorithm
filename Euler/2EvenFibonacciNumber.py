
max = 4000000

rst = 0
sum = 0
pre = 1
current = 2
while sum <= max:
    sum = pre + current
    if sum % 2 == 0:
        rst += sum
    pre = current
    current = sum
print rst



