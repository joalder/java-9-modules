package io.joalder.hotdog.customer;

import io.joalder.hotdog.api.HotDog;
import io.joalder.hotdog.api.HotDogStand;
import io.joalder.hotdog.best.VeryBestHotDogStand;
import io.joalder.hotdog.evil.EvilHotDogStand;

public class Customer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.eatHotDogs();
	}

	public void eatHotDogs() {
		EvilHotDogStand evilHotDogStand = new EvilHotDogStand();
		VeryBestHotDogStand veryBestHotDogStand = new VeryBestHotDogStand();

		visitHotDogStand(evilHotDogStand);
		visitHotDogStand(veryBestHotDogStand);
	}

	private void visitHotDogStand(HotDogStand evilHotDogStand) {
		System.out.println(String.format("Going to '%s'", evilHotDogStand.getName()));
		HotDog hotDog = evilHotDogStand.buyHotDog();
		System.out.println(String.format("Mhh.. Hot Dog! Tastes like a %d", hotDog.getQuality()));
	}
}
