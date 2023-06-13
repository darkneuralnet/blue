package p000;

import java.util.Map;
/* renamed from: kL8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43851kL8<K> implements Map.Entry<K, Object> {

    /* renamed from: b */
    public Map.Entry<K, MK8> f94285b;

    public C43851kL8(Map.Entry<K, MK8> entry) {
        this.f94285b = entry;
    }

    /* renamed from: a */
    public final MK8 m29048a() {
        return this.f94285b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f94285b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f94285b.getValue() == null) {
            return null;
        }
        return MK8.m95437e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC44489lQ8) {
            return this.f94285b.getValue().m102465a((InterfaceC44489lQ8) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
