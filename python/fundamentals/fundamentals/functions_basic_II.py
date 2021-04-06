# part 1
def countdown(num):
    result = []
    for x in range(num, -1, -1):
        result.append(x)
    return result
print(countdown(12))

# part 2
def firstsecond(x):
    print(x[0])
    return(x[1])
x = firstsecond([1,2])
print(x)

# part 3
def first_plus_length(arr):
    return arr[0] + len(arr)

total = first_plus_length([1,2,3,4,5,6])
print(total)

# part 4
def values_greater_than_second(a):
    newList = []
    count = 0
    for i in range(0 , len(a), 1):
        if (a[i] > a[1]):
            newList.append(a[i])
            count = count + 1
    print(count)
    if (len(newList) < 2):
            return false 
    return newList

print(values_greater_than_second([10,2,3,6,1,5]))


# part 5
def this_length_that_value(size, value):
    newList = []
    for i in range(size):
        newList.append(value)
    return newList

print(this_length_that_value(10,2))
    


print(this_length_that_value(10, 5))