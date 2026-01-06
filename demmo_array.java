class demmo_array
{
    public static void main(String[] args)
    {
        String s = "abcdefg";
        System.out.println(reverse(s));
    }

    public static String reverse(String s)
    {
        if (s.length() == 0)
            return "";

        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }
}
