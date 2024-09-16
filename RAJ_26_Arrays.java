public class RAJ_26_Arrays {
    public static void main(String[] args) {
        /*Classroom of 500 students- You have to store marks of these 500 students
        you have 2 options -:
        a. Create 500 variables.
        b. Use Arrays ( recommended)
         */
        int [] marks = new int [51];
        marks [0] = 90;
        marks [1] = 89;
        marks [2] = 95;
        marks [3] = 88;
        marks [4] = 82;
        //any already assigned value ina array can be changed.
        marks [4] = 80;
        System.out.println(marks[4]);
        //trying to access arrays beyond allocated value will throw error.
        //System.out.println(marks[55]);
        /*There are 3 main ways to create arrays in java :
        1. Declarationa and memory allocation.
        2. Declarationa and then memory allocation.
        3. Declaration, memory allocation and Initialization together.
         */
        //Declare, memory allocation and Initialization together.
        int [] num = {515,4,5,87,541,1,65,78,89};
        System.out.println(num[5]);
    }
}
