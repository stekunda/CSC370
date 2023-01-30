class RunLengthEncode:
    def encode(self, givenString):
        newString = ""
        i = 0
        count = 1

        while i < len(givenString) - 1:
            newString = newString + givenString[i]
            if givenString[i] == givenString[i + 1]:
                count = count + 1
            if count > 4:
                newString = newString.replace(givenString[i], '')
                if count/10 < 1:
                    newString = newString + '/' + '0' + \
                        str(count) + givenString[i]
                else:
                    newString = newString + '/' + str(count) + givenString[i]
                newString = newString.replace(givenString[i], '', 1)
                count = 1
            i = i + 1
        newString = newString + givenString[len(givenString) - 1]
        return newString


myString = RunLengthEncode()
givenString = 'aaaaahurrre'
print(myString.encode(givenString))
