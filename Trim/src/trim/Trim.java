/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trim;

/**
 *
 * @author 19301261
 */
public class Trim {

    public static char[] trim(char[] input) {
        char[] output = new char[input.length];
        int i = 0;
        int count = 0;
        for (int j = 0; j < input.length; j++) {
            if (input[j] != ' ') {
                count = 0;
                output[i] = input[j];
                i++;
            } else {
                count++;
            }
            if (count == 1) {
                output[i] = ' ';
                i++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        char[] input = {'T', 'h', 'i', 's', ' ', ' ', ' ', ' ', ' ', 'i', 's', ' ', ' ', ' ', ' ', 'a', ' ', ' ', ' ', ' ', 't', 'e', 's', 't', '.'};
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.println("");
        char[] output = trim(input);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }
        System.out.print(" ");

    }

}
