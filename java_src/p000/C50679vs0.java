package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"Lvs0;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "D", "_real", "b", "_imaginary", "f", "()D", "real", "e", "imaginary", "<init>", "(DD)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n35#1,2:113\n66#1,3:115\n40#1,3:118\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:113,2\n50#1:115,3\n50#1:118,3\n*E\n"})
/* renamed from: vs0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50679vs0 {

    /* renamed from: a */
    public double f114810a;

    /* renamed from: b */
    public double f114811b;

    public C50679vs0(double d, double d2) {
        this.f114810a = d;
        this.f114811b = d2;
    }

    /* renamed from: e */
    public final double m7909e() {
        return this.f114811b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50679vs0) {
            C50679vs0 c50679vs0 = (C50679vs0) obj;
            return Double.compare(this.f114810a, c50679vs0.f114810a) == 0 && Double.compare(this.f114811b, c50679vs0.f114811b) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final double m7908f() {
        return this.f114810a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f114810a) * 31) + Double.hashCode(this.f114811b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f114810a + ", _imaginary=" + this.f114811b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
