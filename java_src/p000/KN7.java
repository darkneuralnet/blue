package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.vision.visionkit.pipeline.PipelineException;
import java.nio.ByteBuffer;
/* renamed from: KN7 */
/* loaded from: classes6.dex */
public final class KN7 implements InterfaceC50389vN7 {
    public KN7(AR7 ar7) {
    }

    @Override // p000.InterfaceC50389vN7
    public final void close(long j, long j2, long j3, long j4) {
    }

    @Override // p000.InterfaceC50389vN7
    public final byte[] getAnalyticsLogs(long j) {
        return new byte[0];
    }

    @Override // p000.InterfaceC50389vN7
    public final long initialize(byte[] bArr, long j, long j2, long j3, long j4) {
        return 1L;
    }

    @Override // p000.InterfaceC50389vN7
    public final long initializeFrameBufferReleaseCallback(long j) {
        return 1L;
    }

    @Override // p000.InterfaceC50389vN7
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // p000.InterfaceC50389vN7
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // p000.InterfaceC50389vN7
    public final byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4) {
        return SZ7.m85282F().m2341e();
    }

    @Override // p000.InterfaceC50389vN7
    public final byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4) {
        return SZ7.m85282F().m2341e();
    }

    @Override // p000.InterfaceC50389vN7
    public final byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        return SZ7.m85282F().m2341e();
    }

    @Override // p000.InterfaceC50389vN7
    public final void start(long j) throws PipelineException {
    }

    @Override // p000.InterfaceC50389vN7
    public final boolean stop(long j) {
        return true;
    }

    @Override // p000.InterfaceC50389vN7
    public final void waitUntilIdle(long j) throws PipelineException {
    }

    @Override // p000.InterfaceC50389vN7
    public final void zza() {
    }
}
