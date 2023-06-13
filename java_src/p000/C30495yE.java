package p000;

import java.util.Map;
import java.util.Objects;
/* renamed from: yE */
/* loaded from: classes8.dex */
public final class C30495yE<Q> extends AbstractC28986u1<Q> {
    private static final long serialVersionUID = 1721629233768215930L;

    /* renamed from: f */
    public final V31 f119155f;

    public C30495yE(String str, V31 v31) {
        super(str);
        this.f119155f = v31;
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: F */
    public V31 mo3806F() {
        return this.f119155f;
    }

    @Override // p000.AbstractC28986u1
    /* renamed from: J */
    public InterfaceC35858Sd6<Q> mo3805J() {
        return this;
    }

    @Override // p000.InterfaceC35726Rp0
    /* renamed from: b0 */
    public InterfaceC38077ae6 mo3804b0() throws UnsupportedOperationException {
        return AbstractC26779o0.f101189c;
    }

    @Override // p000.AbstractC28986u1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30495yE.class != obj.getClass()) {
            return false;
        }
        C30495yE c30495yE = (C30495yE) obj;
        if (Objects.equals(this.f119155f, c30495yE.f119155f) && Objects.equals(mo11086a(), c30495yE.mo11086a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (mo11086a() == null) {
            hashCode = 0;
        } else {
            hashCode = mo11086a().hashCode();
        }
        int i2 = 31 + hashCode;
        int i3 = i2 + (i2 * 31);
        V31 v31 = this.f119155f;
        if (v31 != null) {
            i = v31.hashCode();
        }
        return i3 + i;
    }

    @Override // p000.AbstractC28986u1, p000.InterfaceC35858Sd6
    /* renamed from: l */
    public Map<? extends AbstractC28986u1<Q>, Integer> mo3803l() {
        return null;
    }

    public C30495yE(String str, String str2, V31 v31) {
        super(str);
        this.f111481b = str2;
        this.f119155f = v31;
    }
}
