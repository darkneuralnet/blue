package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: qX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47516qX7 implements InterfaceC49325tb1 {

    /* renamed from: d */
    public static final InterfaceC34919Od3 f105383d = C38604bX7.f57679a;

    /* renamed from: a */
    public final Map f105384a = new HashMap();

    /* renamed from: b */
    public final Map f105385b = new HashMap();

    /* renamed from: c */
    public final InterfaceC34919Od3 f105386c = f105383d;

    @Override // p000.InterfaceC49325tb1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC49325tb1 mo12026a(Class cls, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f105384a.put(cls, interfaceC34919Od3);
        this.f105385b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final FX7 m17468b() {
        return new FX7(new HashMap(this.f105384a), new HashMap(this.f105385b), this.f105386c);
    }
}
