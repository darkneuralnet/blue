package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: J28 */
/* loaded from: classes5.dex */
public final class J28 {

    /* renamed from: b */
    public static final J28 f16697b = new J28(true);

    /* renamed from: a */
    public final Map f16698a;

    public J28() {
        this.f16698a = new HashMap();
    }

    /* renamed from: a */
    public static J28 m101256a() {
        return f16697b;
    }

    /* renamed from: b */
    public final C47280q78 m101255b(InterfaceC39926dj8 interfaceC39926dj8, int i) {
        return (C47280q78) this.f16698a.get(new C50786w28(interfaceC39926dj8, i));
    }

    public J28(boolean z) {
        this.f16698a = Collections.emptyMap();
    }
}
