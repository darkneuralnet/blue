package p000;

import java.io.Serializable;
/* renamed from: et7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40617et7 extends AbstractC41825gv9 implements Serializable {

    /* renamed from: b */
    public final Object f79075b;

    /* renamed from: c */
    public final Object f79076c;

    public C40617et7(Object obj, Object obj2) {
        this.f79075b = obj;
        this.f79076c = obj2;
    }

    @Override // p000.AbstractC41825gv9, java.util.Map.Entry
    public final Object getKey() {
        return this.f79075b;
    }

    @Override // p000.AbstractC41825gv9, java.util.Map.Entry
    public final Object getValue() {
        return this.f79076c;
    }

    @Override // p000.AbstractC41825gv9, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
