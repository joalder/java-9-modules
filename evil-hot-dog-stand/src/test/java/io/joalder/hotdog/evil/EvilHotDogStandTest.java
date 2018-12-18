package io.joalder.hotdog.evil;

import io.joalder.hotdog.api.HotDog;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;

public class EvilHotDogStandTest {

	@Test
	public void buyHotDog() {
		EvilHotDogStand veryBestHotDogStand = new EvilHotDogStand();

		HotDog hotDog = veryBestHotDogStand.buyHotDog();

		assertNotNull(hotDog);
	}

	@Test
	public void verifyHotDogQuality() {
		EvilHotDogStand veryBestHotDogStand = new EvilHotDogStand();

		HotDog hotDog = veryBestHotDogStand.buyHotDog();

		assertEquals(27, hotDog.getQuality());
	}

	@Test
	public void mockitoTest() {
		EvilHotDogStand mockedHotDogStand = mock(EvilHotDogStand.class);

		verifyZeroInteractions(mockedHotDogStand);
	}
}