package p000;

import java.util.Map;
/* renamed from: RM7 */
/* loaded from: classes5.dex */
public final class RM7 extends AbstractC38460bH7 {

    /* renamed from: b */
    public final Object f31964b;

    /* renamed from: c */
    public int f31965c;

    /* renamed from: d */
    public final /* synthetic */ C52761zN7 f31966d;

    public RM7(C52761zN7 c52761zN7, int i) {
        this.f31966d = c52761zN7;
        Object[] objArr = c52761zN7.f121262d;
        objArr.getClass();
        this.f31964b = objArr[i];
        this.f31965c = i;
    }

    /* renamed from: a */
    public final void m86807a() {
        int m1442q;
        int i = this.f31965c;
        if (i != -1 && i < this.f31966d.size()) {
            Object obj = this.f31964b;
            C52761zN7 c52761zN7 = this.f31966d;
            int i2 = this.f31965c;
            Object[] objArr = c52761zN7.f121262d;
            objArr.getClass();
            if (C31998Bq7.m113442a(obj, objArr[i2])) {
                return;
            }
        }
        m1442q = this.f31966d.m1442q(this.f31964b);
        this.f31965c = m1442q;
    }

    @Override // p000.AbstractC38460bH7, java.util.Map.Entry
    public final Object getKey() {
        return this.f31964b;
    }

    @Override // p000.AbstractC38460bH7, java.util.Map.Entry
    public final Object getValue() {
        Map m1449j = this.f31966d.m1449j();
        if (m1449j != null) {
            return m1449j.get(this.f31964b);
        }
        m86807a();
        int i = this.f31965c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.f31966d.f121263e;
        objArr.getClass();
        return objArr[i];
    }

    @Override // p000.AbstractC38460bH7, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m1449j = this.f31966d.m1449j();
        if (m1449j != null) {
            return m1449j.put(this.f31964b, obj);
        }
        m86807a();
        int i = this.f31965c;
        if (i == -1) {
            this.f31966d.put(this.f31964b, obj);
            return null;
        }
        Object[] objArr = this.f31966d.f121263e;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
