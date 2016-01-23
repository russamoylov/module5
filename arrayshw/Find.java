package arrayshw;

public class Find {
    private int min;
    public int getMin(int [] r){
        min = r[0];
        for (int i = 0; i < r.length - 1; i++)
            if (min > r[i + 1])
                min = r[i + 1];
        return min;
    }
    private int max;
    public int getMax(int [] r){
        max = r[0];
        for (int i = 0; i < r.length - 1; i++)
            if (max < r[i + 1])
                max = r[i + 1];
        return max;
    }
}
