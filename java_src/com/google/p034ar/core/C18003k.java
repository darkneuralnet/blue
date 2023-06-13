package com.google.p034ar.core;

import com.google.p034ar.core.dependencies.AbstractC17987a;
import com.google.p034ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
/* renamed from: com.google.ar.core.k */
/* loaded from: classes6.dex */
final class C18003k extends AbstractC17987a {

    /* renamed from: a */
    final /* synthetic */ ArImage f73814a;

    /* renamed from: b */
    private final long f73815b;

    /* renamed from: c */
    private final int f73816c;

    public C18003k(ArImage arImage, long j, int i) {
        this.f73814a = arImage;
        this.f73815b = j;
        this.f73816c = i;
    }

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        Session session;
        ByteBuffer nativeGetBuffer;
        ArImage arImage = this.f73814a;
        session = arImage.f73721b;
        nativeGetBuffer = arImage.nativeGetBuffer(session.nativeWrapperHandle, this.f73815b, this.f73816c);
        return nativeGetBuffer.asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        Session session;
        int nativeGetPixelStride;
        ArImage arImage = this.f73814a;
        session = arImage.f73721b;
        nativeGetPixelStride = arImage.nativeGetPixelStride(session.nativeWrapperHandle, this.f73815b, this.f73816c);
        if (nativeGetPixelStride != -1) {
            return nativeGetPixelStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        Session session;
        int nativeGetRowStride;
        ArImage arImage = this.f73814a;
        session = arImage.f73721b;
        nativeGetRowStride = arImage.nativeGetRowStride(session.nativeWrapperHandle, this.f73815b, this.f73816c);
        if (nativeGetRowStride != -1) {
            return nativeGetRowStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }
}
