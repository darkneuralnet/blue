package p000;

import java.util.Map;
/* renamed from: sb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48738sb7 implements Map.Entry {

    /* renamed from: b */
    public final Map.Entry f109032b;

    /* renamed from: a */
    public final C51702xb7 m13954a() {
        return (C51702xb7) this.f109032b.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f109032b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((C51702xb7) this.f109032b.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC36075Tb7) {
            return ((C51702xb7) this.f109032b.getValue()).m3193c((InterfaceC36075Tb7) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
