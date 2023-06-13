package p000;

import java.io.Serializable;
/* renamed from: gK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41469gK7 extends AbstractC35292Ps7 implements Serializable {

    /* renamed from: b */
    public final Object f81999b;

    /* renamed from: c */
    public final Object f82000c;

    public C41469gK7(Object obj, Object obj2) {
        this.f81999b = obj;
        this.f82000c = obj2;
    }

    @Override // p000.AbstractC35292Ps7, java.util.Map.Entry
    public final Object getKey() {
        return this.f81999b;
    }

    @Override // p000.AbstractC35292Ps7, java.util.Map.Entry
    public final Object getValue() {
        return this.f82000c;
    }

    @Override // p000.AbstractC35292Ps7, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
