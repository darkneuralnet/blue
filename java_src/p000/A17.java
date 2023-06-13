package p000;
/* renamed from: A17 */
/* loaded from: classes6.dex */
public final class A17 extends AbstractC34373Lu6 {

    /* renamed from: a */
    public final String f32a;

    /* renamed from: b */
    public final String f33b;

    /* renamed from: c */
    public final String f34c;

    public /* synthetic */ A17(String str, String str2, String str3, C50765w07 c50765w07) {
        this.f32a = str;
        this.f33b = str2;
        this.f34c = str3;
    }

    @Override // p000.AbstractC34373Lu6
    /* renamed from: b */
    public final String mo96205b() {
        return this.f32a;
    }

    @Override // p000.AbstractC34373Lu6
    /* renamed from: c */
    public final String mo96204c() {
        return this.f34c;
    }

    @Override // p000.AbstractC34373Lu6
    /* renamed from: d */
    public final String mo96203d() {
        return this.f33b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC34373Lu6) {
            AbstractC34373Lu6 abstractC34373Lu6 = (AbstractC34373Lu6) obj;
            if (this.f32a.equals(abstractC34373Lu6.mo96205b()) && this.f33b.equals(abstractC34373Lu6.mo96203d()) && this.f34c.equals(abstractC34373Lu6.mo96204c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f32a.hashCode() ^ 1000003) * 1000003) ^ this.f33b.hashCode()) * 1000003) ^ this.f34c.hashCode();
    }

    public final String toString() {
        String str = this.f32a;
        String str2 = this.f33b;
        String str3 = this.f34c;
        return "VkpTextRecognizerOptions{configLabel=" + str + ", modelDir=" + str2 + ", languageHint=" + str3 + "}";
    }
}
