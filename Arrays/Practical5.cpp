/*Create a Student Record Management System using linked list
• Use a singly/doubly linked list to store student data (Roll No, Name, Marks).
• Perform operations: Add, Delete, Update, Search, and Sort.
• Display records in ascending/descending order based on marks or roll number.*/



#include <iostream>
using namespace std;

class Node {
public:
    int roll;
    string name;
    float marks;
    Node* next;

    Node(int r, string n, float m) {
        roll = r;
        name = n;
        marks = m;
        next = nullptr;
    }
};

class StudentList {
    Node* head;

public:
    StudentList() {
        head = nullptr;
    }

    // Add student at end
    void addStudent(int roll, string name, float marks) {
        Node* newNode = new Node(roll, name, marks);

        if (head == nullptr) {
            head = newNode;
            return;
        }

        Node* temp = head;
        while (temp->next != nullptr)
            temp = temp->next;

        temp->next = newNode;
    }

    // Delete by roll
    void deleteStudent(int roll) {
        if (head == nullptr) {
            cout << "List empty" << endl;
            return;
        }

        if (head->roll == roll) {
            Node* temp = head;
            head = head->next;
            delete temp;
            cout << "Record deleted" << endl;
            return;
        }

        Node* temp = head;
        while (temp->next != nullptr && temp->next->roll != roll)
            temp = temp->next;

        if (temp->next == nullptr)
            cout << "Record not found" << endl;
        else {
            Node* del = temp->next;
            temp->next = temp->next->next;
            delete del;
            cout << "Record deleted" << endl;
        }
    }

    // Update by roll number
    void updateStudent(int roll) {
        Node* temp = head;

        while (temp != nullptr) {
            if (temp->roll == roll) {
                cout << "Enter new name: ";
                cin >> temp->name;
                cout << "Enter new marks: ";
                cin >> temp->marks;
                cout << "Record updated" << endl;
                return;
            }
            temp = temp->next;
        }
        cout << "Record not found" << endl;
    }

    // Search by roll number
    void searchStudent(int roll) {
        Node* temp = head;

        while (temp != nullptr) {
            if (temp->roll == roll) {
                cout << "Record Found" << endl;
                cout << "Roll: " << temp->roll
                     << "  Name: " << temp->name
                     << "  Marks: " << temp->marks << endl;
                return;
            }
            temp = temp->next;
        }
        cout << "Record not found" << endl;
    }

    // Sort by roll or marks
    void sortRecords(int option) {
        if (head == nullptr || head->next == nullptr)
            return;

        bool swapped = true;
        while (swapped) {
            swapped = false;
            Node* temp = head;

            while (temp->next != nullptr) {
                bool condition = false;

                if (option == 1 && temp->roll > temp->next->roll)
                    condition = true;
                if (option == 2 && temp->marks > temp->next->marks)
                    condition = true;

                if (condition) {
                    swap(temp->roll, temp->next->roll);
                    swap(temp->name, temp->next->name);
                    swap(temp->marks, temp->next->marks);
                    swapped = true;
                }
                temp = temp->next;
            }
        }

        if (option == 1)
            cout << "Sorted by Roll Number" << endl;
        else
            cout << "Sorted by Marks" << endl;
    }

    // Display all records
    void display() {
        if (head == nullptr) {
            cout << "No records" << endl;
            return;
        }

        Node* temp = head;
        while (temp != nullptr) {
            cout << "Roll: " << temp->roll 
                 << "  Name: " << temp->name 
                 << "  Marks: " << temp->marks << endl;
            temp = temp->next;
        }
    }
};

// Main Menu
int main() {
    StudentList s;
    int choice;

    while (true) {
        cout << "\n1. Add Student";
        cout << "\n2. Delete Student";
        cout << "\n3. Update Student";
        cout << "\n4. Search Student";
        cout << "\n5. Sort by Roll Number";
        cout << "\n6. Sort by Marks";
        cout << "\n7. Display All Records";
        cout << "\n8. Exit";

        cout << "\nEnter your choice: ";
        cin >> choice;

        if (choice == 1) {
            int roll;
            string name;
            float marks;
            cout << "Enter roll: ";
            cin >> roll;
            cout << "Enter name: ";
            cin >> name;
            cout << "Enter marks: ";
            cin >> marks;
            s.addStudent(roll, name, marks);
        }

        else if (choice == 2) {
            int roll;
            cout << "Enter roll to delete: ";
            cin >> roll;
            s.deleteStudent(roll);
        }

        else if (choice == 3) {
            int roll;
            cout << "Enter roll to update: ";
            cin >> roll;
            s.updateStudent(roll);
        }

        else if (choice == 4) {
            int roll;
            cout << "Enter roll to search: ";
            cin >> roll;
            s.searchStudent(roll);
        }

        else if (choice == 5) {
            s.sortRecords(1);
        }

        else if (choice == 6) {
            s.sortRecords(2);
        }

        else if (choice == 7) {
            s.display();
        }

        else if (choice == 8) {
            cout << "Exiting";
            break;
        }

        else {
            cout << "Invalid choice";
        }
    }

    return 0;
}
