package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t*\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0003*\u00020\tH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u0006*\u00020\tH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u0006H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0005J\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u0013*\u00020\u0014H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, m28432d2 = {"Lg01;", "", "Lk61;", "", "T0", "(F)F", "", "F0", "(F)I", "LM26;", "s0", "(F)J", "I0", "(J)F", "V0", "(J)I", "w", "(I)F", "x", "Lo61;", "LxB5;", "z", "(J)J", "j", "b", "()F", "getDensity$annotations", "()V", "density", "R0", "getFontScale$annotations", "fontScale", "ui-unit_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,163:1\n1#2:164\n174#3:165\n174#3:166\n473#3:167\n152#4:168\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n114#1:165\n124#1:166\n147#1:167\n157#1:168\n*E\n"})
/* renamed from: g01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC41273g01 {
    /* renamed from: F0 */
    default int mo3416F0(float f) {
        int roundToInt;
        float mo3411T0 = mo3411T0(f);
        if (!Float.isInfinite(mo3411T0)) {
            roundToInt = MathKt__MathJVMKt.roundToInt(mo3411T0);
            return roundToInt;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: I0 */
    default float mo3415I0(long j) {
        if (O26.m92975g(M26.m95973g(j), O26.f25571b.m92970b())) {
            return M26.m95972h(j) * mo3412R0() * mo3408b();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: R0 */
    float mo3412R0();

    /* renamed from: T0 */
    default float mo3411T0(float f) {
        return f * mo3408b();
    }

    /* renamed from: V0 */
    default int mo3410V0(long j) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(mo3415I0(j));
        return roundToInt;
    }

    /* renamed from: b */
    float mo3408b();

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

    /* renamed from: s0 */
    default long mo3399s0(float f) {
        return N26.m94415e(f / mo3412R0());
    }

    /* renamed from: w */
    default float mo3398w(int i) {
        return C43705k61.m29303g(i / mo3408b());
    }

    /* renamed from: x */
    default float mo3397x(float f) {
        return C43705k61.m29303g(f / mo3408b());
    }

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
