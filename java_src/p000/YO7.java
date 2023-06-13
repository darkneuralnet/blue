package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* renamed from: YO7 */
/* loaded from: classes5.dex */
public abstract class YO7 extends AbstractMap {

    /* renamed from: b */
    public transient Set f45829b;

    /* renamed from: c */
    public transient Set f45830c;

    /* renamed from: d */
    public transient Collection f45831d;

    /* renamed from: a */
    public abstract Set mo75121a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f45829b;
        if (set == null) {
            Set mo75121a = mo75121a();
            this.f45829b = mo75121a;
            return mo75121a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f45830c;
        if (set == null) {
            C49213tO7 c49213tO7 = new C49213tO7(this);
            this.f45830c = c49213tO7;
            return c49213tO7;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f45831d;
        if (collection == null) {
            JO7 jo7 = new JO7(this);
            this.f45831d = jo7;
            return jo7;
        }
        return collection;
    }
}
