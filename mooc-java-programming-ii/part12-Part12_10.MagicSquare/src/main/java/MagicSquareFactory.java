
public class MagicSquareFactory {
    private MagicSquare mS;

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        if (size % 2 == 0) {
            return square;
        }

        square.placeValue( size / 2, 0, 1);
        
        // square.placeValue(2, 2, 2);
        // square.placeValue(0, 1, 3);
        // square.placeValue(0, 2, 4);
        // square.placeValue(1, 1, 5);
        // square.placeValue(2, 0, 6);
        // square.placeValue(2, 1, 7);
        // square.placeValue(0, 0, 8);
        // square.placeValue(1, 2, 9);

        int row = 0;
        int col = size / 2;

        for (int i = 2; i <= square.getHeight() * square.getWidth(); i++) {
            int nextRow = row - 1;
            int nextCol = col + 1;
            if (nextRow < 0) nextRow = size - 1;
            if(nextRow == size) nextRow = 0;
            if (nextCol == size) nextCol = 0;

            if (square.readValue(nextCol, nextRow) == 0) {
                square.placeValue(nextCol, nextRow, i);
                col = nextCol;
                row = nextRow;
            }else {
                row++;
                square.placeValue(col, row, i);
            }
            
        }

        this.mS = square;
        return square;
    }

    public void print() {
        System.out.println(this.mS.toString());
    }
}
