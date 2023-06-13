package p000;

import android.graphics.Bitmap;
import androidx.camera.core.C11164h;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.C37060Xh2;
import p000.C40160e74;
import p000.C4448KT;
import p000.C51650xW1;
/* renamed from: e74  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40160e74 {

    /* renamed from: a */
    public final Executor f77967a;

    /* renamed from: b */
    public final C48449s62 f77968b;

    /* renamed from: c */
    public InterfaceC37529Zh3<AbstractC19965b, MD3<InterfaceC11183i>> f77969c;

    /* renamed from: d */
    public InterfaceC37529Zh3<C51650xW1.AbstractC30220a, MD3<byte[]>> f77970d;

    /* renamed from: e */
    public InterfaceC37529Zh3<C4448KT.AbstractC4449a, MD3<byte[]>> f77971e;

    /* renamed from: f */
    public InterfaceC37529Zh3<C37060Xh2.AbstractC9447a, C11164h.C11182o> f77972f;

    /* renamed from: g */
    public InterfaceC37529Zh3<MD3<byte[]>, MD3<Bitmap>> f77973g;

    /* renamed from: h */
    public InterfaceC37529Zh3<MD3<InterfaceC11183i>, InterfaceC11183i> f77974h;

    /* renamed from: i */
    public InterfaceC37529Zh3<MD3<byte[]>, MD3<InterfaceC11183i>> f77975i;

    /* renamed from: j */
    public InterfaceC37529Zh3<MD3<Bitmap>, MD3<Bitmap>> f77976j;

    /* renamed from: e74$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC19964a {
        /* renamed from: c */
        public static AbstractC19964a m43249c(int i) {
            return new C9541Xt(new C48478s91(), i);
        }

        /* renamed from: a */
        public abstract C48478s91<AbstractC19965b> mo43251a();

        /* renamed from: b */
        public abstract int mo43250b();
    }

    /* renamed from: e74$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC19965b {
        /* renamed from: c */
        public static AbstractC19965b m43246c(C40753f74 c40753f74, InterfaceC11183i interfaceC11183i) {
            return new C10073Yt(c40753f74, interfaceC11183i);
        }

        /* renamed from: a */
        public abstract InterfaceC11183i mo43248a();

        /* renamed from: b */
        public abstract C40753f74 mo43247b();
    }

    public C40160e74(Executor executor, C48449s62 c48449s62) {
        boolean z;
        if (P21.m91043a(C42003hE2.class) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f77967a = C31631Ac0.m115444f(executor);
        } else {
            this.f77967a = executor;
        }
        this.f77968b = c48449s62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m43258k(final AbstractC19965b abstractC19965b) {
        if (abstractC19965b.mo43247b().m41984i()) {
            return;
        }
        this.f77967a.execute(new Runnable() { // from class: a74
            @Override // java.lang.Runnable
            public final void run() {
                C40160e74.this.m43259j(abstractC19965b);
            }
        });
    }

    /* renamed from: p */
    public static void m43253p(final C40753f74 c40753f74, final ImageCaptureException imageCaptureException) {
        C31631Ac0.m115446d().execute(new Runnable() { // from class: d74
            @Override // java.lang.Runnable
            public final void run() {
                C40753f74.this.m41978o(imageCaptureException);
            }
        });
    }

    /* renamed from: f */
    public final MD3<byte[]> m43263f(MD3<byte[]> md3, int i) throws ImageCaptureException {
        boolean z;
        if (md3.mo80664e() == 256) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103729i(z);
        MD3<Bitmap> apply = this.f77973g.apply(md3);
        InterfaceC37529Zh3<MD3<Bitmap>, MD3<Bitmap>> interfaceC37529Zh3 = this.f77976j;
        if (interfaceC37529Zh3 != null) {
            apply = interfaceC37529Zh3.apply(apply);
        }
        return this.f77971e.apply(C4448KT.AbstractC4449a.m98855c(apply, i));
    }

    /* renamed from: l */
    public InterfaceC11183i m43257l(AbstractC19965b abstractC19965b) throws ImageCaptureException {
        C40753f74 mo43247b = abstractC19965b.mo43247b();
        MD3<InterfaceC11183i> apply = this.f77969c.apply(abstractC19965b);
        if (apply.mo80664e() == 35 || this.f77976j != null) {
            MD3<byte[]> apply2 = this.f77970d.apply(C51650xW1.AbstractC30220a.m5099c(apply, mo43247b.m41990c()));
            if (this.f77976j != null) {
                apply2 = m43263f(apply2, mo43247b.m41990c());
            }
            apply = this.f77975i.apply(apply2);
        }
        return this.f77974h.apply(apply);
    }

    /* renamed from: m */
    public void m43259j(AbstractC19965b abstractC19965b) {
        final C40753f74 mo43247b = abstractC19965b.mo43247b();
        try {
            if (abstractC19965b.mo43247b().m41983j()) {
                final InterfaceC11183i m43257l = m43257l(abstractC19965b);
                C31631Ac0.m115446d().execute(new Runnable() { // from class: b74
                    @Override // java.lang.Runnable
                    public final void run() {
                        C40753f74.this.m41980m(m43257l);
                    }
                });
            } else {
                final C11164h.C11182o m43255n = m43255n(abstractC19965b);
                C31631Ac0.m115446d().execute(new Runnable() { // from class: c74
                    @Override // java.lang.Runnable
                    public final void run() {
                        C40753f74.this.m41981l(m43255n);
                    }
                });
            }
        } catch (ImageCaptureException e) {
            m43253p(mo43247b, e);
        } catch (OutOfMemoryError e2) {
            m43253p(mo43247b, new ImageCaptureException(0, "Processing failed due to low memory.", e2));
        } catch (RuntimeException e3) {
            m43253p(mo43247b, new ImageCaptureException(0, "Processing failed.", e3));
        }
    }

    /* renamed from: n */
    public C11164h.C11182o m43255n(AbstractC19965b abstractC19965b) throws ImageCaptureException {
        C40753f74 mo43247b = abstractC19965b.mo43247b();
        MD3<byte[]> apply = this.f77970d.apply(C51650xW1.AbstractC30220a.m5099c(this.f77969c.apply(abstractC19965b), mo43247b.m41990c()));
        if (apply.m95566i() || this.f77976j != null) {
            apply = m43263f(apply, mo43247b.m41990c());
        }
        InterfaceC37529Zh3<C37060Xh2.AbstractC9447a, C11164h.C11182o> interfaceC37529Zh3 = this.f77972f;
        C11164h.C11180n m41989d = mo43247b.m41989d();
        Objects.requireNonNull(m41989d);
        return interfaceC37529Zh3.apply(C37060Xh2.AbstractC9447a.m76586c(apply, m41989d));
    }

    /* renamed from: o */
    public void m43254o() {
    }

    /* renamed from: q */
    public Void m43252q(AbstractC19964a abstractC19964a) {
        abstractC19964a.mo43251a().m14666a(new InterfaceC48378rz0() { // from class: Z64
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                C40160e74.this.m43258k((C40160e74.AbstractC19965b) obj);
            }
        });
        this.f77969c = new Y64();
        this.f77970d = new C51650xW1();
        this.f77973g = new C36826Wh2();
        this.f77971e = new C4448KT();
        this.f77972f = new C37060Xh2();
        this.f77974h = new C38113ai2();
        if (abstractC19964a.mo43250b() == 35 || this.f77968b != null) {
            this.f77975i = new C37294Yh2();
        }
        C48449s62 c48449s62 = this.f77968b;
        if (c48449s62 != null) {
            this.f77976j = new C8302UT(c48449s62);
            return null;
        }
        return null;
    }
}
