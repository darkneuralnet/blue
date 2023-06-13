package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC11197f;
/* renamed from: androidx.camera.core.impl.a */
/* loaded from: classes.dex */
public final class C11187a<T> extends InterfaceC11197f.AbstractC11198a<T> {

    /* renamed from: a */
    public final String f52566a;

    /* renamed from: b */
    public final Class<T> f52567b;

    /* renamed from: c */
    public final Object f52568c;

    public C11187a(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f52566a = str;
            if (cls != null) {
                this.f52567b = cls;
                this.f52568c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f.AbstractC11198a
    /* renamed from: c */
    public String mo69418c() {
        return this.f52566a;
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f.AbstractC11198a
    /* renamed from: d */
    public Object mo69417d() {
        return this.f52568c;
    }

    @Override // androidx.camera.core.impl.InterfaceC11197f.AbstractC11198a
    /* renamed from: e */
    public Class<T> mo69416e() {
        return this.f52567b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC11197f.AbstractC11198a)) {
            return false;
        }
        InterfaceC11197f.AbstractC11198a abstractC11198a = (InterfaceC11197f.AbstractC11198a) obj;
        if (this.f52566a.equals(abstractC11198a.mo69418c()) && this.f52567b.equals(abstractC11198a.mo69416e())) {
            Object obj2 = this.f52568c;
            if (obj2 == null) {
                if (abstractC11198a.mo69417d() == null) {
                    return true;
                }
            } else if (obj2.equals(abstractC11198a.mo69417d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f52566a.hashCode() ^ 1000003) * 1000003) ^ this.f52567b.hashCode()) * 1000003;
        Object obj = this.f52568c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "Option{id=" + this.f52566a + ", valueClass=" + this.f52567b + ", token=" + this.f52568c + "}";
    }
}
