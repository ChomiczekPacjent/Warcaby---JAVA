package Checkers;

    public class Board {

        Pieces pieces[] = new Pieces[24];
        Utils utils = new Utils();

        Board(){
            //create pieces
            int pieceIndex = 0;
            for (int i = 0; i < 8; i++) {
                //Black pieces
                for (int j = 0; j < 3; j++) {
                    if (j % 2 == 0) {
                        if (i % 2 == 1) {
                            pieces[pieceIndex] = new Pieces(j, i, true, pieceIndex);
                            pieceIndex++;
                        }
                    }
                    else {
                        if(i % 2 == 0) {
                            pieces[pieceIndex] = new Pieces(j, i, true, pieceIndex);
                            pieceIndex++;
                        }
                    }

                }

                //White pieces
                for (int j = 5; j < 8; j++) {
                    if (j % 2 == 0) {
                        if (i % 2 == 1) {
                            pieces[pieceIndex] = new Pieces(j, i, false, pieceIndex);
                            pieceIndex++;
                        }
                    }
                    else {
                        if (i % 2 == 0) {
                            pieces[pieceIndex] = new Pieces(j, i, false, pieceIndex);
                            pieceIndex++;
                        }
                    }
                }
            }
        }

        Pieces GetPiece(int posX, int posY)
        {
            for (int i = 0; i < 24; i++) {
                if (pieces[i].posX == posX && pieces[i].posY == posY)
                    return pieces[i];
            }
            return null;
        }

        boolean UsedSquare(int posX, int posY)
        {
            for (int i = 0; i < 24; i++) {
                if (pieces[i].posX == posX && pieces[i].posY == posY)
                    return pieces[i]._alive;
            }
            return false;
        }

        public boolean ValidateMove(int pieceIndex, int posX, int posY){
            if(UsedSquare(posX, posY)){
                System.out.println("There is a piece where you want to move");
                return false;
            }

            Pieces p = pieces[pieceIndex];

            if(p._alive) {
                //If it's a pon
                if (!p._promoted) {
                    //Back
                    if (!p._color) {
                        if(p.posX +1 == posX && (p.posY + 1 == posY || p.posY - 1 == posY))
                            return true;
                        else if(p.posX +2 == posX && (p.posY + 2 == posY || p.posY - 2 == posY)){

                        }
                    }
                    //White
                    else {
                        if(p.posX -1 == posX && (p.posY + 1 == posX || p.posY - 1 == posX))
                            return true;
                        else if(p.posX -2 == posX && (p.posY + 2 == posY || p.posY - 2 == posY)){

                        }

                    }
                }
                //if dam
                else {

                }
            }

            return false;
        }

        public void Draw(){

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    //Check if there is a piece
                    if (UsedSquare(i, j))
                    {
                        Pieces p = GetPiece(i, j);
                        if(p._promoted)
                            System.out.print(p._color ?  utils.blackDam : utils.whiteDam);
                        else
                            System.out.print(p._color ? utils.blackPon : utils.whitePon);
                    }

                    else
                    {
                        if (j % 2 == 0)
                            System.out.print((i % 2 == 1) ? utils.blackSquare : utils.whiteSquare);
                        else
                            System.out.print((i % 2 == 1) ? utils.whiteSquare : utils.blackSquare);
                    }
                }
                System.out.println();
            }
        }
    }

