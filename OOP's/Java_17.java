// interfaces

public class Java_17 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("all 4 directions");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("front directions");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up down left right");
    }
}


