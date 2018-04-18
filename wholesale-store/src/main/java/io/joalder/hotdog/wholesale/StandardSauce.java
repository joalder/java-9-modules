package io.joalder.hotdog.wholesale;

import io.joalder.hotdog.api.ingredients.Sauce;

public class StandardSauce implements Sauce {
	@Override
	public int getQuality() {
		return 3;
	}
}
