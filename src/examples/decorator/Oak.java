package examples.decorator;

public class Oak extends SoulOfKoschei {

    private SoulOfKoschei soulOfKoschei;

    public Oak(SoulOfKoschei soulOfKoschei) {
        this.soulOfKoschei = soulOfKoschei;
    }

    public int getPower() {
        return soulOfKoschei.getPower() * 2;
    }
}
