package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"LxB5;", "size", "", "b", "(J)F", "Lg01;", "", "bounded", C17296a.f69688o, "(Lg01;ZJ)F", "Lk61;", "F", "BoundedRippleExtraRadius", "material-ripple_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n155#2:195\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n189#1:195\n*E\n"})
/* renamed from: rb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48144rb5 {

    /* renamed from: a */
    public static final float f107308a = C43705k61.m29303g(10);

    /* renamed from: a */
    public static final float m15716a(InterfaceC41273g01 getRippleEndRadius, boolean z, long j) {
        Intrinsics.checkNotNullParameter(getRippleEndRadius, "$this$getRippleEndRadius");
        float m111946m = C32120Ce3.m111946m(C33056Ge3.m104938a(C51465xB5.m5730i(j), C51465xB5.m5732g(j))) / 2.0f;
        if (z) {
            return m111946m + getRippleEndRadius.mo3411T0(f107308a);
        }
        return m111946m;
    }

    /* renamed from: b */
    public static final float m15715b(long j) {
        return Math.max(C51465xB5.m5730i(j), C51465xB5.m5732g(j)) * 0.3f;
    }
}
