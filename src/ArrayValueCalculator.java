import java.util.stream.Stream;
public class ArrayValueCalculator {
    public int doCalc (String[][] array) throws ArraySizeException, ArrayDataException {
        int count = 0;
        int i = 0;
        int j = 0;
        int sizeOfArray = Stream.of(array).mapToInt(m -> m.length).sum();
            if (sizeOfArray!=16) throw new ArraySizeException("wrong size of array");

        try {
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    count += Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException  e) {
            throw new ArrayDataException(e, "wrong number at: [" + i + "] [" + j + "]");
        }
        return count;
    }
}
