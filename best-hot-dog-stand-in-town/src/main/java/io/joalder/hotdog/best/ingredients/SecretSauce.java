package io.joalder.hotdog.best.ingredients;

import io.joalder.hotdog.api.ingredients.Sauce;

public class SecretSauce implements Sauce {
	public SecretSauce() {
	}

	@Override
	public int getQuality() {
		return 5;
	}
}
