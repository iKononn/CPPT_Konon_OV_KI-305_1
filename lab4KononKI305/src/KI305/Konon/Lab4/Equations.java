package KI305.Konon.Lab4;

class Equations {

    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            double ctg = (1 / Math.tan(8*rad));
            if (ctg == 0){
                throw new ArithmeticException("Ділення на нуль");
            }
            else if(x == 0) {
                throw new SomeException("x = 0");
            }
            y = (Math.sin(rad)/ctg);
        }
        catch (ArithmeticException | SomeException ex) {
            if (ex instanceof ArithmeticException) {
                throw new CalcException("Недопустиме значення при обчисленні виразу!");
            }
            else
                throw new CalcException("Помилка: " + ex.getMessage());
        }
        return y;

    }
}


