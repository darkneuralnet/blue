package p000;

import co.bird.android.app.feature.map.p008ui.MapBirdUi;
import com.uber.autodispose.ScopeProvider;
/* renamed from: LO */
/* loaded from: classes2.dex */
public final class C4905LO implements InterfaceC4417KO {

    /* renamed from: a */
    public final C5288MO f21362a;

    public C4905LO(C5288MO c5288mo) {
        this.f21362a = c5288mo;
    }

    /* renamed from: b */
    public static Y94<InterfaceC4417KO> m96972b(C5288MO c5288mo) {
        return C39546d52.m44621a(new C4905LO(c5288mo));
    }

    @Override // p000.InterfaceC4417KO
    /* renamed from: a */
    public C4060JO mo96973a(ScopeProvider scopeProvider, MapBirdUi mapBirdUi, C36207Tq4 c36207Tq4, InterfaceC37617Zr1 interfaceC37617Zr1) {
        return this.f21362a.m95321b(scopeProvider, mapBirdUi, c36207Tq4, interfaceC37617Zr1);
    }
}
