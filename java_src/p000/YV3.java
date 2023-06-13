package p000;

import android.view.View;
import android.widget.Magnifier;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.NV3;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LYV3;", "LFV3;", "LaG2;", "style", "Landroid/view/View;", "view", "Lg01;", "density", "", "initialZoom", "LYV3$a;", "c", "", "Z", "b", "()Z", "canUpdateZoom", "<init>", "()V", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlatformMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,184:1\n152#2:185\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n152#1:185\n*E\n"})
/* renamed from: YV3 */
/* loaded from: classes.dex */
public final class YV3 implements FV3 {

    /* renamed from: b */
    public static final YV3 f45944b = new YV3();

    /* renamed from: c */
    public static final boolean f45945c = true;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"LYV3$a;", "LNV3$a;", "LCe3;", "sourceCenter", "magnifierCenter", "", "zoom", "", "b", "(JJF)V", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: YV3$a */
    /* loaded from: classes.dex */
    public static final class C9792a extends NV3.C5590a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9792a(Magnifier magnifier) {
            super(magnifier);
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
        }

        @Override // p000.NV3.C5590a, p000.EV3
        /* renamed from: b */
        public void mo74969b(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                m93839d().setZoom(f);
            }
            if (C33056Ge3.m104936c(j2)) {
                m93839d().show(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), C32120Ce3.m111944o(j2), C32120Ce3.m111943p(j2));
            } else {
                m93839d().show(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j));
            }
        }
    }

    private YV3() {
    }

    @Override // p000.FV3
    /* renamed from: b */
    public boolean mo74971b() {
        return f45945c;
    }

    @Override // p000.FV3
    /* renamed from: c */
    public C9792a mo74972a(C37853aG2 style, View view, InterfaceC41273g01 density, float f) {
        boolean z;
        Magnifier build;
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(density, "density");
        if (Intrinsics.areEqual(style, C37853aG2.f50192g.m71723b())) {
            HV3.m103806a();
            return new C9792a(GV3.m105047a(view));
        }
        long mo3395z = density.mo3395z(style.m71727g());
        float mo3411T0 = density.mo3411T0(style.m71730d());
        float mo3411T02 = density.mo3411T0(style.m71729e());
        VV3.m79838a();
        Magnifier.Builder m81403a = UV3.m81403a(view);
        if (mo3395z != C51465xB5.f117175b.m5724a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            roundToInt = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(mo3395z));
            roundToInt2 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(mo3395z));
            m81403a.setSize(roundToInt, roundToInt2);
        }
        if (!Float.isNaN(mo3411T0)) {
            m81403a.setCornerRadius(mo3411T0);
        }
        if (!Float.isNaN(mo3411T02)) {
            m81403a.setElevation(mo3411T02);
        }
        if (!Float.isNaN(f)) {
            m81403a.setInitialZoom(f);
        }
        m81403a.setClippingEnabled(style.m71731c());
        build = m81403a.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(view).run {\n    …    build()\n            }");
        return new C9792a(build);
    }
}
