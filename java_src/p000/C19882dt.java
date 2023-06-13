package p000;

import android.util.Range;
import android.util.Size;
/* renamed from: dt */
/* loaded from: classes.dex */
public final class C19882dt extends AbstractC28413sp {

    /* renamed from: a */
    public final DV5 f77335a;

    /* renamed from: b */
    public final int f77336b;

    /* renamed from: c */
    public final Size f77337c;

    /* renamed from: d */
    public final Range<Integer> f77338d;

    public C19882dt(DV5 dv5, int i, Size size, Range<Integer> range) {
        if (dv5 != null) {
            this.f77335a = dv5;
            this.f77336b = i;
            if (size != null) {
                this.f77337c = size;
                this.f77338d = range;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    @Override // p000.AbstractC28413sp
    /* renamed from: b */
    public int mo13610b() {
        return this.f77336b;
    }

    @Override // p000.AbstractC28413sp
    /* renamed from: c */
    public Size mo13609c() {
        return this.f77337c;
    }

    @Override // p000.AbstractC28413sp
    /* renamed from: d */
    public DV5 mo13608d() {
        return this.f77335a;
    }

    @Override // p000.AbstractC28413sp
    /* renamed from: e */
    public Range<Integer> mo13607e() {
        return this.f77338d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC28413sp)) {
            return false;
        }
        AbstractC28413sp abstractC28413sp = (AbstractC28413sp) obj;
        if (this.f77335a.equals(abstractC28413sp.mo13608d()) && this.f77336b == abstractC28413sp.mo13610b() && this.f77337c.equals(abstractC28413sp.mo13609c())) {
            Range<Integer> range = this.f77338d;
            if (range == null) {
                if (abstractC28413sp.mo13607e() == null) {
                    return true;
                }
            } else if (range.equals(abstractC28413sp.mo13607e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f77335a.hashCode() ^ 1000003) * 1000003) ^ this.f77336b) * 1000003) ^ this.f77337c.hashCode()) * 1000003;
        Range<Integer> range = this.f77338d;
        if (range == null) {
            hashCode = 0;
        } else {
            hashCode = range.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f77335a + ", imageFormat=" + this.f77336b + ", size=" + this.f77337c + ", targetFrameRate=" + this.f77338d + "}";
    }
}
