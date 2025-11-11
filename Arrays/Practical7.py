# Hash Table using Linear Probing

SIZE = 10

class HashTable:
    def __init__(self):
        self.table = [None] * SIZE

    def hash_function(self, key):
        return key % SIZE

    def insert(self, key):
        index = self.hash_function(key)

        for i in range(SIZE):
            new_index = (index + i) % SIZE
            if self.table[new_index] is None or self.table[new_index] == "DELETED":
                self.table[new_index] = key
                print("Inserted successfully")
                return
        
        print("Hash Table is full")

    def search(self, key):
        index = self.hash_function(key)

        for i in range(SIZE):
            new_index = (index + i) % SIZE
            if self.table[new_index] == key:
                print(f"Key {key} found at index {new_index}")
                return
            if self.table[new_index] is None:
                break

        print("Key not found")

    def delete(self, key):
        index = self.hash_function(key)

        for i in range(SIZE):
            new_index = (index + i) % SIZE
            if self.table[new_index] == key:
                self.table[new_index] = "DELETED"
                print("Key deleted")
                return
            if self.table[new_index] is None:
                break
        
        print("Key not found")

    def display(self):
        print("\nHash Table:")
        for i in range(SIZE):
            print(i, "->", self.table[i])


ht = HashTable()

while True:
    print("\n1. Insert")
    print("2. Search")
    print("3. Delete")
    print("4. Display")
    print("5. Exit")
    
    choice = int(input("Enter choice: "))

    if choice == 1:
        key = int(input("Enter key: "))
        ht.insert(key)

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
