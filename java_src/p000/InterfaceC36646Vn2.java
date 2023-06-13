package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\n*\u00020\rH\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u0010*\u00020\u0011H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0013\u0082\u0001\u0001\u0015ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m28432d2 = {"LVn2;", "LzO2;", "", "index", "Lkz0;", "constraints", "", "LOU3;", "M", "(IJ)Ljava/util/List;", "Lk61;", "w", "(I)F", "", "x", "(F)F", "Lo61;", "LxB5;", "z", "(J)J", "j", "LWn2;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,147:1\n1#2:148\n174#3:149\n174#3:150\n473#3:151\n152#4:152\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:149\n73#1:150\n85#1:151\n92#1:152\n*E\n"})
/* renamed from: Vn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC36646Vn2 extends InterfaceC52765zO2 {
    /* renamed from: M */
    List<OU3> mo77829M(int i, long j);

    @Override // p000.InterfaceC41273g01
    /* renamed from: j */
    default long mo3403j(long j) {
        boolean z;
        if (j != C51465xB5.f117175b.m5724a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C44891m61.m26345b(mo3397x(C51465xB5.m5730i(j)), mo3397x(C51465xB5.m5732g(j)));
        }
        return C46077o61.f101371b.m21784a();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: w */
    default float mo3398w(int i) {
        return C43705k61.m29303g(i / mo3408b());
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: x */
    default float mo3397x(float f) {
        return C43705k61.m29303g(f / mo3408b());
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: z */
    default long mo3395z(long j) {
        boolean z;
        if (j != C46077o61.f101371b.m21784a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CB5.m112663a(mo3411T0(C46077o61.m21788h(j)), mo3411T0(C46077o61.m21789g(j)));
        }
        return C51465xB5.f117175b.m5724a();
    }
}
