public class SimpleDotComTestDrive {

    public static main name(String[] args) {
        SimpleDotcom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}



public class SimpleDotcom {
    int[] setLocationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
        
    }

    public String checkYouself(String stringGuess) {
        int guess = Inter.parseInt(stringGuess);
        String result = "miss";
        for(in cell : locationCells) {
            if(guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.lenght) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}