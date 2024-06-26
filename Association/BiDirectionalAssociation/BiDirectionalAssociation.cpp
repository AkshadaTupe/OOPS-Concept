// BiDirectionalAssociation.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <string>
#include <iostream>
#include <vector>
using namespace std;

class Teacher;    //Forward Declaration

class Student
{
private:
	string name;
	Teacher* teacher;

public:
	Student(const string& studentName) : name(studentName) //Constructor
	{}

	string getStudentName()
	{
		return name;
	}

	void setTeacher(Teacher* teacherObj)
	{
		this->teacher = teacherObj;
	}

	Teacher* getTeacher() const {
		return teacher;
	}
};


class Teacher
{
private:
	string name;
	vector<Student*> studentList;

public:
	//Constructor
	Teacher(const string& teacherName) : name(teacherName)
	{}

	string teacherName()
	{
		return name;
	}

	void addStudent(Student* student)
	{
		studentList.push_back(student);
		student->setTeacher(this);
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
	Teacher smith("Smith");
	Teacher john("John");

	Student alice("Alice");
	Student bob("bob");
	Student andrew("Andrew");

	smith.addStudent(&alice);

	smith.addStudent(&bob);

	smith.addStudent(&andrew);


	smith.getTeacherDetails();

	cout << "----------------------------------------------" <<endl;
	// Each student knows their teacher
	std::cout << andrew.getStudentName() << "'s teacher is " << andrew.getTeacher()->teacherName() << std::endl;
 
	return 0;
}

