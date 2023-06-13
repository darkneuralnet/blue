package p000;

import co.bird.api.response.BeginnerModeRiderMapAction;
import com.uber.autodispose.ScopeProvider;
import java.util.List;
/* renamed from: AU4 */
/* loaded from: classes2.dex */
public final class AU4 {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f628a;

    /* renamed from: b */
    public final Y94<InterfaceC41018fa5> f629b;

    public AU4(Y94<InterfaceC40099e13> y94, Y94<InterfaceC41018fa5> y942) {
        this.f628a = y94;
        this.f629b = y942;
    }

    /* renamed from: a */
    public static AU4 m115728a(Y94<InterfaceC40099e13> y94, Y94<InterfaceC41018fa5> y942) {
        return new AU4(y94, y942);
    }

    /* renamed from: c */
    public static C51635xU4 m115726c(InterfaceC40099e13 interfaceC40099e13, InterfaceC41018fa5 interfaceC41018fa5, ScopeProvider scopeProvider, List<BeginnerModeRiderMapAction> list, String str, String str2, BU4 bu4) {
        return new C51635xU4(interfaceC40099e13, interfaceC41018fa5, scopeProvider, list, str, str2, bu4);
    }

    /* renamed from: b */
    public C51635xU4 m115727b(ScopeProvider scopeProvider, List<BeginnerModeRiderMapAction> list, String str, String str2, BU4 bu4) {
        return m115726c(this.f628a.get(), this.f629b.get(), scopeProvider, list, str, str2, bu4);
    }
}
