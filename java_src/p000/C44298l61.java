package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001d\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, m28432d2 = {"Ll61;", "LOC0;", "", "LxB5;", "shapeSize", "Lg01;", "density", "", C17296a.f69688o, "(JLg01;)F", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lk61;", "F", "size", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* renamed from: l61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44298l61 implements OC0 {

    /* renamed from: a */
    public final float f95488a;

    public /* synthetic */ C44298l61(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    @Override // p000.OC0
    /* renamed from: a */
    public float mo27869a(long j, InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo3411T0(this.f95488a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44298l61) && C43705k61.m29301i(this.f95488a, ((C44298l61) obj).f95488a);
    }

    public int hashCode() {
        return C43705k61.m29300j(this.f95488a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f95488a + ".dp)";
    }

    public C44298l61(float f) {
        this.f95488a = f;
    }
}
