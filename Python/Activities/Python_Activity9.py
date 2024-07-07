list1 = [1, 2, 3, 4, 5]
list2 = [2, 4, 6, 1, 7, 9]

result = []

for i in list1:
    if i % 2 > 0:
        result.append(i)

for i in list2:
    if i % 2 == 0:
        result.append(i)


print(result)