package p000;

import java.math.BigInteger;
/* renamed from: YU7 */
/* loaded from: classes5.dex */
public final class YU7 extends C51629xT7 {

    /* renamed from: b */
    public final Object f45937b;

    public YU7(Boolean bool) {
        this.f45937b = bool;
    }

    /* renamed from: o */
    public static boolean m74986o(YU7 yu7) {
        Object obj = yu7.f45937b;
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
    public final long m74992b() {
        if (this.f45937b instanceof Number) {
            return m74991c().longValue();
        }
        return Long.parseLong(m74990e());
    }

    /* renamed from: c */
    public final Number m74991c() {
        Object obj = this.f45937b;
        return obj instanceof String ? new CW7((String) obj) : (Number) obj;
    }

    /* renamed from: e */
    public final String m74990e() {
        Object obj = this.f45937b;
        if (!(obj instanceof Number)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).toString();
            }
            return (String) obj;
        }
        return m74991c().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || YU7.class != obj.getClass()) {
            return false;
        }
        YU7 yu7 = (YU7) obj;
        if (m74986o(this) && m74986o(yu7)) {
            if (m74991c().longValue() == yu7.m74991c().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.f45937b;
        if ((obj2 instanceof Number) && (yu7.f45937b instanceof Number)) {
            double doubleValue = m74991c().doubleValue();
            double doubleValue2 = yu7.m74991c().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(yu7.f45937b);
    }

    /* renamed from: f */
    public final boolean m74989f() {
        Object obj = this.f45937b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(m74990e());
    }

    /* renamed from: h */
    public final boolean m74988h() {
        return this.f45937b instanceof Boolean;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (m74986o(this)) {
            doubleToLongBits = m74991c().longValue();
        } else {
            Object obj = this.f45937b;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m74991c().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: j */
    public final boolean m74987j() {
        return this.f45937b instanceof Number;
    }

    public YU7(Number number) {
        this.f45937b = number;
    }

    public YU7(String str) {
        str.getClass();
        this.f45937b = str;
    }
}
