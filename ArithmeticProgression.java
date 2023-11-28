import java.util.Scanner;

public class ArithmeticProgression
{

    private int _fM, _diff;
    public ArithmeticProgression(int fM, int diff)
    {
        _fM = fM;
        _diff = diff;
    }

    public void printGeneralSeries()
    {
        System.out.println("Formula: aN = fM + diff(n-1)");
    }

    public int memberCalculation(int n)
    {
        int aN = _fM + _diff * (n-1);

        return aN;
    }

    public float calculateN(int aN)
    {
        float n = (float) (aN - _fM  + _diff) / _diff;

        if(n % 1 == 0)
        {
            return n;
        }

        return 0;
    }
}
