"""In a company, employee salaries are stored in a list as floating-point numbers. Write a Python
program that sorts the employee salaries in ascending order using the following two algorithms:
a) Selection Sort: Sort the salaries using the selection sort algorithm.
b) Bubble Sort: Sort the salaries using the bubble sort algorithm.
After sorting the salaries, the program should display top five highest salaries in the company"""""





def Selection_sort(selecttion_list):
    n=len(selection_list)

    for i in range(0,n-1):
        min_index=i
        for j in range(i+1,n):
            if(selection_list[j]<selection_list[min_index]):
                min_index=j
        
        selection_list[i], selection_list[min_index]=selection_list[min_index],selection_list[i]


def Bubble_sort(bubble_list):
    n=len(bubble_list)

    for i  in range(0,n-1):
        for j in range(0,n-1):
            if(bubble_list[j+1]<bubble_list[j]):
                bubble_list[j],bubble_list[j+1]=bubble_list[j+1],bubble_list[j]


sal_list=list(map(float,input("Enter Employee Salaries:").split()))

print("Employee Salaries Before Sorting:")
print(sal_list)

bubble_list=sal_list.copy()
selection_list=sal_list.copy()

Selection_sort(selection_list)
print("Employee Salaries Sorted using Selection_Sort: ", selection_list)
Bubble_sort(bubble_list)
print("Emplyee Salaries Sorted using bubbl_sort: ", bubble_list)

print("Top Five Salaries:")
if(len(selection_list)>5):
    top_Five=selection_list[-5:]
else:
    top_Five=selection_list.reverse()


print("Top Five salaries:", top_Five)

""" Explanation (easy for viva)
Selection Sort

You find the smallest element and place it at the beginning.
Repeat for every index.

Bubble Sort

Compare adjacent elements and swap if needed.
Big numbers bubble up to the end.

Top 5 highest salaries

After sorting ascending, highest salaries are at the end.
Take last 5 elements."""
