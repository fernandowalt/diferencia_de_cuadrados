public class DifferenceOfSquaresCalculator {


    public int computeSquareOfSumTo(int numero) {
        return (int) Math.pow(((numero) * (numero + 1) ) / 2, 2);
    }

    public int computeSumOfSquaresTo(int numero) {
        return numero * ((2 * numero) + 1) * (numero + 1) / 6;
    }

    public int computeDifferenceOfSquares(int numero) {
        return this.computeSquareOfSumTo(numero) - this.computeSumOfSquaresTo(numero);
    }
}
