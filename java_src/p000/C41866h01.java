package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, m28432d2 = {"Lh01;", "Lg01;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "b", "F", "()F", "density", "c", "R0", "fontScale", "<init>", "(FF)V", "ui-unit_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: h01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41866h01 implements InterfaceC41273g01 {

    /* renamed from: b */
    public final float f84586b;

    /* renamed from: c */
    public final float f84587c;

    public C41866h01(float f, float f2) {
        this.f84586b = f;
        this.f84587c = f2;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f84587c;
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f84586b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41866h01) {
            C41866h01 c41866h01 = (C41866h01) obj;
            return Float.compare(mo3408b(), c41866h01.mo3408b()) == 0 && Float.compare(mo3412R0(), c41866h01.mo3412R0()) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(mo3408b()) * 31) + Float.hashCode(mo3412R0());
    }

    public String toString() {
        return "DensityImpl(density=" + mo3408b() + ", fontScale=" + mo3412R0() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
