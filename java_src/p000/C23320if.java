package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aY\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"LgV2;", "Ltm1;", "LG52;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "finishedListener", C17296a.f69688o, "animation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,162:1\n135#2:163\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n72#1:163\n*E\n"})
/* renamed from: if */
/* loaded from: classes.dex */
public final class C23320if {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n1#1,170:1\n73#2,4:171\n*E\n"})
    /* renamed from: if$a */
    /* loaded from: classes.dex */
    public static final class C23321a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC49435tm1 f87698g;

        /* renamed from: h */
        public final /* synthetic */ Function2 f87699h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23321a(InterfaceC49435tm1 interfaceC49435tm1, Function2 function2) {
            super(1);
            this.f87698g = interfaceC49435tm1;
            this.f87699h = function2;
        }

        /* renamed from: a */
        public final void m33620a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("animateContentSize");
            s42.m86038a().m104824a("animationSpec", this.f87698g);
            s42.m86038a().m104824a("finishedListener", this.f87699h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m33620a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,162:1\n473#2,4:163\n477#2,2:171\n481#2:177\n25#3:167\n36#3:178\n1057#4,3:168\n1060#4,3:174\n1057#4,6:179\n473#5:173\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n*L\n79#1:163,4\n79#1:171,2\n79#1:177\n79#1:167\n80#1:178\n79#1:168,3\n79#1:174,3\n80#1:179,6\n79#1:173\n*E\n"})
    /* renamed from: if$b */
    /* loaded from: classes.dex */
    public static final class C23322b extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ Function2<G52, G52, Unit> f87700g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC49435tm1<G52> f87701h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23322b(Function2<? super G52, ? super G52, Unit> function2, InterfaceC49435tm1<G52> interfaceC49435tm1) {
            super(3);
            this.f87700g = function2;
            this.f87701h = interfaceC49435tm1;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m33619a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-843180607);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-843180607, i, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
            }
            interfaceC32720Et0.mo89638F(773894976);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                Object c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
                interfaceC32720Et0.mo89503z(c42992iu0);
                mo89635G = c42992iu0;
            }
            interfaceC32720Et0.mo89605Q();
            ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
            interfaceC32720Et0.mo89605Q();
            InterfaceC49435tm1<G52> interfaceC49435tm1 = this.f87701h;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(m31665a);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new C52058yB5(interfaceC49435tm1, m31665a);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            C52058yB5 c52058yB5 = (C52058yB5) mo89635G2;
            c52058yB5.m3867k(this.f87700g);
            InterfaceC41563gV2 mo39266t0 = C35447Qk0.m88105b(composed).mo39266t0(c52058yB5);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return mo39266t0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m33619a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m33622a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC49435tm1<G52> animationSpec, Function2<? super G52, ? super G52, Unit> function2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        if (K32.m99301c()) {
            m99303a = new C23321a(animationSpec, function2);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C23322b(function2, animationSpec));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m33621b(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC49435tm1 interfaceC49435tm1, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC49435tm1 = C26160mf.m25221i(0.0f, 0.0f, null, 7, null);
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        return m33622a(interfaceC41563gV2, interfaceC49435tm1, function2);
    }
}
