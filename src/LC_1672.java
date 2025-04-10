public class LC_1672 {
    public static void main(String[] args) {
       // int [][] accounts = {{1,2,3},{3,2,1}};
        int [][] accounts = {{1,5},{7,3},{3,5}};
        int max = 0;
            for (int i = 0; i < accounts.length; i++){
                int maxWealth = 0;
                for (int j = 0; j < accounts[i].length; j++){
                    maxWealth += accounts[i][j];

                }
                if (maxWealth > max){
                    max = maxWealth;
                }
            }
        System.out.println(max);
    }
}
