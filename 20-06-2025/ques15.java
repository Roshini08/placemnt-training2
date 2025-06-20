Map<Integer, Integer> freq = new HashMap<>();
for (int i : arr) {
    freq.put(i, freq.getOrDefault(i, 0) + 1);
}
System.out.println(freq);
