package model;

public class Pokemon {
    private String name;
    private int life;
    private int basicAttack;
    private String especialAttackName;
    private int especialAttack;

    public Pokemon(String name, int life, int basicAttack, String especialAttackName, int especialAttack) {
        this.name = name;
        this.life = life;
        this.basicAttack = basicAttack;
        this.especialAttack = especialAttack;
        this.especialAttackName = especialAttackName;
    }


    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public String getEspecialAttackName() {
        return especialAttackName;
    }

    public int getEspecialAttack() {
        return especialAttack;
    }
}


