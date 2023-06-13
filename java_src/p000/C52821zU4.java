package p000;

import co.bird.api.response.BeginnerModeRiderMapAction;
import com.uber.autodispose.ScopeProvider;
import java.util.List;
/* renamed from: zU4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52821zU4 implements InterfaceC52228yU4 {

    /* renamed from: a */
    public final AU4 f121411a;

    public C52821zU4(AU4 au4) {
        this.f121411a = au4;
    }

    /* renamed from: b */
    public static Y94<InterfaceC52228yU4> m1319b(AU4 au4) {
        return C39546d52.m44621a(new C52821zU4(au4));
    }

    @Override // p000.InterfaceC52228yU4
    /* renamed from: a */
    public C51635xU4 mo1320a(ScopeProvider scopeProvider, List<BeginnerModeRiderMapAction> list, String str, String str2, BU4 bu4) {
        return this.f121411a.m115727b(scopeProvider, list, str, str2, bu4);
    }
}
