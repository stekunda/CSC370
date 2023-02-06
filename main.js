class AccessLevel {
    testAccess() {
        // The numbers in the array below can be replaced with other arbitrary numbers if needed
        let rights = [];
        // The minPermission value can be replaced with an arbitrary number if needed
        let minPermission = 18;
        let result = "";

        for (let i = 0; i < rights.length; i++) {
            if (rights[i] >= minPermission) {
                result += "A";
            } else {
                result += "D";
            }
        }
        return result;
    }
}
let testRun = new AccessLevel();
console.log(testRun.testAccess());
