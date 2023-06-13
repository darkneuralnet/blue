package com.google.android.libraries.vision.visionkit.pipeline;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.nio.ByteBuffer;
/* renamed from: com.google.android.libraries.vision.visionkit.pipeline.a */
/* loaded from: classes6.dex */
public class C17651a implements AR7, ZS7 {

    /* renamed from: a */
    public final C49761uJ7 f72092a;

    /* renamed from: b */
    public final InterfaceC50389vN7 f72093b;

    /* renamed from: c */
    public long f72094c;

    /* renamed from: d */
    public final long f72095d;

    /* renamed from: e */
    public final long f72096e;

    /* renamed from: f */
    public final long f72097f;

    /* renamed from: g */
    public final C53068zt7 f72098g;

    public C17651a(C49842uS7 c49842uS7, String str) {
        C53068zt7 m153b = C53068zt7.m153b();
        m153b = m153b == null ? C53068zt7.m154a() : m153b;
        if (c49842uS7.m10256L()) {
            this.f72093b = new KN7(this);
        } else if (c49842uS7.m10257K()) {
            this.f72093b = new NativePipelineImpl(this, this, m153b);
        } else {
            this.f72093b = new NativePipelineImpl("mlkitcommonpipeline", this, this, m153b);
        }
        if (c49842uS7.m10255M()) {
            this.f72092a = new C49761uJ7(c49842uS7.m10264D());
        } else {
            this.f72092a = new C49761uJ7(10);
        }
        this.f72098g = m153b;
        long initializeFrameManager = this.f72093b.initializeFrameManager();
        this.f72095d = initializeFrameManager;
        long initializeFrameBufferReleaseCallback = this.f72093b.initializeFrameBufferReleaseCallback(initializeFrameManager);
        this.f72096e = initializeFrameBufferReleaseCallback;
        long initializeResultsCallback = this.f72093b.initializeResultsCallback();
        this.f72097f = initializeResultsCallback;
        this.f72094c = this.f72093b.initialize(c49842uS7.m2341e(), initializeFrameBufferReleaseCallback, initializeResultsCallback, 0L, 0L);
    }

    @Override // p000.AR7
    /* renamed from: a */
    public final void mo50501a(long j) {
        this.f72092a.m10464a(j);
    }

    @Override // p000.ZS7
    /* renamed from: b */
    public final void mo50500b(SZ7 sz7) {
        XU7.f43305b.m76943b(this, "Pipeline received results: ".concat(String.valueOf(sz7)), new Object[0]);
    }

    /* renamed from: c */
    public final LP8 m50499c() {
        byte[] analyticsLogs = this.f72093b.getAnalyticsLogs(this.f72094c);
        if (analyticsLogs == null) {
            return LP8.m96958d();
        }
        try {
            return LP8.m96957e(C45746nY7.m23544G(analyticsLogs, C53068zt7.m154a()));
        } catch (zzaqw e) {
            throw new IllegalStateException("Could not parse analytics logs", e);
        }
    }

    /* renamed from: d */
    public final LP8 m50498d(FI7 fi7) {
        if (this.f72094c != 0) {
            if (this.f72092a.m10463b(fi7, fi7.m107332a())) {
                byte[] process = this.f72093b.process(this.f72094c, this.f72095d, fi7.m107332a(), fi7.m107330c(), fi7.m107331b().m27199b(), fi7.m107331b().m27200a(), fi7.m107329d() - 1, fi7.m107328e() - 1);
                if (process == null) {
                    return LP8.m96958d();
                }
                try {
                    return LP8.m96957e(SZ7.m85281G(process, this.f72098g));
                } catch (zzaqw e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            return LP8.m96958d();
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }

    /* renamed from: e */
    public final synchronized void m50497e() {
        long j = this.f72094c;
        if (j != 0) {
            this.f72093b.stop(j);
            this.f72093b.close(this.f72094c, this.f72095d, this.f72096e, this.f72097f);
            this.f72094c = 0L;
            this.f72093b.zza();
        }
    }

    /* renamed from: f */
    public final void m50496f() throws PipelineException {
        long j = this.f72094c;
        if (j != 0) {
            try {
                this.f72093b.start(j);
                this.f72093b.waitUntilIdle(this.f72094c);
                return;
            } catch (PipelineException e) {
                this.f72093b.stop(this.f72094c);
                throw e;
            }
        }
        throw new PipelineException(KS7.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
    }

    /* renamed from: g */
    public final void m50495g() {
        long j = this.f72094c;
        if (j != 0) {
            if (this.f72093b.stop(j)) {
                return;
            }
            throw new IllegalStateException("Pipeline did not stop successfully.");
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }

    /* renamed from: h */
    public final LP8 m50494h(long j, Bitmap bitmap, int i) {
        if (this.f72094c != 0) {
            if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                byte[] processBitmap = this.f72093b.processBitmap(this.f72094c, j, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i - 1);
                if (processBitmap == null) {
                    return LP8.m96958d();
                }
                try {
                    return LP8.m96957e(SZ7.m85281G(processBitmap, this.f72098g));
                } catch (zzaqw e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            throw new IllegalArgumentException("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }

    /* renamed from: i */
    public final LP8 m50493i(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.f72094c != 0) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                byte[] processYuvFrame = this.f72093b.processYuvFrame(this.f72094c, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6 - 1);
                if (processYuvFrame == null) {
                    return LP8.m96958d();
                }
                try {
                    return LP8.m96957e(SZ7.m85281G(processYuvFrame, this.f72098g));
                } catch (zzaqw e) {
                    throw new IllegalStateException("Could not parse results", e);
                }
            }
            throw new IllegalStateException("Byte buffers are not direct.");
        }
        throw new IllegalStateException("Pipeline has been closed or was not initialized");
    }
}
