package com.google.p034ar.core;

import java.util.Collection;
/* renamed from: com.google.ar.core.Trackable */
/* loaded from: classes6.dex */
public interface Trackable {
    Anchor createAnchor(Pose pose);

    Collection<Anchor> getAnchors();

    TrackingState getTrackingState();
}
