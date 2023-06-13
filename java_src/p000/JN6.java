package p000;
/* renamed from: JN6 */
/* loaded from: classes6.dex */
public final class JN6 {

    /* renamed from: a */
    public final String f17460a;

    /* renamed from: b */
    public final String f17461b;

    public JN6(String str, String str2) {
        this.f17460a = str;
        this.f17461b = str2;
    }

    /* renamed from: a */
    public final String m100564a() {
        return this.f17460a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JN6) {
            JN6 jn6 = (JN6) obj;
            if (C52167yN6.m3532b(this.f17460a, jn6.f17460a) && C52167yN6.m3532b(this.f17461b, jn6.f17461b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (C52167yN6.m3533a(this.f17460a) * 37) + C52167yN6.m3533a(this.f17461b);
    }

    public final String toString() {
        return "[packageName=" + this.f17460a + ",libraryName=" + this.f17461b + "]";
    }
}
