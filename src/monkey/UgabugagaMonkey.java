package monkey;

public class UgabugagaMonkey extends BaseMonkey{
    private final int DEBUFF = 1;
    private final int HEAL = 10;
    public UgabugagaMonkey(int maxHp,int atk,int def){
        super(maxHp,atk,def);
    }

    @Override
    public void attack(BaseMonkey m) {
        super.attack(m);
        m.setAtk(m.getAtk()-DEBUFF);
        m.setDef(m.getDef()-DEBUFF);
    }
    public void heal(BaseMonkey m){
        if(m.getHp()+HEAL <= m.getMaxHp()){
            m.setHp(m.getHp()+HEAL);
        }else{
            m.setHp(m.getMaxHp());
        }
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
