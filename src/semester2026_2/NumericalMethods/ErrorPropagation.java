package semester2026_2.NumericalMethods;

public class ErrorPropagation {
    public double adicaoErroAbsoluto(double erroX, double erroY){
        double erroAbsoluto = erroX + erroY;
        return erroAbsoluto;
    }

    public double subtracacaoErroAbsoluto(double erroX, double erroY){
        double erroAbsoluto = erroX - erroY;
        return erroAbsoluto;
    }

    public double multiplicacaoErroAbsoluto(double xAprox, double erroRelativo){
        double erroX = xAprox * erroRelativo;
        return erroX;
    }

    public double divisaoErroAbsoluto(double xAprox, double yAprox, double erroX, double erroY){
        double resultado = (erroX / yAprox) + ((xAprox * erroY)/(yAprox * yAprox));
        return resultado;
    }

    public double adicaoErroAbsolutoTresVariaveis(double erroX, double erroY, double erroZ){
        double erroAbsoluto = erroX + erroY + erroZ;
        return erroAbsoluto;
    }
}
