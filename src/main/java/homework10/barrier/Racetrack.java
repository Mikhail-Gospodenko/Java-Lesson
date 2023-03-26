package homework10.barrier;

import homework10.participiant.Participant;

public class Racetrack extends Barrier{
    private final int length;
    public Racetrack(int length){
        this.length = length;
    }

    @Override
    public boolean going(Participant participant){
        return participant.running(length);
    }
}
