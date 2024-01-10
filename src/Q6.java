public class Q6 {
    private String packetColor;

    public static void main(String[] args) {
        System.out.println("");
    }


    public class RoulettePocket{
        public RoulettePocket(int pocketNum){
            if (pocketNum < 1 || pocketNum > 36){
                throw new IllegalArgumentException("Invalid pocket number");
            }
            if ((pocketNum <= 10) || (pocketNum >= 19 && pocketNum <= 28) || (pocketNum >= 29)){
                if (pocketNum % 2 == 0){
                    packetColor = "black";
                }else{
                    packetColor = "red";
                }
            }else{
                if (pocketNum % 2 == 0){
                    packetColor = "red";
                }else{
                    packetColor = "black";
                }
            }
        }

    }

}
