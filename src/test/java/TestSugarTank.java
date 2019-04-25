import cm.domain.SugarTank;

public class TestSugarTank implements SugarTank {

    private String c;

    @Override
    public void addSugar() {
        c= "podaje porcje cukru z wlasnego mocka";
        System.out.println(c);
    }

    public String getC() {
        return c;
    }

}

