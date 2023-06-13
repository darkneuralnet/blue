package p000;

import java.math.BigInteger;
import java.util.Objects;
/* renamed from: Zi2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37537Zi2 extends AbstractC52360yi2 {

    /* renamed from: b */
    public final Object f48981b;

    public C37537Zi2(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f48981b = bool;
    }

    /* renamed from: z */
    public static boolean m72654z(C37537Zi2 c37537Zi2) {
        Object obj = c37537Zi2.f48981b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public boolean m72659A() {
        return this.f48981b instanceof Number;
    }

    /* renamed from: C */
    public boolean m72658C() {
        return this.f48981b instanceof String;
    }

    @Override // p000.AbstractC52360yi2
    /* renamed from: a */
    public boolean mo2888a() {
        if (m72655y()) {
            return ((Boolean) this.f48981b).booleanValue();
        }
        return Boolean.parseBoolean(mo2882j());
    }

    @Override // p000.AbstractC52360yi2
    /* renamed from: b */
    public double mo2887b() {
        return m72659A() ? m72656x().doubleValue() : Double.parseDouble(mo2882j());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37537Zi2.class != obj.getClass()) {
            return false;
        }
        C37537Zi2 c37537Zi2 = (C37537Zi2) obj;
        if (this.f48981b == null) {
            if (c37537Zi2.f48981b == null) {
                return true;
            }
            return false;
        } else if (m72654z(this) && m72654z(c37537Zi2)) {
            if (m72656x().longValue() == c37537Zi2.m72656x().longValue()) {
                return true;
            }
            return false;
        } else {
            Object obj2 = this.f48981b;
            if ((obj2 instanceof Number) && (c37537Zi2.f48981b instanceof Number)) {
                double doubleValue = m72656x().doubleValue();
                double doubleValue2 = c37537Zi2.m72656x().doubleValue();
                if (doubleValue == doubleValue2) {
                    return true;
                }
                if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                    return true;
                }
                return false;
            }
            return obj2.equals(c37537Zi2.f48981b);
        }
    }

    @Override // p000.AbstractC52360yi2
    /* renamed from: h */
    public long mo2883h() {
        return m72659A() ? m72656x().longValue() : Long.parseLong(mo2882j());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f48981b == null) {
            return 31;
        }
        if (m72654z(this)) {
            doubleToLongBits = m72656x().longValue();
        } else {
            Object obj = this.f48981b;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m72656x().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // p000.AbstractC52360yi2
    /* renamed from: j */
    public String mo2882j() {
        Object obj = this.f48981b;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (m72659A()) {
            return m72656x().toString();
        }
        if (m72655y()) {
            return ((Boolean) this.f48981b).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f48981b.getClass());
    }

    /* renamed from: w */
    public int m72657w() {
        return m72659A() ? m72656x().intValue() : Integer.parseInt(mo2882j());
    }

    /* renamed from: x */
    public Number m72656x() {
        Object obj = this.f48981b;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new C37105Xm2((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: y */
    public boolean m72655y() {
        return this.f48981b instanceof Boolean;
    }

    public C37537Zi2(Number number) {
        Objects.requireNonNull(number);
        this.f48981b = number;
    }

    public C37537Zi2(String str) {
        Objects.requireNonNull(str);
        this.f48981b = str;
    }
}
