package io.joalder.hotdog.api;

import io.joalder.hotdog.api.ingredients.Bun;
import io.joalder.hotdog.api.ingredients.Sauce;
import io.joalder.hotdog.api.ingredients.Sausage;

public class HotDog {
	private final Bun bun;
	private final Sausage sausage;
	private final Sauce sauce;

	public HotDog(Bun bun, Sausage sausage, Sauce sauce) {
		this.bun = bun;
		this.sausage = sausage;
		this.sauce = sauce;
	}

	public int getBunQuality() {
		return bun.getQuality();
	}

	public int getSausageQuality() {
		return sausage.getQuality();
	}

	public int getSauceQuality() {
		return sauce.getQuality();
	}

	public int getQuality() {
		return getBunQuality() * getSausageQuality() * getSauceQuality();
	}
}
