package io.joalder.hotdog.wholesale;

import io.joalder.hotdog.api.ingredients.Sausage;

public class StandardSausage implements Sausage {
	@Override
	public int getQuality() {
		return 3;
	}
}
