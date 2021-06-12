package examples.decorator;

public class Chest extends SoulOfKoschei {

    private SoulOfKoschei soulOfKoschei;

    public Chest(SoulOfKoschei soulOfKoschei) {
        this.soulOfKoschei = soulOfKoschei;
    }

    public int getPower() {
        return soulOfKoschei.getPower() * 2;
    }
}
