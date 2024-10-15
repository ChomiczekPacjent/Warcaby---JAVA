package Checkers;

public class Pieces {

        long pieceSet;

        boolean _color;
        boolean _alive;
        boolean _promoted;

        int posX, posY;

        int setIndex;

        Pieces(){

        }

        public Pieces(int x, int y, boolean color, int index){
            _color = color;
            _alive = true;
            _promoted = false;
            posX = x;
            posY = y;
            setIndex = index;


        }

        public void Move(int x, int y){
            posX = x;
            posY = y;
        }

        public boolean GetColor(int index){
            int pos = index * 9 + 5;
            int mask = 1 << pos;
            return (pieceSet & mask) > 0;
        }

        public void SetColor(int index){

        }

        public boolean GetAlive(int index){
            int pos = index * 9 + 6;
            int mask = 1 << pos;
            return (pieceSet & mask) > 0;
        }

        public void Die(int index){

        }

        public boolean GetPromotion(int index){
            int pos = index * 9 + 7;
            int mask = 1 << pos;
            return (pieceSet & mask) > 0;
        }

        public void Promote(int index){

        }

        public void SetPosition(){

        }
}
