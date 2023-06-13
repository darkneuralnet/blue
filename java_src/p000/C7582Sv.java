package p000;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", "enabled", "Lkotlin/Function0;", "", "onBack", C17296a.f69688o, "(ZLkotlin/jvm/functions/Function0;LEt0;II)V", "activity-compose_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n25#2:111\n50#2:118\n49#2:119\n955#3,6:112\n955#3,6:120\n76#4:126\n89#5:127\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111\n94#1:118\n94#1:119\n86#1:112,6\n94#1:120,6\n100#1:126\n84#1:127\n*E\n"})
/* renamed from: Sv */
/* loaded from: classes.dex */
public final class C7582Sv {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Sv$a */
    /* loaded from: classes.dex */
    public static final class C7583a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C7587d f34434g;

        /* renamed from: h */
        public final /* synthetic */ boolean f34435h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7583a(C7587d c7587d, boolean z) {
            super(0);
            this.f34434g = c7587d;
            this.f34435h = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f34434g.setEnabled(this.f34435h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,110:1\n62#2,5:111\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n105#1:111,5\n*E\n"})
    /* renamed from: Sv$b */
    /* loaded from: classes.dex */
    public static final class C7584b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ OnBackPressedDispatcher f34436g;

        /* renamed from: h */
        public final /* synthetic */ LifecycleOwner f34437h;

        /* renamed from: i */
        public final /* synthetic */ C7587d f34438i;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Sv$b$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n1#1,483:1\n106#2,2:484\n*E\n"})
        /* renamed from: Sv$b$a */
        /* loaded from: classes.dex */
        public static final class C7585a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ C7587d f34439a;

            public C7585a(C7587d c7587d) {
                this.f34439a = c7587d;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f34439a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7584b(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, C7587d c7587d) {
            super(1);
            this.f34436g = onBackPressedDispatcher;
            this.f34437h = lifecycleOwner;
            this.f34438i = c7587d;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f34436g.m70498b(this.f34437h, this.f34438i);
            return new C7585a(this.f34438i);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Sv$c */
    /* loaded from: classes.dex */
    public static final class C7586c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f34440g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f34441h;

        /* renamed from: i */
        public final /* synthetic */ int f34442i;

        /* renamed from: j */
        public final /* synthetic */ int f34443j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7586c(boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f34440g = z;
            this.f34441h = function0;
            this.f34442i = i;
            this.f34443j = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C7582Sv.m84651a(this.f34440g, this.f34441h, interfaceC32720Et0, this.f34442i | 1, this.f34443j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Sv$d */
    /* loaded from: classes.dex */
    public static final class C7587d extends AbstractC36566Ve3 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC48627sP5<Function0<Unit>> f34444a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7587d(boolean z, InterfaceC48627sP5<? extends Function0<Unit>> interfaceC48627sP5) {
            super(z);
            this.f34444a = interfaceC48627sP5;
        }

        @Override // p000.AbstractC36566Ve3
        public void handleOnBackPressed() {
            C7582Sv.m84650b(this.f34444a).invoke();
        }
    }

    /* renamed from: a */
    public static final void m84651a(boolean z, Function0<Unit> onBack, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-361453782);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onBack)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i6 != 0) {
                z = true;
            }
            InterfaceC48627sP5 m105193n = GM5.m105193n(onBack, mo89518u, (i3 >> 3) & 14);
            mo89518u.mo89638F(-3687241);
            Object mo89635G = mo89518u.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = new C7587d(z, m105193n);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C7587d c7587d = (C7587d) mo89635G;
            Boolean valueOf = Boolean.valueOf(z);
            mo89518u.mo89638F(-3686552);
            boolean mo89539n = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(c7587d);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new C7583a(c7587d, z);
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            Y91.m75531h((Function0) mo89635G2, mo89518u, 0);
            InterfaceC39270cf3 m31645a = C43004iv2.f91709a.m31645a(mo89518u, 6);
            if (m31645a != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = m31645a.getOnBackPressedDispatcher();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
                Y91.m75537b(lifecycleOwner, onBackPressedDispatcher, new C7584b(onBackPressedDispatcher, lifecycleOwner, c7587d), mo89518u, 72);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C7586c(z, onBack, i, i2));
        }
    }

    /* renamed from: b */
    public static final Function0<Unit> m84650b(InterfaceC48627sP5<? extends Function0<Unit>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }
}
