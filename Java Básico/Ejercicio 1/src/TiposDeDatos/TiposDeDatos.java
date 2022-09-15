package TiposDeDatos;

public class TiposDeDatos {
    public static void main(String[] args) {
        System.out.println("-- Números enteros --");
        byte var1 = 1;
        short var2 = 20;
        int var3 = 3515;
        long var4 = 460520;
        System.out.println("byte: " + var1);
        System.out.println("short: " + var2);
        System.out.println("int: " + var3);
        System.out.println("long: " + var4 + "\n");

        System.out.println("-- Números decimales --");
        float var5 = 3.5f;
        double var6 = 55.275d;
        System.out.println("float: " + var5);
        System.out.println("double: " + var6 + "\n");

        System.out.println("-- Texto --");
        char var7 = 'a';
        String var8 = "Hola!";
        System.out.println("char: " + var7);
        System.out.println("String: " + var8 + "\n");

        System.out.println("-- Booleano --");
        boolean var9 = true;
        boolean var10 = false;
        System.out.println("boolean: " + var9);
        System.out.println("boolean: " + var10);
    }
}
