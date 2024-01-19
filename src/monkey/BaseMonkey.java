package monkey;

import java.util.Objects;

public class BaseMonkey {
    private int maxHP;
    private int hp;
    private int atk;
    private int def;

    public BaseMonkey(){
        this.maxHP = 30;
        this.hp = maxHP;
        this.atk = 20;
        this.def = 5;
    }
    public BaseMonkey(int maxHP,int atk,int def){
        setMaxHP(maxHP);
        setHp(maxHP);
        setAtk(atk);
        setDef(def);
    }
    public void attack(BaseMonkey m){
        if(this.atk > m.getDef()){
        m.setHp(m.getHp() - (this.atk - m.getDef()));
        }
    }

    public String getType(){
        return getClass().getSimpleName();
    }
    public String toString(){
        return getType() + "hp=" + this.hp + ", atk=" + this.atk + ", def=" + this.def;
    }

    public int getMaxHp() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP < 0 ? 0 : maxHP;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        //this.hp = hp < 0 ? 0 : hp;
        if(hp >= 0 && hp <= this.maxHP){
            this.hp = hp;
        }else if (hp > this.maxHP){
            this.hp = maxHP;
        }else{
            this.hp  = 0;
        }
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk < 0 ? 0 : atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def < 0 ? 0 : def;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseMonkey that = (BaseMonkey) o;
        return maxHP == that.maxHP && hp == that.hp && atk == that.atk && def == that.def;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxHP, hp, atk, def);
    }
}
