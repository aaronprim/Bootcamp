# Section 1
# 1
x = [ [5,2,3], [10,8,9] ] 
x[1][0]=15
    
print(x)

# 2
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
for i in range(2):
    students[0]["last_name"]='Bryant'

print (students)

#3
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}

sports_directory['soccer'][0]= "Andres"

print (sports_directory)

# 4
z = [ {'x': 10, 'y': 20} ]
z[0]['y']=30
print(z)

# Section 2

students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
def iterateDictionary(students):
    for i in students:
        print(i['first_name'])
    
    for j in students:
        print(j['last_name'])

iterateDictionary(students)

# Section 3

students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]

def iterateDictionary2(key,students):
    for i in students:
        print(i[key])

iterateDictionary2('first_name',students)
iterateDictionary2('last_name',students)


# Section 4

dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
def printInfo(some_dict):
    print(len(some_dict['locations']),'locations')
    for i in some_dict['locations']:
        print(i)
    
    print(len(some_dict['instructors']),'instructors')
    for j in some_dict['instructors']:
        print(j)    

printInfo(dojo)