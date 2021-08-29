from array import *

first = array('i', [6,7,8,9,0])
print (first)

first.append(1)

print (first)

second = array('i', [3,4,5])

#first += second

first.extend(second)
print (first)
