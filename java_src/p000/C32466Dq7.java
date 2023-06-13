package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: Dq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32466Dq7 implements InterfaceC49325tb1 {

    /* renamed from: d */
    public static final InterfaceC34919Od3 f6422d = C33861Jp7.f18305a;

    /* renamed from: a */
    public final Map f6423a = new HashMap();

    /* renamed from: b */
    public final Map f6424b = new HashMap();

    /* renamed from: c */
    public final InterfaceC34919Od3 f6425c = f6422d;

    @Override // p000.InterfaceC49325tb1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC49325tb1 mo12026a(Class cls, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f6423a.put(cls, interfaceC34919Od3);
        this.f6424b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C50084ur7 m109853b() {
        return new C50084ur7(new HashMap(this.f6423a), new HashMap(this.f6424b), this.f6425c);
    }
}
