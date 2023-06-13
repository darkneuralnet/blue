package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R#\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001a\u001a\u00020\u00188VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m28432d2 = {"Li10;", "Lh10;", "Le10;", "LgV2;", "LK9;", "alignment", "c", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lg01;", C17296a.f69688o, "Lg01;", "density", "Lkz0;", "b", "J", "()J", "constraints", "Lk61;", "()F", "maxWidth", "<init>", "(Lg01;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* renamed from: i10  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42468i10 implements InterfaceC41875h10, InterfaceC40096e10 {

    /* renamed from: a */
    public final InterfaceC41273g01 f86277a;

    /* renamed from: b */
    public final long f86278b;

    /* renamed from: c */
    public final /* synthetic */ C40689f10 f86279c;

    public /* synthetic */ C42468i10(InterfaceC41273g01 interfaceC41273g01, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC41273g01, j);
    }

    @Override // p000.InterfaceC41875h10
    /* renamed from: a */
    public float mo35390a() {
        InterfaceC41273g01 interfaceC41273g01 = this.f86277a;
        if (C44228kz0.m28067j(mo35389b())) {
            return interfaceC41273g01.mo3398w(C44228kz0.m28063n(mo35389b()));
        }
        return C43705k61.f93903c.m29296b();
    }

    @Override // p000.InterfaceC41875h10
    /* renamed from: b */
    public long mo35389b() {
        return this.f86278b;
    }

    @Override // p000.InterfaceC40096e10
    /* renamed from: c */
    public InterfaceC41563gV2 mo35388c(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 alignment) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.f86279c.mo35388c(interfaceC41563gV2, alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42468i10) {
            C42468i10 c42468i10 = (C42468i10) obj;
            return Intrinsics.areEqual(this.f86277a, c42468i10.f86277a) && C44228kz0.m28070g(mo35389b(), c42468i10.mo35389b());
        }
        return false;
    }

    public int hashCode() {
        return (this.f86277a.hashCode() * 31) + C44228kz0.m28060q(mo35389b());
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f86277a + ", constraints=" + ((Object) C44228kz0.m28059r(mo35389b())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C42468i10(InterfaceC41273g01 interfaceC41273g01, long j) {
        this.f86277a = interfaceC41273g01;
        this.f86278b = j;
        this.f86279c = C40689f10.f79291a;
    }
}
