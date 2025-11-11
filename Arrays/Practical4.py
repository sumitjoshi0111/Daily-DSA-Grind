"""Implement a real-time event processing system using a Queue data structure. The system should
support the following features:
• Add an Event: When a new event occurs, it should be added to the event queue.
• Process the Next Event: The system should process and remove the event that has been in the
queue the longest.
• Display Pending Events: Show all the events currently waiting to be processed.
• Cancel an Event: An event can be canceled if it has not been processed"""

print("***********Welcome to Event Processing System*************")

event_queue=[]

def Add_Event():
    print("-------------------------------------------------------------")
    new_ev=input("Enter Event Name:")
    event_queue.append(new_ev)
    print('NEW Event Added Successfuly')
    print("-------------------------------------------------------------")

def Process_Event():
    if event_queue:
        print("-------------------------------------------------------------")
        ev_process=event_queue.pop(0)
        print(ev_process,"  is Processing")
        print("Event processed Successfuly")
        print("-------------------------------------------------------------")

def Display():
    print("-------------------------------------------------------------")
    print("Events:")
    for i in event_queue:
        print(i)
    print("-------------------------------------------------------------")

def cancel_Event():
    print("-------------------------------------------------------------")
    if not event_queue:
        print("No Event to cancel")
    
    event=input('Enter Event to cancel')

    if event in event_queue:
        event_queue.remove(event)
        print("Event Canceled Successfuly")
    else:
        print("Event not Found")
    print("-------------------------------------------------------------")



while True:
    print("-------------------------------------------------------------")
    print('Menu')
    print("1.Add Event")
    print("2.Process_Event")
    print("3.Display")
    print("4.Cancel Event")
    print("5.Exit")
    print("-------------------------------------------------------------")

    ch=int(input("Enter Your Choice:"))

    if (ch==1):
        Add_Event()
    elif (ch==2):
        Process_Event()
    elif (ch==3):
        Display()
    elif (ch==4):
        cancel_Event()
    elif (ch==5):
        break
    else:
        print("Invalid Choice Entered")

"""Queue used:

FIFO structure. Events are processed in the same order they arrive.

Add Event

Append at the end of queue.

Process Event

Pop from index 0, because it is the oldest event.

Display Events

Just print all elements of the queue.

Cancel Event

If the event is still in the queue, remove it.
If already processed, it won’t appear."""