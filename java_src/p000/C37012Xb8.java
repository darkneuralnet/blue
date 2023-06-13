package p000;

import java.util.Map;
/* renamed from: Xb8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37012Xb8 implements Map.Entry {

    /* renamed from: b */
    public final Map.Entry f43472b;

    /* renamed from: a */
    public final C51713xc8 m76802a() {
        return (C51713xc8) this.f43472b.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f43472b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((C51713xc8) this.f43472b.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC39926dj8) {
            return ((C51713xc8) this.f43472b.getValue()).m98650c((InterfaceC39926dj8) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
