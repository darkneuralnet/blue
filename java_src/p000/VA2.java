package p000;

import android.widget.EditText;
import com.uber.autodispose.ScopeProvider;
/* renamed from: VA2 */
/* loaded from: classes2.dex */
public final class VA2 implements UA2 {

    /* renamed from: a */
    public final WA2 f38704a;

    public VA2(WA2 wa2) {
        this.f38704a = wa2;
    }

    /* renamed from: b */
    public static Y94<UA2> m80263b(WA2 wa2) {
        return C39546d52.m44621a(new VA2(wa2));
    }

    @Override // p000.UA2
    /* renamed from: a */
    public TA2 mo80264a(QA2 qa2, ScopeProvider scopeProvider, EditText editText) {
        return this.f38704a.m78771b(qa2, scopeProvider, editText);
    }
}
