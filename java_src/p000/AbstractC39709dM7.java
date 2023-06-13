package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: dM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC39709dM7 implements Map, Serializable {

    /* renamed from: b */
    public transient AbstractC49195tM7 f76512b;

    /* renamed from: c */
    public transient AbstractC49195tM7 f76513c;

    /* renamed from: d */
    public transient AbstractC47983rJ7 f76514d;

    /* renamed from: c */
    public static AbstractC39709dM7 m44345c(Object obj, Object obj2) {
        C39462cw7.m44805b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C44524lU7.m27234g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract AbstractC47983rJ7 mo27237a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC47983rJ7 values() {
        AbstractC47983rJ7 abstractC47983rJ7 = this.f76514d;
        if (abstractC47983rJ7 == null) {
            AbstractC47983rJ7 mo27237a = mo27237a();
            this.f76514d = mo27237a;
            return mo27237a;
        }
        return abstractC47983rJ7;
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
    public abstract AbstractC49195tM7 mo27236d();

    /* renamed from: e */
    public abstract AbstractC49195tM7 mo27235e();

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
    public final AbstractC49195tM7 entrySet() {
        AbstractC49195tM7 abstractC49195tM7 = this.f76512b;
        if (abstractC49195tM7 == null) {
            AbstractC49195tM7 mo27236d = mo27236d();
            this.f76512b = mo27236d;
            return mo27236d;
        }
        return abstractC49195tM7;
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
        return LU7.m96794a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC49195tM7 abstractC49195tM7 = this.f76513c;
        if (abstractC49195tM7 == null) {
            AbstractC49195tM7 mo27235e = mo27235e();
            this.f76513c = mo27235e;
            return mo27235e;
        }
        return abstractC49195tM7;
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
        C39462cw7.m44806a(size, "size");
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
