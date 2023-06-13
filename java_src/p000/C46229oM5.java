package p000;
/* renamed from: oM5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46229oM5 extends C41391gC1 {

    /* renamed from: g */
    public double f101846g;

    /* renamed from: h */
    public C52053yB0[] f101847h;

    /* renamed from: i */
    public boolean f101848i = false;

    public C46229oM5(double d, C52053yB0[] c52053yB0Arr) {
        this.f101846g = d;
        this.f101847h = c52053yB0Arr;
    }

    @Override // p000.C41391gC1
    /* renamed from: c */
    public EB0 mo21259c(EB0 eb0, WB1 wb1) {
        return this.f81768b.m64829z().mo107445c(m21258l(eb0.mo1712b2(), this.f101847h));
    }

    /* renamed from: l */
    public final C52053yB0[] m21258l(C52053yB0[] c52053yB0Arr, C52053yB0[] c52053yB0Arr2) {
        C32236Cr2 c32236Cr2 = new C32236Cr2(c52053yB0Arr, this.f101846g);
        c32236Cr2.m111405d(this.f101848i);
        return c32236Cr2.m111403f(c52053yB0Arr2);
    }
}
