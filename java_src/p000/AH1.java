package p000;

import android.text.TextUtils;
/* renamed from: AH1 */
/* loaded from: classes.dex */
public final class AH1 {

    /* renamed from: a */
    public final String f352a;

    /* renamed from: b */
    public final String f353b;

    public AH1(String str, String str2) {
        this.f352a = str;
        this.f353b = str2;
    }

    /* renamed from: a */
    public final String m115938a() {
        return this.f352a;
    }

    /* renamed from: b */
    public final String m115937b() {
        return this.f353b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AH1.class != obj.getClass()) {
            return false;
        }
        AH1 ah1 = (AH1) obj;
        if (TextUtils.equals(this.f352a, ah1.f352a) && TextUtils.equals(this.f353b, ah1.f353b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f352a.hashCode() * 31) + this.f353b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f352a + ",value=" + this.f353b + "]";
    }
}
