package p000;

import java.io.Serializable;
/* renamed from: qK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47399qK7 extends AbstractC35301Pt7 implements Serializable {

    /* renamed from: b */
    public final Object f105127b;

    /* renamed from: c */
    public final Object f105128c;

    public C47399qK7(Object obj, Object obj2) {
        this.f105127b = obj;
        this.f105128c = obj2;
    }

    @Override // p000.AbstractC35301Pt7, java.util.Map.Entry
    public final Object getKey() {
        return this.f105127b;
    }

    @Override // p000.AbstractC35301Pt7, java.util.Map.Entry
    public final Object getValue() {
        return this.f105128c;
    }

    @Override // p000.AbstractC35301Pt7, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
