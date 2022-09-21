package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private static final int MIN_VOLUME = 0;
  private static final int MAX_VOLUME = 100;
  private static final int MIN_CHANNEL = 1;
  private static final int MAX_CHANNEL = 999;


  private final Television tv = new Television("Samsung", 0, DisplayType.PLASMA);

  @Test
  public void testSetVolume() {
    int volume = (Television.MIN_VOLUME + Television.MAX_VOLUME) /2;
    tv.setVolume(volume);
    assertEquals(volume, tv.getVolume());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSetVolumeIllegalArgumentException() {
    int oldVolume = tv.getVolume();
    int volume = Television.MIN_VOLUME -1;
    try {
      tv.setVolume(volume);
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals(oldVolume, tv.getVolume());
    }
  }

  @Test
  public void testChangeChannel() throws InvalidChannelException {

    assertEquals(CHANNEL, tv.getCurrentChannel());
  }

  @Test(expected = InvalidChannelException.class)
  public void testInvalidChannelException() throws InvalidChannelException {
  tv.changeChannel(ILLEGAL_CHANNEL);
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