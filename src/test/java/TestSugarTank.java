import cm.domain.SugarTank;

public class TestSugarTank implements SugarTank {

    private String sugarAdding;

    @Override
    public void addSugar() {
        sugarAdding = "podaje porcje cukru z wlasnego mocka";
        System.out.println(sugarAdding);
    }

    public String putSugar() {
        return sugarAdding;
    }

}

