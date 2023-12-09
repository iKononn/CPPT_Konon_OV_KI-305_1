package KI305.Konon.Lab4;
/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @version 1.0
 */

class SomeException extends Exception
{
    public SomeException(){}
    public SomeException(String cause)
    {
        super(cause);
    }
}