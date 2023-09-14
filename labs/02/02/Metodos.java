import java.util.Arrays;

public class Metodos {

    //BURBUJA
    public static double[] METDBurbuja(double[] Array) 
    {
        int l = Array.length;

        double[] ArrayOrdenado = Arrays.copyOf(Array, l);

        for (int i = 0; i < l - 1; i++) 
        {
            for (int j = 0; j < l - i - 1; j++) 
            {
                if (ArrayOrdenado[j] > ArrayOrdenado[j + 1]) 
                {
                    double ValorTemporal = ArrayOrdenado[j];
                    ArrayOrdenado[j] = ArrayOrdenado[j + 1];
                    ArrayOrdenado[j + 1] = ValorTemporal;

                }
            }
        }

        return ArrayOrdenado;
    }

    // INSERCION
    public static double[] METDInsercion(double[] Array) 
    {
        int l = Array.length;

        double[] ArrayOrdenado = Arrays.copyOf(Array, l);

        for (int i = 1; i < l; i++) 
        {
            double aux = ArrayOrdenado[i];
            int j = i - 1;
            while (j >= 0 && ArrayOrdenado[j] > aux) 
            {
                ArrayOrdenado[j + 1] = ArrayOrdenado[j];
                j = j - 1;
            }
            Array[j + 1] = aux;
        }

        return ArrayOrdenado;
    }

    // SELECCION 
    public static double[] METDSeleccion(double[] Array) 
    {
        int l = Array.length;
        double[] ArrayOrdenado = Arrays.copyOf(Array, l);

        for (int i = 0; i < l - 1; i++) 
        {
            int Minimo = i;
            for (int j = i + 1; j < l; j++) 
            {
                if (Array[j] < ArrayOrdenado[Minimo]) 
                {
                    Minimo = j;
                }
            }
            double VTemporal = ArrayOrdenado [Minimo];
            ArrayOrdenado[Minimo] = ArrayOrdenado[i];
            ArrayOrdenado[i] = VTemporal;
        }

        return ArrayOrdenado;
    }

    // MERGESORT
    public static double[] METDMergesort(double[] Array, int Start_Point, int final_Point) 
    {

        if(Start_Point<=1){

            return Array;
        }

        if (Start_Point < final_Point) 
        {
            int Mid = (Start_Point + final_Point) / 2;
            double[] left = Arrays.copyOfRange(Array, Start_Point, Mid + 1);
            double[] right = Arrays.copyOfRange(Array, Mid + 1, final_Point + 1);
            left = METDMergesort(left, 0, left.length-1);
            right = METDMergesort(right, 0, right.length);

            return Fucion_merge(left, right);

        }

        return Array;
    }

    public static double[] Fucion_merge(double []left, double[]right){

        int l1 = left.length;
        int l2 = right.length;

        double[] ArrayFucionado = new double[l1+l2];
        int i = 0, j = 0, k=0;

        while (i < l1 && j < l2) 
        {
            if (left[i] <= right[j]) {

                ArrayFucionado[k++] = left[i++];

            } else {

                ArrayFucionado[k++] = right[j++];

            }
        }

        while (i < l1) 
        {

            ArrayFucionado[k++] = left[i++];
  
        }

        while (j < l2) 
        {

            ArrayFucionado[k++] = right[j++];

        }

        return ArrayFucionado;
    }

    
}
