'''
If a number is a multiple of 2, print out
the string “Upper”. If a number is a multiple of 3, print out the string “Line”. And if a number
is a multiple of both 2 AND 3, print out the string “UpperLine”.
@param num - takes in a number as an argument
'''

def multiple(num):
    if num % 2 == 0 and num % 3 == 0:
        print ("UpperLine")
    elif num % 2 == 0:
        print ("Upper")
    elif num % 3 == 0:
        print ("Line")

def main():
    #for testing purposes
    for i in range(1,21):
        multiple(i)

if __name__ == "__main__":
    main()
