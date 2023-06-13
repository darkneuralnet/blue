package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.AbstractC11160f;
import androidx.camera.core.C11154e;
import androidx.core.p004os.OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import p000.KX1;
import p000.O80;
/* renamed from: androidx.camera.core.f */
/* loaded from: classes.dex */
public abstract class AbstractC11160f implements KX1.InterfaceC4462a {

    /* renamed from: a */
    public C11154e.InterfaceC11155a f52455a;

    /* renamed from: b */
    public volatile int f52456b;

    /* renamed from: c */
    public volatile int f52457c;

    /* renamed from: e */
    public volatile boolean f52459e;

    /* renamed from: f */
    public volatile boolean f52460f;

    /* renamed from: g */
    public Executor f52461g;

    /* renamed from: h */
    public C11242n f52462h;

    /* renamed from: i */
    public ImageWriter f52463i;

    /* renamed from: n */
    public ByteBuffer f52468n;

    /* renamed from: o */
    public ByteBuffer f52469o;

    /* renamed from: p */
    public ByteBuffer f52470p;

    /* renamed from: q */
    public ByteBuffer f52471q;

    /* renamed from: d */
    public volatile int f52458d = 1;

    /* renamed from: j */
    public Rect f52464j = new Rect();

    /* renamed from: k */
    public Rect f52465k = new Rect();

    /* renamed from: l */
    public Matrix f52466l = new Matrix();

    /* renamed from: m */
    public Matrix f52467m = new Matrix();

    /* renamed from: r */
    public final Object f52472r = new Object();

    /* renamed from: s */
    public boolean f52473s = true;

