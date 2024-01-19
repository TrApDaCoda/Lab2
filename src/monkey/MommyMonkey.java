package monkey;

import application.*;

import  logic.game.*;

public class MommyMonkey extends BaseMonkey{
    public MommyMonkey (int hp,int atk,int def){
        super(hp,atk,def);
    }

    @Override
    public void attack(BaseMonkey m) {
        return;
    }

    public void birth(){
        BaseMonkey m = new BaseMonkey();
        GameSystem.getInstance().getMonkeyContainer().add(m);
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
