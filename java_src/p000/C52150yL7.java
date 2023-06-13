package p000;

import java.util.Map;
/* renamed from: yL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52150yL7<K> implements Map.Entry<K, Object> {

    /* renamed from: b */
    public Map.Entry<K, TK7> f119428b;

    public C52150yL7(Map.Entry<K, TK7> entry) {
        this.f119428b = entry;
    }

    /* renamed from: a */
    public final TK7 m3580a() {
        return this.f119428b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f119428b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f119428b.getValue() == null) {
            return null;
        }
        return TK7.m83770e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC52815zT7) {
            return this.f119428b.getValue().m42995c((InterfaceC52815zT7) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
