package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import p000.AbstractC34139Ku6;
/* renamed from: yu */
/* loaded from: classes6.dex */
public final class C30769yu extends AbstractC34139Ku6.AbstractC4613a {

    /* renamed from: a */
    public final int f120378a;

    /* renamed from: b */
    public final int f120379b;

    public C30769yu(int i, int i2) {
        this.f120378a = i;
        this.f120379b = i2;
    }

    @Override // p000.AbstractC34139Ku6.AbstractC4613a
    @KeepForSdk
    /* renamed from: a */
    public int mo2316a() {
        return this.f120379b;
    }

    @Override // p000.AbstractC34139Ku6.AbstractC4613a
    @KeepForSdk
    /* renamed from: b */
    public int mo2315b() {
        return this.f120378a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC34139Ku6.AbstractC4613a) {
            AbstractC34139Ku6.AbstractC4613a abstractC4613a = (AbstractC34139Ku6.AbstractC4613a) obj;
            if (this.f120378a == abstractC4613a.mo2315b() && this.f120379b == abstractC4613a.mo2316a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f120378a ^ 1000003) * 1000003) ^ this.f120379b;
    }

    public final String toString() {
        int i = this.f120378a;
        int i2 = this.f120379b;
        StringBuilder sb = new StringBuilder(61);
        sb.append("VkpError{errorSpaceNumber=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
