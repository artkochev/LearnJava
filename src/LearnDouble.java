public class LearnDouble {
    public static void main(String[] args){
        System.out.println(doubleExpression(0.001, 0.002, 0.003));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        java.math.BigDecimal A = java.math.BigDecimal.valueOf(a);
        java.math.BigDecimal B = java.math.BigDecimal.valueOf(b);
        java.math.BigDecimal C = java.math.BigDecimal.valueOf(c);

        A = A.setScale(4,java.math.RoundingMode.HALF_DOWN);
        B = B.setScale(4,java.math.RoundingMode.HALF_DOWN);
        C = C.setScale(4,java.math.RoundingMode.HALF_DOWN);
        return  C.equals(A.add(B));
    }
}
