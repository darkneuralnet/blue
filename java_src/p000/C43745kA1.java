package p000;

import co.bird.android.model.wire.WireFrequentFlyerView;
import com.uber.autodispose.ScopeProvider;
/* renamed from: kA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43745kA1 implements InterfaceC48812sj1<C43152jA1> {

    /* renamed from: a */
    public final Y94<WireFrequentFlyerView> f94045a;

    /* renamed from: b */
    public final Y94<InterfaceC45524nA1> f94046b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f94047c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f94048d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f94049e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f94050f;

    public C43745kA1(Y94<WireFrequentFlyerView> y94, Y94<InterfaceC45524nA1> y942, Y94<C36207Tq4> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<InterfaceC1880Ea> y946) {
        this.f94045a = y94;
        this.f94046b = y942;
        this.f94047c = y943;
        this.f94048d = y944;
        this.f94049e = y945;
        this.f94050f = y946;
    }

    /* renamed from: a */
    public static C43745kA1 m29205a(Y94<WireFrequentFlyerView> y94, Y94<InterfaceC45524nA1> y942, Y94<C36207Tq4> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<InterfaceC1880Ea> y946) {
        return new C43745kA1(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C43152jA1 m29203c(WireFrequentFlyerView wireFrequentFlyerView, InterfaceC45524nA1 interfaceC45524nA1, C36207Tq4 c36207Tq4, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, InterfaceC1880Ea interfaceC1880Ea) {
        return new C43152jA1(wireFrequentFlyerView, interfaceC45524nA1, c36207Tq4, interfaceC40099e13, scopeProvider, interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43152jA1 get() {
        return m29203c(this.f94045a.get(), this.f94046b.get(), this.f94047c.get(), this.f94048d.get(), this.f94049e.get(), this.f94050f.get());
    }
}
