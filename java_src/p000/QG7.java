package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* renamed from: QG7 */
/* loaded from: classes5.dex */
public abstract class QG7 extends AbstractMap {

    /* renamed from: b */
    public transient Set f30144b;

    /* renamed from: c */
    public transient Set f30145c;

    /* renamed from: d */
    public transient Collection f30146d;

    /* renamed from: a */
    public abstract Set mo88673a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f30144b;
        if (set == null) {
            Set mo88673a = mo88673a();
            this.f30144b = mo88673a;
            return mo88673a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f30145c;
        if (set == null) {
            C43203jF7 c43203jF7 = new C43203jF7(this);
            this.f30145c = c43203jF7;
            return c43203jF7;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f30146d;
        if (collection == null) {
            ZF7 zf7 = new ZF7(this);
            this.f30146d = zf7;
            return zf7;
        }
        return collection;
    }
}
