package p000;

import java.util.Map;
import java.util.Set;
/* renamed from: Ti2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36133Ti2 extends AbstractC52360yi2 {

    /* renamed from: b */
    public final C36448Ur2<String, AbstractC52360yi2> f35903b = new C36448Ur2<>(false);

    public Set<Map.Entry<String, AbstractC52360yi2>> entrySet() {
        return this.f35903b.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof C36133Ti2) || !((C36133Ti2) obj).f35903b.equals(this.f35903b))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f35903b.hashCode();
    }

    /* renamed from: w */
    public void m83137w(String str, AbstractC52360yi2 abstractC52360yi2) {
        C36448Ur2<String, AbstractC52360yi2> c36448Ur2 = this.f35903b;
        if (abstractC52360yi2 == null) {
            abstractC52360yi2 = C35431Qi2.f30779b;
        }
        c36448Ur2.put(str, abstractC52360yi2);
    }

    /* renamed from: x */
    public void m83136x(String str, String str2) {
        m83137w(str, str2 == null ? C35431Qi2.f30779b : new C37537Zi2(str2));
    }

    /* renamed from: y */
    public AbstractC52360yi2 m83135y(String str) {
        return this.f35903b.get(str);
    }

    /* renamed from: z */
    public boolean m83134z(String str) {
        return this.f35903b.containsKey(str);
    }
}
