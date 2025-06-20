Map<Character, Integer> map = new HashMap<>();
String str = "teststring";
for (char c : str.toCharArray())
    map.put(c, map.getOrDefault(c, 0) + 1);
System.out.println(map);
