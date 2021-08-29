from array import *

items = array('i',[9,8,3,2,7])

for i in range (0, len(items)):
    print(items[i], end=" ")
print ()
rvrsd = [None] * len(items)
for i in range(0,len(items)):
    rvrsd[i] = items[i]
rvrsd.reverse()
print(rvrsd)

