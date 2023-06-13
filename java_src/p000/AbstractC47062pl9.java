package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: pl9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC47062pl9 implements Map, Serializable {

    /* renamed from: b */
    public transient Ao9 f104045b;

    /* renamed from: c */
    public transient Ao9 f104046c;

    /* renamed from: d */
    public transient TT8 f104047d;

    /* renamed from: c */
    public static AbstractC47062pl9 m18759c(Object obj, Object obj2) {
        C41380gA8.m39952a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C46006ny9.m22044g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract TT8 mo18761a();

    @Override // java.util.Map
    /* renamed from: b */
    public final TT8 values() {
        TT8 tt8 = this.f104047d;
        if (tt8 == null) {
            TT8 mo18761a = mo18761a();
            this.f104047d = mo18761a;
            return mo18761a;
        }
        return tt8;
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
    public abstract Ao9 mo18758d();

    /* renamed from: e */
    public abstract Ao9 mo18757e();

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
    public final Ao9 entrySet() {
        Ao9 ao9 = this.f104045b;
        if (ao9 == null) {
            Ao9 mo18758d = mo18758d();
            this.f104045b = mo18758d;
            return mo18758d;
        }
        return ao9;
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
        return C51149wf7.m6535a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        Ao9 ao9 = this.f104046c;
        if (ao9 == null) {
            Ao9 mo18757e = mo18757e();
            this.f104046c = mo18757e;
            return mo18757e;
        }
        return ao9;
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
        if (size >= 0) {
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
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
