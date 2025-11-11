class Parcel:
    def __init__(self, w, p):
        self.w, self.p = w, p
        self.r = p / w

def knapsack(cap, items):
    items.sort(key=lambda x: x.r, reverse=True)
    profit = 0
    for i in items:
        if cap <= 0: break
        take = min(1, cap / i.w)
        profit += i.p * take
        print(f"Take {take*100:.0f}% of Parcel(w={i.w}, p={i.p})")
        cap -= i.w * take
    print("Max Profit:", profit)

if __name__ == "__main__":
    data = [(10,60), (20,100), (30,120)]
    knapsack(50, [Parcel(w,p) for w,p in data])
