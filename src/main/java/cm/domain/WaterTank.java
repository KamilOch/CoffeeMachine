package cm.domain;

public class WaterTank {

    private void openWaterValve (){
        System.out.println("otwieram zawor wody");
    }


    public void giveWate() {
        openWaterValve();
        System.out.println("podaje wode");
    }
}
