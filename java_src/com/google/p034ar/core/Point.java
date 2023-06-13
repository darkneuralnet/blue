package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
import java.util.Collection;
/* renamed from: com.google.ar.core.Point */
/* loaded from: classes6.dex */
public class Point extends TrackableBase {

    /* renamed from: com.google.ar.core.Point$OrientationMode */
    /* loaded from: classes6.dex */
    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);
        
        private final int nativeCode;

        OrientationMode(int i) {
            this.nativeCode = i;
        }

        public static OrientationMode forNumber(int i) {
            OrientationMode[] values;
            for (OrientationMode orientationMode : values()) {
                if (orientationMode.nativeCode == i) {
                    return orientationMode;
                }
            }
            throw new FatalException("Unexpected value for native Point Orientation Mode, value=" + i);
        }
    }

    public Point() {
        super(0L, null);
    }

    private native int nativeGetOrientationMode(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

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

    public OrientationMode getOrientationMode() {
        return OrientationMode.forNumber(nativeGetOrientationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @Override // com.google.p034ar.core.TrackableBase, com.google.p034ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.p034ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Point(long j, Session session) {
        super(j, session);
    }
}
