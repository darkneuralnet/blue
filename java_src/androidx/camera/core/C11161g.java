package androidx.camera.core;

import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.C11161g;
import androidx.camera.core.InterfaceC11183i;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* renamed from: androidx.camera.core.g */
/* loaded from: classes.dex */
public final class C11161g extends AbstractC11160f {

    /* renamed from: t */
    public final Executor f52474t;

    /* renamed from: u */
    public final Object f52475u = new Object();

    /* renamed from: v */
    public InterfaceC11183i f52476v;

    /* renamed from: w */
    public C11163b f52477w;

    /* renamed from: androidx.camera.core.g$a */
    /* loaded from: classes.dex */
    public class C11162a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ C11163b f52478a;

        public C11162a(C11163b c11163b) {
            this.f52478a = c11163b;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            this.f52478a.close();
        }
    }

    /* renamed from: androidx.camera.core.g$b */
    /* loaded from: classes.dex */
    public static class C11163b extends AbstractC11152d {

        /* renamed from: e */
        public final WeakReference<C11161g> f52480e;

        public C11163b(InterfaceC11183i interfaceC11183i, C11161g c11161g) {
            super(interfaceC11183i);
            this.f52480e = new WeakReference<>(c11161g);
            m69639a(new AbstractC11152d.InterfaceC11153a() { // from class: EW1
                @Override // androidx.camera.core.AbstractC11152d.InterfaceC11153a
                /* renamed from: f */
                public final void mo43878f(InterfaceC11183i interfaceC11183i2) {
                    C11161g.C11163b.this.m69576g(interfaceC11183i2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m69576g(InterfaceC11183i interfaceC11183i) {
            final C11161g c11161g = this.f52480e.get();
            if (c11161g != null) {
                c11161g.f52474t.execute(new Runnable() { // from class: FW1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11161g.this.m69581z();
                    }
                });
            }
        }
    }

    public C11161g(Executor executor) {
        this.f52474t = executor;
    }

    @Override // androidx.camera.core.AbstractC11160f
    /* renamed from: d */
    public InterfaceC11183i mo69584d(KX1 kx1) {
        return kx1.mo69131g();
    }

    @Override // androidx.camera.core.AbstractC11160f
    /* renamed from: g */
    public void mo69583g() {
        synchronized (this.f52475u) {
            InterfaceC11183i interfaceC11183i = this.f52476v;
            if (interfaceC11183i != null) {
                interfaceC11183i.close();
                this.f52476v = null;
            }
        }
    }

    @Override // androidx.camera.core.AbstractC11160f
    /* renamed from: o */
    public void mo69582o(InterfaceC11183i interfaceC11183i) {
        synchronized (this.f52475u) {
            if (!this.f52473s) {
                interfaceC11183i.close();
            } else if (this.f52477w != null) {
                if (interfaceC11183i.mo40428i1().getTimestamp() <= this.f52477w.mo40428i1().getTimestamp()) {
                    interfaceC11183i.close();
                } else {
                    InterfaceC11183i interfaceC11183i2 = this.f52476v;
                    if (interfaceC11183i2 != null) {
                        interfaceC11183i2.close();
                    }
                    this.f52476v = interfaceC11183i;
                }
            } else {
                C11163b c11163b = new C11163b(interfaceC11183i, this);
                this.f52477w = c11163b;
                IA1.m102842b(m69603e(c11163b), new C11162a(c11163b), C31631Ac0.m115449a());
            }
        }
    }

    /* renamed from: z */
    public void m69581z() {
        synchronized (this.f52475u) {
            this.f52477w = null;
            InterfaceC11183i interfaceC11183i = this.f52476v;
            if (interfaceC11183i != null) {
                this.f52476v = null;
                mo69582o(interfaceC11183i);
            }
        }
    }
}
