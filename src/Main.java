import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] massiv = new int[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();

            integers.add(random.nextInt(0, 2));
            arrayList.add(random.nextInt(0, 2));
            massiv[i] = random.nextInt(0, 2);

        }

        System.out.println(integers);
        sort(integers);
        System.out.println("\n"+arrayList);
        sort(arrayList);
        System.out.println("\n"+Arrays.toString(massiv));
        sort(massiv);


    }

    public static void sort(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        for (Integer integer : arrayList) {
            System.out.print(integer+" ");
        }
    }
    public static void sort(LinkedList<Integer> integers){
        Collections.sort(integers);
        for (Integer integer : integers) {
            System.out.print(integer+" ");
        }
    }
    public static void sort(int[] massiv){
        Arrays.sort(massiv);
        for (int i : massiv) {
            System.out.print(i+" ");
        }
    }

}
