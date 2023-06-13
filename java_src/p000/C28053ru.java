package p000;

import android.util.Size;
import p000.AbstractC39983dp6;
/* renamed from: ru */
/* loaded from: classes.dex */
public final class C28053ru extends AbstractC39983dp6 {

    /* renamed from: a */
    public final String f107857a;

    /* renamed from: b */
    public final int f107858b;

    /* renamed from: c */
    public final EnumC47841r46 f107859c;

    /* renamed from: d */
    public final Size f107860d;

    /* renamed from: e */
    public final int f107861e;

    /* renamed from: f */
    public final int f107862f;

    /* renamed from: g */
    public final int f107863g;

    /* renamed from: h */
    public final int f107864h;

    /* renamed from: ru$b */
    /* loaded from: classes.dex */
    public static final class C28055b extends AbstractC39983dp6.AbstractC19864a {

        /* renamed from: a */
        public String f107865a;

        /* renamed from: b */
        public Integer f107866b;

        /* renamed from: c */
        public EnumC47841r46 f107867c;

        /* renamed from: d */
        public Size f107868d;

        /* renamed from: e */
        public Integer f107869e;

        /* renamed from: f */
        public Integer f107870f;

        /* renamed from: g */
        public Integer f107871g;

        /* renamed from: h */
        public Integer f107872h;

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: a */
        public AbstractC39983dp6 mo15101a() {
            String str = "";
            if (this.f107865a == null) {
                str = " mimeType";
            }
            if (this.f107866b == null) {
                str = str + " profile";
            }
            if (this.f107867c == null) {
                str = str + " inputTimebase";
            }
            if (this.f107868d == null) {
                str = str + " resolution";
            }
            if (this.f107869e == null) {
                str = str + " colorFormat";
            }
            if (this.f107870f == null) {
                str = str + " frameRate";
            }
            if (this.f107871g == null) {
                str = str + " IFrameInterval";
            }
            if (this.f107872h == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new C28053ru(this.f107865a, this.f107866b.intValue(), this.f107867c, this.f107868d, this.f107869e.intValue(), this.f107870f.intValue(), this.f107871g.intValue(), this.f107872h.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: b */
        public AbstractC39983dp6.AbstractC19864a mo15100b(int i) {
            this.f107872h = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: c */
        public AbstractC39983dp6.AbstractC19864a mo15099c(int i) {
            this.f107869e = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: d */
        public AbstractC39983dp6.AbstractC19864a mo15098d(int i) {
            this.f107870f = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: e */
        public AbstractC39983dp6.AbstractC19864a mo15097e(int i) {
            this.f107871g = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: f */
        public AbstractC39983dp6.AbstractC19864a mo15096f(EnumC47841r46 enumC47841r46) {
            if (enumC47841r46 != null) {
                this.f107867c = enumC47841r46;
                return this;
            }
            throw new NullPointerException("Null inputTimebase");
        }

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: g */
        public AbstractC39983dp6.AbstractC19864a mo15095g(String str) {
            if (str != null) {
                this.f107865a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // p000.AbstractC39983dp6.AbstractC19864a
        /* renamed from: h */
        public AbstractC39983dp6.AbstractC19864a mo15094h(Size size) {
            if (size != null) {
                this.f107868d = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }

        /* renamed from: i */
        public AbstractC39983dp6.AbstractC19864a m15093i(int i) {
            this.f107866b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // p000.AbstractC39983dp6, p000.InterfaceC49918ub1
    /* renamed from: a */
    public String mo2555a() {
        return this.f107857a;
    }

    @Override // p000.AbstractC39983dp6, p000.InterfaceC49918ub1
    /* renamed from: b */
    public EnumC47841r46 mo10003b() {
        return this.f107859c;
    }

    @Override // p000.AbstractC39983dp6
    /* renamed from: e */
    public int mo15107e() {
        return this.f107864h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC39983dp6)) {
            return false;
        }
        AbstractC39983dp6 abstractC39983dp6 = (AbstractC39983dp6) obj;
        if (this.f107857a.equals(abstractC39983dp6.mo2555a()) && this.f107858b == abstractC39983dp6.mo15103i() && this.f107859c.equals(abstractC39983dp6.mo10003b()) && this.f107860d.equals(abstractC39983dp6.mo15102j()) && this.f107861e == abstractC39983dp6.mo15106f() && this.f107862f == abstractC39983dp6.mo15105g() && this.f107863g == abstractC39983dp6.mo15104h() && this.f107864h == abstractC39983dp6.mo15107e()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC39983dp6
    /* renamed from: f */
    public int mo15106f() {
        return this.f107861e;
    }

    @Override // p000.AbstractC39983dp6
    /* renamed from: g */
    public int mo15105g() {
        return this.f107862f;
    }

    @Override // p000.AbstractC39983dp6
    /* renamed from: h */
    public int mo15104h() {
        return this.f107863g;
    }

    public int hashCode() {
        return ((((((((((((((this.f107857a.hashCode() ^ 1000003) * 1000003) ^ this.f107858b) * 1000003) ^ this.f107859c.hashCode()) * 1000003) ^ this.f107860d.hashCode()) * 1000003) ^ this.f107861e) * 1000003) ^ this.f107862f) * 1000003) ^ this.f107863g) * 1000003) ^ this.f107864h;
    }

    @Override // p000.AbstractC39983dp6
    /* renamed from: i */
    public int mo15103i() {
        return this.f107858b;
    }

    @Override // p000.AbstractC39983dp6
    /* renamed from: j */
    public Size mo15102j() {
        return this.f107860d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f107857a + ", profile=" + this.f107858b + ", inputTimebase=" + this.f107859c + ", resolution=" + this.f107860d + ", colorFormat=" + this.f107861e + ", frameRate=" + this.f107862f + ", IFrameInterval=" + this.f107863g + ", bitrate=" + this.f107864h + "}";
    }

    public C28053ru(String str, int i, EnumC47841r46 enumC47841r46, Size size, int i2, int i3, int i4, int i5) {
        this.f107857a = str;
        this.f107858b = i;
        this.f107859c = enumC47841r46;
        this.f107860d = size;
        this.f107861e = i2;
        this.f107862f = i3;
        this.f107863g = i4;
        this.f107864h = i5;
    }
}
