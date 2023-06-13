package p000;

import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: yP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52186yP7 {

    /* renamed from: a */
    public final C42247he8 f119496a;

    /* renamed from: b */
    public C38159am8 f119497b;

    /* renamed from: c */
    public final C34950Og7 f119498c;

    /* renamed from: d */
    public final Jy9 f119499d;

    public C52186yP7() {
        C42247he8 c42247he8 = new C42247he8();
        this.f119496a = c42247he8;
        this.f119497b = c42247he8.f85631b.m70758a();
        this.f119498c = new C34950Og7();
        this.f119499d = new Jy9();
        c42247he8.f85633d.m19570a("internal.registerCallback", new Callable() { // from class: oe7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C52186yP7.this.m3521b();
            }
        });
        c42247he8.f85633d.m19570a("internal.eventLogger", new Callable() { // from class: LB7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new SN8(C52186yP7.this.f119498c);
            }
        });
    }

    /* renamed from: a */
    public final C34950Og7 m3522a() {
        return this.f119498c;
    }

    /* renamed from: b */
    public final /* synthetic */ AbstractC40557en7 m3521b() throws Exception {
        return new C40036du9(this.f119499d);
    }

    /* renamed from: c */
    public final void m3520c(C48899sr8 c48899sr8) throws zzd {
        AbstractC40557en7 abstractC40557en7;
        try {
            this.f119497b = this.f119496a.f85631b.m70758a();
            if (!(this.f119496a.m36114a(this.f119497b, (C32485Ds8[]) c48899sr8.m13565D().toArray(new C32485Ds8[0])) instanceof C45874nl7)) {
                for (C36679Vq8 c36679Vq8 : c48899sr8.m13567B().m9658E()) {
                    List m79341D = c36679Vq8.m79341D();
                    String m79342C = c36679Vq8.m79342C();
                    Iterator it = m79341D.iterator();
                    while (it.hasNext()) {
                        InterfaceC37164Xs7 m36114a = this.f119496a.m36114a(this.f119497b, (C32485Ds8) it.next());
                        if (m36114a instanceof C53038zq7) {
                            C38159am8 c38159am8 = this.f119497b;
                            if (!c38159am8.m70751h(m79342C)) {
                                abstractC40557en7 = null;
                            } else {
                                InterfaceC37164Xs7 m70755d = c38159am8.m70755d(m79342C);
                                if (m70755d instanceof AbstractC40557en7) {
                                    abstractC40557en7 = (AbstractC40557en7) m70755d;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(m79342C)));
                                }
                            }
                            if (abstractC40557en7 != null) {
                                abstractC40557en7.mo4521d(this.f119497b, Collections.singletonList(m36114a));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(m79342C)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void m3519d(String str, Callable callable) {
        this.f119496a.f85633d.m19570a(str, callable);
    }

    /* renamed from: e */
    public final boolean m3518e(C35175Pf7 c35175Pf7) throws zzd {
        try {
            this.f119498c.m91681d(c35175Pf7);
            this.f119496a.f85632c.m70752g("runtime.counter", new C44105km7(Double.valueOf(0.0d)));
            this.f119499d.m99407b(this.f119497b.m70758a(), this.f119498c);
            if (!m3516g()) {
                if (!m3517f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean m3517f() {
        return !this.f119498c.m91682c().isEmpty();
    }

    /* renamed from: g */
    public final boolean m3516g() {
        C34950Og7 c34950Og7 = this.f119498c;
        return !c34950Og7.m91683b().equals(c34950Og7.m91684a());
    }
}
