package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* renamed from: IL7 */
/* loaded from: classes5.dex */
public abstract class IL7 implements Map, Serializable {

    /* renamed from: b */
    public transient ZL7 f15385b;

    /* renamed from: c */
    public transient ZL7 f15386c;

    /* renamed from: d */
    public transient OI7 f15387d;

    /* renamed from: c */
    public static IL7 m102467c(Object obj, Object obj2) {
        C44991mG7.m25858a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return RN7.m86783g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    /* renamed from: a */
    public abstract OI7 mo86786a();

    @Override // java.util.Map
    /* renamed from: b */
    public final OI7 values() {
        OI7 oi7 = this.f15387d;
        if (oi7 == null) {
            OI7 mo86786a = mo86786a();
            this.f15387d = mo86786a;
            return mo86786a;
        }
        return oi7;
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
    public abstract ZL7 mo86785d();

    /* renamed from: e */
    public abstract ZL7 mo86784e();

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
    public final ZL7 entrySet() {
        ZL7 zl7 = this.f15385b;
        if (zl7 == null) {
            ZL7 mo86785d = mo86785d();
            this.f15385b = mo86785d;
            return mo86785d;
        }
        return zl7;
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
        return C42098hO7.m36461a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        ZL7 zl7 = this.f15386c;
        if (zl7 == null) {
            ZL7 mo86784e = mo86784e();
            this.f15386c = mo86784e;
            return mo86784e;
        }
        return zl7;
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
