package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: cx9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39474cx9 extends Zv9 {
    @Override // p000.Zv9
    /* renamed from: d */
    public final Pv9 mo29592a(Vx9 vx9) throws IOException {
        int m79052q = vx9.m79052q() - 1;
        if (m79052q != 0) {
            if (m79052q != 2) {
                if (m79052q != 5) {
                    if (m79052q != 6) {
                        if (m79052q != 7) {
                            if (m79052q == 8) {
                                vx9.m79057k();
                                return Sv9.f34502b;
                            }
                            throw new IllegalArgumentException();
                        }
                        return new Xv9(Boolean.valueOf(vx9.m79053p()));
                    }
                    return new Xv9(new C39464cw9(vx9.m79062c()));
                }
                return new Xv9(vx9.m79062c());
            }
            Uv9 uv9 = new Uv9();
            vx9.m79060f();
            while (vx9.m79055m()) {
                uv9.m80609f(vx9.m79063b(), mo29592a(vx9));
            }
            vx9.m79058i();
            return uv9;
        }
        Nv9 nv9 = new Nv9();
        vx9.m79061d();
        while (vx9.m79055m()) {
            nv9.m93189b(mo29592a(vx9));
        }
        vx9.m79059g();
        return nv9;
    }

    @Override // p000.Zv9
    /* renamed from: e */
    public final void mo29591b(Xx9 xx9, Pv9 pv9) throws IOException {
        if (pv9 != null && !(pv9 instanceof Sv9)) {
            if (pv9 instanceof Xv9) {
                Xv9 xv9 = (Xv9) pv9;
                if (xv9.m76047j()) {
                    xx9.m76014i(xv9.m76051c());
                    return;
                } else if (xv9.m76048h()) {
                    xx9.m76012l(xv9.m76049f());
                    return;
                } else {
                    xx9.m76013k(xv9.m76050e());
                    return;
                }
            } else if (pv9 instanceof Nv9) {
                xx9.m76020a();
                Iterator it = ((Nv9) pv9).iterator();
                while (it.hasNext()) {
                    mo29591b(xx9, (Pv9) it.next());
                }
                xx9.m76018c();
                return;
            } else if (pv9 instanceof Uv9) {
                xx9.m76019b();
                for (Map.Entry entry : pv9.m89367a().m80610e()) {
                    xx9.m76016f((String) entry.getKey());
                    mo29591b(xx9, (Pv9) entry.getValue());
                }
                xx9.m76017d();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(pv9.getClass())));
            }
        }
        xx9.m76015g();
    }
}
