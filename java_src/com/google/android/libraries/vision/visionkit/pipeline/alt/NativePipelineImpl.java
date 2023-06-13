package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
class NativePipelineImpl implements InterfaceC49823uQ6 {

    /* renamed from: a */
    public C34896Oa7 f72099a;

    /* renamed from: b */
    public InterfaceC43975kZ6 f72100b;

    /* renamed from: c */
    public InterfaceC51089wZ6 f72101c;

    public NativePipelineImpl(InterfaceC43975kZ6 interfaceC43975kZ6, InterfaceC51089wZ6 interfaceC51089wZ6, C34896Oa7 c34896Oa7) {
        this.f72100b = interfaceC43975kZ6;
        this.f72101c = interfaceC51089wZ6;
        this.f72099a = c34896Oa7;
    }

    @Override // p000.InterfaceC49823uQ6
    public native void close(long j, long j2, long j3, long j4);

    @Override // p000.InterfaceC49823uQ6
    public native long initialize(byte[] bArr, long j, long j2, long j3, long j4);

    @Override // p000.InterfaceC49823uQ6
    public native long initializeFrameBufferReleaseCallback(long j);

    @Override // p000.InterfaceC49823uQ6
    public native long initializeFrameManager();

    @Override // p000.InterfaceC49823uQ6
    public native long initializeResultsCallback();

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onReleaseAtTimestampUs(long j) {
        this.f72100b.mo28830b(j);
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onResult(byte[] bArr) {
        try {
            this.f72101c.mo6637a(C46023o07.m21997H(bArr, this.f72099a));
        } catch (zbuw e) {
            C38297b07.f56786b.m65128a(e, "Error in result from JNI layer", new Object[0]);
        }
    }

    @Override // p000.InterfaceC49823uQ6
    public native byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

    @Override // p000.InterfaceC49823uQ6
    public native byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

    @Override // p000.InterfaceC49823uQ6
    public native byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // p000.InterfaceC49823uQ6
    public native void start(long j) throws PipelineException;

    @Override // p000.InterfaceC49823uQ6
    public native boolean stop(long j);

    @Override // p000.InterfaceC49823uQ6
    public native void waitUntilIdle(long j) throws PipelineException;

    @Override // p000.InterfaceC49823uQ6
    /* renamed from: y */
    public final void mo10329y() {
        this.f72099a = null;
        this.f72100b = null;
        this.f72101c = null;
    }

    public NativePipelineImpl(String str, InterfaceC43975kZ6 interfaceC43975kZ6, InterfaceC51089wZ6 interfaceC51089wZ6, C34896Oa7 c34896Oa7) {
        this(interfaceC43975kZ6, interfaceC51089wZ6, c34896Oa7);
        System.loadLibrary("mlkit_google_ocr_pipeline");
    }
}
