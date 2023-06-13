package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0003\u0007\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0013\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, m28432d2 = {"LpJ3;", "", "", C17296a.f69688o, "Z", "()Z", "isCurve", "b", "isQuad", "<init>", "(ZZ)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "LpJ3$a;", "LpJ3$b;", "LpJ3$c;", "LpJ3$d;", "LpJ3$e;", "LpJ3$f;", "LpJ3$g;", "LpJ3$h;", "LpJ3$i;", "LpJ3$j;", "LpJ3$k;", "LpJ3$l;", "LpJ3$m;", "LpJ3$n;", "LpJ3$o;", "LpJ3$p;", "LpJ3$q;", "LpJ3$r;", "LpJ3$s;", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pJ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46793pJ3 {

    /* renamed from: a */
    public final boolean f103454a;

    /* renamed from: b */
    public final boolean f103455b;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"LpJ3$a;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "e", "()F", "horizontalEllipseRadius", DateTokenConverter.CONVERTER_KEY, "g", "verticalEllipseRadius", "f", "theta", "Z", "h", "()Z", "isMoreThanHalf", "i", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$a */
    /* loaded from: classes.dex */
    public static final class C27252a extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103456c;

        /* renamed from: d */
        public final float f103457d;

        /* renamed from: e */
        public final float f103458e;

        /* renamed from: f */
        public final boolean f103459f;

        /* renamed from: g */
        public final boolean f103460g;

        /* renamed from: h */
        public final float f103461h;

        /* renamed from: i */
        public final float f103462i;

        public C27252a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f103456c = f;
            this.f103457d = f2;
            this.f103458e = f3;
            this.f103459f = z;
            this.f103460g = z2;
            this.f103461h = f4;
            this.f103462i = f5;
        }

        /* renamed from: c */
        public final float m19528c() {
            return this.f103461h;
        }

        /* renamed from: d */
        public final float m19527d() {
            return this.f103462i;
        }

        /* renamed from: e */
        public final float m19526e() {
            return this.f103456c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27252a) {
                C27252a c27252a = (C27252a) obj;
                return Float.compare(this.f103456c, c27252a.f103456c) == 0 && Float.compare(this.f103457d, c27252a.f103457d) == 0 && Float.compare(this.f103458e, c27252a.f103458e) == 0 && this.f103459f == c27252a.f103459f && this.f103460g == c27252a.f103460g && Float.compare(this.f103461h, c27252a.f103461h) == 0 && Float.compare(this.f103462i, c27252a.f103462i) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19525f() {
            return this.f103458e;
        }

        /* renamed from: g */
        public final float m19524g() {
            return this.f103457d;
        }

        /* renamed from: h */
        public final boolean m19523h() {
            return this.f103459f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f103456c) * 31) + Float.hashCode(this.f103457d)) * 31) + Float.hashCode(this.f103458e)) * 31;
            boolean z = this.f103459f;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.f103460g;
            return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Float.hashCode(this.f103461h)) * 31) + Float.hashCode(this.f103462i);
        }

        /* renamed from: i */
        public final boolean m19522i() {
            return this.f103460g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f103456c + ", verticalEllipseRadius=" + this.f103457d + ", theta=" + this.f103458e + ", isMoreThanHalf=" + this.f103459f + ", isPositiveArc=" + this.f103460g + ", arcStartX=" + this.f103461h + ", arcStartY=" + this.f103462i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LpJ3$b;", "LpJ3;", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$b */
    /* loaded from: classes.dex */
    public static final class C27253b extends AbstractC46793pJ3 {

        /* renamed from: c */
        public static final C27253b f103463c = new C27253b();

        private C27253b() {
            super(false, false, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, m28432d2 = {"LpJ3$c;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "x1", DateTokenConverter.CONVERTER_KEY, "f", "y1", "e", "x2", "g", "y2", "x3", "h", "y3", "<init>", "(FFFFFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$c */
    /* loaded from: classes.dex */
    public static final class C27254c extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103464c;

        /* renamed from: d */
        public final float f103465d;

        /* renamed from: e */
        public final float f103466e;

        /* renamed from: f */
        public final float f103467f;

        /* renamed from: g */
        public final float f103468g;

        /* renamed from: h */
        public final float f103469h;

        public C27254c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f103464c = f;
            this.f103465d = f2;
            this.f103466e = f3;
            this.f103467f = f4;
            this.f103468g = f5;
            this.f103469h = f6;
        }

        /* renamed from: c */
        public final float m19521c() {
            return this.f103464c;
        }

        /* renamed from: d */
        public final float m19520d() {
            return this.f103466e;
        }

        /* renamed from: e */
        public final float m19519e() {
            return this.f103468g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27254c) {
                C27254c c27254c = (C27254c) obj;
                return Float.compare(this.f103464c, c27254c.f103464c) == 0 && Float.compare(this.f103465d, c27254c.f103465d) == 0 && Float.compare(this.f103466e, c27254c.f103466e) == 0 && Float.compare(this.f103467f, c27254c.f103467f) == 0 && Float.compare(this.f103468g, c27254c.f103468g) == 0 && Float.compare(this.f103469h, c27254c.f103469h) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19518f() {
            return this.f103465d;
        }

        /* renamed from: g */
        public final float m19517g() {
            return this.f103467f;
        }

        /* renamed from: h */
        public final float m19516h() {
            return this.f103469h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f103464c) * 31) + Float.hashCode(this.f103465d)) * 31) + Float.hashCode(this.f103466e)) * 31) + Float.hashCode(this.f103467f)) * 31) + Float.hashCode(this.f103468g)) * 31) + Float.hashCode(this.f103469h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f103464c + ", y1=" + this.f103465d + ", x2=" + this.f103466e + ", y2=" + this.f103467f + ", x3=" + this.f103468g + ", y3=" + this.f103469h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LpJ3$d;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "x", "<init>", "(F)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$d */
    /* loaded from: classes.dex */
    public static final class C27255d extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103470c;

        public C27255d(float f) {
            super(false, false, 3, null);
            this.f103470c = f;
        }

        /* renamed from: c */
        public final float m19515c() {
            return this.f103470c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27255d) && Float.compare(this.f103470c, ((C27255d) obj).f103470c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f103470c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f103470c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LpJ3$e;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "x", DateTokenConverter.CONVERTER_KEY, "y", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$e */
    /* loaded from: classes.dex */
    public static final class C27256e extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103471c;

        /* renamed from: d */
        public final float f103472d;

        public C27256e(float f, float f2) {
            super(false, false, 3, null);
            this.f103471c = f;
            this.f103472d = f2;
        }

        /* renamed from: c */
        public final float m19514c() {
            return this.f103471c;
        }

        /* renamed from: d */
        public final float m19513d() {
            return this.f103472d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27256e) {
                C27256e c27256e = (C27256e) obj;
                return Float.compare(this.f103471c, c27256e.f103471c) == 0 && Float.compare(this.f103472d, c27256e.f103472d) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f103471c) * 31) + Float.hashCode(this.f103472d);
        }

        public String toString() {
            return "LineTo(x=" + this.f103471c + ", y=" + this.f103472d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LpJ3$f;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "x", DateTokenConverter.CONVERTER_KEY, "y", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$f */
    /* loaded from: classes.dex */
    public static final class C27257f extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103473c;

        /* renamed from: d */
        public final float f103474d;

        public C27257f(float f, float f2) {
            super(false, false, 3, null);
            this.f103473c = f;
            this.f103474d = f2;
        }

        /* renamed from: c */
        public final float m19512c() {
            return this.f103473c;
        }

        /* renamed from: d */
        public final float m19511d() {
            return this.f103474d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27257f) {
                C27257f c27257f = (C27257f) obj;
                return Float.compare(this.f103473c, c27257f.f103473c) == 0 && Float.compare(this.f103474d, c27257f.f103474d) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f103473c) * 31) + Float.hashCode(this.f103474d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f103473c + ", y=" + this.f103474d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, m28432d2 = {"LpJ3$g;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "x1", DateTokenConverter.CONVERTER_KEY, "e", "y1", "x2", "f", "y2", "<init>", "(FFFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$g */
    /* loaded from: classes.dex */
    public static final class C27258g extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103475c;

        /* renamed from: d */
        public final float f103476d;

        /* renamed from: e */
        public final float f103477e;

        /* renamed from: f */
        public final float f103478f;

        public C27258g(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f103475c = f;
            this.f103476d = f2;
            this.f103477e = f3;
            this.f103478f = f4;
        }

        /* renamed from: c */
        public final float m19510c() {
            return this.f103475c;
        }

        /* renamed from: d */
        public final float m19509d() {
            return this.f103477e;
        }

        /* renamed from: e */
        public final float m19508e() {
            return this.f103476d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27258g) {
                C27258g c27258g = (C27258g) obj;
                return Float.compare(this.f103475c, c27258g.f103475c) == 0 && Float.compare(this.f103476d, c27258g.f103476d) == 0 && Float.compare(this.f103477e, c27258g.f103477e) == 0 && Float.compare(this.f103478f, c27258g.f103478f) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19507f() {
            return this.f103478f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f103475c) * 31) + Float.hashCode(this.f103476d)) * 31) + Float.hashCode(this.f103477e)) * 31) + Float.hashCode(this.f103478f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f103475c + ", y1=" + this.f103476d + ", x2=" + this.f103477e + ", y2=" + this.f103478f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, m28432d2 = {"LpJ3$h;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "x1", DateTokenConverter.CONVERTER_KEY, "e", "y1", "x2", "f", "y2", "<init>", "(FFFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$h */
    /* loaded from: classes.dex */
    public static final class C27259h extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103479c;

        /* renamed from: d */
        public final float f103480d;

        /* renamed from: e */
        public final float f103481e;

        /* renamed from: f */
        public final float f103482f;

        public C27259h(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f103479c = f;
            this.f103480d = f2;
            this.f103481e = f3;
            this.f103482f = f4;
        }

        /* renamed from: c */
        public final float m19506c() {
            return this.f103479c;
        }

        /* renamed from: d */
        public final float m19505d() {
            return this.f103481e;
        }

        /* renamed from: e */
        public final float m19504e() {
            return this.f103480d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27259h) {
                C27259h c27259h = (C27259h) obj;
                return Float.compare(this.f103479c, c27259h.f103479c) == 0 && Float.compare(this.f103480d, c27259h.f103480d) == 0 && Float.compare(this.f103481e, c27259h.f103481e) == 0 && Float.compare(this.f103482f, c27259h.f103482f) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19503f() {
            return this.f103482f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f103479c) * 31) + Float.hashCode(this.f103480d)) * 31) + Float.hashCode(this.f103481e)) * 31) + Float.hashCode(this.f103482f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f103479c + ", y1=" + this.f103480d + ", x2=" + this.f103481e + ", y2=" + this.f103482f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LpJ3$i;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "x", DateTokenConverter.CONVERTER_KEY, "y", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$i */
    /* loaded from: classes.dex */
    public static final class C27260i extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103483c;

        /* renamed from: d */
        public final float f103484d;

        public C27260i(float f, float f2) {
            super(false, true, 1, null);
            this.f103483c = f;
            this.f103484d = f2;
        }

        /* renamed from: c */
        public final float m19502c() {
            return this.f103483c;
        }

        /* renamed from: d */
        public final float m19501d() {
            return this.f103484d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27260i) {
                C27260i c27260i = (C27260i) obj;
                return Float.compare(this.f103483c, c27260i.f103483c) == 0 && Float.compare(this.f103484d, c27260i.f103484d) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f103483c) * 31) + Float.hashCode(this.f103484d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f103483c + ", y=" + this.f103484d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"LpJ3$j;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "e", "()F", "horizontalEllipseRadius", DateTokenConverter.CONVERTER_KEY, "g", "verticalEllipseRadius", "f", "theta", "Z", "h", "()Z", "isMoreThanHalf", "i", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$j */
    /* loaded from: classes.dex */
    public static final class C27261j extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103485c;

        /* renamed from: d */
        public final float f103486d;

        /* renamed from: e */
        public final float f103487e;

        /* renamed from: f */
        public final boolean f103488f;

        /* renamed from: g */
        public final boolean f103489g;

        /* renamed from: h */
        public final float f103490h;

        /* renamed from: i */
        public final float f103491i;

        public C27261j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.f103485c = f;
            this.f103486d = f2;
            this.f103487e = f3;
            this.f103488f = z;
            this.f103489g = z2;
            this.f103490h = f4;
            this.f103491i = f5;
        }

        /* renamed from: c */
        public final float m19500c() {
            return this.f103490h;
        }

        /* renamed from: d */
        public final float m19499d() {
            return this.f103491i;
        }

        /* renamed from: e */
        public final float m19498e() {
            return this.f103485c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27261j) {
                C27261j c27261j = (C27261j) obj;
                return Float.compare(this.f103485c, c27261j.f103485c) == 0 && Float.compare(this.f103486d, c27261j.f103486d) == 0 && Float.compare(this.f103487e, c27261j.f103487e) == 0 && this.f103488f == c27261j.f103488f && this.f103489g == c27261j.f103489g && Float.compare(this.f103490h, c27261j.f103490h) == 0 && Float.compare(this.f103491i, c27261j.f103491i) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19497f() {
            return this.f103487e;
        }

        /* renamed from: g */
        public final float m19496g() {
            return this.f103486d;
        }

        /* renamed from: h */
        public final boolean m19495h() {
            return this.f103488f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.f103485c) * 31) + Float.hashCode(this.f103486d)) * 31) + Float.hashCode(this.f103487e)) * 31;
            boolean z = this.f103488f;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.f103489g;
            return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Float.hashCode(this.f103490h)) * 31) + Float.hashCode(this.f103491i);
        }

        /* renamed from: i */
        public final boolean m19494i() {
            return this.f103489g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f103485c + ", verticalEllipseRadius=" + this.f103486d + ", theta=" + this.f103487e + ", isMoreThanHalf=" + this.f103488f + ", isPositiveArc=" + this.f103489g + ", arcStartDx=" + this.f103490h + ", arcStartDy=" + this.f103491i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, m28432d2 = {"LpJ3$k;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dx1", DateTokenConverter.CONVERTER_KEY, "f", "dy1", "e", "dx2", "g", "dy2", "dx3", "h", "dy3", "<init>", "(FFFFFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$k */
    /* loaded from: classes.dex */
    public static final class C27262k extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103492c;

        /* renamed from: d */
        public final float f103493d;

        /* renamed from: e */
        public final float f103494e;

        /* renamed from: f */
        public final float f103495f;

        /* renamed from: g */
        public final float f103496g;

        /* renamed from: h */
        public final float f103497h;

        public C27262k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.f103492c = f;
            this.f103493d = f2;
            this.f103494e = f3;
            this.f103495f = f4;
            this.f103496g = f5;
            this.f103497h = f6;
        }

        /* renamed from: c */
        public final float m19493c() {
            return this.f103492c;
        }

        /* renamed from: d */
        public final float m19492d() {
            return this.f103494e;
        }

        /* renamed from: e */
        public final float m19491e() {
            return this.f103496g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27262k) {
                C27262k c27262k = (C27262k) obj;
                return Float.compare(this.f103492c, c27262k.f103492c) == 0 && Float.compare(this.f103493d, c27262k.f103493d) == 0 && Float.compare(this.f103494e, c27262k.f103494e) == 0 && Float.compare(this.f103495f, c27262k.f103495f) == 0 && Float.compare(this.f103496g, c27262k.f103496g) == 0 && Float.compare(this.f103497h, c27262k.f103497h) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19490f() {
            return this.f103493d;
        }

        /* renamed from: g */
        public final float m19489g() {
            return this.f103495f;
        }

        /* renamed from: h */
        public final float m19488h() {
            return this.f103497h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f103492c) * 31) + Float.hashCode(this.f103493d)) * 31) + Float.hashCode(this.f103494e)) * 31) + Float.hashCode(this.f103495f)) * 31) + Float.hashCode(this.f103496g)) * 31) + Float.hashCode(this.f103497h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f103492c + ", dy1=" + this.f103493d + ", dx2=" + this.f103494e + ", dy2=" + this.f103495f + ", dx3=" + this.f103496g + ", dy3=" + this.f103497h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LpJ3$l;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dx", "<init>", "(F)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$l */
    /* loaded from: classes.dex */
    public static final class C27263l extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103498c;

        public C27263l(float f) {
            super(false, false, 3, null);
            this.f103498c = f;
        }

        /* renamed from: c */
        public final float m19487c() {
            return this.f103498c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27263l) && Float.compare(this.f103498c, ((C27263l) obj).f103498c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f103498c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f103498c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LpJ3$m;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dx", DateTokenConverter.CONVERTER_KEY, "dy", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$m */
    /* loaded from: classes.dex */
    public static final class C27264m extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103499c;

        /* renamed from: d */
        public final float f103500d;

        public C27264m(float f, float f2) {
            super(false, false, 3, null);
            this.f103499c = f;
            this.f103500d = f2;
        }

        /* renamed from: c */
        public final float m19486c() {
            return this.f103499c;
        }

        /* renamed from: d */
        public final float m19485d() {
            return this.f103500d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27264m) {
                C27264m c27264m = (C27264m) obj;
                return Float.compare(this.f103499c, c27264m.f103499c) == 0 && Float.compare(this.f103500d, c27264m.f103500d) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f103499c) * 31) + Float.hashCode(this.f103500d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f103499c + ", dy=" + this.f103500d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LpJ3$n;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dx", DateTokenConverter.CONVERTER_KEY, "dy", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$n */
    /* loaded from: classes.dex */
    public static final class C27265n extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103501c;

        /* renamed from: d */
        public final float f103502d;

        public C27265n(float f, float f2) {
            super(false, false, 3, null);
            this.f103501c = f;
            this.f103502d = f2;
        }

        /* renamed from: c */
        public final float m19484c() {
            return this.f103501c;
        }

        /* renamed from: d */
        public final float m19483d() {
            return this.f103502d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27265n) {
                C27265n c27265n = (C27265n) obj;
                return Float.compare(this.f103501c, c27265n.f103501c) == 0 && Float.compare(this.f103502d, c27265n.f103502d) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f103501c) * 31) + Float.hashCode(this.f103502d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f103501c + ", dy=" + this.f103502d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, m28432d2 = {"LpJ3$o;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dx1", DateTokenConverter.CONVERTER_KEY, "e", "dy1", "dx2", "f", "dy2", "<init>", "(FFFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$o */
    /* loaded from: classes.dex */
    public static final class C27266o extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103503c;

        /* renamed from: d */
        public final float f103504d;

        /* renamed from: e */
        public final float f103505e;

        /* renamed from: f */
        public final float f103506f;

        public C27266o(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.f103503c = f;
            this.f103504d = f2;
            this.f103505e = f3;
            this.f103506f = f4;
        }

        /* renamed from: c */
        public final float m19482c() {
            return this.f103503c;
        }

        /* renamed from: d */
        public final float m19481d() {
            return this.f103505e;
        }

        /* renamed from: e */
        public final float m19480e() {
            return this.f103504d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27266o) {
                C27266o c27266o = (C27266o) obj;
                return Float.compare(this.f103503c, c27266o.f103503c) == 0 && Float.compare(this.f103504d, c27266o.f103504d) == 0 && Float.compare(this.f103505e, c27266o.f103505e) == 0 && Float.compare(this.f103506f, c27266o.f103506f) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19479f() {
            return this.f103506f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f103503c) * 31) + Float.hashCode(this.f103504d)) * 31) + Float.hashCode(this.f103505e)) * 31) + Float.hashCode(this.f103506f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f103503c + ", dy1=" + this.f103504d + ", dx2=" + this.f103505e + ", dy2=" + this.f103506f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, m28432d2 = {"LpJ3$p;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dx1", DateTokenConverter.CONVERTER_KEY, "e", "dy1", "dx2", "f", "dy2", "<init>", "(FFFF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$p */
    /* loaded from: classes.dex */
    public static final class C27267p extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103507c;

        /* renamed from: d */
        public final float f103508d;

        /* renamed from: e */
        public final float f103509e;

        /* renamed from: f */
        public final float f103510f;

        public C27267p(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.f103507c = f;
            this.f103508d = f2;
            this.f103509e = f3;
            this.f103510f = f4;
        }

        /* renamed from: c */
        public final float m19478c() {
            return this.f103507c;
        }

        /* renamed from: d */
        public final float m19477d() {
            return this.f103509e;
        }

        /* renamed from: e */
        public final float m19476e() {
            return this.f103508d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27267p) {
                C27267p c27267p = (C27267p) obj;
                return Float.compare(this.f103507c, c27267p.f103507c) == 0 && Float.compare(this.f103508d, c27267p.f103508d) == 0 && Float.compare(this.f103509e, c27267p.f103509e) == 0 && Float.compare(this.f103510f, c27267p.f103510f) == 0;
            }
            return false;
        }

        /* renamed from: f */
        public final float m19475f() {
            return this.f103510f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f103507c) * 31) + Float.hashCode(this.f103508d)) * 31) + Float.hashCode(this.f103509e)) * 31) + Float.hashCode(this.f103510f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f103507c + ", dy1=" + this.f103508d + ", dx2=" + this.f103509e + ", dy2=" + this.f103510f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LpJ3$q;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dx", DateTokenConverter.CONVERTER_KEY, "dy", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$q */
    /* loaded from: classes.dex */
    public static final class C27268q extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103511c;

        /* renamed from: d */
        public final float f103512d;

        public C27268q(float f, float f2) {
            super(false, true, 1, null);
            this.f103511c = f;
            this.f103512d = f2;
        }

        /* renamed from: c */
        public final float m19474c() {
            return this.f103511c;
        }

        /* renamed from: d */
        public final float m19473d() {
            return this.f103512d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27268q) {
                C27268q c27268q = (C27268q) obj;
                return Float.compare(this.f103511c, c27268q.f103511c) == 0 && Float.compare(this.f103512d, c27268q.f103512d) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f103511c) * 31) + Float.hashCode(this.f103512d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f103511c + ", dy=" + this.f103512d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LpJ3$r;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "dy", "<init>", "(F)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$r */
    /* loaded from: classes.dex */
    public static final class C27269r extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103513c;

        public C27269r(float f) {
            super(false, false, 3, null);
            this.f103513c = f;
        }

        /* renamed from: c */
        public final float m19472c() {
            return this.f103513c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27269r) && Float.compare(this.f103513c, ((C27269r) obj).f103513c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f103513c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f103513c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LpJ3$s;", "LpJ3;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "c", "F", "()F", "y", "<init>", "(F)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pJ3$s */
    /* loaded from: classes.dex */
    public static final class C27270s extends AbstractC46793pJ3 {

        /* renamed from: c */
        public final float f103514c;

        public C27270s(float f) {
            super(false, false, 3, null);
            this.f103514c = f;
        }

        /* renamed from: c */
        public final float m19471c() {
            return this.f103514c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27270s) && Float.compare(this.f103514c, ((C27270s) obj).f103514c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f103514c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f103514c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ AbstractC46793pJ3(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    /* renamed from: a */
    public final boolean m19530a() {
        return this.f103454a;
    }

    /* renamed from: b */
    public final boolean m19529b() {
        return this.f103455b;
    }

    public AbstractC46793pJ3(boolean z, boolean z2) {
        this.f103454a = z;
        this.f103455b = z2;
    }

    public /* synthetic */ AbstractC46793pJ3(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}
