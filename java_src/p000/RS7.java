package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: RS7 */
/* loaded from: classes5.dex */
public final class RS7 implements InterfaceC49325tb1 {

    /* renamed from: d */
    public static final InterfaceC34919Od3 f32060d = AS7.f572a;

    /* renamed from: a */
    public final Map f32061a = new HashMap();

    /* renamed from: b */
    public final Map f32062b = new HashMap();

    /* renamed from: c */
    public final InterfaceC34919Od3 f32063c = f32060d;

    @Override // p000.InterfaceC49325tb1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC49325tb1 mo12026a(Class cls, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f32061a.put(cls, interfaceC34919Od3);
        this.f32062b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C41550gT7 m86736b() {
        return new C41550gT7(new HashMap(this.f32061a), new HashMap(this.f32062b), this.f32063c);
    }
}
