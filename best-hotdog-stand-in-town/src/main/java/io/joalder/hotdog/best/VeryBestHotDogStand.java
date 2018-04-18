package io.joalder.hotdog.best;

import io.joalder.hotdog.api.ingredients.Bun;
import io.joalder.hotdog.api.HotDog;
import io.joalder.hotdog.api.HotDogStand;
import io.joalder.hotdog.api.ingredients.Sauce;
import io.joalder.hotdog.api.ingredients.Sausage;
import io.joalder.hotdog.best.ingredients.SecretSauce;
import io.joalder.hotdog.wholesale.StandardBun;
import io.joalder.hotdog.wholesale.StandardSausage;

public class VeryBestHotDogStand implements HotDogStand {
	@Override
	public HotDog buyHotDog() {
		return makeHotDog();
	}

	private HotDog makeHotDog() {
		Bun bun = new StandardBun();
		Sausage sausage = new StandardSausage();
		Sauce sauce = new SecretSauce();

		return new HotDog(bun, sausage, sauce);
	}

	@Override
	public long getPriceOfHotDog() {
		return 10;
	}
}
