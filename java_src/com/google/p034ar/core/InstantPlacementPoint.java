package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
import java.util.Collection;
/* renamed from: com.google.ar.core.InstantPlacementPoint */
/* loaded from: classes6.dex */
public class InstantPlacementPoint extends TrackableBase {

    /* renamed from: com.google.ar.core.InstantPlacementPoint$TrackingMethod */
    /* loaded from: classes6.dex */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        SCREENSPACE_WITH_APPROXIMATE_DISTANCE(1),
        FULL_TRACKING(2);
        
        final int nativeCode;

        TrackingMethod(int i) {
            this.nativeCode = i;
        }

        public static TrackingMethod fromNumber(int i) {
            TrackingMethod[] values;
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            throw new FatalException("Unexpected value for native InstantPlacementPoint TrackingMethod Mode, value=" + i);
        }
    }

    public InstantPlacementPoint(long j, Session session) {
        super(j, session);
    }

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingMethod(long j, long j2);

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

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
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
