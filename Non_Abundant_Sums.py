from  math import sqrt

def non_abundant_sum(n):
    abundant_sum = 1
    temp = sqrt(n)
    for i in range(2,int(temp)+1):
        if n % i == 0:
            abundant_sum +=  i + n / i
    if temp == int(temp):
        abundant_sum -= temp
    return abundant_sum

max_int_size = 28123
non_abudant_value = 0
container = set()

for value in range(1,max_int_size):
    if non_abundant_sum(value) > value:
        container.add(value)
    if not any( (value-a in container) for a in container ):
        non_abudant_value += value

print (non_abudant_value)
