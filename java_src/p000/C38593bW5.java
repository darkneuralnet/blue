package p000;

import androidx.camera.core.C11243o;
import androidx.camera.core.ProcessingException;
import java.util.concurrent.Executor;
/* renamed from: bW5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38593bW5 implements UV5 {

    /* renamed from: a */
    public final TV5 f57611a;

    /* renamed from: b */
    public final Executor f57612b;

    public C38593bW5(TV5 tv5, Executor executor) {
        HZ3.m103728j(!(tv5 instanceof UV5), "SurfaceProcessorInternal should always be thread safe. Do not wrap.");
        this.f57611a = tv5;
        this.f57612b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m64488e(C11243o c11243o) {
        try {
            this.f57611a.mo64491b(c11243o);
        } catch (ProcessingException e) {
            C33928Jx2.m99530d("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m64487f(PV5 pv5) {
        try {
            this.f57611a.mo64492a(pv5);
        } catch (ProcessingException e) {
            C33928Jx2.m99530d("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e);
        }
    }

    @Override // p000.TV5
    /* renamed from: a */
    public void mo64492a(final PV5 pv5) {
        this.f57612b.execute(new Runnable() { // from class: aW5
            @Override // java.lang.Runnable
            public final void run() {
                C38593bW5.this.m64487f(pv5);
            }
        });
    }

    @Override // p000.TV5
    /* renamed from: b */
    public void mo64491b(final C11243o c11243o) {
        this.f57612b.execute(new Runnable() { // from class: ZV5
            @Override // java.lang.Runnable
            public final void run() {
                C38593bW5.this.m64488e(c11243o);
            }
        });
    }

    @Override // p000.UV5
    public void release() {
    }
}
