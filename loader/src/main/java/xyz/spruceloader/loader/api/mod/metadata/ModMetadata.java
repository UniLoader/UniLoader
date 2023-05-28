/*
 * This file is part of SpruceLoader.
 * Copyright (C) 2023  SpruceLoader & Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package xyz.spruceloader.loader.api.mod.metadata;

import org.jetbrains.annotations.Unmodifiable;

import java.util.Collections;
import java.util.List;

/**
 * @since 0.0.1
 */
public interface ModMetadata {
    String getId();
    String getDisplayName();
    String getDescription();
    String getVersion();

    default @Unmodifiable List<ModPerson> getModAuthors() {
        return Collections.emptyList();
    }
}