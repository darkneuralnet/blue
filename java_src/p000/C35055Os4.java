package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;J\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0007J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0000J\u001e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001dR \u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u001dR \u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001b\u0012\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010\u001dR\u001a\u0010)\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001f\u001a\u0004\b'\u0010\u001dR\u001a\u0010,\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001f\u001a\u0004\b*\u0010\u001dR#\u00101\u001a\u00020-8FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b0\u0010\u001f\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b2\u0010/R\u001a\u00105\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b4\u0010/R\u001a\u00107\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b6\u0010/R\u001a\u00109\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b8\u0010/\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006<"}, m28432d2 = {"LOs4;", "", "LCe3;", "offset", "s", "(J)LOs4;", "", "translateX", "translateY", "r", LegacyRepairType.OTHER_KEY, "p", "", "q", "b", "(J)Z", "", "toString", "left", "top", "right", "bottom", "c", "", "hashCode", "equals", C17296a.f69688o, "F", "i", "()F", "getLeft$annotations", "()V", "l", "getTop$annotations", "j", "getRight$annotations", DateTokenConverter.CONVERTER_KEY, "e", "getBottom$annotations", "o", "getWidth$annotations", "width", "h", "getHeight$annotations", "height", "LxB5;", "k", "()J", "getSize-NH-jbRc$annotations", "size", "m", "topLeft", "n", "topRight", "g", "center", "f", "bottomRight", "<init>", "(FFFF)V", "ui-geometry_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Os4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35055Os4 {

    /* renamed from: e */
    public static final C6194a f27481e = new C6194a(null);

    /* renamed from: f */
    public static final C35055Os4 f27482f = new C35055Os4(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public final float f27483a;

    /* renamed from: b */
    public final float f27484b;

    /* renamed from: c */
    public final float f27485c;

    /* renamed from: d */
    public final float f27486d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LOs4$a;", "", "LOs4;", "Zero", "LOs4;", C17296a.f69688o, "()LOs4;", "getZero$annotations", "()V", "<init>", "ui-geometry_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Os4$a */
    /* loaded from: classes.dex */
    public static final class C6194a {
        public /* synthetic */ C6194a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C35055Os4 m91247a() {
            return C35055Os4.f27482f;
        }

        private C6194a() {
        }
    }

    public C35055Os4(float f, float f2, float f3, float f4) {
        this.f27483a = f;
        this.f27484b = f2;
        this.f27485c = f3;
        this.f27486d = f4;
    }

    /* renamed from: d */
    public static /* synthetic */ C35055Os4 m91263d(C35055Os4 c35055Os4, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = c35055Os4.f27483a;
        }
        if ((i & 2) != 0) {
            f2 = c35055Os4.f27484b;
        }
        if ((i & 4) != 0) {
            f3 = c35055Os4.f27485c;
        }
        if ((i & 8) != 0) {
            f4 = c35055Os4.f27486d;
        }
        return c35055Os4.m91264c(f, f2, f3, f4);
    }

    /* renamed from: b */
    public final boolean m91265b(long j) {
        return C32120Ce3.m111944o(j) >= this.f27483a && C32120Ce3.m111944o(j) < this.f27485c && C32120Ce3.m111943p(j) >= this.f27484b && C32120Ce3.m111943p(j) < this.f27486d;
    }

    /* renamed from: c */
    public final C35055Os4 m91264c(float f, float f2, float f3, float f4) {
        return new C35055Os4(f, f2, f3, f4);
    }

    /* renamed from: e */
    public final float m91262e() {
        return this.f27486d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35055Os4) {
            C35055Os4 c35055Os4 = (C35055Os4) obj;
            return Float.compare(this.f27483a, c35055Os4.f27483a) == 0 && Float.compare(this.f27484b, c35055Os4.f27484b) == 0 && Float.compare(this.f27485c, c35055Os4.f27485c) == 0 && Float.compare(this.f27486d, c35055Os4.f27486d) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final long m91261f() {
        return C33056Ge3.m104938a(this.f27485c, this.f27486d);
    }

    /* renamed from: g */
    public final long m91260g() {
        return C33056Ge3.m104938a(this.f27483a + (m91252o() / 2.0f), this.f27484b + (m91259h() / 2.0f));
    }

    /* renamed from: h */
    public final float m91259h() {
        return this.f27486d - this.f27484b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f27483a) * 31) + Float.hashCode(this.f27484b)) * 31) + Float.hashCode(this.f27485c)) * 31) + Float.hashCode(this.f27486d);
    }

    /* renamed from: i */
    public final float m91258i() {
        return this.f27483a;
    }

    /* renamed from: j */
    public final float m91257j() {
        return this.f27485c;
    }

    /* renamed from: k */
    public final long m91256k() {
        return CB5.m112663a(m91252o(), m91259h());
    }

    /* renamed from: l */
    public final float m91255l() {
        return this.f27484b;
    }

    /* renamed from: m */
    public final long m91254m() {
        return C33056Ge3.m104938a(this.f27483a, this.f27484b);
    }

    /* renamed from: n */
    public final long m91253n() {
        return C33056Ge3.m104938a(this.f27485c, this.f27484b);
    }

    /* renamed from: o */
    public final float m91252o() {
        return this.f27485c - this.f27483a;
    }

    /* renamed from: p */
    public final C35055Os4 m91251p(C35055Os4 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new C35055Os4(Math.max(this.f27483a, other.f27483a), Math.max(this.f27484b, other.f27484b), Math.min(this.f27485c, other.f27485c), Math.min(this.f27486d, other.f27486d));
    }

    /* renamed from: q */
    public final boolean m91250q(C35055Os4 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.f27485c <= other.f27483a || other.f27485c <= this.f27483a || this.f27486d <= other.f27484b || other.f27486d <= this.f27484b) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final C35055Os4 m91249r(float f, float f2) {
        return new C35055Os4(this.f27483a + f, this.f27484b + f2, this.f27485c + f, this.f27486d + f2);
    }

    /* renamed from: s */
    public final C35055Os4 m91248s(long j) {
        return new C35055Os4(this.f27483a + C32120Ce3.m111944o(j), this.f27484b + C32120Ce3.m111943p(j), this.f27485c + C32120Ce3.m111944o(j), this.f27486d + C32120Ce3.m111943p(j));
    }

    public String toString() {
        return "Rect.fromLTRB(" + C41984hC1.m36629a(this.f27483a, 1) + ", " + C41984hC1.m36629a(this.f27484b, 1) + ", " + C41984hC1.m36629a(this.f27485c, 1) + ", " + C41984hC1.m36629a(this.f27486d, 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
