package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
import java.util.Collection;
/* renamed from: com.google.ar.core.AugmentedImage */
/* loaded from: classes6.dex */
public class AugmentedImage extends TrackableBase {

    /* renamed from: com.google.ar.core.AugmentedImage$TrackingMethod */
    /* loaded from: classes6.dex */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        FULL_TRACKING(1),
        LAST_KNOWN_POSE(2);
        
        final int nativeCode;

        TrackingMethod(int i) {
            this.nativeCode = i;
        }

        public static TrackingMethod forNumber(int i) {
            TrackingMethod[] values;
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            throw new FatalException("Unexpected value for native TrackingMethod, value=" + i);
        }
    }

    public AugmentedImage(long j, Session session) {
        super(j, session);
    }

    private native Pose nativeGetCenterPose(long j, long j2);

    private native float nativeGetExtentX(long j, long j2);

    private native float nativeGetExtentZ(long j, long j2);

    private native int nativeGetIndex(long j, long j2);

    private native String nativeGetName(long j, long j2);

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

    public Pose getCenterPose() {
        return nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentX() {
        return nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentZ() {
        return nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public int getIndex() {
        return nativeGetIndex(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public String getName() {
        return nativeGetName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.forNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
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
