public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte en byte: " + Byte.BYTES);
        System.out.println("Tipo byte en bits: " + Byte.SIZE);
        System.out.println("Valor máximo en byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo en byte: " + Byte.MIN_VALUE);

        // Short
        short numeroShort = 30000;
        System.out.println("Tipo Short en byte: " + Short.BYTES);
        System.out.println("Tipo Short en bits: " + Short.SIZE);
        System.out.println("Valor máximo en Short: " + Short.MAX_VALUE);
        System.out.println("Valor miínimo en Short: " + Short.MIN_VALUE);
    }
}
