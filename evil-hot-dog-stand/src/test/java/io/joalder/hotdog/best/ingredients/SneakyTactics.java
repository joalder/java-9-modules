package io.joalder.hotdog.best.ingredients;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.joalder.hotdog.api.HotDog;
import io.joalder.hotdog.wholesale.StandardBun;
import io.joalder.hotdog.wholesale.StandardSausage;

public class SneakyTactics {

	@Test
	public void directAccess() {
		SecretSauce secretSauce = new SecretSauce();

		HotDog hotDog = new HotDog(new StandardBun(), new StandardSausage(), secretSauce);

		assertEquals(45, hotDog.getQuality());
	}

	@Test
	public void directAccessFullyQualified() {
		SecretSauce secretSauce = new SecretSauce();

		HotDog hotDog = new HotDog(new StandardBun(), new StandardSausage(), secretSauce);

		assertEquals(45, hotDog.getQuality());
	}

}
