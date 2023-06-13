package p000;

import java.util.Map;
/* renamed from: ru7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48336ru7 implements Map.Entry {

    /* renamed from: b */
    public final Map.Entry f107885b;

    /* renamed from: a */
    public final C34374Lu7 m15088a() {
        return (C34374Lu7) this.f107885b.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f107885b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((C34374Lu7) this.f107885b.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC41230fv7) {
            return ((C34374Lu7) this.f107885b.getValue()).m94583c((InterfaceC41230fv7) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
