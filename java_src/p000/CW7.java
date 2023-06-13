package p000;

import java.math.BigDecimal;
/* renamed from: CW7 */
/* loaded from: classes5.dex */
public final class CW7 extends Number {

    /* renamed from: b */
    public final String f4162b;

    public CW7(String str) {
        this.f4162b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f4162b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CW7)) {
            return false;
        }
        String str = this.f4162b;
        String str2 = ((CW7) obj).f4162b;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f4162b);
    }

    public final int hashCode() {
        return this.f4162b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f4162b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f4162b);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f4162b).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f4162b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f4162b).longValue();
        }
    }

    public final String toString() {
        return this.f4162b;
    }
}
