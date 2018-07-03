package io.joalder.hotdog.best;

public class ModulePathEnforcer {
	public static void enforce(Class<?> classToEnforce) {
		String moduleName = classToEnforce.getModule().getName();

		if (moduleName == null) {
			throw new RuntimeException("No module name defined, thus not running on module-path which is unsupported");
		}
	}
}
