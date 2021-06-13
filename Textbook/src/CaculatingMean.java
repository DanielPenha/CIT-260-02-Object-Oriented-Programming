public class CaculatingMean {
    public static void main(String[] args) {
        //int[] list = {2, 4, 7, 10};
        //System.out.println(java.util.Arrays.toString(list));
        // How to make a array

        double[] myArray = {3.5 , 4 , 6.1 , 6 , 7.5};
        double[] myList = new double[5];
        myList[0] = 3.5;
        myList[1] = 4;
        myList[2] = 6.1;
        myList[3] = 6;
        myList[4] = 7.5;

        System.out.println(java.util.Arrays.toString(myList));
        System.out.println(myList.length);

        double sum = myList[0] + myList[1] + myList[2] +
                myList[3] + myList[4];
        System.out.println(sum);
        System.out.println(sum/myList.length);
        double mean = sum / myList.length;
        System.out.printf("The mean of this set of numbers is %.2f\n\n", mean);
        System.out.println(java.util.Arrays.toString(myArray));

        // com loop
        for (int i = 0 ; i < myList.length ; i++){
            myList[0] = i;
            System.out.println(i);
        }

        //new array
        double[]  myList2 = new double[5];
        double average = 0;
        // call method
        //Mean(mo);
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList2.length + " values: ");
        for (int i = 0; i < myList2.length; i++)
            myList2[i] = input.nextDouble();
            //average = Mean(mo);
        System.out.println(java.util.Arrays.toString(myList2));

        //display
        for (int i = 0 ; i < myList2.length ; i++){
            System.out.println(myList2[i] + " ");
        }

        // summing all elements
        double total = 0;
        for (int i = 0 ; i < myList2.length ; i++){
            total += myList2[i];
            System.out.println(total);
        }


    }
    //method
    public static double Mean(double[] mo){
        double total2 = 0;
        for (double i: mo){
            total2 +=i;
            System.out.println(total2);
        }
        double average = total2 / mo.length;
        return average;
    }
}
