package p000;

import android.view.ViewConfiguration;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m28432d2 = {"T", "LjV0;", "b", "(LEt0;I)LjV0;", "", C17296a.f69688o, "F", "()F", "platformFlingScrollFriction", "animation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSplineBasedFloatDecayAnimationSpec.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n76#2:50\n36#3:51\n1057#4,6:52\n*S KotlinDebug\n*F\n+ 1 SplineBasedFloatDecayAnimationSpec.android.kt\nandroidx/compose/animation/SplineBasedFloatDecayAnimationSpec_androidKt\n*L\n44#1:50\n45#1:51\n45#1:52,6\n*E\n"})
/* renamed from: WN5 */
/* loaded from: classes.dex */
public final class WN5 {

    /* renamed from: a */
    public static final float f40926a = ViewConfiguration.getScrollFriction();

    /* renamed from: a */
    public static final float m78508a() {
        return f40926a;
    }

    /* renamed from: b */
    public static final <T> InterfaceC43340jV0<T> m78507b(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(904445851);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(904445851, i, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        Float valueOf = Float.valueOf(interfaceC41273g01.mo3408b());
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = C44526lV0.m27216a(new VN5(interfaceC41273g01));
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC43340jV0<T> interfaceC43340jV0 = (InterfaceC43340jV0) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC43340jV0;
    }
}
