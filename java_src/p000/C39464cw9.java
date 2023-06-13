package p000;

import java.math.BigDecimal;
/* renamed from: cw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39464cw9 extends Number {

    /* renamed from: b */
    public final String f75893b;

    public C39464cw9(String str) {
        this.f75893b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f75893b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39464cw9)) {
            return false;
        }
        String str = this.f75893b;
        String str2 = ((C39464cw9) obj).f75893b;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f75893b);
    }

    public final int hashCode() {
        return this.f75893b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f75893b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f75893b);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f75893b).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f75893b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f75893b).longValue();
        }
    }

    public final String toString() {
        return this.f75893b;
    }
}
