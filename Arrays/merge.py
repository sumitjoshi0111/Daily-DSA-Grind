def merge_sort(data):
    if len(data) > 1:
        mid = len(data)//2
        left, right = data[:mid], data[mid:]
        merge_sort(left)
        merge_sort(right)
        i = j = k = 0
        while i < len(left) and j < len(right):
            if left[i]['delivery_time_minutes'] < right[j]['delivery_time_minutes']:
                data[k] = left[i]; i += 1
            else:
                data[k] = right[j]; j += 1
            k += 1
        while i < len(left):
            data[k] = left[i]; i += 1; k += 1
        while j < len(right):
            data[k] = right[j]; j += 1; k += 1

if __name__ == "__main__":
    orders = [
        {'id':'A1','item':'Pizza','delivery_time_minutes':35},
        {'id':'B2','item':'Burger','delivery_time_minutes':20},
        {'id':'C3','item':'Pasta','delivery_time_minutes':45},
        {'id':'D4','item':'Sushi','delivery_time_minutes':25},
        {'id':'E5','item':'Tacos','delivery_time_minutes':30}
    ]
    print("Original Orders:")
    for o in orders: print(o)
    merge_sort(orders)
    print("\nSorted Orders:")
    for o in orders: print(o)
