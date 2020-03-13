package battleship;

public class SimpleDotCom{
    int[] locatinCells;
    int numOfHits = 0;
    
    public void setLocatinCells(int[] locs){
        locatinCells = locs;
    }
    
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        
        for (int cell: locatinCells){
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        
        if (numOfHits == locatinCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}