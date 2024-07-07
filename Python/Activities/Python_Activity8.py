numbers = list(input("Enter numbers").split(","))

if numbers[0] == numbers[len(numbers)-1]:
    pass
else:
    raise SystemExit
