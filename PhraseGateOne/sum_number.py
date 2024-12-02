import random

result = int(input("Enter sum of integers :"))

random_integer = random.randint(1 , 100)

sum_integer = random_integer + random_integer

if result == sum_integer:
	print("True")
else:
	print("False")