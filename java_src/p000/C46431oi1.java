package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: oi1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46431oi1 {

    /* renamed from: a */
    public final List<C45838ni1> f102361a;

    /* renamed from: b */
    public final int f102362b;

    /* renamed from: c */
    public final boolean f102363c;

    public C46431oi1(List<C45838ni1> list, int i, boolean z) {
        this.f102361a = new ArrayList(list);
        this.f102362b = i;
        this.f102363c = z;
    }

    /* renamed from: a */
    public List<C45838ni1> m20589a() {
        return this.f102361a;
    }

    /* renamed from: b */
    public int m20588b() {
        return this.f102362b;
    }

    /* renamed from: c */
    public boolean m20587c(List<C45838ni1> list) {
        return this.f102361a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C46431oi1)) {
            return false;
        }
        C46431oi1 c46431oi1 = (C46431oi1) obj;
        if (!this.f102361a.equals(c46431oi1.m20589a()) || this.f102363c != c46431oi1.f102363c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f102361a.hashCode() ^ Boolean.valueOf(this.f102363c).hashCode();
    }

    public String toString() {
        return "{ " + this.f102361a + " }";
    }
}
