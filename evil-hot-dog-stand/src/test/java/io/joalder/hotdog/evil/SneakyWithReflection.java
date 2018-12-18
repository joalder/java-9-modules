package io.joalder.hotdog.evil;

import io.joalder.hotdog.api.HotDog;
import io.joalder.hotdog.api.ingredients.Sauce;
import io.joalder.hotdog.wholesale.StandardBun;
import io.joalder.hotdog.wholesale.StandardSausage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SneakyWithReflection {

	@Test
	public void loadByClassLoader() throws Exception {

		Class clazz = SneakyWithReflection.class.getClassLoader().loadClass("io.joalder.hotdog.best.ingredients.SecretSauce");
		Sauce secretSauce = (Sauce) clazz.getConstructor().newInstance();

		HotDog hotDog = new HotDog(new StandardBun(), new StandardSausage(), secretSauce);

		assertEquals(45, hotDog.getQuality());
	}
}
