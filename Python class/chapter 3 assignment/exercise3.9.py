number = int(input("Enter 5 digits number:"))
reminder = number // 10000
number2 = number % 10000
reminder2 = number2 // 1000
number3 = number2 % 1000
reminder3 = number3 // 100
number4 = number3 % 100
reminder4 = number4 // 10
number5 = number4 % 10

print(f"{reminder} {reminder2} {reminder3} {reminder4} {number5}")