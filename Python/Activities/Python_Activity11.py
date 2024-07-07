myDictionary = {"banana": 20, "apple": 30, "Orange": 80}

expectedFruit = input("enter fruit name: ")
if expectedFruit in myDictionary:
    print(expectedFruit+" fruit present")
else:
    print(expectedFruit+" fruit Not present")

# method 2
for x in myDictionary:
    if x == expectedFruit:
        print("grapes present")
    else:
        print(" expected fruit not present")
