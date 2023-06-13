package p000;

import android.content.Context;
import io.reactivex.Observable;
/* renamed from: Qr4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35514Qr4 {
    /* renamed from: a */
    public static void m87863a(A62 a62) {
        BZ3.m113862c(a62, "strategy == null");
    }

    /* renamed from: b */
    public static Observable<Boolean> m87862b() {
        C52599z62 m1818b = C52599z62.m1818b();
        return m87861c(m1818b.m1811i(), m1818b.m1814f(), m1818b.m1813g(), m1818b.m1816d(), m1818b.m1812h(), m1818b.m1810j(), m1818b.m1815e(), m1818b.m1817c());
    }

    /* renamed from: c */
    public static Observable<Boolean> m87861c(A62 a62, int i, int i2, String str, int i3, int i4, int i5, InterfaceC41667gg1 interfaceC41667gg1) {
        m87863a(a62);
        return a62.mo91155a(i, i2, str, i3, i4, i5, interfaceC41667gg1);
    }

    /* renamed from: d */
    public static Observable<C32063By0> m87860d(Context context) {
        I73 c39211cZ3;
        if (BZ3.m113859f()) {
            c39211cZ3 = new C46226oM2();
        } else if (BZ3.m113860e()) {
            c39211cZ3 = new C41265fz2();
        } else {
            c39211cZ3 = new C39211cZ3();
        }
        return m87859e(context, c39211cZ3);
    }

    /* renamed from: e */
    public static Observable<C32063By0> m87859e(Context context, I73 i73) {
        BZ3.m113862c(context, "context == null");
        BZ3.m113862c(i73, "strategy == null");
        return i73.mo21300a(context);
    }
}
