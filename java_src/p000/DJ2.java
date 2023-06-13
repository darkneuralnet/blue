package p000;

import android.content.Context;
/* renamed from: DJ2 */
/* loaded from: classes4.dex */
public final class DJ2 implements InterfaceC48812sj1<InterfaceC39904dh6> {

    /* renamed from: a */
    public final VH2 f5511a;

    /* renamed from: b */
    public final Y94<Context> f5512b;

    /* renamed from: c */
    public final Y94<InterfaceC6181Op> f5513c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f5514d;

    /* renamed from: e */
    public final Y94<InterfaceC22767hq> f5515e;

    /* renamed from: f */
    public final Y94<InterfaceC35660Rh6> f5516f;

    /* renamed from: g */
    public final Y94<InterfaceC44647lh6> f5517g;

    /* renamed from: h */
    public final Y94<InterfaceC40099e13> f5518h;

    public DJ2(VH2 vh2, Y94<Context> y94, Y94<InterfaceC6181Op> y942, Y94<C36207Tq4> y943, Y94<InterfaceC22767hq> y944, Y94<InterfaceC35660Rh6> y945, Y94<InterfaceC44647lh6> y946, Y94<InterfaceC40099e13> y947) {
        this.f5511a = vh2;
        this.f5512b = y94;
        this.f5513c = y942;
        this.f5514d = y943;
        this.f5515e = y944;
        this.f5516f = y945;
        this.f5517g = y946;
        this.f5518h = y947;
    }

    /* renamed from: a */
    public static DJ2 m110581a(VH2 vh2, Y94<Context> y94, Y94<InterfaceC6181Op> y942, Y94<C36207Tq4> y943, Y94<InterfaceC22767hq> y944, Y94<InterfaceC35660Rh6> y945, Y94<InterfaceC44647lh6> y946, Y94<InterfaceC40099e13> y947) {
        return new DJ2(vh2, y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static InterfaceC39904dh6 m110579c(VH2 vh2, Context context, InterfaceC6181Op interfaceC6181Op, C36207Tq4 c36207Tq4, InterfaceC22767hq interfaceC22767hq, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC40099e13 interfaceC40099e13) {
        return (InterfaceC39904dh6) C51679xZ3.m5002e(vh2.m80101J0(context, interfaceC6181Op, c36207Tq4, interfaceC22767hq, interfaceC35660Rh6, interfaceC44647lh6, interfaceC40099e13));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39904dh6 get() {
        return m110579c(this.f5511a, this.f5512b.get(), this.f5513c.get(), this.f5514d.get(), this.f5515e.get(), this.f5516f.get(), this.f5517g.get(), this.f5518h.get());
    }
}
