package monkey;

import java.util.*;

import logic.game.*;

public class Ape extends BaseMonkey{
    public Ape(int maxHp,int atk,int def){
        super(maxHp,atk,def);
    }

    @Override
    public void attack(BaseMonkey m) {
        super.attack(m);
    }
    public void attackAOE(){
        for(int i = 0;i < GameSystem.getInstance().getMonkeyContainer().size();i++){
            if(this.getAtk() > GameSystem.getInstance().getMonkeyContainer().get(i).getDef()){
                GameSystem.getInstance().getMonkeyContainer().get(i).setHp(GameSystem.getInstance().getMonkeyContainer().get(i).getHp() - (this.getAtk() - GameSystem.getInstance().getMonkeyContainer().get(i).getDef()));
            }
        }
    }

    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
