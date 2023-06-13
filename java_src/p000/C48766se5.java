package p000;

import java.util.Map;
import p000.C21;
/* renamed from: se5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48766se5 {

    /* renamed from: a */
    public final Map<String, C21> f109065a;

    /* renamed from: b */
    public final Z94<C21.InterfaceC0844a> f109066b;

    public C48766se5(D21 d21, Z94<C21.InterfaceC0844a> z94) {
        this.f109065a = d21;
        this.f109066b = z94;
    }

    /* renamed from: a */
    public InterfaceC45802ne5 m13911a(String str) {
        C21 c21 = this.f109065a.get(str);
        if (c21 != null) {
            return c21.mo102637a();
        }
        synchronized (this.f109065a) {
            C21 c212 = this.f109065a.get(str);
            if (c212 != null) {
                return c212.mo102637a();
            }
            C21 build = this.f109066b.get().mo102639a(str).build();
            InterfaceC45802ne5 mo102637a = build.mo102637a();
            this.f109065a.put(str, build);
            return mo102637a;
        }
    }
}
