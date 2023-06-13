package p000;

import android.content.Context;
/* renamed from: IJ2 */
/* loaded from: classes4.dex */
public final class IJ2 implements InterfaceC48812sj1<InterfaceC48847sm6> {

    /* renamed from: a */
    public final VH2 f15302a;

    /* renamed from: b */
    public final Y94<Context> f15303b;

    /* renamed from: c */
    public final Y94<InterfaceC10732aY> f15304c;

    public IJ2(VH2 vh2, Y94<Context> y94, Y94<InterfaceC10732aY> y942) {
        this.f15302a = vh2;
        this.f15303b = y94;
        this.f15304c = y942;
    }

    /* renamed from: a */
    public static IJ2 m102527a(VH2 vh2, Y94<Context> y94, Y94<InterfaceC10732aY> y942) {
        return new IJ2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC48847sm6 m102525c(VH2 vh2, Context context, InterfaceC10732aY interfaceC10732aY) {
        return (InterfaceC48847sm6) C51679xZ3.m5002e(vh2.m80091O0(context, interfaceC10732aY));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC48847sm6 get() {
        return m102525c(this.f15302a, this.f15303b.get(), this.f15304c.get());
    }
}
