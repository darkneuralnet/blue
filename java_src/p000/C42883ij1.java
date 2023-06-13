package p000;

import android.graphics.PointF;
/* renamed from: ij1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42883ij1 {

    /* renamed from: a */
    public final int f87788a;

    /* renamed from: b */
    public final PointF f87789b;

    public C42883ij1(int i, PointF pointF) {
        this.f87788a = i;
        this.f87789b = pointF;
    }

    public String toString() {
        Ht9 m43498a = C40046dv9.m43498a("FaceLandmark");
        m43498a.m103238b("type", this.f87788a);
        m43498a.m103237c("position", this.f87789b);
        return m43498a.toString();
    }
}
