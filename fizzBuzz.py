#Write a program that prints the numbers from 1 to 15.
#But for multiples of three print “Fizz” instead of the
#number and for the multiples of five print “Buzz”.
#For numbers which are multiples of both three and five print “FizzBuzz

def fizzBuzz(low, high):
    for num in range(low,high):
        if num % 3 == 0 and num % 5 == 0:
            print("FizzBuzz")
        elif num % 3 == 0:
            print("Fizz")
        elif num % 5 == 0:
            print ("Buzz")
        else:
            print (num)

def main():
    fizzBuzz(1,16)

if __name__ == "__main__":
    main()
