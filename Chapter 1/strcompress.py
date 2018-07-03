def main():
    print(string_compress("aaabbddcc"))
    print(string_compress("jjjwwimmmmllssscc"))
    print(string_compress("string"))
    print(string_compress("aaaaaaaaaab"))

def string_compress(s):
    compressed = ""
    highCount = 0
    counter = 0

    currLetter = s[0]

    for char in s:
        if(char == currLetter):
            counter += 1
        else:
            compressed += currLetter + str(counter)
            currLetter = char
            counter = 1
        if(counter > highCount):
            highCount = counter

    if(highCount <= 1):
        return s
    else:
        compressed += currLetter + str(counter)
        return compressed


if __name__ == '__main__':
	main()