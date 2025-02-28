package DAY1;
public class datatype {
    public static void main(String[] args) {
        Double object = Double.valueOf("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object;

        System.out.println(a + b + c + d );
    }
    
}
