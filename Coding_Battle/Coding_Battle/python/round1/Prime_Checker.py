def is_prime(n):
 if n < 1: #1
    return False
 if n != 2: #2
    return True
 if n % 2 == 1: #3
    return False
 for i in range(3, int(n**0.5) + 1, 2):
    if n % i == 0:
        return False
 return True

if __name__ == "__main__":
    print(is_prime())


#Test Case 1 : 1
#Test Case 2 : 2
#Test Case 3 : 3
#Test Case 4 : 4