# Part 1
greeting = input("What is your name?")
print(f'Your name is: {greeting}')

# Part 2
greeting = input("What is your name?")
if ( greeting == "Aaron"):    
    print("Hey thats my name too!")
else:
    print(f"Your name is: {greeting}")


# Part 3
names= []
i = 1
greeting = ''
while i in range (1, 11):
    greeting = (input("What is your name?"))
    names.append(greeting)
    if i == 10:
        print("Nice to meet all of you")
    i+=1
print (names)
