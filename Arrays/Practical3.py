"""Implementing a real-time undo/redo system for a text editing application using a Stack data
structure. The system should support the following operations:
• Make a Change: A new change to the document is made.
• Undo Action: Revert the most recent change and store it for potential redo.
• Redo Action: Reapply the most recently undone action.
• Display Document State: Show the current state of the document after undoing or redoing an
action"""


print("*************Welcome to Text Editing Application******************")
document="Sumit Anandrao Joshi"
undo_stack=[]
redo_stack=[]

def make_change():
    global document
    new_text=input("Enter new text:")
    undo_stack.append(document)
    document=new_text

def undo():
    global document

    if undo_stack:
        redo_stack.append(document)
        document=undo_stack.pop()
        undo_stack.clear()
        print("Undo Operation Done")
        print("-------------------------------------------------------------")
    else:
        print("Cannot do Undo operation")
        print("-------------------------------------------------------------")

def redo():
    global document
    if redo_stack:
        undo_stack.append(document)
        document=redo_stack.pop()
        
        print("Redo operstion Done")
        print("-------------------------------------------------------------")
    else:
        print("Cannot do redo operation")
        print("-------------------------------------------------------------")


def Display():
    global document
    print("Document:\n", document)
    print("-------------------------------------------------------------")
while True:
    print("-------------------------------------------------------------")

    print("MENU")
    print("1.Make change in document")
    print("2.Undo")
    print("3.Redo")
    print("4.Display")
    print("5.Exit")
    print("-------------------------------------------------------------")

    ch=int(input("Enter Choice:"))

    if(ch==1):
        make_change()

    elif(ch==2):
        undo()
    elif(ch==3):
        redo()
    elif(ch==4):
        Display()
    elif(ch==5):
        break

    else:
        print("Invalid Choice Entered")
