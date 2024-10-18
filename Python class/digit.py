numberR = int(input("Enter 3 digit number:"))
FirstD = numberR //100
ThirdD = numberR % 10
toSec = numberR // 10
SecondD = toSec % 10
print(ThirdD, SecondD, FirstD)
evenN = 0
oddN = 0
if FirstD % 2 == 0:
   evenN = evenN + 1
else:
    oddN = oddN + 1
if SecondD % 2 == 0:
   evenN = evenN + 1
else:
   oddN = oddN + 1
if ThirdD % 2 == 0:
   evenN = evenN + 1
else:
  oddN = oddN + 1
print("even is: ",evenN)
print("and odd is: ", oddN)