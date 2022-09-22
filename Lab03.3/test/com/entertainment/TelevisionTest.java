package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private final Television tv1 = new Television("Samsung", 0, DisplayType.OLED);

  @Test
  public void testSetVolume() {
    int volume = (Television.MIN_VOLUME + Television.MAX_VOLUME) /2;
    tv1.setVolume(volume);
    assertEquals(volume, tv1.getVolume());
  }

  @Test
  public void testSetVolumeIllegalArgumentException() {
    int oldVolume = tv1.getVolume();
    int volume = Television.MIN_VOLUME -1;
    try {
      tv1.setVolume(volume);
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals(oldVolume, tv1.getVolume());
    }
  }

  @Test
  public void testChangeChannel() throws InvalidChannelException {
    int channel = (Television.MIN_CHANNEL + Television.MAX_CHANNEL) /2;
    tv1.changeChannel(channel);
    assertEquals(channel, tv1.getCurrentChannel());
  }

  @Test(expected = InvalidChannelException.class)
  public void testInvalidChannelException() {
  tv1.setVolume(Television.MIN_VOLUME-1);
  }

  @Test
  public void testCompareTo() {
    Television tv2 = new Television("Sony");
    assertTrue(tv.compareTo(tv2) < 0);
  }

  @Test
  public void testHashCode() {
    fail("hashcode not implemented");
  }

  @Test
  public void testEquals() {
    fail("testEquals not implemented");
  }
}