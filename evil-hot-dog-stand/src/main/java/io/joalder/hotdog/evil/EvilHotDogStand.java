package io.joalder.hotdog.evil;

import io.joalder.hotdog.api.HotDog;
import io.joalder.hotdog.api.HotDogStand;
import io.joalder.hotdog.api.ingredients.Bun;
import io.joalder.hotdog.api.ingredients.Sauce;
import io.joalder.hotdog.api.ingredients.Sausage;
import io.joalder.hotdog.wholesale.StandardBun;
import io.joalder.hotdog.wholesale.StandardSauce;
import io.joalder.hotdog.wholesale.StandardSausage;

public class EvilHotDogStand implements HotDogStand {
	@Override
	public String getName() {
		return "Evil Hot Dog Stand";
	}

	@Override
	public HotDog buyHotDog() {
		return makeHotDog();
	}

	private HotDog makeHotDog() {
		Bun bun = new StandardBun();
		Sausage sausage = new StandardSausage();
		Sauce sauce = new StandardSauce();

		return new HotDog(bun, sausage, sauce);
	}
}
