package KI305.Konon.Lab5;
/**
 * Class <code>Equations</code> implements method for  y=tg(x)ctg(2x) expression calculation
 * @version 1.0
 */
class Equations
{
    public double calculate(double x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try
        {
            double ctg = (1 / Math.tan(8*rad));
            if (ctg == 0)
                throw new ArithmeticException();
            y = (Math.sin(rad)/ctg);
        }
        catch (ArithmeticException ex)
        {
            if ((1 / Math.tan(8*rad)) == 0)
                throw new CalcException("Недопустиме значення при обчислені значення знаменника!");
            else
                throw new CalcException("Інша причина винятку!");
        }
        return y;
    }
}