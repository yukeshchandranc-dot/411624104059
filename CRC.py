def xor(a, b):
    result = ""
    for i in range(1, len(b)):
        if a[i] == b[i]:
            result += "0"
        else:
            result += "1"
    return result

def crc(data, div):
    n = len(div)
    data = data + "0" * (n - 1)
    temp = data[:n]

    for i in range(n, len(data)):
        if temp[0] == '1':
            temp = xor(temp, div) + data[i]
        else:
            temp = xor(temp, "0" * n) + data[i]

    if temp[0] == '1':
        temp = xor(temp, div)
    else:
        temp = xor(temp, "0" * n)

    remainder = temp
    codeword = data[:-(n - 1)] + remainder

    return remainder, codeword

# Input
data = input("Enter data: ")
div = input("Enter divisor: ")
received = input("Enter received codeword: ")

# Sender side
remainder, codeword = crc(data, div)
print("CRC Remainder:", remainder)
print("Final Codeword:", codeword)

# Receiver side
rem, _ = crc(received, div)

if rem == "0" * (len(div) - 1):
    print("No Error found")
else:
    print("Error found")