module io.joalder.hotdog.evil {
	requires io.joalder.hotdog.api;
	requires io.joalder.hotdog.wholesale;

	exports io.joalder.hotdog.evil;

	provides io.joalder.hotdog.api.HotDogStand with io.joalder.hotdog.evil.EvilHotDogStand;
}