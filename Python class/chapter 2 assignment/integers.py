integer = int(input("Enter 5-integer integers:"))
integer1 = integer // 10000
reminder1 = integer % 10000
integer2 = reminder1 // 1000
reminder2 = reminder1 % 1000
integer3 = reminder2 // 100
reminder3 = reminder2 % 100
integer4 = reminder3 // 10
reminder4 = reminder3 % 10 

print(f"{integer1} {integer2} {integer3} {integer4} {reminder4}  ")