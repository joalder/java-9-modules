package io.joalder.hotdog.best;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.joalder.hotdog.api.HotDog;

public class VeryBestHotDogStandTest {

	@Test
	public void buyHotDog() {
		VeryBestHotDogStand veryBestHotDogStand = new VeryBestHotDogStand();

		HotDog hotDog = veryBestHotDogStand.buyHotDog();

		assertNotNull(hotDog);
	}

	@Test
	public void verifyHotDogQuality() {
		VeryBestHotDogStand veryBestHotDogStand = new VeryBestHotDogStand();

		HotDog hotDog = veryBestHotDogStand.buyHotDog();

		assertEquals(45, hotDog.getQuality());
	}
}