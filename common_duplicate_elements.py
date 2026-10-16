#common_duplicate_elements

def return_duplicates(numbers):
	duplicates = []
	for index in range(len(numbers)):
		for count in range (index + 1, len(numbers)):
			if numbers[index] == numbers[count]:
				duplicates.append(numbers[index])
	return duplicates
	
	
list_array = [45,60,3,0,67,2,45,3,22,0]
result = return_duplicates(list_array)

print(result)
