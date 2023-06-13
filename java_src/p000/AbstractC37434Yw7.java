package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: Yw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC37434Yw7 implements Map, Serializable {

    /* renamed from: b */
    public transient AbstractC34869Nx7 f47652b;

    /* renamed from: c */
    public transient AbstractC34869Nx7 f47653c;

    /* renamed from: d */
    public transient AbstractC48306rr7 f47654d;

    /* renamed from: c */
    public static AbstractC37434Yw7 m73954c(Object obj, Object obj2) {
        C41150fn7.m40817a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return AE7.m115957g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract AbstractC48306rr7 mo73956a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC48306rr7 values() {
        AbstractC48306rr7 abstractC48306rr7 = this.f47654d;
        if (abstractC48306rr7 == null) {
            AbstractC48306rr7 mo73956a = mo73956a();
            this.f47654d = mo73956a;
            return mo73956a;
        }
        return abstractC48306rr7;
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
    public abstract AbstractC34869Nx7 mo73953d();

    /* renamed from: e */
    public abstract AbstractC34869Nx7 mo73952e();

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
    public final AbstractC34869Nx7 entrySet() {
        AbstractC34869Nx7 abstractC34869Nx7 = this.f47652b;
        if (abstractC34869Nx7 == null) {
            AbstractC34869Nx7 mo73953d = mo73953d();
            this.f47652b = mo73953d;
            return mo73953d;
        }
        return abstractC34869Nx7;
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
        return C48539sF7.m14491a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC34869Nx7 abstractC34869Nx7 = this.f47653c;
        if (abstractC34869Nx7 == null) {
            AbstractC34869Nx7 mo73952e = mo73952e();
            this.f47653c = mo73952e;
            return mo73952e;
        }
        return abstractC34869Nx7;
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
