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

import com.jwebmp.core.*;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.core.services.*;
import jakarta.validation.constraints.*;

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
@TsDependency(value = "jquery.counterup", version = "^2.1.0")
@NgScript("node_modules/jquery.counterup/jquery.counterup.js")
public class CounterUpPageConfigurator
        implements IPageConfigurator<CounterUpPageConfigurator> {
   
    @NotNull
    @Override
    public Page<?> configure(Page<?> page) {
        return page;
    }

    @Override
    public boolean enabled() {
        return true;
    }

}
