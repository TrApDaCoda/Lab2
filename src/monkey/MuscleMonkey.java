package monkey;

public class MuscleMonkey extends BaseMonkey{
    private final int POWER_UP = 4;
    public MuscleMonkey(int maxHp, int atk, int def){
        super(maxHp,atk,def);
    }

    @Override
    public void attack(BaseMonkey m) {
        for(int i=0;i<2;i++) {super.attack(m);}
    }
    public void buff(){
        this.setAtk(this.getAtk()+POWER_UP);
        this.setDef(this.getDef()+POWER_UP);
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
