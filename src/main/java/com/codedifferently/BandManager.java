package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String currentPerson = "";
        String result = "";
        int counter = 0; // create a `counter
        while(counter < wuMemberArray.length)// while `counter` is less than length of array
        {   // begin loop
            // use `counter` to identify the `current Person` in the array
            result += wuMemberArray[counter].toString();
            counter++;
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

        }// end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        for(int i = 0; i < wuMemberArray.length; i++){

            result += wuMemberArray[i].toString();

        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for(WuMember wuMember : wuMemberArray){
            result += wuMember.toString();
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
