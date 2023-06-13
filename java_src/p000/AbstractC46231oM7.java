package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: oM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC46231oM7 implements Map, Serializable {

    /* renamed from: b */
    public transient FM7 f101849b;

    /* renamed from: c */
    public transient FM7 f101850c;

    /* renamed from: d */
    public transient BJ7 f101851d;

    /* renamed from: c */
    public static AbstractC46231oM7 m21254c(Object obj, Object obj2) {
        C38861bx7.m62067b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return QS7.m88496g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract BJ7 mo21256a();

    @Override // java.util.Map
    /* renamed from: b */
    public final BJ7 values() {
        BJ7 bj7 = this.f101851d;
        if (bj7 == null) {
            BJ7 mo21256a = mo21256a();
            this.f101851d = mo21256a;
            return mo21256a;
        }
        return bj7;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract FM7 mo21253d();

    /* renamed from: e */
    public abstract FM7 mo21252e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f */
    public final FM7 entrySet() {
        FM7 fm7 = this.f101849b;
        if (fm7 == null) {
            FM7 mo21253d = mo21253d();
            this.f101849b = mo21253d;
            return mo21253d;
        }
        return fm7;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C49851uT7.m10233a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        FM7 fm7 = this.f101850c;
        if (fm7 == null) {
            FM7 mo21252e = mo21252e();
            this.f101850c = mo21252e;
            return mo21252e;
        }
        return fm7;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        C38861bx7.m62068a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append(CoreConstants.CURLY_LEFT);
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
