public class Source {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 2, 5};
        int[] arr2 = new int[]{1, 4, 4};
        System.out.println(findDifference(arr1,arr2)==14);
    }
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int a = 1;
        int b = 1;
        for (int j : firstCuboid) {
            a *= j;
        }
        for (int j : secondCuboid) {
            b *= j;
        }
        return Math.abs(a-b); // Math.abs(firstCuboid[0] * firstCuboid[1] * firstCuboid[2] -
       // secondCuboid[0] * secondCuboid[1] * secondCuboid[2]);
    }
}
