package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* renamed from: ud3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49940ud3 extends AbstractC45348ms4<C49940ud3> {

    /* renamed from: f */
    public final Collection<String> f112685f = new HashSet();

    /* renamed from: g */
    public final Map<String, C34835Nu0> f112686g = new HashMap();

    /* renamed from: h */
    public boolean f112687h;

    @Override // p000.AbstractC45348ms4
    /* renamed from: o */
    public C49940ud3 mo9942f() {
        return this;
    }

    /* renamed from: p */
    public void m9940p() {
        this.f112687h = true;
    }

    /* renamed from: q */
    public void m9939q(String str) {
        this.f112685f.add(str);
    }

    /* renamed from: r */
    public void m9938r(String str, C34835Nu0 c34835Nu0) {
        this.f112686g.put(str, c34835Nu0);
    }
}
