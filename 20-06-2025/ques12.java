int[] arr = {1, 5, 3, 9};
int max = arr[0];
for (int i : arr) {
    if (i > max) max = i;
}
System.out.println("Max: " + max);
