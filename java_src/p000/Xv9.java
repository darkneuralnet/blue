package p000;

import java.math.BigInteger;
/* renamed from: Xv9 */
/* loaded from: classes5.dex */
public final class Xv9 extends Pv9 {

    /* renamed from: b */
    public final Object f44253b;

    public Xv9(Boolean bool) {
        this.f44253b = bool;
    }

    /* renamed from: o */
    public static boolean m76046o(Xv9 xv9) {
        Object obj = xv9.f44253b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final long m76052b() {
        if (this.f44253b instanceof Number) {
            return m76051c().longValue();
        }
        return Long.parseLong(m76050e());
    }

    /* renamed from: c */
    public final Number m76051c() {
        Object obj = this.f44253b;
        return obj instanceof String ? new C39464cw9((String) obj) : (Number) obj;
    }

    /* renamed from: e */
    public final String m76050e() {
        Object obj = this.f44253b;
        if (!(obj instanceof Number)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).toString();
            }
            return (String) obj;
        }
        return m76051c().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Xv9.class != obj.getClass()) {
            return false;
        }
        Xv9 xv9 = (Xv9) obj;
        if (m76046o(this) && m76046o(xv9)) {
            if (m76051c().longValue() == xv9.m76051c().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.f44253b;
        if ((obj2 instanceof Number) && (xv9.f44253b instanceof Number)) {
            double doubleValue = m76051c().doubleValue();
            double doubleValue2 = xv9.m76051c().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(xv9.f44253b);
    }

    /* renamed from: f */
    public final boolean m76049f() {
        Object obj = this.f44253b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(m76050e());
    }

    /* renamed from: h */
    public final boolean m76048h() {
        return this.f44253b instanceof Boolean;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (m76046o(this)) {
            doubleToLongBits = m76051c().longValue();
        } else {
            Object obj = this.f44253b;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m76051c().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: j */
    public final boolean m76047j() {
        return this.f44253b instanceof Number;
    }

    public Xv9(Number number) {
        this.f44253b = number;
    }

    public Xv9(String str) {
        str.getClass();
        this.f44253b = str;
    }
}
