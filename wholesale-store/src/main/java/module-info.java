module io.joalder.hotdog.wholesale {
	requires io.joalder.hotdog.api;

	exports io.joalder.hotdog.wholesale;

	provides io.joalder.hotdog.api.ingredients.Sauce with io.joalder.hotdog.wholesale.StandardSauce;
	provides io.joalder.hotdog.api.ingredients.Bun with io.joalder.hotdog.wholesale.StandardBun;
	provides io.joalder.hotdog.api.ingredients.Sausage with io.joalder.hotdog.wholesale.StandardSausage;
}