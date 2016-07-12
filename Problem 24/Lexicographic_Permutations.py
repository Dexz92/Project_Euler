import itertools

x = list(itertools.permutations([0,1,2,3,4,5,6,7,8,9]))
millionth_lexico = x[1000000-1]
print (millionth_lexico)
