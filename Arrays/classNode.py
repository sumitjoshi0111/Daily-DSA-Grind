class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None

def insert(root, key):
    if root is None:
        return Node(key)
    if key < root.key:
        root.left = insert(root.left, key)
    elif key > root.key:
        root.right = insert(root.right, key)
    return root

def search(root, key):
    if root is None:
        return False
    if root.key == key:
        return True
    elif key < root.key:
        return search(root.left, key)
    else:
        return search(root.right, key)

def find_min(root):
    while root and root.left:
        root = root.left
    return root

def delete_node(root, key):
    if root is None:
        return root
    if key < root.key:
        root.left = delete_node(root.left, key)
    elif key > root.key:
        root.right = delete_node(root.right, key)
    else:
        if root.left is None:
            return root.right
        elif root.right is None:
            return root.left
        temp = find_min(root.right)
        root.key = temp.key
        root.right = delete_node(root.right, temp.key)
    return root

def inorder(root):
    if root:
        inorder(root.left)
        print(root.key, end=" ")
        inorder(root.right)

def preorder(root):
    if root:
        print(root.key, end=" ")
        preorder(root.left)
        preorder(root.right)

def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.key, end=" ")

def height(root):
    if root is None:
        return 0
    return 1 + max(height(root.left), height(root.right))

if __name__ == "__main__":
    root = None
    while True:
        print("\n--- BST Menu ---")
        print("1.Insert  2.Delete  3.Search  4.Inorder  5.Preorder  6.Postorder  7.Height  8.Exit")
        choice = int(input("Enter choice: "))
        if choice == 1:
            val = int(input("Enter value: "))
            root = insert(root, val)
        elif choice == 2:
            val = int(input("Enter value to delete: "))
            root = delete_node(root, val)
        elif choice == 3:
            val = int(input("Enter value to search: "))
            print("Found" if search(root, val) else "Not Found")
        elif choice == 4:
            print("Inorder:", end=" ")
            inorder(root); print()
        elif choice == 5:
            print("Preorder:", end=" ")
            preorder(root); print()
        elif choice == 6:
            print("Postorder:", end=" ")
            postorder(root); print()
        elif choice == 7:
            print("Height of Tree:", height(root))
        elif choice == 8:
            break
        else:
            print("Invalid choice!")
