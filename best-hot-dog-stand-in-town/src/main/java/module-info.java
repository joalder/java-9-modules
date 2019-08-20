module io.joalder.hotdog.best {
	requires io.joalder.hotdog.api;
	requires io.joalder.hotdog.wholesale;

	exports io.joalder.hotdog.best;

	provides io.joalder.hotdog.api.HotDogStand with io.joalder.hotdog.best.VeryBestHotDogStand;
}