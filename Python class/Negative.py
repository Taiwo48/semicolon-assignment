negative = 0
positive = 0
zero = 0

for i in range(5):
     number = float(input("enter number{}: ".format(i+1)))

     if number < 0:
           negative += 1
     elif number > 0:
          positive += 1
     else:
          zero += 1

print("\nNegative number:", negative)
print("positive numbers:", positive)
print("Zeros:", zero)