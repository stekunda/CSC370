class RunLengthEncode {
    encode(givenString) {
        let newString = "";

        for (let i = 0; i < givenString.length; i++) {
            let counter = 1;
            while (
                i < givenString.length - 1 &&
                givenString[i] == givenString[i + 1]
            ) {
                counter++;
                i++;
            }

            if (counter > 4) {
                if (counter / 10 < 1) {
                    newString =
                        newString + "/" + "0" + counter + givenString[i];
                } else {
                    newString = newString + "/" + counter + givenString[i];
                }
            } else {
                for (let j = 0; j < counter; j++) {
                    newString = newString + givenString[i];
                }
            }
        }
        return newString;
    }
}

let myString = new RunLengthEncode();
console.log(myString.encode("aaaaahurrre"));
