package Lab04;

public class JPA406 {
    public static void main(String[] argv) {
        int hours = 0;

        hours = 2;
        park(hours);
        System.out.println("--------------------");

        hours = 3;
        park(hours);
        System.out.println("--------------------");

        hours = 5;
        park(hours);
        System.out.println("--------------------");

        hours = 8;
        park(hours);
    }

    public static void park(int hours) {
        int[] hourTable = {0, 2, 4, 6};
        int[] feeTable = {30, 50, 80, 100};
        int fee = 0;

        for(int i=(hourTable.length-1) ; i>=0 ; i--){
            if(hours>hourTable[i]){
                fee+=(hours-hourTable[i])*feeTable[i];
                for(int j=i ; j>0 ; j--){
                    fee+=(hourTable[j]-hourTable[j-1])*feeTable[j-1];
                }
            break;
            }
        }
        System.out.println("停車時數：" + hours + "小時");
        System.out.println("應繳費用：" + fee + "元整");
    }
}
