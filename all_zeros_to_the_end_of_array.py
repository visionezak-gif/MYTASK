def end_of_array(array):

    none_zero_values = []
    
    zero_values = []
    
    for value in array:
        if value == 0:
            zero_values.append(0)
        else:
            none_zero_values.append(value)
            
    return none_zero_values + zero_values
    
numbers = [5, 0, 3 ,0 ,2 ,0]
print(end_of_array([5, 0, 3 ,0 ,2 ,0]))	
