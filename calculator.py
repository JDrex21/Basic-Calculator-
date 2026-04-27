i = int(input("Enter first number: "))
j = int(input("Enter second number: "))

a = int(input("1. Addition\n2. Substraction\n3. Multiply\n4. Divide\nChoose the operator: "))

if a==1:
    print("The sum is: ", i+j)
elif a==2:
    print("The substraction is: ", i-j)
elif a==3:
    print("The multiplication is: ", i*j)
elif a==4:
    print("The division is: ", i/j)
else:
    print("Invalid input")
