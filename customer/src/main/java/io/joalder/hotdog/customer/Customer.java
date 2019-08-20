package io.joalder.hotdog.customer;

import io.joalder.hotdog.api.HotDog;
import io.joalder.hotdog.api.HotDogStand;
import org.apache.commons.lang3.StringUtils;

import java.util.ServiceLoader;

public class Customer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.eatHotDogs();
	}

	public void eatHotDogs() {
		System.out.println("Lookup HotDog stands");

		Iterable<HotDogStand> allHotDogStands = ServiceLoader.load(HotDogStand.class);

		for (HotDogStand hotdogStand: allHotDogStands) {
			visitHotDogStand(hotdogStand);
		}
	}

	private void visitHotDogStand(HotDogStand evilHotDogStand) {
		String visitingText = String.format("=> %s", evilHotDogStand.getName());
		System.out.println(StringUtils.leftPad(visitingText, 31));

		HotDog hotDog = evilHotDogStand.buyHotDog();

		String hotDogRating = String.format("Mhh.. Hot Dog! Tastes like a %d", hotDog.getQuality());
		System.out.println(hotDogRating);
		System.out.println();
	}
}
