for x in range(0, 150, 1):
    print (x)

for y in range(5, 1000, 5):
    print (y)

for z in range(1, 100):
    if(z%5==0):
        print("Coding")
    if (z%10==0):
        print("Coding Dojo")

sum = 0
for a in range(0, 500000):
    if (a % 2!=0):
        sum=sum+a
print(a)

for b in range(2018, 0, -4):
    print(b)

lowNum = 1
highNum = 100
mult = 3
for i in range(lowNum, highNum):
    if(i % mult==0):
        print(i)