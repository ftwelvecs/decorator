package examples.decorator;

public class Rabbit extends SoulOfKoschei {

    private SoulOfKoschei soulOfKoschei;

    public Rabbit(SoulOfKoschei soulOfKoschei) {
        this.soulOfKoschei = soulOfKoschei;
    }

    public int getPower() {
        return soulOfKoschei.getPower() * 2;
    }
}
