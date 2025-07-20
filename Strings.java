class Strings{
    public static void main(String[] args) {
        String str = "college";
        String strr = "ACE ENGINEERING COLLEGE  ";
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.equals(strr));
        System.out.println(str.equalsIgnoreCase(strr));
        System.out.println(str.compareTo(strr));
        System.out.println(strr.toLowerCase());
        System.out.println(strr.toUpperCase());
        String[] words = strr.split(" ",1);
        for(String s : words){
            System.out.println(s);
        }
        System.out.println(String.join("#",str,strr));
        // string concat
        System.out.println(str.concat(strr));
        System.out.println(str+strr);
        // String match
        System.out.println(str.matches(strr));
        System.out.println(strr.contains(str));

         System.out.println(strr.replace("E","e"));
         System.out.println(strr.replaceAll("E","e"));
        String s = strr.replaceFirst("E","e");

        char[] a = s.toCharArray();
        for(char i : a){
            System.out.print(i+" ");
        }
        System.out.println(strr.substring(6));
        System.out.println("With out Using Reg:"+strr.matches("E"));
        System.out.println("With Using Reg:"+strr.matches(".*E*."));
        System.out.println(strr.indent(5));
        System.out.println(strr.indent(5).strip());
        System.out.println(strr.indent(5).stripLeading());
        System.out.println(strr.indent(5).stripTrailing());

        System.out.println(strr.valueOf(3));
        Integer n = 148321;
        System.out.println(n.toString());
       
        System.out.println(strr.repeat(3));
        System.out.println(strr.indexOf("E"));
        System.out.println(strr.lastIndexOf("E"));
        
        String s1 = "abc";
        String s2 = "acb";
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}