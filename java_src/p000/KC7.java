package p000;
/* renamed from: KC7 */
/* loaded from: classes6.dex */
public final class KC7 extends AbstractC33671Iu6 {

    /* renamed from: a */
    public final boolean f19281a;

    /* renamed from: b */
    public final boolean f19282b;

    /* renamed from: c */
    public final boolean f19283c;

    /* renamed from: d */
    public final boolean f19284d;

    /* renamed from: e */
    public final float f19285e;

    /* renamed from: f */
    public final int f19286f;

    /* renamed from: g */
    public final String f19287g;

    /* renamed from: h */
    public final String f19288h;

    public KC7(boolean z, boolean z2, boolean z3, boolean z4, float f, int i, C41225fv2 c41225fv2, String str, String str2) {
        this.f19281a = z;
        this.f19282b = z2;
        this.f19283c = z3;
        this.f19284d = z4;
        this.f19285e = f;
        this.f19286f = i;
        this.f19287g = str;
        if (str2 == null) {
            throw new NullPointerException("Null clientLibraryVersion");
        }
        this.f19288h = str2;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: b */
    public final float mo99084b() {
        return this.f19285e;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: c */
    public final int mo99083c() {
        return this.f19286f;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: d */
    public final C41225fv2 mo99082d() {
        return null;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: e */
    public final String mo99081e() {
        return this.f19287g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC33671Iu6) {
            AbstractC33671Iu6 abstractC33671Iu6 = (AbstractC33671Iu6) obj;
            if (this.f19281a == abstractC33671Iu6.mo99076j() && this.f19282b == abstractC33671Iu6.mo99077i() && this.f19283c == abstractC33671Iu6.mo99078h() && this.f19284d == abstractC33671Iu6.mo99079g() && Float.floatToIntBits(this.f19285e) == Float.floatToIntBits(abstractC33671Iu6.mo99084b()) && this.f19286f == abstractC33671Iu6.mo99083c()) {
                abstractC33671Iu6.mo99082d();
                if (this.f19287g.equals(abstractC33671Iu6.mo99081e()) && this.f19288h.equals(abstractC33671Iu6.mo99080f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: f */
    public final String mo99080f() {
        return this.f19288h;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: g */
    public final boolean mo99079g() {
        return this.f19284d;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: h */
    public final boolean mo99078h() {
        return this.f19283c;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 1237;
        if (true != this.f19281a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i5 = (i ^ 1000003) * 1000003;
        if (true != this.f19282b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (true != this.f19283c) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i7 = (i6 ^ i3) * 1000003;
        if (true == this.f19284d) {
            i4 = 1231;
        }
        return ((((((((((i7 ^ i4) * 1000003) ^ Float.floatToIntBits(this.f19285e)) * 1000003) ^ this.f19286f) * 1000003) ^ 0) * 1000003) ^ this.f19287g.hashCode()) * 1000003) ^ this.f19288h.hashCode();
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: i */
    public final boolean mo99077i() {
        return this.f19282b;
    }

    @Override // p000.AbstractC33671Iu6
    /* renamed from: j */
    public final boolean mo99076j() {
        return this.f19281a;
    }

    public final String toString() {
        boolean z = this.f19281a;
        boolean z2 = this.f19282b;
        boolean z3 = this.f19283c;
        boolean z4 = this.f19284d;
        float f = this.f19285e;
        int i = this.f19286f;
        String str = this.f19287g;
        String str2 = this.f19288h;
        StringBuilder sb = new StringBuilder("null".length() + 290 + str.length() + str2.length());
        sb.append("VkpObjectDetectorOptions{streamingMode=");
        sb.append(z);
        sb.append(", multipleObjectsEnabled=");
        sb.append(z2);
        sb.append(", classificationEnabled=");
        sb.append(z3);
        sb.append(", accelerationEnabled=");
        sb.append(z4);
        sb.append(", classificationConfidenceThreshold=");
        sb.append(f);
        sb.append(", maxPerObjectLabelCount=");
        sb.append(i);
        sb.append(", customClassifierLocalModel=");
        sb.append("null");
        sb.append(", clientLibraryName=");
        sb.append(str);
        sb.append(", clientLibraryVersion=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
