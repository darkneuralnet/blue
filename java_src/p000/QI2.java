package p000;

import android.content.Context;
/* renamed from: QI2 */
/* loaded from: classes4.dex */
public final class QI2 implements InterfaceC48812sj1<InterfaceC48923su2> {

    /* renamed from: a */
    public final VH2 f30190a;

    /* renamed from: b */
    public final Y94<Context> f30191b;

    /* renamed from: c */
    public final Y94<InterfaceC41671gg5> f30192c;

    /* renamed from: d */
    public final Y94<AbstractC5089Lo> f30193d;

    /* renamed from: e */
    public final Y94<InterfaceC9184Wo> f30194e;

    /* renamed from: f */
    public final Y94<InterfaceC6909Qo> f30195f;

    public QI2(VH2 vh2, Y94<Context> y94, Y94<InterfaceC41671gg5> y942, Y94<AbstractC5089Lo> y943, Y94<InterfaceC9184Wo> y944, Y94<InterfaceC6909Qo> y945) {
        this.f30190a = vh2;
        this.f30191b = y94;
        this.f30192c = y942;
        this.f30193d = y943;
        this.f30194e = y944;
        this.f30195f = y945;
    }

    /* renamed from: a */
    public static QI2 m88664a(VH2 vh2, Y94<Context> y94, Y94<InterfaceC41671gg5> y942, Y94<AbstractC5089Lo> y943, Y94<InterfaceC9184Wo> y944, Y94<InterfaceC6909Qo> y945) {
        return new QI2(vh2, y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static InterfaceC48923su2 m88662c(VH2 vh2, Context context, InterfaceC41671gg5 interfaceC41671gg5, AbstractC5089Lo abstractC5089Lo, InterfaceC9184Wo interfaceC9184Wo, InterfaceC6909Qo interfaceC6909Qo) {
        return (InterfaceC48923su2) C51679xZ3.m5002e(vh2.m80078V(context, interfaceC41671gg5, abstractC5089Lo, interfaceC9184Wo, interfaceC6909Qo));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC48923su2 get() {
        return m88662c(this.f30190a, this.f30191b.get(), this.f30192c.get(), this.f30193d.get(), this.f30194e.get(), this.f30195f.get());
    }
}
