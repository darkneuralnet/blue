package p000;

import java.util.Map;
/* renamed from: UV7 */
/* loaded from: classes5.dex */
public final class UV7<K> implements Map.Entry<K, Object> {

    /* renamed from: b */
    public Map.Entry<K, C48683sV7> f37484b;

    public UV7(Map.Entry<K, C48683sV7> entry) {
        this.f37484b = entry;
    }

    /* renamed from: a */
    public final C48683sV7 m81402a() {
        return this.f37484b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f37484b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f37484b.getValue() == null) {
            return null;
        }
        return C48683sV7.m14124e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof H28) {
            return this.f37484b.getValue().m8536c((H28) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
