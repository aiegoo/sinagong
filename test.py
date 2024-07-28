x = input('입력 :')
print(f"Input received: {x}")

a = ['abc123', 'def456', 'ghi789']
print(f"Initial list: {a}")

a.append(x)
print(f"List after appending input: {a}")

a.remove('def456')
print(f"List after removing 'def456': {a}")

print(f"Slice of a[1]: {a[1][-3:]}")
print(f"Slice of a[2]: {a[2][:-3]}")
print(a[1][-3:], a[2][:-3], sep=',')

for i in range(3, 6):
    print(f"Current value of i: {i}", end ='')
print()  # For better formatting in the output