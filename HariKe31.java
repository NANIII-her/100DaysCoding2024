public class HariKe31 {
    
    public static void main(String[] args) {
        
        String tipe_byte = "50";
        byte a = Byte.parseByte(tipe_byte);
        System.out.println(a);

        String tipe_short = "30000";
        short b = Short.parseShort(tipe_short);
        System.out.println(b);

        String tipe_integer = "2875985";
        int c = Integer.parseInt(tipe_integer);
        System.out.println(c);

        String tipe_long = "2356927459";
        long d = Long.parseLong(tipe_long);
        System.out.println(d);

        String tipe_double = "923.8374";
        double e = Double.parseDouble(tipe_double);
        System.out.println(e);

        String tipe_float = "87265.283";
        float f = Float.parseFloat(tipe_float);
        System.out.println(f);

        String tipe_boolean = "True";
        boolean g = Boolean.parseBoolean(tipe_boolean);
        System.out.println(g);

    }
}
