#return true if the str is a palindrome, return false if otherwise

def isPalindrome(str):
    str = str.lower()
    str = str.replace(" ","")
    for i in range(len(str)//2):
        if str[i] != str[len(str)-i-1]:
            return False
    return True

def main():
    strOne = "Anna"
    strTwo = "A Santa at Nasa"
    strThree = "LaLa Land"
    print(isPalindrome(strTwo))

if __name__ == "__main__":
    main()
