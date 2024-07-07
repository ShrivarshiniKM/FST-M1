"""Find Odd or Even number"""

number = int(input("enter any number :"))
mod = number % 2

if mod > 0:
    print(number, " is odd number")
else:
    print(number, " is even number")
