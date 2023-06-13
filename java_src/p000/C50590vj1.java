package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lvj1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "()F", "alpha", "Ltm1;", "b", "Ltm1;", "()Ltm1;", "animationSpec", "<init>", "(FLtm1;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50590vj1 {

    /* renamed from: a */
    public final float f114542a;

    /* renamed from: b */
    public final InterfaceC49435tm1<Float> f114543b;

    public C50590vj1(float f, InterfaceC49435tm1<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f114542a = f;
        this.f114543b = animationSpec;
    }

    /* renamed from: a */
    public final float m8238a() {
        return this.f114542a;
    }

    /* renamed from: b */
    public final InterfaceC49435tm1<Float> m8237b() {
        return this.f114543b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50590vj1) {
            C50590vj1 c50590vj1 = (C50590vj1) obj;
            return Float.compare(this.f114542a, c50590vj1.f114542a) == 0 && Intrinsics.areEqual(this.f114543b, c50590vj1.f114543b);
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f114542a) * 31) + this.f114543b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f114542a + ", animationSpec=" + this.f114543b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
