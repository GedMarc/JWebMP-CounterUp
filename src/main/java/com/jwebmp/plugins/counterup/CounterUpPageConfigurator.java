/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.counterup;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;
import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "Counter Up",
        pluginDescription = "Counter-Up is a jQuery plugin that animates a number from zero (counting up towards it)." +
                " Simply add the class counterup to any component that has a number",
        pluginUniqueName = "counterup",
        pluginVersion = "1.0.0",
        pluginCategories = "display,counter",
        pluginSubtitle = "Counter-Up is a jQuery plugin that animates a number from zero (counting up towards it)",
        pluginSourceUrl = "https://github.com/bfintal/Counter-Up",
        pluginWikiUrl = "https://github.com/GedMarc/JWebMP-CounterUp/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebMP-CounterUp",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://github.com/bfintal/Counter-Up",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-jquery-counterup",
        pluginGroupId = "com.jwebmp.plugins.jquery",
        pluginArtifactId = "jwebmp-jquery-counterup",
        pluginModuleName = "com.jwebmp.plugins.counterup",
        pluginStatus = PluginStatus.Released
)
public class CounterUpPageConfigurator
        implements IPageConfigurator<CounterUpPageConfigurator> {
    /**
     * If this configurator is enabled
     */
    private static boolean enabled = true;

    /**
     * The default page configurator for counterup
     */
    public CounterUpPageConfigurator() {
        //Nothing Needed
    }

    /**
     * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
     */
    public static boolean isEnabled() {
        return CounterUpPageConfigurator.enabled;
    }

    /**
     * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
     */
    public static void setEnabled(boolean mustEnable) {
        CounterUpPageConfigurator.enabled = mustEnable;
    }


    /**
     * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
     * <p>
     * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page
     * via file://
     *
     * @return
     */
    @NotNull
    @Override
    public Page<?> configure(Page<?> page) {
        if (!page.isConfigured() && enabled()) {
            JQueryPageConfigurator.setRequired(true);
            page.getBody()
                    .addJavaScriptReference(CounterUpReferencePool.CounterUpCoreReference.getJavaScriptReference());
        }
        return page;
    }

    @Override
    public boolean enabled() {
        return CounterUpPageConfigurator.enabled;
    }

}
