package Q6;
public class RoulettePocket{
    private final String pocketColor;
    public RoulettePocket(int pocketNum){


        if (pocketNum < 0 || pocketNum > 36){//pocketNum has to be between 0 & 36 inclusive to be valid
            throw new IllegalArgumentException("Invalid pocket number!");
        }
        if (pocketNum == 0){pocketColor = "green";}
        else if ((pocketNum <= 10) || (pocketNum >= 19 && pocketNum <= 28)){
            if (pocketNum % 2 == 0){//If even, pocketColor = black, else red.
                pocketColor = "black";
            }else{
                pocketColor = "red";
            }
        }else{//pocketNum is between 11 & 18 or 29 & 36.
            if (pocketNum % 2 == 0){//If even, pocketColor = red, else black.
                pocketColor = "red";
            }else{
                pocketColor = "black";
            }
        }
    }
    public String getPocketColor(){return pocketColor;}

}