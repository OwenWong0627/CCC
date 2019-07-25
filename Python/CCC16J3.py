word = str(input())

def Palindromeverifier(word):
    check = True
    for i in range(len(word)):
        if word[i]==word[-i-1]:
            check = True
        else:
            check = False
            break
    return check

def checkPalindrome(string):
    lengthOfLongestPalindrome = 1
    length = len(string)
    for i in range(length):
        for a in range(length):
            if length - a >= i:
                if Palindromeverifier(word[i:length - a])==True:
                    if lengthOfLongestPalindrome< len(word[i:length - a]):
                        lengthOfLongestPalindrome = len(word[i:length - a])
    return lengthOfLongestPalindrome
print(checkPalindrome(word))