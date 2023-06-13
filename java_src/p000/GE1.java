package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: GE1 */
/* loaded from: classes6.dex */
public final class GE1 {

    /* renamed from: a */
    public final int f11180a;

    /* renamed from: b */
    public final String f11181b;

    /* renamed from: c */
    public final String f11182c;

    /* renamed from: d */
    public final String f11183d;

    /* renamed from: e */
    public final boolean f11184e;

    public GE1(int i, String str, String str2, String str3, boolean z) {
        this.f11180a = i;
        this.f11181b = str;
        this.f11182c = str2;
        this.f11183d = str3;
        this.f11184e = z;
    }

    /* renamed from: a */
    public String m105611a() {
        return this.f11183d;
    }

    /* renamed from: b */
    public String m105610b() {
        return this.f11182c;
    }

    /* renamed from: c */
    public String m105609c() {
        return this.f11181b;
    }

    /* renamed from: d */
    public int m105608d() {
        return this.f11180a;
    }

    /* renamed from: e */
    public boolean m105607e() {
        return this.f11184e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GE1)) {
            return false;
        }
        GE1 ge1 = (GE1) obj;
        if (this.f11180a == ge1.f11180a && this.f11184e == ge1.f11184e && this.f11181b.equals(ge1.f11181b) && this.f11182c.equals(ge1.f11182c) && this.f11183d.equals(ge1.f11183d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.f11180a;
        if (this.f11184e) {
            i = 64;
        } else {
            i = 0;
        }
        return i2 + i + (this.f11181b.hashCode() * this.f11182c.hashCode() * this.f11183d.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11181b);
        sb.append(CoreConstants.DOT);
        sb.append(this.f11182c);
        sb.append(this.f11183d);
        sb.append(" (");
        sb.append(this.f11180a);
        sb.append(this.f11184e ? " itf" : "");
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
