package p000;

import android.util.Range;
import android.util.Size;
import p000.BR5;
/* renamed from: iu */
/* loaded from: classes.dex */
public final class C24630iu extends BR5 {

    /* renamed from: b */
    public final Size f91660b;

    /* renamed from: c */
    public final Range<Integer> f91661c;

    /* renamed from: iu$b */
    /* loaded from: classes.dex */
    public static final class C24632b extends BR5.AbstractC0611a {

        /* renamed from: a */
        public Size f91662a;

        /* renamed from: b */
        public Range<Integer> f91663b;

        @Override // p000.BR5.AbstractC0611a
        /* renamed from: a */
        public BR5 mo31668a() {
            String str = "";
            if (this.f91662a == null) {
                str = " resolution";
            }
            if (this.f91663b == null) {
                str = str + " expectedFrameRateRange";
            }
            if (str.isEmpty()) {
                return new C24630iu(this.f91662a, this.f91663b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.BR5.AbstractC0611a
        /* renamed from: b */
        public BR5.AbstractC0611a mo31667b(Range<Integer> range) {
            if (range != null) {
                this.f91663b = range;
                return this;
            }
            throw new NullPointerException("Null expectedFrameRateRange");
        }

        /* renamed from: c */
        public BR5.AbstractC0611a m31666c(Size size) {
            if (size != null) {
                this.f91662a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }
    }

    @Override // p000.BR5
    /* renamed from: b */
    public Range<Integer> mo31670b() {
        return this.f91661c;
    }

    @Override // p000.BR5
    /* renamed from: c */
    public Size mo31669c() {
        return this.f91660b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BR5)) {
            return false;
        }
        BR5 br5 = (BR5) obj;
        if (this.f91660b.equals(br5.mo31669c()) && this.f91661c.equals(br5.mo31670b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f91660b.hashCode() ^ 1000003) * 1000003) ^ this.f91661c.hashCode();
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f91660b + ", expectedFrameRateRange=" + this.f91661c + "}";
    }

    public C24630iu(Size size, Range<Integer> range) {
        this.f91660b = size;
        this.f91661c = range;
    }
}
