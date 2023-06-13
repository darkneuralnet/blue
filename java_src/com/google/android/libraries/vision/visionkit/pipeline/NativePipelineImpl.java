package com.google.android.libraries.vision.visionkit.pipeline;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
class NativePipelineImpl implements InterfaceC50389vN7 {

    /* renamed from: a */
    public C53068zt7 f72089a;

    /* renamed from: b */
    public AR7 f72090b;

    /* renamed from: c */
    public ZS7 f72091c;

    public NativePipelineImpl(AR7 ar7, ZS7 zs7, C53068zt7 c53068zt7) {
        this.f72090b = ar7;
        this.f72091c = zs7;
        this.f72089a = c53068zt7;
    }

    @Override // p000.InterfaceC50389vN7
    public native void close(long j, long j2, long j3, long j4);

    @Override // p000.InterfaceC50389vN7
    public native byte[] getAnalyticsLogs(long j);

    @Override // p000.InterfaceC50389vN7
    public native long initialize(byte[] bArr, long j, long j2, long j3, long j4);

    @Override // p000.InterfaceC50389vN7
    public native long initializeFrameBufferReleaseCallback(long j);

    @Override // p000.InterfaceC50389vN7
    public native long initializeFrameManager();

    @Override // p000.InterfaceC50389vN7
    public native long initializeResultsCallback();

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onReleaseAtTimestampUs(long j) {
        this.f72090b.mo50501a(j);
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onResult(byte[] bArr) {
        try {
            this.f72091c.mo50500b(SZ7.m85281G(bArr, this.f72089a));
        } catch (zzaqw e) {
            XU7.f43305b.m76944a(e, "Error in result from JNI layer", new Object[0]);
        }
    }

    @Override // p000.InterfaceC50389vN7
    public native byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

    @Override // p000.InterfaceC50389vN7
    public native byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

    @Override // p000.InterfaceC50389vN7
    public native byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // p000.InterfaceC50389vN7
    public native void start(long j) throws PipelineException;

    @Override // p000.InterfaceC50389vN7
    public native boolean stop(long j);

    @Override // p000.InterfaceC50389vN7
    public native void waitUntilIdle(long j) throws PipelineException;

    @Override // p000.InterfaceC50389vN7
    public final void zza() {
        this.f72089a = null;
        this.f72090b = null;
        this.f72091c = null;
    }

    public NativePipelineImpl(String str, AR7 ar7, ZS7 zs7, C53068zt7 c53068zt7) {
        this(ar7, zs7, c53068zt7);
        System.loadLibrary("mlkitcommonpipeline");
    }
}
