package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import java.nio.ByteBuffer;
/* renamed from: uQ6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC49823uQ6 {
    void close(long j, long j2, long j3, long j4);

    long initialize(byte[] bArr, long j, long j2, long j3, long j4);

    long initializeFrameBufferReleaseCallback(long j);

    long initializeFrameManager();

    long initializeResultsCallback();

    byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

    byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

    byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    void start(long j) throws PipelineException;

    boolean stop(long j);

    void waitUntilIdle(long j) throws PipelineException;

    /* renamed from: y */
    void mo10329y();
}
