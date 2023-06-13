package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import java.nio.ByteBuffer;
/* renamed from: nY6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45745nY6 implements InterfaceC49823uQ6 {
    public C45745nY6(InterfaceC43975kZ6 interfaceC43975kZ6) {
    }

    @Override // p000.InterfaceC49823uQ6
    public final void close(long j, long j2, long j3, long j4) {
    }

    @Override // p000.InterfaceC49823uQ6
    public final long initialize(byte[] bArr, long j, long j2, long j3, long j4) {
        return 1L;
    }

    @Override // p000.InterfaceC49823uQ6
    public final long initializeFrameBufferReleaseCallback(long j) {
        return 1L;
    }

    @Override // p000.InterfaceC49823uQ6
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // p000.InterfaceC49823uQ6
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // p000.InterfaceC49823uQ6
    public final byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4) {
        return C46023o07.m21998G().m42734b();
    }

    @Override // p000.InterfaceC49823uQ6
    public final byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4) {
        return C46023o07.m21998G().m42734b();
    }

    @Override // p000.InterfaceC49823uQ6
    public final byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        return C46023o07.m21998G().m42734b();
    }

    @Override // p000.InterfaceC49823uQ6
    public final void start(long j) throws PipelineException {
    }

    @Override // p000.InterfaceC49823uQ6
    public final boolean stop(long j) {
        return true;
    }

    @Override // p000.InterfaceC49823uQ6
    public final void waitUntilIdle(long j) throws PipelineException {
    }

    @Override // p000.InterfaceC49823uQ6
    /* renamed from: y */
    public final void mo10329y() {
    }
}
