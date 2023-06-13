package p000;

import android.graphics.PointF;
/* renamed from: XX3 */
/* loaded from: classes2.dex */
public class XX3 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f43362a;

    /* renamed from: b */
    public final EnumC9423a f43363b;

    /* renamed from: c */
    public final C27640qe f43364c;

    /* renamed from: d */
    public final InterfaceC2901Ge<PointF, PointF> f43365d;

    /* renamed from: e */
    public final C27640qe f43366e;

    /* renamed from: f */
    public final C27640qe f43367f;

    /* renamed from: g */
    public final C27640qe f43368g;

    /* renamed from: h */
    public final C27640qe f43369h;

    /* renamed from: i */
    public final C27640qe f43370i;

    /* renamed from: j */
    public final boolean f43371j;

    /* renamed from: k */
    public final boolean f43372k;

    /* renamed from: XX3$a */
    /* loaded from: classes2.dex */
    public enum EnumC9423a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: b */
        public final int f43376b;

        EnumC9423a(int i) {
            this.f43376b = i;
        }

        /* renamed from: b */
        public static EnumC9423a m76896b(int i) {
            EnumC9423a[] values;
            for (EnumC9423a enumC9423a : values()) {
                if (enumC9423a.f43376b == i) {
                    return enumC9423a;
                }
            }
            return null;
        }
    }

    public XX3(String str, EnumC9423a enumC9423a, C27640qe c27640qe, InterfaceC2901Ge<PointF, PointF> interfaceC2901Ge, C27640qe c27640qe2, C27640qe c27640qe3, C27640qe c27640qe4, C27640qe c27640qe5, C27640qe c27640qe6, boolean z, boolean z2) {
        this.f43362a = str;
        this.f43363b = enumC9423a;
        this.f43364c = c27640qe;
        this.f43365d = interfaceC2901Ge;
        this.f43366e = c27640qe2;
        this.f43367f = c27640qe3;
        this.f43368g = c27640qe4;
        this.f43369h = c27640qe5;
        this.f43370i = c27640qe6;
        this.f43371j = z;
        this.f43372k = z2;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new WX3(rd2, abstractC27525qB, this);
    }

    /* renamed from: b */
    public C27640qe m76908b() {
        return this.f43367f;
    }

    /* renamed from: c */
    public C27640qe m76907c() {
        return this.f43369h;
    }

    /* renamed from: d */
    public String m76906d() {
        return this.f43362a;
    }

    /* renamed from: e */
    public C27640qe m76905e() {
        return this.f43368g;
    }

    /* renamed from: f */
    public C27640qe m76904f() {
        return this.f43370i;
    }

    /* renamed from: g */
    public C27640qe m76903g() {
        return this.f43364c;
    }

    /* renamed from: h */
    public InterfaceC2901Ge<PointF, PointF> m76902h() {
        return this.f43365d;
    }

    /* renamed from: i */
    public C27640qe m76901i() {
        return this.f43366e;
    }

    /* renamed from: j */
    public EnumC9423a m76900j() {
        return this.f43363b;
    }

    /* renamed from: k */
    public boolean m76899k() {
        return this.f43371j;
    }

    /* renamed from: l */
    public boolean m76898l() {
        return this.f43372k;
    }
}
