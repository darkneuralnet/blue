package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: QU8 */
/* loaded from: classes5.dex */
public abstract class QU8 implements Map, Serializable {

    /* renamed from: b */
    public transient AbstractC45127mV8 f30442b;

    /* renamed from: c */
    public transient AbstractC45127mV8 f30443c;

    /* renamed from: d */
    public transient AbstractC37976aT8 f30444d;

    /* renamed from: c */
    public static QU8 m88460c(Object obj, Object obj2) {
        C43321jS8.m30591a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return TW8.m83480g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract AbstractC37976aT8 mo83483a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC37976aT8 values() {
        AbstractC37976aT8 abstractC37976aT8 = this.f30444d;
        if (abstractC37976aT8 == null) {
            AbstractC37976aT8 mo83483a = mo83483a();
            this.f30444d = mo83483a;
            return mo83483a;
        }
        return abstractC37976aT8;
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
    public abstract AbstractC45127mV8 mo83482d();

    /* renamed from: e */
    public abstract AbstractC45127mV8 mo83481e();

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
    public final AbstractC45127mV8 entrySet() {
        AbstractC45127mV8 abstractC45127mV8 = this.f30442b;
        if (abstractC45127mV8 == null) {
            AbstractC45127mV8 mo83482d = mo83482d();
            this.f30442b = mo83482d;
            return mo83482d;
        }
        return abstractC45127mV8;
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
        return C45738nX8.m23556a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC45127mV8 abstractC45127mV8 = this.f30443c;
        if (abstractC45127mV8 == null) {
            AbstractC45127mV8 mo83481e = mo83481e();
            this.f30443c = mo83481e;
            return mo83481e;
        }
        return abstractC45127mV8;
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
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("size cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }
}
