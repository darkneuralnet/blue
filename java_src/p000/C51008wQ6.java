package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom;
/* renamed from: wQ6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51008wQ6 extends AbstractC42535i77 {

    /* renamed from: a */
    public final L77 f115942a;

    /* renamed from: b */
    public final zbom f115943b;

    /* renamed from: c */
    public final X57 f115944c;

    /* renamed from: d */
    public final boolean f115945d;

    public C51008wQ6(L77 l77, zbom zbomVar, X57 x57, boolean z) {
        this.f115942a = l77;
        this.f115943b = zbomVar;
        if (x57 == null) {
            throw new NullPointerException("Null lineBoxParcels");
        }
        this.f115944c = x57;
        this.f115945d = z;
    }

    @Override // p000.AbstractC42535i77
    /* renamed from: a */
    public final X57 mo6848a() {
        return this.f115944c;
    }

    @Override // p000.AbstractC42535i77
    /* renamed from: b */
    public final zbom mo6847b() {
        return this.f115943b;
    }

    @Override // p000.AbstractC42535i77
    /* renamed from: c */
    public final L77 mo6846c() {
        return this.f115942a;
    }

    @Override // p000.AbstractC42535i77
    /* renamed from: d */
    public final boolean mo6845d() {
        return this.f115945d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC42535i77) {
            AbstractC42535i77 abstractC42535i77 = (AbstractC42535i77) obj;
            if (this.f115942a.equals(abstractC42535i77.mo6846c()) && this.f115943b.equals(abstractC42535i77.mo6847b()) && this.f115944c.equals(abstractC42535i77.mo6848a()) && this.f115945d == abstractC42535i77.mo6845d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.f115942a.hashCode() ^ 1000003) * 1000003) ^ this.f115943b.hashCode()) * 1000003) ^ this.f115944c.hashCode();
        if (true != this.f115945d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        String obj = this.f115942a.toString();
        String obj2 = this.f115943b.toString();
        String obj3 = this.f115944c.toString();
        boolean z = this.f115945d;
        return "VkpResults{status=" + obj + ", textParcel=" + obj2 + ", lineBoxParcels=" + obj3 + ", fromColdCall=" + z + "}";
    }
}
