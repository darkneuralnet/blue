package com.google.p034ar.core;

import android.graphics.Rect;
import android.media.Image;
import com.google.p034ar.core.dependencies.AbstractC17988b;
import com.google.p034ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.ArImage */
/* loaded from: classes6.dex */
public class ArImage extends AbstractC17988b {

    /* renamed from: a */
    long f73720a;

    /* renamed from: b */
    private final Session f73721b;

    /* renamed from: c */
    private final long f73722c;

    public ArImage(Session session, long j) {
        this.f73721b = session;
        this.f73720a = j;
        this.f73722c = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native ByteBuffer nativeGetBuffer(long j, long j2, int i);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetPixelStride(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetRowStride(long j, long j2, int i);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    public static native void nativeLoadSymbols();

    @Override // android.media.Image, java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.f73722c, this.f73720a);
        this.f73720a = 0L;
    }

    @Override // android.media.Image
    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // android.media.Image
    public final int getFormat() {
        int nativeGetFormat = nativeGetFormat(this.f73721b.nativeWrapperHandle, this.f73720a);
        if (nativeGetFormat != -1) {
            return nativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    @Override // android.media.Image
    public final int getHeight() {
        int nativeGetHeight = nativeGetHeight(this.f73721b.nativeWrapperHandle, this.f73720a);
        if (nativeGetHeight != -1) {
            return nativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    @Override // android.media.Image
    public final Image.Plane[] getPlanes() {
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.f73721b.nativeWrapperHandle, this.f73720a);
        if (nativeGetNumberOfPlanes != -1) {
            C18003k[] c18003kArr = new C18003k[nativeGetNumberOfPlanes];
            for (int i = 0; i < nativeGetNumberOfPlanes; i++) {
                c18003kArr[i] = new C18003k(this, this.f73720a, i);
            }
            return c18003kArr;
        }
        throw new FatalException("Unknown error in ArImage.getPlanes().");
    }

    @Override // android.media.Image
    public final long getTimestamp() {
        long nativeGetTimestamp = nativeGetTimestamp(this.f73721b.nativeWrapperHandle, this.f73720a);
        if (nativeGetTimestamp != -1) {
            return nativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    @Override // android.media.Image
    public final int getWidth() {
        int nativeGetWidth = nativeGetWidth(this.f73721b.nativeWrapperHandle, this.f73720a);
        if (nativeGetWidth != -1) {
            return nativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    @Override // android.media.Image
    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    @Override // android.media.Image
    public final void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
