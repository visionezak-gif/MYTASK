

def replace_all_negative_numbers(numbers):

	for index in range(len(numbers)):
	
		if numbers[index] < 0:
		
			numbers[index] = 0
			
			return numbers
			
			
new_list = [1, -3, 4, 5,-3]			
			
result = replace_all_negative_numbers(new_list)

print(result)
