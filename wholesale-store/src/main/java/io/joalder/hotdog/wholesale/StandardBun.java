package io.joalder.hotdog.wholesale;

import io.joalder.hotdog.api.ingredients.Bun;

public class StandardBun implements Bun {
	@Override
	public int getQuality() {
		return 3;
	}
}