    /* renamed from: i */
    public static C11242n m69600i(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6;
        if (i3 != 90 && i3 != 270) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i6 = i2;
        } else {
            i6 = i;
        }
        if (!z) {
            i = i2;
        }
        return new C11242n(MX1.m95184a(i6, i, i4, i5));
    }

    /* renamed from: k */
    public static Matrix m69598k(int i, int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i, i2), C46705p96.f103218a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i5);
            matrix.postConcat(C46705p96.m19873b(new RectF(0.0f, 0.0f, i3, i4)));
        }
        return matrix;
    }

    /* renamed from: l */
    public static Rect m69597l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m69596m(InterfaceC11183i interfaceC11183i, Matrix matrix, InterfaceC11183i interfaceC11183i2, Rect rect, C11154e.InterfaceC11155a interfaceC11155a, O80.C5832a c5832a) {
        int i;
        if (this.f52473s) {
            C51672xY5 mo3254b = interfaceC11183i.mo40428i1().mo3254b();
            long timestamp = interfaceC11183i.mo40428i1().getTimestamp();
            if (this.f52459e) {
                i = 0;
            } else {
                i = this.f52456b;
            }
            C41238fw5 c41238fw5 = new C41238fw5(interfaceC11183i2, TY1.m83423d(mo3254b, timestamp, i, matrix));
            if (!rect.isEmpty()) {
                c41238fw5.setCropRect(rect);
            }
            interfaceC11155a.mo968d(c41238fw5);
            c5832a.m92861c(null);
            return;
        }
        c5832a.m92858f(new OperationCanceledException("ImageAnalysis is detached"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m69595n(Executor executor, final InterfaceC11183i interfaceC11183i, final Matrix matrix, final InterfaceC11183i interfaceC11183i2, final Rect rect, final C11154e.InterfaceC11155a interfaceC11155a, final O80.C5832a c5832a) throws Exception {
        executor.execute(new Runnable() { // from class: CW1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11160f.this.m69596m(interfaceC11183i, matrix, interfaceC11183i2, rect, interfaceC11155a, c5832a);
            }
        });
        return "analyzeImage";
    }

    @Override // p000.KX1.InterfaceC4462a
    /* renamed from: a */
    public void mo12500a(KX1 kx1) {
        try {
            InterfaceC11183i mo69584d = mo69584d(kx1);
            if (mo69584d != null) {
                mo69582o(mo69584d);
            }
        } catch (IllegalStateException e) {
            C33928Jx2.m99530d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* renamed from: d */
    public abstract InterfaceC11183i mo69584d(KX1 kx1);

    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListenableFuture<Void> m69603e(final InterfaceC11183i interfaceC11183i) {
        int i;
        final Executor executor;
        final C11154e.InterfaceC11155a interfaceC11155a;
        boolean z;
        C11242n c11242n;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        InterfaceC11183i interfaceC11183i2;
        final InterfaceC11183i interfaceC11183i3;
        boolean z2 = false;
        if (this.f52459e) {
            i = this.f52456b;
        } else {
            i = 0;
        }
        synchronized (this.f52472r) {
            executor = this.f52461g;
            interfaceC11155a = this.f52455a;
            if (this.f52459e && i != this.f52457c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m69593q(interfaceC11183i, i);
            }
            if (this.f52459e) {
                m69601h(interfaceC11183i);
            }
            c11242n = this.f52462h;
            imageWriter = this.f52463i;
            byteBuffer = this.f52468n;
            byteBuffer2 = this.f52469o;
            byteBuffer3 = this.f52470p;
            byteBuffer4 = this.f52471q;
        }
        if (interfaceC11155a != null && executor != null && this.f52473s) {
            if (c11242n != null) {
                if (this.f52458d == 2) {
                    interfaceC11183i2 = ImageProcessingUtil.m69650f(interfaceC11183i, c11242n, byteBuffer, i, this.f52460f);
                } else if (this.f52458d == 1) {
                    if (this.f52460f) {
                        ImageProcessingUtil.m69653c(interfaceC11183i);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        interfaceC11183i2 = ImageProcessingUtil.m69642n(interfaceC11183i, c11242n, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                if (interfaceC11183i2 == null) {
                    z2 = true;
                }
                if (!z2) {
                    interfaceC11183i3 = interfaceC11183i;
                } else {
                    interfaceC11183i3 = interfaceC11183i2;
                }
                final Rect rect = new Rect();
                final Matrix matrix = new Matrix();
                synchronized (this.f52472r) {
                    if (z && !z2) {
                        m69594p(interfaceC11183i.getWidth(), interfaceC11183i.getHeight(), interfaceC11183i3.getWidth(), interfaceC11183i3.getHeight());
                    }
                    this.f52457c = i;
                    rect.set(this.f52465k);
                    matrix.set(this.f52467m);
                }
                return O80.m92864a(new O80.InterfaceC5834c() { // from class: BW1
                    @Override // p000.O80.InterfaceC5834c
                    /* renamed from: a */
                    public final Object mo3207a(O80.C5832a c5832a) {
                        Object m69595n;
                        m69595n = AbstractC11160f.this.m69595n(executor, interfaceC11183i, matrix, interfaceC11183i3, rect, interfaceC11155a, c5832a);
                        return m69595n;
                    }
                });
            }
            interfaceC11183i2 = null;
            if (interfaceC11183i2 == null) {
            }
            if (!z2) {
            }
            final Rect rect2 = new Rect();
            final Matrix matrix2 = new Matrix();
            synchronized (this.f52472r) {
            }
        } else {
            return IA1.m102838f(new OperationCanceledException("No analyzer or executor currently set."));
        }
    }

    /* renamed from: f */
    public void m69602f() {
        this.f52473s = true;
    }

    /* renamed from: g */
    public abstract void mo69583g();

    /* renamed from: h */
    public final void m69601h(InterfaceC11183i interfaceC11183i) {
        if (this.f52458d == 1) {
            if (this.f52469o == null) {
                this.f52469o = ByteBuffer.allocateDirect(interfaceC11183i.getWidth() * interfaceC11183i.getHeight());
            }
            this.f52469o.position(0);
            if (this.f52470p == null) {
                this.f52470p = ByteBuffer.allocateDirect((interfaceC11183i.getWidth() * interfaceC11183i.getHeight()) / 4);
            }
            this.f52470p.position(0);
            if (this.f52471q == null) {
                this.f52471q = ByteBuffer.allocateDirect((interfaceC11183i.getWidth() * interfaceC11183i.getHeight()) / 4);
            }
            this.f52471q.position(0);
        } else if (this.f52458d == 2 && this.f52468n == null) {
            this.f52468n = ByteBuffer.allocateDirect(interfaceC11183i.getWidth() * interfaceC11183i.getHeight() * 4);
        }
    }

    /* renamed from: j */
    public void m69599j() {
        this.f52473s = false;
        mo69583g();
    }

    /* renamed from: o */
    public abstract void mo69582o(InterfaceC11183i interfaceC11183i);

    /* renamed from: p */
    public final void m69594p(int i, int i2, int i3, int i4) {
        Matrix m69598k = m69598k(i, i2, i3, i4, this.f52456b);
        this.f52465k = m69597l(this.f52464j, m69598k);
        this.f52467m.setConcat(this.f52466l, m69598k);
    }

    /* renamed from: q */
    public final void m69593q(InterfaceC11183i interfaceC11183i, int i) {
        C11242n c11242n = this.f52462h;
        if (c11242n == null) {
            return;
        }
        c11242n.m69125m();
        this.f52462h = m69600i(interfaceC11183i.getWidth(), interfaceC11183i.getHeight(), i, this.f52462h.mo69136b(), this.f52462h.mo69135c());
        if (this.f52458d == 1) {
            ImageWriter imageWriter = this.f52463i;
            if (imageWriter != null) {
                DY1.m110265a(imageWriter);
            }
            this.f52463i = DY1.m110263c(this.f52462h.mo69137a(), this.f52462h.mo69135c());
        }
    }

    /* renamed from: r */
    public void m69592r(Executor executor, C11154e.InterfaceC11155a interfaceC11155a) {
        if (interfaceC11155a == null) {
            mo69583g();
        }
        synchronized (this.f52472r) {
            this.f52455a = interfaceC11155a;
            this.f52461g = executor;
        }
    }

    /* renamed from: s */
    public void m69591s(boolean z) {
        this.f52460f = z;
    }

    /* renamed from: t */
    public void m69590t(int i) {
        this.f52458d = i;
    }

    /* renamed from: u */
    public void m69589u(boolean z) {
        this.f52459e = z;
    }

    /* renamed from: v */
    public void m69588v(C11242n c11242n) {
        synchronized (this.f52472r) {
            this.f52462h = c11242n;
        }
    }

    /* renamed from: w */
    public void m69587w(int i) {
        this.f52456b = i;
    }

    /* renamed from: x */
    public void m69586x(Matrix matrix) {
        synchronized (this.f52472r) {
            this.f52466l = matrix;
            this.f52467m = new Matrix(this.f52466l);
        }
    }

    /* renamed from: y */
    public void m69585y(Rect rect) {
        synchronized (this.f52472r) {
            this.f52464j = rect;
            this.f52465k = new Rect(this.f52464j);
        }
    }
}
