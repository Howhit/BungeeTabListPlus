/*
 *
 *  * BungeeTabListPlus - a bungeecord plugin to customize the tablist
 *  *
 *  * Copyright (C) 2014 Florian Stober
 *  *
 *  * This program is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * This program is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package codecrafter47.bungeetablistplus.api;

import codecrafter47.bungeetablistplus.skin.Skin;

public interface ITabList {
    String getHeader();

    void setHeader(String header);

    String getFooter();

    void setFooter(String footer);

    int getRows();

    int getColumns();

    int getUsedSlots();

    Slot getSlot(int n);

    Slot getSlot(int row, int column);

    void setSlot(int n, Slot s);

    void setSlot(int row, int column, Slot s);

    int getDefaultPing();

    void setDefaultPing(int defaultPing);

    int getSize();

    Skin getDefaultSkin();

    void setDefaultSkin(Skin defaultSkin);
}
