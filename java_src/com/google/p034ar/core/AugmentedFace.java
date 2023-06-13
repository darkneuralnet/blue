package com.google.p034ar.core;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Collection;
/* renamed from: com.google.ar.core.AugmentedFace */
/* loaded from: classes6.dex */
public class AugmentedFace extends TrackableBase {
    private static final String TAG = "ARCore-AugmentedFace";
    private FloatBuffer normalsBuffer;
    private FloatBuffer textureCoordinatesBuffer;
    private ShortBuffer triangleIndicesBuffer;
    private FloatBuffer verticesBuffer;

    /* renamed from: com.google.ar.core.AugmentedFace$RegionType */
    /* loaded from: classes6.dex */
    public enum RegionType {
        NOSE_TIP(0),
        FOREHEAD_LEFT(1),
        FOREHEAD_RIGHT(2);
        
        final int nativeCode;

        RegionType(int i) {
            this.nativeCode = i;
        }
    }

    public AugmentedFace() {
        super(0L, null);
    }

    private native Pose nativeGetCenterPose(long j, long j2);

    private native ByteBuffer nativeGetMeshNormalsByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTextureCoordinatesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTriangleIndicesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshVerticesByteBuffer(long j, long j2);

    private native Pose nativeGetRegionPose(long j, long j2, int i);

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

    public FloatBuffer getMeshNormals() {
        return this.normalsBuffer;
    }

    public FloatBuffer getMeshTextureCoordinates() {
        return this.textureCoordinatesBuffer;
    }

    public ShortBuffer getMeshTriangleIndices() {
        return this.triangleIndicesBuffer;
    }

    public FloatBuffer getMeshVertices() {
        return this.verticesBuffer;
    }

    public Pose getRegionPose(RegionType regionType) {
        return nativeGetRegionPose(this.session.nativeWrapperHandle, this.nativeHandle, regionType.nativeCode);
    }

    @Override // com.google.p034ar.core.TrackableBase, com.google.p034ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.p034ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public void populateMeshData() {
        this.verticesBuffer = Session.directByteBufferOrDefault(nativeGetMeshVerticesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.normalsBuffer = Session.directByteBufferOrDefault(nativeGetMeshNormalsByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.textureCoordinatesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTextureCoordinatesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asFloatBuffer();
        this.triangleIndicesBuffer = Session.directByteBufferOrDefault(nativeGetMeshTriangleIndicesByteBuffer(this.session.nativeWrapperHandle, this.nativeHandle)).asShortBuffer();
    }

    public AugmentedFace(long j, Session session) {
        super(j, session);
        populateMeshData();
    }
}
