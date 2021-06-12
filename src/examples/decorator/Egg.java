package examples.decorator;

public class Egg extends SoulOfKoschei {

    private SoulOfKoschei soulOfKoschei;

    public Egg(SoulOfKoschei soulOfKoschei) {
        this.soulOfKoschei = soulOfKoschei;
    }

    public int getPower() {
        return soulOfKoschei.getPower() * 2;
    }
}
