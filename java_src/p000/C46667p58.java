package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: p58  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46667p58 extends NV7 {
    @Override // p000.NV7
    /* renamed from: d */
    public final C51629xT7 mo7460a(C37003Xa8 c37003Xa8) throws IOException {
        int m76825q = c37003Xa8.m76825q() - 1;
        if (m76825q != 0) {
            if (m76825q != 2) {
                if (m76825q != 5) {
                    if (m76825q != 6) {
                        if (m76825q != 7) {
                            if (m76825q == 8) {
                                c37003Xa8.m76830k();
                                return VT7.f39133b;
                            }
                            throw new IllegalArgumentException();
                        }
                        return new YU7(Boolean.valueOf(c37003Xa8.m76826p()));
                    }
                    return new YU7(new CW7(c37003Xa8.m76835c()));
                }
                return new YU7(c37003Xa8.m76835c());
            }
            C43931kU7 c43931kU7 = new C43931kU7();
            c37003Xa8.m76833f();
            while (c37003Xa8.m76828m()) {
                c43931kU7.m28916f(c37003Xa8.m76836b(), mo7460a(c37003Xa8));
            }
            c37003Xa8.m76831i();
            return c43931kU7;
        }
        C42736iT7 c42736iT7 = new C42736iT7();
        c37003Xa8.m76834d();
        while (c37003Xa8.m76828m()) {
            c42736iT7.m33864b(mo7460a(c37003Xa8));
        }
        c37003Xa8.m76832g();
        return c42736iT7;
    }

    @Override // p000.NV7
    /* renamed from: e */
    public final void mo7459b(C31630Ab8 c31630Ab8, C51629xT7 c51629xT7) throws IOException {
        if (c51629xT7 != null && !(c51629xT7 instanceof VT7)) {
            if (c51629xT7 instanceof YU7) {
                YU7 yu7 = (YU7) c51629xT7;
                if (yu7.m74987j()) {
                    c31630Ab8.m115462i(yu7.m74991c());
                    return;
                } else if (yu7.m74988h()) {
                    c31630Ab8.m115460l(yu7.m74989f());
                    return;
                } else {
                    c31630Ab8.m115461k(yu7.m74990e());
                    return;
                }
            } else if (c51629xT7 instanceof C42736iT7) {
                c31630Ab8.m115468a();
                Iterator it = ((C42736iT7) c51629xT7).iterator();
                while (it.hasNext()) {
                    mo7459b(c31630Ab8, (C51629xT7) it.next());
                }
                c31630Ab8.m115466c();
                return;
            } else if (c51629xT7 instanceof C43931kU7) {
                c31630Ab8.m115467b();
                for (Map.Entry entry : c51629xT7.m5236a().m28917e()) {
                    c31630Ab8.m115464f((String) entry.getKey());
                    mo7459b(c31630Ab8, (C51629xT7) entry.getValue());
                }
                c31630Ab8.m115465d();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(c51629xT7.getClass())));
            }
        }
        c31630Ab8.m115463g();
    }
}
