amount = int(input("Enter amount invested:"))

p = amount 

firstinterest = p * ( 1 + 7/100) ** 10
secondinterest = p * (1 + 7/100) ** 20
thirdinterest = p * (1 + 7/100) ** 30
print("The return in 10 years ", firstinterest)
print("The return in 20 years ", secondinterest)
print("The return in 30 years ", thirdinterest)