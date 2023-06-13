package p000;

import java.util.Arrays;
/* renamed from: Oy0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35105Oy0 {

    /* renamed from: a */
    public final String f27616a;

    /* renamed from: b */
    public final String f27617b;

    /* renamed from: c */
    public final GE1 f27618c;

    /* renamed from: d */
    public final Object[] f27619d;

    public C35105Oy0(String str, String str2, GE1 ge1, Object... objArr) {
        this.f27616a = str;
        this.f27617b = str2;
        this.f27618c = ge1;
        this.f27619d = objArr;
    }

    /* renamed from: a */
    public GE1 m91142a() {
        return this.f27618c;
    }

    /* renamed from: b */
    public Object[] m91141b() {
        return this.f27619d;
    }

    /* renamed from: c */
    public String m91140c() {
        return this.f27617b;
    }

    /* renamed from: d */
    public String m91139d() {
        return this.f27616a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C35105Oy0)) {
            return false;
        }
        C35105Oy0 c35105Oy0 = (C35105Oy0) obj;
        if (this.f27616a.equals(c35105Oy0.f27616a) && this.f27617b.equals(c35105Oy0.f27617b) && this.f27618c.equals(c35105Oy0.f27618c) && Arrays.equals(this.f27619d, c35105Oy0.f27619d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f27616a.hashCode() ^ Integer.rotateLeft(this.f27617b.hashCode(), 8)) ^ Integer.rotateLeft(this.f27618c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f27619d), 24);
    }

    public String toString() {
        return this.f27616a + " : " + this.f27617b + ' ' + this.f27618c + ' ' + Arrays.toString(this.f27619d);
    }
}
