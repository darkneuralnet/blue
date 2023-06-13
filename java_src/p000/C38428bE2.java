package p000;

import java.util.Arrays;
/* renamed from: bE2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38428bE2<V> {

    /* renamed from: a */
    public final V f57108a;

    /* renamed from: b */
    public final Throwable f57109b;

    public C38428bE2(V v) {
        this.f57108a = v;
        this.f57109b = null;
    }

    /* renamed from: a */
    public Throwable m64805a() {
        return this.f57109b;
    }

    /* renamed from: b */
    public V m64804b() {
        return this.f57108a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38428bE2)) {
            return false;
        }
        C38428bE2 c38428bE2 = (C38428bE2) obj;
        if (m64804b() != null && m64804b().equals(c38428bE2.m64804b())) {
            return true;
        }
        if (m64805a() == null || c38428bE2.m64805a() == null) {
            return false;
        }
        return m64805a().toString().equals(m64805a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m64804b(), m64805a()});
    }

    public C38428bE2(Throwable th) {
        this.f57109b = th;
        this.f57108a = null;
    }
}
