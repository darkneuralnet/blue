package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: vQ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC50417vQ8<K, V> implements Map<K, V>, Serializable {

    /* renamed from: b */
    public transient RQ8<Map.Entry<K, V>> f114058b;

    /* renamed from: c */
    public transient RQ8<K> f114059c;

    /* renamed from: d */
    public transient XO8<V> f114060d;

    /* renamed from: c */
    public static <K, V> AbstractC50417vQ8<K, V> m8682c() {
        return (AbstractC50417vQ8<K, V>) HS8.f13418h;
    }

    /* renamed from: a */
    public abstract XO8<V> mo8684a();

    @Override // java.util.Map
    /* renamed from: b */
    public final XO8<V> values() {
        XO8<V> xo8 = this.f114060d;
        if (xo8 == null) {
            XO8<V> mo8684a = mo8684a();
            this.f114060d = mo8684a;
            return mo8684a;
        }
        return xo8;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract RQ8<Map.Entry<K, V>> mo8681d();

    /* renamed from: e */
    public abstract RQ8<K> mo8680e();

    @Override // java.util.Map
    public final boolean equals(@NullableDecl Object obj) {
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
    public final RQ8<Map.Entry<K, V>> entrySet() {
        RQ8<Map.Entry<K, V>> rq8 = this.f114058b;
        if (rq8 == null) {
            RQ8<Map.Entry<K, V>> mo8681d = mo8681d();
            this.f114058b = mo8681d;
            return mo8681d;
        }
        return rq8;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C39773dT8.m44223a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        RQ8<K> rq8 = this.f114059c;
        if (rq8 == null) {
            RQ8<K> mo8680e = mo8680e();
            this.f114059c = mo8680e;
            return mo8680e;
        }
        return rq8;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb.append(CoreConstants.CURLY_LEFT);
            boolean z = true;
            for (Map.Entry<K, V> entry : entrySet()) {
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
