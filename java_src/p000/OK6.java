package p000;

import android.support.annotation.Nullable;
/* renamed from: OK6 */
/* loaded from: classes6.dex */
public final class OK6 extends AbstractC7276Ro {

    /* renamed from: b */
    public final int f26394b;

    /* renamed from: c */
    public final String f26395c;

    /* renamed from: d */
    public final String f26396d;

    public OK6(int i, @Nullable String str, @Nullable String str2) {
        this.f26394b = i;
        this.f26395c = str;
        this.f26396d = str2;
    }

    @Override // p000.AbstractC7276Ro
    @Nullable
    /* renamed from: a */
    public final String mo86289a() {
        return this.f26396d;
    }

    @Override // p000.AbstractC7276Ro
    /* renamed from: c */
    public final int mo86287c() {
        return this.f26394b;
    }

    @Override // p000.AbstractC7276Ro
    @Nullable
    /* renamed from: d */
    public final String mo86286d() {
        return this.f26395c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7276Ro) {
            AbstractC7276Ro abstractC7276Ro = (AbstractC7276Ro) obj;
            if (this.f26394b == abstractC7276Ro.mo86287c() && ((str = this.f26395c) != null ? str.equals(abstractC7276Ro.mo86286d()) : abstractC7276Ro.mo86286d() == null)) {
                String str2 = this.f26396d;
                String mo86289a = abstractC7276Ro.mo86289a();
                if (str2 != null ? str2.equals(mo86289a) : mo86289a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f26394b ^ 1000003) * 1000003;
        String str = this.f26395c;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f26396d;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f26394b;
        String str = this.f26395c;
        String str2 = this.f26396d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
