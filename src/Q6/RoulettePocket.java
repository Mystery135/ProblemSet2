package Q6;
public class RoulettePocket{
    private String pocketColor;
    public RoulettePocket(int pocketNum){


        if (pocketNum < 0 || pocketNum > 36){
            throw new IllegalArgumentException("Invalid pocket number!");
        }
        if (pocketNum == 0){pocketColor = "green";}
        else if ((pocketNum <= 10) || (pocketNum >= 19 && pocketNum <= 28)){
            if (pocketNum % 2 == 0){
                pocketColor = "black";
            }else{
                pocketColor = "red";
            }
        }else{
            if (pocketNum % 2 == 0){
                pocketColor = "red";
            }else{
                pocketColor = "black";
            }
        }
    }
    public String getPocketColor(){return pocketColor;}

}