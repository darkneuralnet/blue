package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, m28432d2 = {"LUE0;", "Lh91;", "", "fraction", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "b", "m", "F", "c", DateTokenConverter.CONVERTER_KEY, "<init>", "(FFFF)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UE0 */
/* loaded from: classes.dex */
public final class UE0 implements InterfaceC41956h91 {

    /* renamed from: a */
    public final float f37094a;

    /* renamed from: b */
    public final float f37095b;

    /* renamed from: c */
    public final float f37096c;

    /* renamed from: d */
    public final float f37097d;

    public UE0(float f, float f2, float f3, float f4) {
        boolean z;
        this.f37094a = f;
        this.f37095b = f2;
        this.f37096c = f3;
        this.f37097d = f4;
        if (!Float.isNaN(f) && !Float.isNaN(f2) && !Float.isNaN(f3) && !Float.isNaN(f4)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + CoreConstants.DOT).toString());
    }

    @Override // p000.InterfaceC41956h91
    /* renamed from: a */
    public float mo34392a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float m81799b = m81799b(this.f37094a, this.f37096c, f4);
                    if (Math.abs(f - m81799b) < 0.001f) {
                        return m81799b(this.f37095b, this.f37097d, f4);
                    }
                    if (m81799b < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    /* renamed from: b */
    public final float m81799b(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof UE0)) {
            return false;
        }
        UE0 ue0 = (UE0) obj;
        if (this.f37094a == ue0.f37094a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f37095b == ue0.f37095b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f37096c == ue0.f37096c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f37097d == ue0.f37097d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f37094a) * 31) + Float.hashCode(this.f37095b)) * 31) + Float.hashCode(this.f37096c)) * 31) + Float.hashCode(this.f37097d);
    }
}
