package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao=null;
    public MetierImpl(){
        

    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();

        double res = t*23;
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

