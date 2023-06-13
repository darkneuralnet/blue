package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p000.O80;
import p000.PV5;
/* renamed from: SV5 */
/* loaded from: classes.dex */
public final class SV5 implements PV5 {

    /* renamed from: b */
    public final Surface f33805b;

    /* renamed from: c */
    public final int f33806c;

    /* renamed from: d */
    public final int f33807d;

    /* renamed from: e */
    public final Size f33808e;

    /* renamed from: f */
    public final Size f33809f;

    /* renamed from: g */
    public final Rect f33810g;

    /* renamed from: h */
    public final int f33811h;

    /* renamed from: i */
    public final boolean f33812i;

    /* renamed from: l */
    public InterfaceC48378rz0<PV5.AbstractC6398a> f33815l;

    /* renamed from: m */
    public Executor f33816m;

    /* renamed from: p */
    public final ListenableFuture<Void> f33819p;

    /* renamed from: q */
    public O80.C5832a<Void> f33820q;

    /* renamed from: a */
    public final Object f33804a = new Object();

    /* renamed from: j */
    public final float[] f33813j = new float[16];

    /* renamed from: k */
    public final float[] f33814k = new float[16];

    /* renamed from: n */
    public boolean f33817n = false;

    /* renamed from: o */
    public boolean f33818o = false;

    public SV5(Surface surface, int i, int i2, Size size, Size size2, Rect rect, int i3, boolean z, InterfaceC34196Lb0 interfaceC34196Lb0) {
        this.f33805b = surface;
        this.f33806c = i;
        this.f33807d = i2;
        this.f33808e = size;
        this.f33809f = size2;
        this.f33810g = new Rect(rect);
        this.f33812i = z;
        this.f33811h = i3;
        m85333e(interfaceC34196Lb0);
        this.f33819p = O80.m92864a(new O80.InterfaceC5834c() { // from class: QV5
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m85330h;
                m85330h = SV5.this.m85330h(c5832a);
                return m85330h;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m85330h(O80.C5832a c5832a) throws Exception {
        this.f33820q = c5832a;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m85329i(AtomicReference atomicReference) {
        ((InterfaceC48378rz0) atomicReference.get()).accept(PV5.AbstractC6398a.m90167c(0, this));
    }

    @Override // p000.PV5
    /* renamed from: a */
    public Surface mo85337a(Executor executor, InterfaceC48378rz0<PV5.AbstractC6398a> interfaceC48378rz0) {
        boolean z;
        synchronized (this.f33804a) {
            this.f33816m = executor;
            this.f33815l = interfaceC48378rz0;
            z = this.f33817n;
        }
        if (z) {
            m85328j();
        }
        return this.f33805b;
    }

    @Override // p000.PV5
    /* renamed from: b */
    public void mo85336b(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f33813j, 0);
    }

    @Override // p000.PV5
    public void close() {
        synchronized (this.f33804a) {
            if (!this.f33818o) {
                this.f33818o = true;
            }
        }
        this.f33820q.m92861c(null);
    }

    /* renamed from: e */
    public final void m85333e(InterfaceC34196Lb0 interfaceC34196Lb0) {
        Matrix.setIdentityM(this.f33813j, 0);
        Matrix.translateM(this.f33813j, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(this.f33813j, 0, 1.0f, -1.0f, 1.0f);
        C45049mN2.m25780c(this.f33813j, this.f33811h, 0.5f, 0.5f);
        if (this.f33812i) {
            Matrix.translateM(this.f33813j, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(this.f33813j, 0, -1.0f, 1.0f, 1.0f);
        }
        Size m19862m = C46705p96.m19862m(this.f33809f, this.f33811h);
        android.graphics.Matrix m19871d = C46705p96.m19871d(C46705p96.m19859p(this.f33809f), C46705p96.m19859p(m19862m), this.f33811h, this.f33812i);
        RectF rectF = new RectF(this.f33810g);
        m19871d.mapRect(rectF);
        float width = rectF.left / m19862m.getWidth();
        float height = ((m19862m.getHeight() - rectF.height()) - rectF.top) / m19862m.getHeight();
        float height2 = rectF.height() / m19862m.getHeight();
        Matrix.translateM(this.f33813j, 0, width, height, 0.0f);
        Matrix.scaleM(this.f33813j, 0, rectF.width() / m19862m.getWidth(), height2, 1.0f);
        m85332f(interfaceC34196Lb0);
        float[] fArr = this.f33813j;
        Matrix.multiplyMM(fArr, 0, this.f33814k, 0, fArr, 0);
    }

    /* renamed from: f */
    public final void m85332f(InterfaceC34196Lb0 interfaceC34196Lb0) {
        Matrix.setIdentityM(this.f33814k, 0);
        Matrix.translateM(this.f33814k, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(this.f33814k, 0, 1.0f, -1.0f, 1.0f);
        if (interfaceC34196Lb0.mo4458q()) {
            C45049mN2.m25780c(this.f33814k, interfaceC34196Lb0.mo23505b().mo100135i(), 0.5f, 0.5f);
            if (interfaceC34196Lb0.m96610e()) {
                Matrix.translateM(this.f33814k, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(this.f33814k, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        float[] fArr = this.f33814k;
        Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* renamed from: g */
    public ListenableFuture<Void> m85331g() {
        return this.f33819p;
    }

    @Override // p000.PV5
    public int getFormat() {
        return this.f33807d;
    }

    /* renamed from: j */
    public void m85328j() {
        Executor executor;
        InterfaceC48378rz0<PV5.AbstractC6398a> interfaceC48378rz0;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f33804a) {
            if (this.f33816m != null && (interfaceC48378rz0 = this.f33815l) != null) {
                if (!this.f33818o) {
                    atomicReference.set(interfaceC48378rz0);
                    executor = this.f33816m;
                    this.f33817n = false;
                }
                executor = null;
            }
            this.f33817n = true;
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: RV5
                    @Override // java.lang.Runnable
                    public final void run() {
                        SV5.this.m85329i(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e) {
                C33928Jx2.m99532b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }
}
