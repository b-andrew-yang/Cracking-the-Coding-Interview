def main():
    print(rotation("ll", "hello"))
    print(rotation("elloh", "hello"))
    print(rotation("waterbottle", "erbottlewat"))


def rotation(s1, s2):
    index = find_index(s1, s2)

    if index == -1:
        return False

    rot_string = s2[index:] + s2[:index]
    return isSubstring(s1, rot_string)


def find_index(s1, s2):
    for i in range(len(s1)):
        if(s2[i] == s1[0]):
            return i

    return -1


def isSubstring(s1, s2):
    return(s1 in s2)


if __name__ == '__main__':
    main()
