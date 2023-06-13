package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Oa7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34896Oa7 {

    /* renamed from: b */
    public static volatile C34896Oa7 f26795b;

    /* renamed from: c */
    public static final C34896Oa7 f26796c = new C34896Oa7(true);

    /* renamed from: a */
    public final Map f26797a;

    public C34896Oa7() {
        this.f26797a = new HashMap();
    }

    /* renamed from: a */
    public static C34896Oa7 m92005a() {
        return f26796c;
    }

    /* renamed from: b */
    public static C34896Oa7 m92004b() {
        C34896Oa7 c34896Oa7 = f26795b;
        if (c34896Oa7 != null) {
            return c34896Oa7;
        }
        synchronized (C34896Oa7.class) {
            C34896Oa7 c34896Oa72 = f26795b;
            if (c34896Oa72 != null) {
                return c34896Oa72;
            }
            C34896Oa7 m74887b = AbstractC37236Ya7.m74887b(C34896Oa7.class);
            f26795b = m74887b;
            return m74887b;
        }
    }

    /* renamed from: c */
    public final C40437eb7 m92003c(InterfaceC36075Tb7 interfaceC36075Tb7, int i) {
        return (C40437eb7) this.f26797a.get(new C34662Na7(interfaceC36075Tb7, i));
    }

    public C34896Oa7(boolean z) {
        this.f26797a = Collections.emptyMap();
    }
}
