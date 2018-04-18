package io.joalder.hotdog.adversarial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import io.joalder.hotdog.api.HotDog;

public class AdversarialHotDogStandTest {

	@Test
	public void buyHotDog() {
		AdversarialHotDogStand veryBestHotDogStand = new AdversarialHotDogStand();

		HotDog hotDog = veryBestHotDogStand.buyHotDog();

		assertNotNull(hotDog);
	}

	@Test
	public void verifyHotDogQuality() {
		AdversarialHotDogStand veryBestHotDogStand = new AdversarialHotDogStand();

		HotDog hotDog = veryBestHotDogStand.buyHotDog();

		assertEquals(27, hotDog.getQuality());
	}
}