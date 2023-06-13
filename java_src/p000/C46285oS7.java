package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: oS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46285oS7 implements InterfaceC49325tb1 {

    /* renamed from: d */
    public static final InterfaceC34919Od3 f102028d = ZR7.f48578a;

    /* renamed from: a */
    public final Map f102029a = new HashMap();

    /* renamed from: b */
    public final Map f102030b = new HashMap();

    /* renamed from: c */
    public final InterfaceC34919Od3 f102031c = f102028d;

    @Override // p000.InterfaceC49325tb1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC49325tb1 mo12026a(Class cls, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f102029a.put(cls, interfaceC34919Od3);
        this.f102030b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final CS7 m21040b() {
        return new CS7(new HashMap(this.f102029a), new HashMap(this.f102030b), this.f102031c);
    }
}
