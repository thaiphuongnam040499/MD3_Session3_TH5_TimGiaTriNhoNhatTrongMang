public class TimGiaTriNhoNhatCuaMang {
    public static void main(String[] args) {
        int[] array = {4,12,7,8,1,6,9};
        int index =minValue(array);
        System.out.println("Phan tu nho nhat la"+array[index]);
    }
    public static int minValue(int[] array){
        int index =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<array[index]){
                index = i ;
            }
        }
        return index;
    }
}
