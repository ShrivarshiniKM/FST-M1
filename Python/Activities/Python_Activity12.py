def sum_of_numbers(n):
    print(n)
    if n:
        return n + sum_of_numbers(n - 1)
    else:
        return 0


total = sum_of_numbers(10)
print("sum of number : ", total)
