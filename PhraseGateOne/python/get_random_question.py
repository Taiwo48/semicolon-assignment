import random
def get_random_question(Questions, answer):
	total = 10
	passed = 0
	failed = 0
	sign = "-"
	for count in range(10):
		random_number_one = random.randint(Questions, answer)
		random_number_two = random.randint(Questions, answer)
		if random_number_one > random_number_two:
			response = int(input(f"{random_number_one} {sign} {random_number_two}:"))
			answer = random_number_one - random_number_two
			if response == answer:
				passed += 1
			else:
				failed += 1			
	return (f"passed {passed}/{total}  failed {total - passed}/{total}")

print(get_random_question(1, 100))
	
 

