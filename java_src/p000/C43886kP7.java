package p000;

import java.io.Serializable;
/* renamed from: kP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43886kP7 extends AbstractC38460bH7 implements Serializable {

    /* renamed from: b */
    public final Object f94354b;

    /* renamed from: c */
    public final Object f94355c;

    public C43886kP7(Object obj, Object obj2) {
        this.f94354b = obj;
        this.f94355c = obj2;
    }

    @Override // p000.AbstractC38460bH7, java.util.Map.Entry
    public final Object getKey() {
        return this.f94354b;
    }

    @Override // p000.AbstractC38460bH7, java.util.Map.Entry
    public final Object getValue() {
        return this.f94355c;
    }

    @Override // p000.AbstractC38460bH7, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
