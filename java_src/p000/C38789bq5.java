package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u001a#\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Laq5;", C17296a.f69688o, "b", "(Lkotlin/jvm/functions/Function1;LEt0;I)Laq5;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,192:1\n25#2:193\n1114#3,6:194\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n146#1:193\n146#1:194,6\n*E\n"})
/* renamed from: bq5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38789bq5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bq5$a */
    /* loaded from: classes.dex */
    public static final class C13289a extends Lambda implements Function1<Float, Float> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<Function1<Float, Float>> f59602g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13289a(InterfaceC48627sP5<? extends Function1<? super Float, Float>> interfaceC48627sP5) {
            super(1);
            this.f59602g = interfaceC48627sP5;
        }

        public final Float invoke(float f) {
            return this.f59602g.getValue().invoke(Float.valueOf(f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC38196aq5 m62556a(Function1<? super Float, Float> consumeScrollDelta) {
        Intrinsics.checkNotNullParameter(consumeScrollDelta, "consumeScrollDelta");
        return new BY0(consumeScrollDelta);
    }

    /* renamed from: b */
    public static final InterfaceC38196aq5 m62555b(Function1<? super Float, Float> consumeScrollDelta, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(consumeScrollDelta, "consumeScrollDelta");
        interfaceC32720Et0.mo89638F(-180460798);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        InterfaceC48627sP5 m105193n = GM5.m105193n(consumeScrollDelta, interfaceC32720Et0, i & 14);
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = m62556a(new C13289a(m105193n));
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC38196aq5 interfaceC38196aq5 = (InterfaceC38196aq5) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return interfaceC38196aq5;
    }
}
