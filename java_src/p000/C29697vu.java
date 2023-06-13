package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
/* renamed from: vu */
/* loaded from: classes6.dex */
public final class C29697vu extends AbstractC33203Gu6 {

    /* renamed from: a */
    public final String f114868a;

    /* renamed from: b */
    public final String f114869b;

    /* renamed from: c */
    public final float f114870c;

    /* renamed from: d */
    public final int f114871d;

    public C29697vu(String str, String str2, float f, int i) {
        if (str != null) {
            this.f114868a = str;
            if (str2 != null) {
                this.f114869b = str2;
                this.f114870c = f;
                this.f114871d = i;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null className");
    }

    @Override // p000.AbstractC33203Gu6
    @KeepForSdk
    /* renamed from: a */
    public String mo7806a() {
        return this.f114868a;
    }

    @Override // p000.AbstractC33203Gu6
    @KeepForSdk
    /* renamed from: b */
    public int mo7805b() {
        return this.f114871d;
    }

    @Override // p000.AbstractC33203Gu6
    @KeepForSdk
    /* renamed from: c */
    public float mo7804c() {
        return this.f114870c;
    }

    @Override // p000.AbstractC33203Gu6
    @KeepForSdk
    /* renamed from: d */
    public String mo7803d() {
        return this.f114869b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC33203Gu6) {
            AbstractC33203Gu6 abstractC33203Gu6 = (AbstractC33203Gu6) obj;
            if (this.f114868a.equals(abstractC33203Gu6.mo7806a()) && this.f114869b.equals(abstractC33203Gu6.mo7803d()) && Float.floatToIntBits(this.f114870c) == Float.floatToIntBits(abstractC33203Gu6.mo7804c()) && this.f114871d == abstractC33203Gu6.mo7805b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f114868a.hashCode() ^ 1000003) * 1000003) ^ this.f114869b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f114870c)) * 1000003) ^ this.f114871d;
    }

    public final String toString() {
        String str = this.f114868a;
        String str2 = this.f114869b;
        float f = this.f114870c;
        int i = this.f114871d;
        StringBuilder sb = new StringBuilder(str.length() + 74 + str2.length());
        sb.append("VkpImageLabel{className=");
        sb.append(str);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", score=");
        sb.append(f);
        sb.append(", index=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
