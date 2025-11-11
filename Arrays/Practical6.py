"""Implement a hash table of size 10 and use the division method as a hash function. In case of a
collision, use chaining. Implement the following operations:
• Insert(key): Insert key-value pairs into the hash table.
• Search(key): Search for the value associated with a given key.
• Delete(key): Delete a key-value pair from the hash table"""


class Hashtable:

    def __init__(self):
        self.size=10
        self.table=[[] for _ in range(self.size)]


    def hash_Function(self,key):
        return key%self.size
    

    def insert(self,key,value):
        index=self.hash_Function(key)
        self.table[index].append((key,value))
        print("Data Inserted Succesfully")

    def delete(key,self):
       index=self.hash_Function(key)
       for item in self.table[index]:
           if self.table[0]==key:
               self.table[index].remove(item)
               print("Deleted Successfully")
               return
    print("Key not found")


    def search(self,key):
        index=self.hash_Fuction(key,self)
        for k, v in self.table[index]:
            if k==key:
                print(f"Found: key={k}, Value={v}")
                return
        print("key Not found")

    def display(self):
        for i in range(self.size):
            print(i,"->",end=" ")
            for k, v in self.table[i]:
                print(f"[{k},{v}]->", end=" ")
            print("NULL")
        

ht=Hashtable()

while True:
    print("\n1. Insert")
    print("2. Search")
    print("3. Delete")
    print("4. Display Table")
    print("5. Exit")

    choice = int(input("Enter choice: "))

    if choice == 1:
        key = int(input("Enter key: "))
        value = input("Enter value: ")
        ht.insert(key, value)

    elif choice == 2:
        key = int(input("Enter key to search: "))
        ht.search(key)

    elif choice == 3:
        key = int(input("Enter key to delete: "))
        ht.delete(key)

    elif choice == 4:
        ht.display()

    elif choice == 5:
        break

    else:
        print("Invalid choice")


