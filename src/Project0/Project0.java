package Project0;

import javax.swing.*;

public class Project0 {

    public static void main(String[] args) {

        while (true) {
            //counter for lower and upper case e's
            int upperCounter = 0;
            int lowerCounter = 0;
            //dialog to ask for input
            String inputSentence = JOptionPane.showInputDialog(null, "Please enter a sentence.");
            //exit sequence
            if("Stop".equalsIgnoreCase(inputSentence)) {
                System.exit(0);
            }
            // check for lower and upper case e's
            for(int i = 0; i < inputSentence.length(); i++){
                if(inputSentence.charAt(i) == 'e'){
                    lowerCounter++;
                }
                else if(inputSentence.charAt(i) == 'E'){
                    upperCounter++;
                }
            }
            // message dialog with response
            JOptionPane.showMessageDialog(null, "The number of lower case e's: " +lowerCounter +" \nThe number of upper case E's: " +upperCounter);
        }
    }
}