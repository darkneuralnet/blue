package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.C11242n;
import androidx.camera.core.InterfaceC11183i;
import java.util.concurrent.Executor;
import p000.KX1;
/* renamed from: androidx.camera.core.n */
/* loaded from: classes.dex */
public class C11242n implements KX1 {

    /* renamed from: d */
    public final KX1 f52752d;

    /* renamed from: e */
    public final Surface f52753e;

    /* renamed from: f */
    public AbstractC11152d.InterfaceC11153a f52754f;

    /* renamed from: a */
    public final Object f52749a = new Object();

    /* renamed from: b */
    public int f52750b = 0;

    /* renamed from: c */
    public boolean f52751c = false;

    /* renamed from: g */
    public final AbstractC11152d.InterfaceC11153a f52755g = new AbstractC11152d.InterfaceC11153a() { // from class: dh5
        @Override // androidx.camera.core.AbstractC11152d.InterfaceC11153a
        /* renamed from: f */
        public final void mo43878f(InterfaceC11183i interfaceC11183i) {
            C11242n.this.m69127k(interfaceC11183i);
        }
    };

    public C11242n(KX1 kx1) {
        this.f52752d = kx1;
        this.f52753e = kx1.mo69137a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m69127k(InterfaceC11183i interfaceC11183i) {
        AbstractC11152d.InterfaceC11153a interfaceC11153a;
        synchronized (this.f52749a) {
            int i = this.f52750b - 1;
            this.f52750b = i;
            if (this.f52751c && i == 0) {
                close();
            }
            interfaceC11153a = this.f52754f;
        }
        if (interfaceC11153a != null) {
            interfaceC11153a.mo43878f(interfaceC11183i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m69126l(KX1.InterfaceC4462a interfaceC4462a, KX1 kx1) {
        interfaceC4462a.mo12500a(this);
    }

    @Override // p000.KX1
    /* renamed from: a */
    public Surface mo69137a() {
        Surface mo69137a;
        synchronized (this.f52749a) {
            mo69137a = this.f52752d.mo69137a();
        }
        return mo69137a;
    }

    @Override // p000.KX1
    /* renamed from: b */
    public int mo69136b() {
        int mo69136b;
        synchronized (this.f52749a) {
            mo69136b = this.f52752d.mo69136b();
        }
        return mo69136b;
    }

    @Override // p000.KX1
    /* renamed from: c */
    public int mo69135c() {
        int mo69135c;
        synchronized (this.f52749a) {
            mo69135c = this.f52752d.mo69135c();
        }
        return mo69135c;
    }

    @Override // p000.KX1
    public void close() {
        synchronized (this.f52749a) {
            Surface surface = this.f52753e;
            if (surface != null) {
                surface.release();
            }
            this.f52752d.close();
        }
    }

    @Override // p000.KX1
    /* renamed from: d */
    public void mo69134d(final KX1.InterfaceC4462a interfaceC4462a, Executor executor) {
        synchronized (this.f52749a) {
            this.f52752d.mo69134d(new KX1.InterfaceC4462a() { // from class: eh5
                @Override // p000.KX1.InterfaceC4462a
                /* renamed from: a */
                public final void mo12500a(KX1 kx1) {
                    C11242n.this.m69126l(interfaceC4462a, kx1);
                }
            }, executor);
        }
    }

    @Override // p000.KX1
    /* renamed from: e */
    public InterfaceC11183i mo69133e() {
        InterfaceC11183i m69123o;
        synchronized (this.f52749a) {
            m69123o = m69123o(this.f52752d.mo69133e());
        }
        return m69123o;
    }

    @Override // p000.KX1
    /* renamed from: g */
    public InterfaceC11183i mo69131g() {
        InterfaceC11183i m69123o;
        synchronized (this.f52749a) {
            m69123o = m69123o(this.f52752d.mo69131g());
        }
        return m69123o;
    }

    @Override // p000.KX1
    public int getHeight() {
        int height;
        synchronized (this.f52749a) {
            height = this.f52752d.getHeight();
        }
        return height;
    }

    @Override // p000.KX1
    public int getWidth() {
        int width;
        synchronized (this.f52749a) {
            width = this.f52752d.getWidth();
        }
        return width;
    }

    @Override // p000.KX1
    /* renamed from: h */
    public void mo69130h() {
        synchronized (this.f52749a) {
            this.f52752d.mo69130h();
        }
    }

    /* renamed from: j */
    public int m69128j() {
        int mo69135c;
        synchronized (this.f52749a) {
            mo69135c = this.f52752d.mo69135c() - this.f52750b;
        }
        return mo69135c;
    }

    /* renamed from: m */
    public void m69125m() {
        synchronized (this.f52749a) {
            this.f52751c = true;
            this.f52752d.mo69130h();
            if (this.f52750b == 0) {
                close();
            }
        }
    }

    /* renamed from: n */
    public void m69124n(AbstractC11152d.InterfaceC11153a interfaceC11153a) {
        synchronized (this.f52749a) {
            this.f52754f = interfaceC11153a;
        }
    }

    /* renamed from: o */
    public final InterfaceC11183i m69123o(InterfaceC11183i interfaceC11183i) {
        if (interfaceC11183i != null) {
            this.f52750b++;
            C43165jB5 c43165jB5 = new C43165jB5(interfaceC11183i);
            c43165jB5.m69639a(this.f52755g);
            return c43165jB5;
        }
        return null;
    }
}
