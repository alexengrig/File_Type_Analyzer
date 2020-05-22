import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = number -> {
        long target = number + 1;
        while (target % 2 != 0) {
            target++;
        }
        return target;
    };
}