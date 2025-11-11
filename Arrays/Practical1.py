#  In an e-commerce system, customer account IDs are stored in a list, and you are tasked with
# writing a program that implements the following:
# a) Linear Search: Check if a particular customer account ID exists in the list.
# b)Binary Search: Implement Binary search to find if a customer account ID exists,
# a) Improving the search efficiency over the basic linear



def Linear_Search(ids,key):
    
    for i in  range(0,len(ids)-1):
        if(ids[i]==key):
            return True
    return False

def binary_search(ids,key):
    low=0
    high=len(ids)-1

    while low<=high:
        mid=(low+high)//2

        if(ids[mid]==key):
            return True
        else:
            if(key<ids[mid]):
                high=mid-1
            else:
                low=mid+1
    return False




ids = list(map(int, input("Enter customer IDs (sorted): ").split()))
    
key=int(input("Enter Customer Id to search"))

if Linear_Search(ids,key):
    print("Customer Id found using Linear Search")

else:
    print("customer Id Not found using Linear search")



if binary_search(ids,key):
    print("Customer Id found Using Binary Search")

else:
    print("Customer Id not found using Binary Search")