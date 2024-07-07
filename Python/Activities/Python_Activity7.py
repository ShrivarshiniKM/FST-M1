numbers = list(input("enter numbers :").split(","))

# numbers = [1, 2, 3, 4, 5, 6]

temp = 0
for i in numbers:
    temp += int(i)

print("total ", temp)


