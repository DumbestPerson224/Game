public class Player{
    public int[] axis, scores = null;
    public String[] names = null;
    public int getPlayer1YAxis(){
        return axis[1];
    }

    public int getPlayer1XAxis(){
        return axis[0];
    }

    public int getPlayer2YAxis(){
        return axis[2];
    }

    public int getPlayer2XAxis(){
        return axis[3];
    }

    public int getPlayer1Score(){
        return scores[0];
    }

    public int getPlayer2Score(){
        return scores[1];
    }

    public void incrementPlayer1Score(){
        if(getPlayer1Score() < 10){
            scores[0]++;
        }
    }

    public void decrementPlayer1Score(){
        if(getPlayer1Score() > 0){
            scores[0]--;
        }
    }

    public void incrementPlayer2Score(){
        if(getPlayer2Score() < 10){
            scores[1]++;
        }
    }

    public void decrementPlayer2Score() {
        if (getPlayer2Score() > 0) {
            scores[1]--;
        }
    }

    public void incrementPlayer1XAxis(){
        if(getPlayer1XAxis() < 100) {
            axis[0]++;
        }
    }

    public void decrementPlayer1XAxis(){
        if(getPlayer1XAxis() > 0) {
            axis[0]--;
        }
    }

    public void incrementPlayer1YAxis(){
        if(getPlayer1YAxis() < 100) {
            axis[2]--;
        }
    }
};
