/*
 * Copyright (C) 2013
 *
 *  This file is part of Messic.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.messic.android.smartphone.activities.main.fragments.playlist;

import org.messic.android.smartphone.activities.Presenter;
import org.messic.android.messiccore.datamodel.MDMAlbum;
import org.messic.android.messiccore.datamodel.MDMPlaylist;
import org.messic.android.messiccore.datamodel.MDMSong;

import rx.Observable;

public interface PlaylistPresenter extends Presenter {

    Observable<MDMPlaylist> getPlaylists();

    void playAction(MDMSong song);

    void longPlayAction(MDMSong song);

    Observable<MDMAlbum> authorAction(MDMSong song);

    Observable<MDMAlbum> albumAction(MDMSong song);

    Observable<MDMAlbum> songAction(MDMSong song);

    void playlistAction(MDMPlaylist playlist);
}
