package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: s39  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48426s39 implements InterfaceC49325tb1 {

    /* renamed from: d */
    public static final InterfaceC34919Od3 f108189d = W29.f40312a;

    /* renamed from: a */
    public final Map f108190a = new HashMap();

    /* renamed from: b */
    public final Map f108191b = new HashMap();

    /* renamed from: c */
    public final InterfaceC34919Od3 f108192c = f108189d;

    @Override // p000.InterfaceC49325tb1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC49325tb1 mo12026a(Class cls, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f108190a.put(cls, interfaceC34919Od3);
        this.f108191b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final B39 m14818b() {
        return new B39(new HashMap(this.f108190a), new HashMap(this.f108191b), this.f108192c);
    }
}
