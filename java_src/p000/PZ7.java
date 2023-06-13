package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: PZ7 */
/* loaded from: classes5.dex */
public final class PZ7 implements InterfaceC49325tb1 {

    /* renamed from: d */
    public static final InterfaceC34919Od3 f28702d = BZ7.f2525a;

    /* renamed from: a */
    public final Map f28703a = new HashMap();

    /* renamed from: b */
    public final Map f28704b = new HashMap();

    /* renamed from: c */
    public final InterfaceC34919Od3 f28705c = f28702d;

    @Override // p000.InterfaceC49325tb1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC49325tb1 mo12026a(Class cls, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f28703a.put(cls, interfaceC34919Od3);
        this.f28704b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C39502d08 m90085b() {
        return new C39502d08(new HashMap(this.f28703a), new HashMap(this.f28704b), this.f28705c);
    }
}
