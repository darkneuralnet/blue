package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: vy7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC50746vy7 implements Map, Serializable {

    /* renamed from: b */
    public transient AbstractC51942xz7 f115057b;

    /* renamed from: c */
    public transient AbstractC51942xz7 f115058c;

    /* renamed from: d */
    public transient AbstractC45944ns7 f115059d;

    /* renamed from: c */
    public static AbstractC50746vy7 m7627c() {
        return ML7.f22994h;
    }

    /* renamed from: d */
    public static AbstractC50746vy7 m7626d(Object obj, Object obj2) {
        C31665Af7.m115391b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return ML7.m95424h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract AbstractC45944ns7 mo7629a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC45944ns7 values() {
        AbstractC45944ns7 abstractC45944ns7 = this.f115059d;
        if (abstractC45944ns7 == null) {
            AbstractC45944ns7 mo7629a = mo7629a();
            this.f115059d = mo7629a;
            return mo7629a;
        }
        return abstractC45944ns7;
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

    /* renamed from: e */
    public abstract AbstractC51942xz7 mo7625e();

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

    /* renamed from: f */
    public abstract AbstractC51942xz7 mo7624f();

    @Override // java.util.Map
    /* renamed from: g */
    public final AbstractC51942xz7 entrySet() {
        AbstractC51942xz7 abstractC51942xz7 = this.f115057b;
        if (abstractC51942xz7 == null) {
            AbstractC51942xz7 mo7625e = mo7625e();
            this.f115057b = mo7625e;
            return mo7625e;
        }
        return abstractC51942xz7;
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
        return C48602sM7.m14270a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC51942xz7 abstractC51942xz7 = this.f115058c;
        if (abstractC51942xz7 == null) {
            AbstractC51942xz7 mo7624f = mo7624f();
            this.f115058c = mo7624f;
            return mo7624f;
        }
        return abstractC51942xz7;
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
        C31665Af7.m115392a(size, "size");
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
