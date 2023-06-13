package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.nio.ByteBuffer;
/* renamed from: com.google.android.libraries.vision.visionkit.pipeline.alt.a */
/* loaded from: classes6.dex */
public class C17652a implements InterfaceC43975kZ6, InterfaceC51089wZ6 {

    /* renamed from: a */
    public final AY6 f72102a;

    /* renamed from: b */
    public final InterfaceC49823uQ6 f72103b;

    /* renamed from: c */
    public long f72104c;

    /* renamed from: d */
    public final long f72105d;

    /* renamed from: e */
    public final long f72106e;

    /* renamed from: f */
    public final long f72107f;

    /* renamed from: g */
    public final C34896Oa7 f72108g;

    public C17652a(C49904uZ6 c49904uZ6, String str) {
        C34896Oa7 m92004b = C34896Oa7.m92004b();
        m92004b = m92004b == null ? C34896Oa7.m92005a() : m92004b;
        if (c49904uZ6.m10056K()) {
            this.f72103b = new C45745nY6(this);
        } else if (c49904uZ6.m10057J()) {
            this.f72103b = new NativePipelineImpl(this, this, m92004b);
        } else {
            this.f72103b = new NativePipelineImpl("mlkit_google_ocr_pipeline", this, this, m92004b);
        }
        if (c49904uZ6.m10055L()) {
            this.f72102a = new AY6(c49904uZ6.m10062E());
        } else {
            this.f72102a = new AY6(10);
        }
        this.f72108g = m92004b;
        long initializeFrameManager = this.f72103b.initializeFrameManager();
        this.f72105d = initializeFrameManager;
        long initializeFrameBufferReleaseCallback = this.f72103b.initializeFrameBufferReleaseCallback(initializeFrameManager);
        this.f72106e = initializeFrameBufferReleaseCallback;
        long initializeResultsCallback = this.f72103b.initializeResultsCallback();
        this.f72107f = initializeResultsCallback;
        this.f72104c = this.f72103b.initialize(c49904uZ6.m42734b(), initializeFrameBufferReleaseCallback, initializeResultsCallback, 0L, 0L);
    }

    @Override // p000.InterfaceC51089wZ6
    /* renamed from: a */
    public final void mo6637a(C46023o07 c46023o07) {
        C38297b07.f56786b.m65127b(this, "Pipeline received results: ".concat(String.valueOf(c46023o07)), new Object[0]);
    }

    @Override // p000.InterfaceC43975kZ6
    /* renamed from: b */
    public final void mo28830b(long j) {
        this.f72102a.m115556a(j);
    }

    /* renamed from: c */
    public final I57 m50492c(C52266yY6 c52266yY6) {
        if (this.f72104c != 0) {
            if (this.f72102a.m115555b(c52266yY6, c52266yY6.m3276a())) {
                byte[] process = this.f72103b.process(this.f72104c, this.f72105d, c52266yY6.m3276a(), c52266yY6.m3274c(), c52266yY6.m3275b().m44738b(), c52266yY6.m3275b().m44739a(), c52266yY6.m3273d() - 1, c52266yY6.m3272e() - 1);
                if (process == null) {
                    return I57.m102960d();
                }
                try {
                    return I57.m102959e(C46023o07.m21997H(process, this.f72108g));
                } catch (zbuw e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            return I57.m102960d();
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }

    /* renamed from: d */
    public final synchronized void m50491d() {
        long j = this.f72104c;
        if (j != 0) {
            this.f72103b.stop(j);
            this.f72103b.close(this.f72104c, this.f72105d, this.f72106e, this.f72107f);
            this.f72104c = 0L;
            this.f72103b.mo10329y();
        }
    }

    /* renamed from: e */
    public final void m50490e() throws PipelineException {
        long j = this.f72104c;
        if (j != 0) {
            try {
                this.f72103b.start(j);
                this.f72103b.waitUntilIdle(this.f72104c);
                return;
            } catch (PipelineException e) {
                this.f72103b.stop(this.f72104c);
                throw e;
            }
        }
        throw new PipelineException(EnumC50173v07.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
    }

    /* renamed from: f */
    public final void m50489f() {
        long j = this.f72104c;
        if (j != 0) {
            if (this.f72103b.stop(j)) {
                return;
            }
            throw new IllegalStateException("Pipeline did not stop successfully.");
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }

    /* renamed from: g */
    public final I57 m50488g(long j, Bitmap bitmap, int i) {
        if (this.f72104c != 0) {
            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                byte[] processBitmap = this.f72103b.processBitmap(this.f72104c, j, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i - 1);
                if (processBitmap == null) {
                    return I57.m102960d();
                }
                try {
                    return I57.m102959e(C46023o07.m21997H(processBitmap, this.f72108g));
                } catch (zbuw e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            throw new IllegalArgumentException("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }

    /* renamed from: h */
    public final I57 m50487h(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.f72104c != 0) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                byte[] processYuvFrame = this.f72103b.processYuvFrame(this.f72104c, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6 - 1);
                if (processYuvFrame == null) {
                    return I57.m102960d();
                }
                try {
                    return I57.m102959e(C46023o07.m21997H(processYuvFrame, this.f72108g));
                } catch (zbuw e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            throw new IllegalStateException("Byte buffers are not direct.");
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }
}
