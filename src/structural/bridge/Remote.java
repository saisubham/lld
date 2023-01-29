package structural.bridge;

public class Remote {
    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void volumeUp() {
        this.device.updateVolume(1);
    }

    public void volumeDown() {
        this.device.updateVolume(-1);
    }

    public void channelUp() {
        this.device.updateChannel(1);
    }

    public void channelDown() {
        this.device.updateChannel(-1);
    }
}
