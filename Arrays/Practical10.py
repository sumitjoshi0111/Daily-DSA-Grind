class Node:
    def __init__(self, city, population):
        self.city = city
        self.population = population
        self.left = None
        self.right = None


class CityBST:
    def __init__(self):
        self.root = None

    # Insert city
    def insert(self, node, city, population):
        if node is None:
            return Node(city, population)

        if city.lower() < node.city.lower():
            node.left = self.insert(node.left, city, population)
        else:
            node.right = self.insert(node.right, city, population)

        return node

    # Search city with comparison count
    def search(self, node, city):
        comparisons = 0
        while node:
            comparisons += 1

            if city.lower() == node.city.lower():
                return True, node, comparisons

            if city.lower() < node.city.lower():
                node = node.left
            else:
                node = node.right

        return False, None, comparisons

    # Find minimum node (for delete)
    def find_min(self, node):
        while node.left:
            node = node.left
        return node

    # Delete city
    def delete(self, node, city):
        if node is None:
            return None

        if city.lower() < node.city.lower():
            node.left = self.delete(node.left, city)
        elif city.lower() > node.city.lower():
            node.right = self.delete(node.right, city)
        else:
            if node.left is None and node.right is None:
                return None
            if node.left is None:
                return node.right
            if node.right is None:
                return node.left

            temp = self.find_min(node.right)
            node.city = temp.city
            node.population = temp.population
            node.right = self.delete(node.right, temp.city)

        return node

    # Update population
    def update_population(self, city, new_pop):
        found, node, comp = self.search(self.root, city)
        if found:
            node.population = new_pop
            return True
        return False

    # Display ascending (inorder)
    def inorder(self, node):
        if node:
            self.inorder(node.left)
            print(f"{node.city} --> {node.population}")
            self.inorder(node.right)

    # Display descending
    def reverse_inorder(self, node):
        if node:
            self.reverse_inorder(node.right)
            print(f"{node.city} --> {node.population}")
            self.reverse_inorder(node.left)


# Main menu
bst = CityBST()

while True:
    print("\n1. Add City")
    print("2. Delete City")
    print("3. Update Population")
    print("4. Display Cities Ascending")
    print("5. Display Cities Descending")
    print("6. Search City (also show comparisons)")
    print("7. Exit")

    choice = int(input("Enter choice: "))

    if choice == 1:
        city = input("Enter city name: ")
        pop = int(input("Enter population: "))
        bst.root = bst.insert(bst.root, city, pop)
        print("City added")

    elif choice == 2:
        city = input("Enter city to delete: ")
        bst.root = bst.delete(bst.root, city)
        print("Deleted if existed")

    elif choice == 3:
        city = input("Enter city name: ")
        new_pop = int(input("Enter updated population: "))
        if bst.update_population(city, new_pop):
            print("Population updated")
        else:
            print("City not found")

    elif choice == 4:
        print("Cities in ascending order:")
        bst.inorder(bst.root)

    elif choice == 5:
        print("Cities in descending order:")
        bst.reverse_inorder(bst.root)

    elif choice == 6:
        city = input("Enter city name: ")
        found, node, comp = bst.search(bst.root, city)
        if found:
            print(f"Found. Population = {node.population}")
        else:
            print("Not found")
        print(f"Maximum comparisons done: {comp}")

    elif choice == 7:
        print("Exiting...")
        break

    else:
        print("Invalid choice")
