public class Main {
    public static void main(String[] args)  {
        //Нормальный массив
        String[][] array = {{"1","4","3","11"},
                            {"3","22","33","11"},
                            {"7","8","9","5"},
                            {"3","51","1","5",}};
        //Массив с некорректной ячейкой
        String[][] array1 = {{"1","4","3","11"},
                            {"3","22","33","11"},
                            {"7","8","bad","5"},
                            {"3","51","1","5",}};
        //Массив бОльшего размера чем требуется
        String[][] array2 = {{"1","4","3","11"},
                            {"3","22","33","11"},
                            {"7","8","9","5"},
                            {"7","8","9","5"},
                            {"3","51","1","5",}};
        //Массив меньшего размера чем требуется
        String[][] array3 = {{"1","4","3","11"},
                            {"3","22","33","11"},
                            {"3","51","1","5",}};

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            System.out.println("_____________________________________ \nНормальный массив");
            System.out.println("Summ of elements: " + arrayValueCalculator.doCalc(array));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("_____________________________________ \nМассив с некорректной ячейкой");
            System.out.println("Summ of elements: " + arrayValueCalculator.doCalc(array1));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("_____________________________________ \nМассив бОльшего размера чем требуется");
            System.out.println("Summ of elements: " + arrayValueCalculator.doCalc(array2));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("_____________________________________ \nМассив меньшего размера чем требуется");
            System.out.println("Summ of elements: " + arrayValueCalculator.doCalc(array3));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}