package org.schabi.newpipe.local.holder;

import android.view.ViewGroup;

import org.schabi.newpipe.R;
import org.schabi.newpipe.local.LocalItemBuilder;

public class RemotePlaylistGridItemHolder extends RemotePlaylistItemHolder {
    public RemotePlaylistGridItemHolder(final LocalItemBuilder infoItemBuilder,
                                        final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
