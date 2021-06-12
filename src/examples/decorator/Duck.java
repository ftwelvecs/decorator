package examples.decorator;

public class Duck extends SoulOfKoschei {
    private SoulOfKoschei soulOfKoschei;

    public Duck(SoulOfKoschei soulOfKoschei) {
        this.soulOfKoschei = soulOfKoschei;
    }

    public int getPower() {
        return soulOfKoschei.getPower() * 2;
    }
}
