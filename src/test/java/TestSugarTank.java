import cm.domain.SugarTank;

public class TestSugarTank implements SugarTank {

    private String sugarAdding;

    @Override
    public void addSugar() {
        sugarAdding = "podaje porcje cukru z wlasnego mocka";
        System.out.println(sugarTankInfo);
    }

    public String getC() {
        return sugarAdding;
    }

}

