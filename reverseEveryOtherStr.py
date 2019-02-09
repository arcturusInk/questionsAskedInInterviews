#if string "abc.def.ghi.jkl.mno" is passed in, do the following
#so that the function returns this: "abc.fed.ghi.lkj.mno"

def reverseEveryOtherStr(str):
    newStr = []
    str = str.split(".")
    change = False
    for s in str:
        if change:
            for i in range(len(s)):
                newStr.append(s[len(s)-i-1])
        else:
            newStr.append(s)
        change = not change
        if s != str[-1]:
            newStr.append(".")
    return ''.join(newStr)

def main():
    str = "abc.def.ghi.jkl.mno"
    print(reverseEveryOtherStr(str))

if __name__ == "__main__":
    main()
