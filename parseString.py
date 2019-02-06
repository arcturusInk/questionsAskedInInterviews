#return the extension of the file

def parseString(fileName):
    ans = fileName.split(".")[-1]
    return ans

def main():
    fileNameOne = "Anaconda.exe"
    fileNameTwo = "Anaconda.exe.exe"
    fileNameThree = "Anaconda.py"
    print(parseString(fileNameThree))

if __name__ == "__main__":
    main()
