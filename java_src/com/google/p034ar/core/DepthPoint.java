package com.google.p034ar.core;

import java.util.Collection;
/* renamed from: com.google.ar.core.DepthPoint */
/* loaded from: classes6.dex */
public class DepthPoint extends TrackableBase {
    public DepthPoint(long j, Session session) {
        super(j, session);
    }

    @Override // com.google.p034ar.core.TrackableBase, com.google.p034ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.p034ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.p034ar.core.TrackableBase, com.google.p034ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    @Override // com.google.p034ar.core.TrackableBase, com.google.p034ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.p034ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
