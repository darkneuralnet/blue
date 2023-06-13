package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: kH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43808kH1 implements InterfaceC48812sj1<C42622iH1> {

    /* renamed from: a */
    public final Y94<XF1> f94187a;

    /* renamed from: b */
    public final Y94<N92> f94188b;

    /* renamed from: c */
    public final Y94<InterfaceC46473om3> f94189c;

    /* renamed from: d */
    public final Y94<InterfaceC7381SM> f94190d;

    /* renamed from: e */
    public final Y94<NQ5> f94191e;

    /* renamed from: f */
    public final Y94<InterfaceC35443Qj5> f94192f;

    /* renamed from: g */
    public final Y94<C36207Tq4> f94193g;

    /* renamed from: h */
    public final Y94<ScopeProvider> f94194h;

    /* renamed from: i */
    public final Y94<InterfaceC40099e13> f94195i;

    public C43808kH1(Y94<XF1> y94, Y94<N92> y942, Y94<InterfaceC46473om3> y943, Y94<InterfaceC7381SM> y944, Y94<NQ5> y945, Y94<InterfaceC35443Qj5> y946, Y94<C36207Tq4> y947, Y94<ScopeProvider> y948, Y94<InterfaceC40099e13> y949) {
        this.f94187a = y94;
        this.f94188b = y942;
        this.f94189c = y943;
        this.f94190d = y944;
        this.f94191e = y945;
        this.f94192f = y946;
        this.f94193g = y947;
        this.f94194h = y948;
        this.f94195i = y949;
    }

    /* renamed from: a */
    public static C43808kH1 m29108a(Y94<XF1> y94, Y94<N92> y942, Y94<InterfaceC46473om3> y943, Y94<InterfaceC7381SM> y944, Y94<NQ5> y945, Y94<InterfaceC35443Qj5> y946, Y94<C36207Tq4> y947, Y94<ScopeProvider> y948, Y94<InterfaceC40099e13> y949) {
        return new C43808kH1(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static C42622iH1 m29106c(XF1 xf1, N92 n92, InterfaceC46473om3 interfaceC46473om3, InterfaceC7381SM interfaceC7381SM, NQ5 nq5, InterfaceC35443Qj5 interfaceC35443Qj5, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return new C42622iH1(xf1, n92, interfaceC46473om3, interfaceC7381SM, nq5, interfaceC35443Qj5, c36207Tq4, scopeProvider, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42622iH1 get() {
        return m29106c(this.f94187a.get(), this.f94188b.get(), this.f94189c.get(), this.f94190d.get(), this.f94191e.get(), this.f94192f.get(), this.f94193g.get(), this.f94194h.get(), this.f94195i.get());
    }
}
