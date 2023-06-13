package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: lM5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44450lM5 implements InterfaceC36676Vq5 {

    /* renamed from: a */
    public final AbstractC48893sr2 f95939a = new C31861Bb5();

    /* renamed from: b */
    public final List<C52053yB0> f95940b = new ArrayList();

    /* renamed from: c */
    public final double f95941c;

    public C44450lM5(double d) {
        this.f95941c = d;
    }

    @Override // p000.InterfaceC36676Vq5
    /* renamed from: a */
    public void mo19421a(InterfaceC39410cr5 interfaceC39410cr5, int i, InterfaceC39410cr5 interfaceC39410cr52, int i2) {
        if (interfaceC39410cr5 == interfaceC39410cr52 && i == i2) {
            return;
        }
        C52053yB0 mo44966u = interfaceC39410cr5.mo44966u(i);
        C52053yB0 mo44966u2 = interfaceC39410cr5.mo44966u(i + 1);
        C52053yB0 mo44966u3 = interfaceC39410cr52.mo44966u(i2);
        C52053yB0 mo44966u4 = interfaceC39410cr52.mo44966u(i2 + 1);
        this.f95939a.m13587d(mo44966u, mo44966u2, mo44966u3, mo44966u4);
        if (this.f95939a.m13582i() && this.f95939a.m13579l()) {
            for (int i3 = 0; i3 < this.f95939a.m13584g(); i3++) {
                this.f95940b.add(this.f95939a.m13585f(i3));
            }
            ((S83) interfaceC39410cr5).m85914d(this.f95939a, i, 0);
            ((S83) interfaceC39410cr52).m85914d(this.f95939a, i2, 1);
            return;
        }
        m27391c(mo44966u, interfaceC39410cr52, i2, mo44966u3, mo44966u4);
        m27391c(mo44966u2, interfaceC39410cr52, i2, mo44966u3, mo44966u4);
        m27391c(mo44966u3, interfaceC39410cr5, i, mo44966u, mo44966u2);
        m27391c(mo44966u4, interfaceC39410cr5, i, mo44966u, mo44966u2);
    }

    /* renamed from: b */
    public List<C52053yB0> m27392b() {
        return this.f95940b;
    }

    /* renamed from: c */
    public final void m27391c(C52053yB0 c52053yB0, InterfaceC39410cr5 interfaceC39410cr5, int i, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        if (c52053yB0.m3887f(c52053yB02) >= this.f95941c && c52053yB0.m3887f(c52053yB03) >= this.f95941c && G51.m105836a(c52053yB0, c52053yB02, c52053yB03) < this.f95941c) {
            this.f95940b.add(c52053yB0);
            ((S83) interfaceC39410cr5).m85917a(c52053yB0, i);
        }
    }

    @Override // p000.InterfaceC36676Vq5
    public boolean isDone() {
        return false;
    }
}
