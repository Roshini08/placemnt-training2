int min = arr[0];
for (int i : arr) {
    if (i < min) min = i;
}
System.out.println("Min: " + min);
