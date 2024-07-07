//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1.Write a Java program to test if the first and the last element of an array of
        //integers are same. The length of the array must be greater than or equal to 2
        //array = 50, -20, 0, 30, 40, 60, 10;

        //START
//        ArrayList<Integer> myArrayList=new ArrayList<>();
//        myArrayList.add(50);
//        myArrayList.add(-20);
//        myArrayList.add(0);
//        myArrayList.add(30);
//        myArrayList.add(40);
//        myArrayList.add(60);
//        myArrayList.add(10);
//        if (myArrayList.size()>=2){
//            if (myArrayList.getFirst()==myArrayList.getLast()){
//                System.out.println(true);
//            }else {
//                System.out.println(false);//false
//            }
//        }
        //END

        //2.Write a Java program to find the numbers greater than the average of the
        //numbers of a given array
        //[1, 4, 17, 7, 25, 3, 100]

        //START
//        double average=0;
//        int sum=0;
//        ArrayList<Integer> newArry=new ArrayList<>();
//        int[] arr= {1, 4, 17, 7, 25, 3, 100};
//        int num=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//        }
//        average=sum/arr.length;
//        for (int j = 0; j <arr.length ; j++) {
//            if (arr[j]>average){
//                newArry.add(arr[j]);
//            }
//        }
//        System.out.println("The average of the said array is: "+average+" The numbers in the said array that are \n" +
//                "greater than the average are: "+newArry);
        //END



//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers

        //START
//        ArrayList<Integer> larg=new ArrayList<>();
////        [20, 30, 40]
//        larg.add(20);
//        larg.add(30);
//        larg.add(40);
//        if (larg.getFirst()>larg.getLast()){
//            System.out.println(larg.getFirst());
//        }else {
//            System.out.println("Larger value between first and last element: "+larg.getLast());
//        }
        //END


        //4.Write a Java program to swap the first and last elements of an array and
        //create a new array.
        //[20, 30, 40]

        //START
//       ArrayList<Integer> swap=new ArrayList<>();
//        swap.add(20);
//        swap.add(30);
//        swap.add(40);
//        ArrayList<Integer> firstAnd2nd =new ArrayList<>();
//       int first=0;
//       int last=0;
//        first=swap.getFirst();
//        last=swap.getLast();
//        int indexFirst=swap.indexOf(first);
//        int indexLast=swap.indexOf(last);
//        swap.set(indexFirst,last);
//        swap.set(indexLast,first);
//        System.out.println(swap);//[40, 30, 20]

        //END

        //5. Write a program that places the odd elements of an array before the
        //even elements.

        //START

//        int[] places={2,3,40,1,5,9,4,10,7};
//        int[] newArray=new int[places.length];
//        for (int i = 0; i < places.length; i++) {
//            if (places[i]%2==0){
//                newArray[i]=places[i];
//            }else {
//                newArray[i]=places[i];
//            }
//        }
//        System.out.println(Arrays.toString(newArray));//[2, 3, 40, 1, 5, 9, 4, 10, 7]
        //END

        //6. Write a program that test the equality of two arrays.
        //[2,3,6,6,4] [2,3,6,6,4]

        //START
//        int[] first= {2,3,6,6,4};
//        int[] secend={2,3,6,6,4};
//        boolean equal =true;
//        for (int i=0; i<first.length;i++){
//            if (first[i]!=secend[i]){
//                equal =false;
//                break;
//            }
//        }
//        System.out.println(equal);//true
        //END
    }
}