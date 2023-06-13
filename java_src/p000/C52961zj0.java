package p000;

import android.graphics.PointF;
/* renamed from: zj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52961zj0 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f122112a;

    /* renamed from: b */
    public final InterfaceC2901Ge<PointF, PointF> f122113b;

    /* renamed from: c */
    public final C30260xe f122114c;

    /* renamed from: d */
    public final boolean f122115d;

    /* renamed from: e */
    public final boolean f122116e;

    public C52961zj0(String str, InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge, C30260xe c30260xe, boolean z, boolean z2) {
        this.f122112a = str;
        this.f122113b = interfaceC2901Ge;
        this.f122114c = c30260xe;
        this.f122115d = z;
        this.f122116e = z2;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new C46944pa1(rd2, abstractC27525qB, this);
    }

    /* renamed from: b */
    public String m482b() {
        return this.f122112a;
    }

    /* renamed from: c */
    public InterfaceC2901Ge<PointF, PointF> m481c() {
        return this.f122113b;
    }

    /* renamed from: d */
    public C30260xe m480d() {
        return this.f122114c;
    }

    /* renamed from: e */
    public boolean m479e() {
        return this.f122116e;
    }

    /* renamed from: f */
    public boolean m478f() {
        return this.f122115d;
    }
}
