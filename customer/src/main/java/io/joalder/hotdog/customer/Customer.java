package io.joalder.hotdog.customer;

import java.util.stream.Stream;

import io.joalder.hotdog.adversarial.AdversarialHotDogStand;
import io.joalder.hotdog.api.HotDogStand;
import io.joalder.hotdog.best.VeryBestHotDogStand;

public class Customer {
	public static void main(String[] args){
		Customer customer = new Customer();
		customer.eatHotDogs();
	}

	public void eatHotDogs(){
		Stream.of(new AdversarialHotDogStand(), new VeryBestHotDogStand())
				.map(HotDogStand::buyHotDog)
				.forEach(hotDog -> System.out.println("Mhh.. Hot Dog! Tastes like a " + hotDog.getQuality()));
	}
}
