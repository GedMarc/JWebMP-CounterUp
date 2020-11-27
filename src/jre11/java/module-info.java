import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.counterup.CounterUpPageConfigurator;

module com.jwebmp.plugins.counterup {

	exports com.jwebmp.plugins.counterup;

	requires transitive com.jwebmp.core;

	provides IPageConfigurator with CounterUpPageConfigurator;

}
