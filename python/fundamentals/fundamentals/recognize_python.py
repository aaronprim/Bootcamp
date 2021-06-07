num1 = 42 # variable declaration
num2 = 2.3 # variable declaration
boolean = True # data type- primative- boolean
string = 'Hello World' # data- primative- string
pizza_toppings = ['Pepperoni', 'Sausage', 'Jalepenos', 'Cheese', 'Olives'] # data type- composite- list
person = {'name': 'John', 'location': 'Salt Lake', 'age': 37, 'is_balding': False} #data type- composite- dictionary
fruit = ('blueberry', 'strawberry', 'banana') # data type- composite- list
print(type(fruit)) # call function, and run in console
print(pizza_toppings[1]) # initialize and call the 1 index of the array
pizza_toppings.append('Mushrooms') # add mushrooms to toppings
print(person['name']) # call name item from person dictionary 
person['name'] = 'George' # error theres no george
person['eye_color'] = 'blue' # error
print(fruit[2]) # print 2nd index

if num1 > 45:
    print("It's greater") # conditional statement 
else:
    print("It's lower") 

if len(string) < 5:
    print("It's a short word!") # conditional statement
elif len(string) > 15:
    print("It's a long word!")
else:
    print("Just right!")

for x in range(5): #for loop
    print(x)
for x in range(2,5):
    print(x)
for x in range(2,10,3):
    print(x)
x = 0
while(x < 5): #while loop
    print(x)
    x += 1

pizza_toppings.pop() #attribute error
pizza_toppings.pop(1) # removes item from the first index

print(person)
person.pop('eye_color') # attribute error nothing to pop
print(person)

for topping in pizza_toppings:
    if topping == 'Pepperoni': # conditional statement
        continue
    print('After 1st if statement')
    if topping == 'Olives':
        break

def print_hello_ten_times(): # funciton prints hello 10 times
    for num in range(10):
        print('Hello')

print_hello_ten_times() #error

def print_hello_x_times(x): #funciton error x isnt defined
    for num in range(x):
        print('Hello')

print_hello_x_times(4) #error

def print_hello_x_or_ten_times(x = 10): # function prints 10 times
    for num in range(x):
        print('Hello')

print_hello_x_or_ten_times() #error not defined
print_hello_x_or_ten_times(4) #doesnt run


"""
Bonus section
"""

# print(num3)
# num3 = 72
# fruit[0] = 'cranberry'
# print(person['favorite_team'])
# print(pizza_toppings[7])
#   print(boolean)
# fruit.append('raspberry')
# fruit.pop(1)