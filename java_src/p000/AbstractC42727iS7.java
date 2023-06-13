package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: iS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC42727iS7 implements Map, Serializable {

    /* renamed from: b */
    public transient AbstractC51027wS7 f87346b;

    /* renamed from: c */
    public transient AbstractC51027wS7 f87347c;

    /* renamed from: d */
    public transient VO7 f87348d;

    /* renamed from: c */
    public static AbstractC42727iS7 m33901c(Object obj, Object obj2) {
        C45620nK7.m23965b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return YW7.m74940g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract VO7 mo33903a();

    @Override // java.util.Map
    /* renamed from: b */
    public final VO7 values() {
        VO7 vo7 = this.f87348d;
        if (vo7 == null) {
            VO7 mo33903a = mo33903a();
            this.f87348d = mo33903a;
            return mo33903a;
        }
        return vo7;
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
    public abstract AbstractC51027wS7 mo33900d();

    /* renamed from: e */
    public abstract AbstractC51027wS7 mo33899e();

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
    public final AbstractC51027wS7 entrySet() {
        AbstractC51027wS7 abstractC51027wS7 = this.f87346b;
        if (abstractC51027wS7 == null) {
            AbstractC51027wS7 mo33900d = mo33900d();
            this.f87346b = mo33900d;
            return mo33900d;
        }
        return abstractC51027wS7;
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
        return CX7.m112153a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC51027wS7 abstractC51027wS7 = this.f87347c;
        if (abstractC51027wS7 == null) {
            AbstractC51027wS7 mo33899e = mo33899e();
            this.f87347c = mo33899e;
            return mo33899e;
        }
        return abstractC51027wS7;
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
        C45620nK7.m23966a(size, "size");
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
