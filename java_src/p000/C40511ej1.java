package p000;

import java.util.List;
/* renamed from: ej1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40511ej1 {

    /* renamed from: a */
    public final int f78734a;

    /* renamed from: b */
    public final List f78735b;

    public C40511ej1(int i, List list) {
        this.f78734a = i;
        this.f78735b = list;
    }

    public String toString() {
        Ht9 m43498a = C40046dv9.m43498a("FaceContour");
        m43498a.m103238b("type", this.f78734a);
        m43498a.m103237c("points", this.f78735b.toArray());
        return m43498a.toString();
    }
}
