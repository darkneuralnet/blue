package p000;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
/* renamed from: Ys4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C37395Ys4 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f47579a;

    /* renamed from: b */
    public final InterfaceC2901Ge<PointF, PointF> f47580b;

    /* renamed from: c */
    public final InterfaceC2901Ge<PointF, PointF> f47581c;

    /* renamed from: d */
    public final C27640qe f47582d;

    /* renamed from: e */
    public final boolean f47583e;

    public C37395Ys4(String str, InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge, InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge2, C27640qe c27640qe, boolean z) {
        this.f47579a = str;
        this.f47580b = interfaceC2901Ge;
        this.f47581c = interfaceC2901Ge2;
        this.f47582d = c27640qe;
        this.f47583e = z;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new C36459Us4(rd2, abstractC27525qB, this);
    }

    /* renamed from: b */
    public C27640qe m74050b() {
        return this.f47582d;
    }

    /* renamed from: c */
    public String m74049c() {
        return this.f47579a;
    }

    /* renamed from: d */
    public InterfaceC2901Ge<PointF, PointF> m74048d() {
        return this.f47580b;
    }

    /* renamed from: e */
    public InterfaceC2901Ge<PointF, PointF> m74047e() {
        return this.f47581c;
    }

    /* renamed from: f */
    public boolean m74046f() {
        return this.f47583e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f47580b + ", size=" + this.f47581c + CoreConstants.CURLY_RIGHT;
    }
}
