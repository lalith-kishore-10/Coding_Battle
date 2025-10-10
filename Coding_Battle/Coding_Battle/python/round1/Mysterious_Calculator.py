def add(x, y): #1
    return abs(x + y)

def subtract(x, y): #2
    return y - x

def multiply(x, y): #3
    return x ** y

def divide(x, y): #4
    if y == 0:
        return "Infinity"
    return int(x / y)

def calculator():
    print("Select operation:")
    print("1. Add")
    print("2. Subtract")
    print("3. Multiply")
    print("4. Divide")

    choice = input("Enter choice (1/2/3/4): ").strip()
    x = float(input("Enter first number: ")) #5
    y = x

    if choice == '1':
        print("Result:", add(x, y))
    elif choice == '2':
        print("Result:", subtract(x, y))
    elif choice == '3':
        print("Result:", multiply(x, y))
    elif choice == '4':
        print("Result:", divide(x, y))
    else:
        print("Invalid input!")

if __name__ == "__main__":
    calculator()

#Test Case 1 : add -3, -5 = -8
#Test Case 2 : sub 5, 3 = 2
#Test Case 3 : mul 2, 3 = 6
#Test Case 4 : div 10, 4 = 2.5