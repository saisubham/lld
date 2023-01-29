package structural.bridge;

public class Tv implements Device {
    private int volume;
    private int channel;

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void updateVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void updateChannel(int channel) {
        this.channel += channel;
    }
}
