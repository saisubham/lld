package structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteTest {

    @Test
    public void setRadioVolume() {
        Device radio = new Radio();
        Remote remote = new Remote(radio);
        remote.volumeUp();
        remote.volumeUp();
        assertEquals(radio.getVolume(), 2);
    }

    @Test
    public void setTvChannel() {
        Device tv = new Tv();
        Remote remote = new Remote(tv);
        remote.channelDown();
        assertEquals(tv.getChannel(), -1);
    }

}
