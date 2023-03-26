package homework10.barrier;

import homework10.participiant.Participant;

public class Roadblock extends Barrier {
    private final int high;

    public Roadblock(int high) {
        this.high = high;
    }

    @Override
    public boolean going(Participant participant) {
        return participant.jumping(high);
    }
}
