list_of_students = []
students = int(input("How many students do you have? "))
for i in range(0,students):
    student_info = []
    name = input("Students name: ")
    student_info.append(name)
    grade = input("Student grade: ")
    student_info.append(grade)
    course= input(" Select a course: 1 - Math, 2 - Science, 3- History: ")
    if course == "1":
        course = "Math"
    elif course == "2":
        course = "Science"
    elif course == "3":
        course = "History"
    student_info.append(course)
    list_of_students.append(student_info)
for j in range(len(list_of_students)):
    print("Name: " + list_of_students[j][0] , "Grade: " + list_of_students[j][1], "Course: " + list_of_students[j][2])