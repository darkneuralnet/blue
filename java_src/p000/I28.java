package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: I28 */
/* loaded from: classes5.dex */
public final class I28 implements InterfaceC49325tb1 {

    /* renamed from: d */
    public static final InterfaceC34919Od3 f14371d = C50193v28.f113426a;

    /* renamed from: a */
    public final Map f14372a = new HashMap();

    /* renamed from: b */
    public final Map f14373b = new HashMap();

    /* renamed from: c */
    public final InterfaceC34919Od3 f14374c = f14371d;

    @Override // p000.InterfaceC49325tb1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC49325tb1 mo12026a(Class cls, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f14372a.put(cls, interfaceC34919Od3);
        this.f14373b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final V28 m103039b() {
        return new V28(new HashMap(this.f14372a), new HashMap(this.f14373b), this.f14374c);
    }
}
