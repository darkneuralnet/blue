package p000;

import java.util.Map;
/* renamed from: GD7 */
/* loaded from: classes5.dex */
public final class GD7 extends AbstractC35292Ps7 {

    /* renamed from: b */
    public final Object f11169b;

    /* renamed from: c */
    public int f11170c;

    /* renamed from: d */
    public final /* synthetic */ C43796kF7 f11171d;

    public GD7(C43796kF7 c43796kF7, int i) {
        this.f11171d = c43796kF7;
        Object[] objArr = c43796kF7.f94165d;
        objArr.getClass();
        this.f11169b = objArr[i];
        this.f11170c = i;
    }

    /* renamed from: a */
    public final void m105612a() {
        int m29119q;
        int i = this.f11170c;
        if (i != -1 && i < this.f11171d.size()) {
            Object obj = this.f11169b;
            C43796kF7 c43796kF7 = this.f11171d;
            int i2 = this.f11170c;
            Object[] objArr = c43796kF7.f94165d;
            objArr.getClass();
            if (C42418hv9.m35483a(obj, objArr[i2])) {
                return;
            }
        }
        m29119q = this.f11171d.m29119q(this.f11169b);
        this.f11170c = m29119q;
    }

    @Override // p000.AbstractC35292Ps7, java.util.Map.Entry
    public final Object getKey() {
        return this.f11169b;
    }

    @Override // p000.AbstractC35292Ps7, java.util.Map.Entry
    public final Object getValue() {
        Map m29126j = this.f11171d.m29126j();
        if (m29126j != null) {
            return m29126j.get(this.f11169b);
        }
        m105612a();
        int i = this.f11170c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.f11171d.f94166e;
        objArr.getClass();
        return objArr[i];
    }

    @Override // p000.AbstractC35292Ps7, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m29126j = this.f11171d.m29126j();
        if (m29126j != null) {
            return m29126j.put(this.f11169b, obj);
        }
        m105612a();
        int i = this.f11170c;
        if (i == -1) {
            this.f11171d.put(this.f11169b, obj);
            return null;
        }
        Object[] objArr = this.f11171d.f94166e;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
