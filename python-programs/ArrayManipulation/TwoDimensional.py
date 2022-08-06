from array import *

Dimensional_Array = [
                        [5,4,3,6], 
                        [6,9,5,77,88]
                    ]
print (Dimensional_Array)

#Updating multiple values
Dimensional_Array[0] = [1,4,3,6]

#Updating one value
Dimensional_Array[1][2] = 89

# Print using a loop elements.  
for i in Dimensional_Array:
    for j in i:  
        print(j, end = " ")
    print()   

#Removing a value
Dimensional_Array[1].pop(3)
#del(Dimensional_Array[0][3])

print (Dimensional_Array)

Dimensional_Array[0].append(55)
print (Dimensional_Array)


