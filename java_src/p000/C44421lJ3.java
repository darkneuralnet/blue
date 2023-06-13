package p000;

import android.graphics.Path;
import android.graphics.PointF;
/* renamed from: lJ3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44421lJ3 extends C41125fl2<PointF> {

    /* renamed from: q */
    public Path f95868q;

    /* renamed from: r */
    public final C41125fl2<PointF> f95869r;

    public C44421lJ3(C47924rD2 c47924rD2, C41125fl2<PointF> c41125fl2) {
        super(c47924rD2, c41125fl2.f80564b, c41125fl2.f80565c, c41125fl2.f80566d, c41125fl2.f80567e, c41125fl2.f80568f, c41125fl2.f80569g, c41125fl2.f80570h);
        this.f95869r = c41125fl2;
        m27428j();
    }

    /* renamed from: j */
    public void m27428j() {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3 = this.f80565c;
        if (obj3 != null && (obj2 = this.f80564b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) {
            z = true;
        } else {
            z = false;
        }
        Object obj4 = this.f80564b;
        if (obj4 != null && (obj = this.f80565c) != null && !z) {
            C41125fl2<PointF> c41125fl2 = this.f95869r;
            this.f95868q = C33095Gi6.m104868d((PointF) obj4, (PointF) obj, c41125fl2.f80577o, c41125fl2.f80578p);
        }
    }

    /* renamed from: k */
    public Path m27427k() {
        return this.f95868q;
    }
}
