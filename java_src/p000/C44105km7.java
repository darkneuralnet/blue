package p000;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* renamed from: km7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44105km7 implements InterfaceC37164Xs7 {

    /* renamed from: b */
    public final Double f94936b;

    public C44105km7(Double d) {
        if (d == null) {
            this.f94936b = Double.valueOf(Double.NaN);
        } else {
            this.f94936b = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C44105km7)) {
            return false;
        }
        return this.f94936b.equals(((C44105km7) obj).f94936b);
    }

    public final int hashCode() {
        return this.f94936b.hashCode();
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return null;
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        if ("toString".equals(str)) {
            return new C43019iw7(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final String toString() {
        return zzi();
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        return new C44105km7(this.f94936b);
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        boolean z = false;
        if (!Double.isNaN(this.f94936b.doubleValue()) && this.f94936b.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        return this.f94936b;
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        int scale;
        if (Double.isNaN(this.f94936b.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f94936b.doubleValue())) {
            if (this.f94936b.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f94936b.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }
}
