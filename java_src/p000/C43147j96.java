package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0016"}, m28432d2 = {"Lj96;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "D", "g", "()D", "gamma", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "<init>", "(DDDDDDD)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: j96  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43147j96 {

    /* renamed from: a */
    public final double f92227a;

    /* renamed from: b */
    public final double f92228b;

    /* renamed from: c */
    public final double f92229c;

    /* renamed from: d */
    public final double f92230d;

    /* renamed from: e */
    public final double f92231e;

    /* renamed from: f */
    public final double f92232f;

    /* renamed from: g */
    public final double f92233g;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C43147j96(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f92227a = d;
        this.f92228b = d2;
        this.f92229c = d3;
        this.f92230d = d4;
        this.f92231e = d5;
        this.f92232f = d6;
        this.f92233g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d) {
            if (!(d2 == 0.0d)) {
            }
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d) {
            if (d4 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
        }
        if (!(d2 == 0.0d)) {
        }
        if (d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    /* renamed from: a */
    public final double m31060a() {
        return this.f92228b;
    }

    /* renamed from: b */
    public final double m31059b() {
        return this.f92229c;
    }

    /* renamed from: c */
    public final double m31058c() {
        return this.f92230d;
    }

    /* renamed from: d */
    public final double m31057d() {
        return this.f92231e;
    }

    /* renamed from: e */
    public final double m31056e() {
        return this.f92232f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43147j96) {
            C43147j96 c43147j96 = (C43147j96) obj;
            return Double.compare(this.f92227a, c43147j96.f92227a) == 0 && Double.compare(this.f92228b, c43147j96.f92228b) == 0 && Double.compare(this.f92229c, c43147j96.f92229c) == 0 && Double.compare(this.f92230d, c43147j96.f92230d) == 0 && Double.compare(this.f92231e, c43147j96.f92231e) == 0 && Double.compare(this.f92232f, c43147j96.f92232f) == 0 && Double.compare(this.f92233g, c43147j96.f92233g) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final double m31055f() {
        return this.f92233g;
    }

    /* renamed from: g */
    public final double m31054g() {
        return this.f92227a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f92227a) * 31) + Double.hashCode(this.f92228b)) * 31) + Double.hashCode(this.f92229c)) * 31) + Double.hashCode(this.f92230d)) * 31) + Double.hashCode(this.f92231e)) * 31) + Double.hashCode(this.f92232f)) * 31) + Double.hashCode(this.f92233g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f92227a + ", a=" + this.f92228b + ", b=" + this.f92229c + ", c=" + this.f92230d + ", d=" + this.f92231e + ", e=" + this.f92232f + ", f=" + this.f92233g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C43147j96(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
