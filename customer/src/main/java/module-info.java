module io.joalder.hotdog.customer {
	requires io.joalder.hotdog.api;
	requires io.joalder.hotdog.best;
	requires io.joalder.hotdog.evil;
	requires org.apache.commons.lang3;  // Automatic-Module-Name of apache common lang3

	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.web;

	opens io.joalder.hotdog.customer to spring.core,spring.beans,spring.context;
	opens io.joalder.hotdog.customer.controllers to spring.beans, spring.web;
}