package p000;
/* renamed from: vJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50348vJ2 implements InterfaceC48812sj1<NQ5> {

    /* renamed from: a */
    public final VH2 f113825a;

    /* renamed from: b */
    public final Y94<MQ5> f113826b;

    public C50348vJ2(VH2 vh2, Y94<MQ5> y94) {
        this.f113825a = vh2;
        this.f113826b = y94;
    }

    /* renamed from: a */
    public static C50348vJ2 m8910a(VH2 vh2, Y94<MQ5> y94) {
        return new C50348vJ2(vh2, y94);
    }

    /* renamed from: c */
    public static NQ5 m8908c(VH2 vh2, MQ5 mq5) {
        return (NQ5) C51679xZ3.m5002e(vh2.m80117B0(mq5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public NQ5 get() {
        return m8908c(this.f113825a, this.f113826b.get());
    }
}
