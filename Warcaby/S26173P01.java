package Checkers;

public class S26173P01 {
    public static void main(String[] args) {

        boolean playing = true;
        boolean turn = false;

        InputManager im = new InputManager();

        Board b = new Board();
        b.Draw();

        while(playing){
            System.out.println(turn ? "Its' black to move" : "It's white to move");
            im.WaitInput();
            if(b.UsedSquare(im.inputOriginX, im.inputOriginY)){
                Pieces p = b.GetPiece(im.inputOriginX, im.inputOriginY);
                if(p._color == turn){
                    p.Move(im.inputDestinationX, im.inputDestinationY);
                    turn = !turn;/*
                    if(b.ValidateMove(p.index, im.inputDestinationX, im.inputDestinationY)){
                    }
                    else
                        System.out.println("This is an invalid move");*/
                }
                else
                    System.out.println("You're trying to move your opponent's piece");
            }
            else
                System.out.println("You tried to move an empty square");
            b.Draw();
        }
    }
}
