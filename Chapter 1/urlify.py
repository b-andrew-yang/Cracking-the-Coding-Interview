def main():
    print(replace_spaces("Mr John Smith"))
    print(replace_spaces("much ado about nothing      "))


def replace_spaces(s):
    s = s.strip()
    return s.replace(" ", "%20")

if __name__ == '__main__':
		main()	