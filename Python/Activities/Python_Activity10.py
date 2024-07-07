numbers = tuple(input("Enter Numbers: ").split(","))

for i in numbers:
    if int(i)%5 == 0:
        print("Divisible by 5: ", i)
