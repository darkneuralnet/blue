package p000;

import android.widget.EditText;
import com.uber.autodispose.ScopeProvider;
/* renamed from: WA2 */
/* loaded from: classes2.dex */
public final class WA2 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f40509a;

    public WA2(Y94<InterfaceC1880Ea> y94) {
        this.f40509a = y94;
    }

    /* renamed from: a */
    public static WA2 m78772a(Y94<InterfaceC1880Ea> y94) {
        return new WA2(y94);
    }

    /* renamed from: c */
    public static TA2 m78770c(InterfaceC1880Ea interfaceC1880Ea, QA2 qa2, ScopeProvider scopeProvider, EditText editText) {
        return new TA2(interfaceC1880Ea, qa2, scopeProvider, editText);
    }

    /* renamed from: b */
    public TA2 m78771b(QA2 qa2, ScopeProvider scopeProvider, EditText editText) {
        return m78770c(this.f40509a.get(), qa2, scopeProvider, editText);
    }
}
