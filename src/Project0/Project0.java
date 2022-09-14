package Project0;

import javax.swing.*;

public class Project0 {

    public static void main(String[] args) {


        while (true) {

            int upperCounter = 0;
            int lowerCounter = 0;

            String inputSentence = JOptionPane.showInputDialog(null, "Please enter a sentence.");

            if("Stop".equalsIgnoreCase(inputSentence)) {
                System.exit(0);
            }

            for(int i = 0; i < inputSentence.length(); i++){
                if(inputSentence.charAt(i) == 'e'){
                    lowerCounter++;
                }
                else if(inputSentence.charAt(i) == 'E'){
                    upperCounter++;
                }
            }
            JOptionPane.showMessageDialog(null, "The number of lower case e's: " +lowerCounter +" \nThe number of upper case E's: " +upperCounter);
        }
    }
}