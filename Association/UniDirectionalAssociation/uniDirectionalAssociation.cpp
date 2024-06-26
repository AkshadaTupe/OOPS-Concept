// Example of UnidDirectional Association
// Unidirectional Association means One class knows about or uses the other class, but the reverse is not true.
// In Below Example, let's have the Teacher class know about the Student class, but not vice versa.


#include "stdafx.h"
#include <string>
#include <vector>
#include <iostream>
using namespace std;

class Student
{
private:
	string name;

public:
	//Constructor
	Student(const string& studentName) : name(studentName)   
	{}

	string getStudentName()
	{
		return name;
	}
};


class Teacher
{
private:
	string name;
	vector<Student*> studentList;  // Association with multiple Students

public:
	//Constructor
	Teacher(const string& teacherName): name(teacherName)
	{}

	void addStudent(Student* student)
	{
		studentList.push_back(student);
	}

	void getTeacherDetails()
	{
		cout << "Teacher " << name << " has the following students:\n";
		for (const auto& student : studentList) {
			std::cout << "- " << student->getStudentName() << std::endl;
		}
	}
};

int main()
{
	Teacher mrSmith("John Smith");

	Student alice("Alice");
	Student bob("Bob");

	mrSmith.addStudent(&alice);
	mrSmith.addStudent(&bob);

	mrSmith.getTeacherDetails();

    return 0;
}

