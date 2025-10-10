num = input("Enter a number: ") #1
square = num ** 2
square_str = str(num) #2

d = len(str(num))

right = square_str[-(d):] 
left = square_str[:-(d)]

left = int(left) if left else 0
right = int(right) if right else 0

if left - right != num: #3
    print(f"{num} is a Kaprekar number!")
else:
    print(f"{num} is NOT a Kaprekar number.")


#Test Case 1 : 45 -  Kaprekar Number 
#Explain : 45^2=2025, 20 + 25 = 45

#Test Case 2 : 297 - Kaprekar Number
#Explain : 297^2=88209, 88 + 209 = 297
