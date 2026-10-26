def twoSum(number):
	if(number == 0):
		return 0
	
	elif (number % 9 == 0):
		return 9
	
	
	else:
		return number % 9
	
	
	
	
	
print(twoSum(48))
