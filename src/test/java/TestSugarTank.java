import cm.domain.SugarTank;

public class TestSugarTank implements SugarTank {

    public String getC() {
        return c;
    }

    String c;

    @Override
    public void adSugar() {
        c= "podaje porcje cukru z wlasnego mocka";
        System.out.println(c);
    }

}

