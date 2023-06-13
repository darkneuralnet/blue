package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LjQ3;", "LOC0;", "", "LxB5;", "shapeSize", "Lg01;", "density", "", C17296a.f69688o, "(JLg01;)F", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "F", "percent", "<init>", "(F)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jQ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43298jQ3 implements OC0 {

    /* renamed from: a */
    public final float f92702a;

    public C43298jQ3(float f) {
        this.f92702a = f;
        if (f >= 0.0f && f <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }

    @Override // p000.OC0
    /* renamed from: a */
    public float mo27869a(long j, InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return C51465xB5.m5731h(j) * (this.f92702a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43298jQ3) && Float.compare(this.f92702a, ((C43298jQ3) obj).f92702a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f92702a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f92702a + "%)";
    }
}
