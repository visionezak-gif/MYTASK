function twoSum(...number){
	if(number == 0){
		return 0;
	}
	else if (number % 9 == 0){
		return 9;
	}
	
	else{
		return number / -1 % 9;
	}
	
	
	}
	
console.log(twoSum(-247))
