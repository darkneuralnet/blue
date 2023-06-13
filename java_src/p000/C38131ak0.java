package p000;

import android.view.KeyEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aG\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a>\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0015H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001f\u001a\u00020\b*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u001dH\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a«\u0001\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, m28432d2 = {"LgV2;", "", "enabled", "", "onClickLabel", "LCb5;", "role", "Lkotlin/Function0;", "", "onClick", DateTokenConverter.CONVERTER_KEY, "(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;)LgV2;", "LrX2;", "interactionSource", "Ly12;", "indication", "b", "(LgV2;LrX2;Ly12;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;)LgV2;", "LEX2;", "LQ14;", "pressedInteraction", "", "LWj2;", "currentKeyPressInteractions", C17296a.f69688o, "(LrX2;LEX2;Ljava/util/Map;LEt0;I)V", "LN14;", "LCe3;", "pressPoint", "LsP5;", "delayPressInteraction", "i", "(LN14;JLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gestureModifiers", "LZC0;", "indicationScope", "keyClickOffset", "onLongClickLabel", "onLongClick", "f", "(LgV2;LgV2;LrX2;Ly12;LZC0;Ljava/util/Map;LsP5;ZLjava/lang/String;LCb5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LgV2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,565:1\n135#2:566\n135#2:567\n135#2:568\n135#2:569\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n86#1:566\n198#1:567\n243#1:568\n395#1:569\n*E\n"})
/* renamed from: ak0 */
/* loaded from: classes.dex */
public final class C38131ak0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,565:1\n62#2,5:566\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n*L\n416#1:566,5\n*E\n"})
    /* renamed from: ak0$a */
    /* loaded from: classes.dex */
    public static final class C10828a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ EX2<Q14> f51020g;

        /* renamed from: h */
        public final /* synthetic */ Map<C36844Wj2, Q14> f51021h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48104rX2 f51022i;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"ak0$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n417#2,6:485\n423#2,2:492\n425#2,2:495\n1855#3:491\n1856#3:494\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n*L\n422#1:491\n422#1:494\n*E\n"})
        /* renamed from: ak0$a$a */
        /* loaded from: classes.dex */
        public static final class C10829a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ EX2 f51023a;

            /* renamed from: b */
            public final /* synthetic */ Map f51024b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC48104rX2 f51025c;

            public C10829a(EX2 ex2, Map map, InterfaceC48104rX2 interfaceC48104rX2) {
                this.f51023a = ex2;
                this.f51024b = map;
                this.f51025c = interfaceC48104rX2;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                Q14 q14 = (Q14) this.f51023a.getValue();
                if (q14 != null) {
                    this.f51025c.mo14090a(new P14(q14));
                    this.f51023a.setValue(null);
                }
                for (Q14 q142 : this.f51024b.values()) {
                    this.f51025c.mo14090a(new P14(q142));
                }
                this.f51024b.clear();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10828a(EX2<Q14> ex2, Map<C36844Wj2, Q14> map, InterfaceC48104rX2 interfaceC48104rX2) {
            super(1);
            this.f51020g = ex2;
            this.f51021h = map;
            this.f51022i = interfaceC48104rX2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C10829a(this.f51020g, this.f51021h, this.f51022i);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ak0$b */
    /* loaded from: classes.dex */
    public static final class C10830b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48104rX2 f51026g;

        /* renamed from: h */
        public final /* synthetic */ EX2<Q14> f51027h;

        /* renamed from: i */
        public final /* synthetic */ Map<C36844Wj2, Q14> f51028i;

        /* renamed from: j */
        public final /* synthetic */ int f51029j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10830b(InterfaceC48104rX2 interfaceC48104rX2, EX2<Q14> ex2, Map<C36844Wj2, Q14> map, int i) {
            super(2);
            this.f51026g = interfaceC48104rX2;
            this.f51027h = ex2;
            this.f51028i = map;
            this.f51029j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C38131ak0.m70818a(this.f51026g, this.f51027h, this.f51028i, interfaceC32720Et0, C47127ps4.m18626a(this.f51029j | 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,565:1\n76#2:566\n25#3:567\n1114#4,6:568\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n*L\n99#1:566\n100#1:567\n100#1:568,6\n*E\n"})
    /* renamed from: ak0$c */
    /* loaded from: classes.dex */
    public static final class C10831c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f51030g;

        /* renamed from: h */
        public final /* synthetic */ String f51031h;

        /* renamed from: i */
        public final /* synthetic */ C32095Cb5 f51032i;

        /* renamed from: j */
        public final /* synthetic */ Function0<Unit> f51033j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10831c(boolean z, String str, C32095Cb5 c32095Cb5, Function0<Unit> function0) {
            super(3);
            this.f51030g = z;
            this.f51031h = str;
            this.f51032i = c32095Cb5;
            this.f51033j = function0;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m70809a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-756081143);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-756081143, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:92)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC51956y12 interfaceC51956y12 = (InterfaceC51956y12) interfaceC32720Et0.mo89572c(A12.m116198a());
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = C40741f62.m42091a();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m70817b = C38131ak0.m70817b(c20912a, (InterfaceC48104rX2) mo89635G, interfaceC51956y12, this.f51030g, this.f51031h, this.f51032i, this.f51033j);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m70817b;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m70809a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,565:1\n25#2:566\n25#2:573\n25#2:580\n50#2:587\n49#2:588\n25#2:595\n83#2,3:602\n25#2:611\n25#2:622\n1114#3,6:567\n1114#3,6:574\n1114#3,6:581\n1114#3,6:589\n1114#3,6:596\n1114#3,6:605\n1114#3,6:612\n1114#3,3:623\n1117#3,3:629\n474#4,4:618\n478#4,2:626\n482#4:632\n474#5:628\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n*L\n138#1:566\n139#1:573\n148#1:580\n149#1:587\n149#1:588\n152#1:595\n154#1:602,3\n172#1:611\n187#1:622\n138#1:567,6\n139#1:574,6\n148#1:581,6\n149#1:589,6\n152#1:596,6\n154#1:605,6\n172#1:612,6\n187#1:623,3\n187#1:629,3\n187#1:618,4\n187#1:626,2\n187#1:632\n187#1:628\n*E\n"})
    /* renamed from: ak0$d */
    /* loaded from: classes.dex */
    public static final class C10832d extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f51034g;

        /* renamed from: h */
        public final /* synthetic */ boolean f51035h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48104rX2 f51036i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC51956y12 f51037j;

        /* renamed from: k */
        public final /* synthetic */ String f51038k;

        /* renamed from: l */
        public final /* synthetic */ C32095Cb5 f51039l;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ak0$d$a */
        /* loaded from: classes.dex */
        public static final class C10833a implements InterfaceC42749iV2 {

            /* renamed from: b */
            public final /* synthetic */ EX2<Boolean> f51040b;

            public C10833a(EX2<Boolean> ex2) {
                this.f51040b = ex2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.InterfaceC42749iV2
            /* renamed from: o0 */
            public void mo33854o0(InterfaceC46900pV2 scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                this.f51040b.setValue(scope.mo19176a(C37603Zp5.m72423g()));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ak0$d$b */
        /* loaded from: classes.dex */
        public static final class C10834b extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ EX2<Boolean> f51041g;

            /* renamed from: h */
            public final /* synthetic */ Function0<Boolean> f51042h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10834b(EX2<Boolean> ex2, Function0<Boolean> function0) {
                super(0);
                this.f51041g = ex2;
                this.f51042h = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f51041g.getValue().booleanValue() || this.f51042h.invoke().booleanValue());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", m28418f = "Clickable.kt", m28417i = {}, m28416l = {156}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,565:1\n157#2:566\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n*L\n155#1:566\n*E\n"})
        /* renamed from: ak0$d$c */
        /* loaded from: classes.dex */
        public static final class C10835c extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f51043h;

            /* renamed from: i */
            public /* synthetic */ Object f51044i;

            /* renamed from: j */
            public final /* synthetic */ EX2<C32120Ce3> f51045j;

            /* renamed from: k */
            public final /* synthetic */ boolean f51046k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC48104rX2 f51047l;

            /* renamed from: m */
            public final /* synthetic */ EX2<Q14> f51048m;

            /* renamed from: n */
            public final /* synthetic */ InterfaceC48627sP5<Function0<Boolean>> f51049n;

            /* renamed from: o */
            public final /* synthetic */ InterfaceC48627sP5<Function0<Unit>> f51050o;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1", m28418f = "Clickable.kt", m28417i = {}, m28416l = {159}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: ak0$d$c$a */
            /* loaded from: classes.dex */
            public static final class C10836a extends SuspendLambda implements Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f51051h;

                /* renamed from: i */
                public /* synthetic */ Object f51052i;

                /* renamed from: j */
                public /* synthetic */ long f51053j;

                /* renamed from: k */
                public final /* synthetic */ boolean f51054k;

                /* renamed from: l */
                public final /* synthetic */ InterfaceC48104rX2 f51055l;

                /* renamed from: m */
                public final /* synthetic */ EX2<Q14> f51056m;

                /* renamed from: n */
                public final /* synthetic */ InterfaceC48627sP5<Function0<Boolean>> f51057n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C10836a(boolean z, InterfaceC48104rX2 interfaceC48104rX2, EX2<Q14> ex2, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP5, Continuation<? super C10836a> continuation) {
                    super(3, continuation);
                    this.f51054k = z;
                    this.f51055l = interfaceC48104rX2;
                    this.f51056m = ex2;
                    this.f51057n = interfaceC48627sP5;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(N14 n14, C32120Ce3 c32120Ce3, Continuation<? super Unit> continuation) {
                    return m116231invoked4ec7I(n14, c32120Ce3.m111935x(), continuation);
                }

                /* renamed from: invoke-d-4ec7I */
                public final Object m116231invoked4ec7I(N14 n14, long j, Continuation<? super Unit> continuation) {
                    C10836a c10836a = new C10836a(this.f51054k, this.f51055l, this.f51056m, this.f51057n, continuation);
                    c10836a.f51052i = n14;
                    c10836a.f51053j = j;
                    return c10836a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f51051h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        N14 n14 = (N14) this.f51052i;
                        long j = this.f51053j;
                        if (this.f51054k) {
                            InterfaceC48104rX2 interfaceC48104rX2 = this.f51055l;
                            EX2<Q14> ex2 = this.f51056m;
                            InterfaceC48627sP5<Function0<Boolean>> interfaceC48627sP5 = this.f51057n;
                            this.f51051h = 1;
                            if (C38131ak0.m70810i(n14, j, interfaceC48104rX2, ex2, interfaceC48627sP5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: ak0$d$c$b */
            /* loaded from: classes.dex */
            public static final class C10837b extends Lambda implements Function1<C32120Ce3, Unit> {

                /* renamed from: g */
                public final /* synthetic */ boolean f51058g;

                /* renamed from: h */
                public final /* synthetic */ InterfaceC48627sP5<Function0<Unit>> f51059h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C10837b(boolean z, InterfaceC48627sP5<? extends Function0<Unit>> interfaceC48627sP5) {
                    super(1);
                    this.f51058g = z;
                    this.f51059h = interfaceC48627sP5;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
                    m116232invokek4lQ0M(c32120Ce3.m111935x());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M */
                public final void m116232invokek4lQ0M(long j) {
                    if (this.f51058g) {
                        this.f51059h.getValue().invoke();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10835c(EX2<C32120Ce3> ex2, boolean z, InterfaceC48104rX2 interfaceC48104rX2, EX2<Q14> ex22, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP5, InterfaceC48627sP5<? extends Function0<Unit>> interfaceC48627sP52, Continuation<? super C10835c> continuation) {
                super(2, continuation);
                this.f51045j = ex2;
                this.f51046k = z;
                this.f51047l = interfaceC48104rX2;
                this.f51048m = ex22;
                this.f51049n = interfaceC48627sP5;
                this.f51050o = interfaceC48627sP52;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10835c c10835c = new C10835c(this.f51045j, this.f51046k, this.f51047l, this.f51048m, this.f51049n, this.f51050o, continuation);
                c10835c.f51044i = obj;
                return c10835c;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
                return ((C10835c) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f51043h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC49290tX3 interfaceC49290tX3 = (InterfaceC49290tX3) this.f51044i;
                    EX2<C32120Ce3> ex2 = this.f51045j;
                    long m104429b = H52.m104429b(interfaceC49290tX3.m12143a());
                    ex2.setValue(C32120Ce3.m111955d(C33056Ge3.m104938a(A52.m116111j(m104429b), A52.m116110k(m104429b))));
                    C10836a c10836a = new C10836a(this.f51046k, this.f51047l, this.f51048m, this.f51049n, null);
                    C10837b c10837b = new C10837b(this.f51046k, this.f51050o);
                    this.f51043h = 1;
                    if (KY5.m98770h(interfaceC49290tX3, c10836a, c10837b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10832d(Function0<Unit> function0, boolean z, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC51956y12 interfaceC51956y12, String str, C32095Cb5 c32095Cb5) {
            super(3);
            this.f51034g = function0;
            this.f51035h = z;
            this.f51036i = interfaceC48104rX2;
            this.f51037j = interfaceC51956y12;
            this.f51038k = str;
            this.f51039l = c32095Cb5;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m70808a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(92076020);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(92076020, i, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)");
            }
            InterfaceC48627sP5 m105193n = GM5.m105193n(this.f51034g, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = LM5.m97025e(null, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new LinkedHashMap();
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            Map map = (Map) mo89635G2;
            interfaceC32720Et0.mo89638F(1841981561);
            if (this.f51035h) {
                C38131ak0.m70818a(this.f51036i, ex2, map, interfaceC32720Et0, 560);
            }
            interfaceC32720Et0.mo89605Q();
            Function0<Boolean> m43822d = C39928dk0.m43822d(interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = LM5.m97025e(Boolean.TRUE, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex22 = (EX2) mo89635G3;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex22) | interfaceC32720Et0.mo89539n(m43822d);
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G4 == c2012a.m108267a()) {
                mo89635G4 = new C10834b(ex22, m43822d);
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC48627sP5 m105193n2 = GM5.m105193n(mo89635G4, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G5 = interfaceC32720Et0.mo89635G();
            if (mo89635G5 == c2012a.m108267a()) {
                mo89635G5 = LM5.m97025e(C32120Ce3.m111955d(C32120Ce3.f4427b.m111932c()), null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G5);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex23 = (EX2) mo89635G5;
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC48104rX2 interfaceC48104rX2 = this.f51036i;
            Boolean valueOf = Boolean.valueOf(this.f51035h);
            InterfaceC48104rX2 interfaceC48104rX22 = this.f51036i;
            Object[] objArr = {ex23, Boolean.valueOf(this.f51035h), interfaceC48104rX22, ex2, m105193n2, m105193n};
            boolean z = this.f51035h;
            interfaceC32720Et0.mo89638F(-568225417);
            int i2 = 0;
            boolean z2 = false;
            for (int i3 = 6; i2 < i3; i3 = 6) {
                z2 |= interfaceC32720Et0.mo89539n(objArr[i2]);
                i2++;
            }
            Object mo89635G6 = interfaceC32720Et0.mo89635G();
            if (!z2 && mo89635G6 != InterfaceC32720Et0.f8257a.m108267a()) {
                bool = valueOf;
            } else {
                bool = valueOf;
                mo89635G6 = new C10835c(ex23, z, interfaceC48104rX22, ex2, m105193n2, m105193n, null);
                interfaceC32720Et0.mo89503z(mo89635G6);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m1271b = C52840zW5.m1271b(c20912a, interfaceC48104rX2, bool, (Function2) mo89635G6);
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G7 = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a2 = InterfaceC32720Et0.f8257a;
            if (mo89635G7 == c2012a2.m108267a()) {
                mo89635G7 = new C10833a(ex22);
                interfaceC32720Et0.mo89503z(mo89635G7);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 mo39266t0 = c20912a2.mo39266t0((InterfaceC41563gV2) mo89635G7);
            InterfaceC48104rX2 interfaceC48104rX23 = this.f51036i;
            InterfaceC51956y12 interfaceC51956y12 = this.f51037j;
            interfaceC32720Et0.mo89638F(773894976);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G8 = interfaceC32720Et0.mo89635G();
            if (mo89635G8 == c2012a2.m108267a()) {
                Object c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
                interfaceC32720Et0.mo89503z(c42992iu0);
                mo89635G8 = c42992iu0;
            }
            interfaceC32720Et0.mo89605Q();
            ZC0 m31665a = ((C42992iu0) mo89635G8).m31665a();
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m70813f = C38131ak0.m70813f(mo39266t0, m1271b, interfaceC48104rX23, interfaceC51956y12, m31665a, map, ex23, this.f51035h, this.f51038k, this.f51039l, null, null, this.f51034g);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m70813f;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m70808a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n199#2,8:171\n*E\n"})
    /* renamed from: ak0$e */
    /* loaded from: classes.dex */
    public static final class C10838e extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f51060g;

        /* renamed from: h */
        public final /* synthetic */ String f51061h;

        /* renamed from: i */
        public final /* synthetic */ C32095Cb5 f51062i;

        /* renamed from: j */
        public final /* synthetic */ Function0 f51063j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC51956y12 f51064k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC48104rX2 f51065l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10838e(boolean z, String str, C32095Cb5 c32095Cb5, Function0 function0, InterfaceC51956y12 interfaceC51956y12, InterfaceC48104rX2 interfaceC48104rX2) {
            super(1);
            this.f51060g = z;
            this.f51061h = str;
            this.f51062i = c32095Cb5;
            this.f51063j = function0;
            this.f51064k = interfaceC51956y12;
            this.f51065l = interfaceC48104rX2;
        }

        /* renamed from: a */
        public final void m70807a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("clickable");
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f51060g));
            s42.m86038a().m104824a("onClickLabel", this.f51061h);
            s42.m86038a().m104824a("role", this.f51062i);
            s42.m86038a().m104824a("onClick", this.f51063j);
            s42.m86038a().m104824a("indication", this.f51064k);
            s42.m86038a().m104824a("interactionSource", this.f51065l);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m70807a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n87#2,6:171\n*E\n"})
    /* renamed from: ak0$f */
    /* loaded from: classes.dex */
    public static final class C10839f extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f51066g;

        /* renamed from: h */
        public final /* synthetic */ String f51067h;

        /* renamed from: i */
        public final /* synthetic */ C32095Cb5 f51068i;

        /* renamed from: j */
        public final /* synthetic */ Function0 f51069j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10839f(boolean z, String str, C32095Cb5 c32095Cb5, Function0 function0) {
            super(1);
            this.f51066g = z;
            this.f51067h = str;
            this.f51068i = c32095Cb5;
            this.f51069j = function0;
        }

        /* renamed from: a */
        public final void m70806a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("clickable");
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f51066g));
            s42.m86038a().m104824a("onClickLabel", this.f51067h);
            s42.m86038a().m104824a("role", this.f51068i);
            s42.m86038a().m104824a("onClick", this.f51069j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m70806a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ak0$g */
    /* loaded from: classes.dex */
    public static final class C10840g extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C32095Cb5 f51070g;

        /* renamed from: h */
        public final /* synthetic */ String f51071h;

        /* renamed from: i */
        public final /* synthetic */ Function0<Unit> f51072i;

        /* renamed from: j */
        public final /* synthetic */ String f51073j;

        /* renamed from: k */
        public final /* synthetic */ boolean f51074k;

        /* renamed from: l */
        public final /* synthetic */ Function0<Unit> f51075l;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ak0$g$a */
        /* loaded from: classes.dex */
        public static final class C10841a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Function0<Unit> f51076g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10841a(Function0<Unit> function0) {
                super(0);
                this.f51076g = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f51076g.invoke();
                return Boolean.TRUE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ak0$g$b */
        /* loaded from: classes.dex */
        public static final class C10842b extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Function0<Unit> f51077g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10842b(Function0<Unit> function0) {
                super(0);
                this.f51077g = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f51077g.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10840g(C32095Cb5 c32095Cb5, String str, Function0<Unit> function0, String str2, boolean z, Function0<Unit> function02) {
            super(1);
            this.f51070g = c32095Cb5;
            this.f51071h = str;
            this.f51072i = function0;
            this.f51073j = str2;
            this.f51074k = z;
            this.f51075l = function02;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C32095Cb5 c32095Cb5 = this.f51070g;
            if (c32095Cb5 != null) {
                C47128ps5.m18610P(semantics, c32095Cb5.m112067n());
            }
            C47128ps5.m18581r(semantics, this.f51071h, new C10841a(this.f51075l));
            Function0<Unit> function0 = this.f51072i;
            if (function0 != null) {
                C47128ps5.m18579t(semantics, this.f51073j, new C10842b(function0));
            }
            if (this.f51074k) {
                return;
            }
            C47128ps5.m18591h(semantics);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lik2;", "keyEvent", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ak0$h */
    /* loaded from: classes.dex */
    public static final class C10843h extends Lambda implements Function1<C42894ik2, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ boolean f51078g;

        /* renamed from: h */
        public final /* synthetic */ Map<C36844Wj2, Q14> f51079h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48627sP5<C32120Ce3> f51080i;

        /* renamed from: j */
        public final /* synthetic */ ZC0 f51081j;

        /* renamed from: k */
        public final /* synthetic */ Function0<Unit> f51082k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC48104rX2 f51083l;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", m28418f = "Clickable.kt", m28417i = {}, m28416l = {540}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: ak0$h$a */
        /* loaded from: classes.dex */
        public static final class C10844a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f51084h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC48104rX2 f51085i;

            /* renamed from: j */
            public final /* synthetic */ Q14 f51086j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10844a(InterfaceC48104rX2 interfaceC48104rX2, Q14 q14, Continuation<? super C10844a> continuation) {
                super(2, continuation);
                this.f51085i = interfaceC48104rX2;
                this.f51086j = q14;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10844a(this.f51085i, this.f51086j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C10844a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f51084h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC48104rX2 interfaceC48104rX2 = this.f51085i;
                    Q14 q14 = this.f51086j;
                    this.f51084h = 1;
                    if (interfaceC48104rX2.mo14088c(q14, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", m28418f = "Clickable.kt", m28417i = {}, m28416l = {549}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: ak0$h$b */
        /* loaded from: classes.dex */
        public static final class C10845b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f51087h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC48104rX2 f51088i;

            /* renamed from: j */
            public final /* synthetic */ Q14 f51089j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10845b(InterfaceC48104rX2 interfaceC48104rX2, Q14 q14, Continuation<? super C10845b> continuation) {
                super(2, continuation);
                this.f51088i = interfaceC48104rX2;
                this.f51089j = q14;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10845b(this.f51088i, this.f51089j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C10845b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f51087h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC48104rX2 interfaceC48104rX2 = this.f51088i;
                    R14 r14 = new R14(this.f51089j);
                    this.f51087h = 1;
                    if (interfaceC48104rX2.mo14088c(r14, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10843h(boolean z, Map<C36844Wj2, Q14> map, InterfaceC48627sP5<C32120Ce3> interfaceC48627sP5, ZC0 zc0, Function0<Unit> function0, InterfaceC48104rX2 interfaceC48104rX2) {
            super(1);
            this.f51078g = z;
            this.f51079h = map;
            this.f51080i = interfaceC48627sP5;
            this.f51081j = zc0;
            this.f51082k = function0;
            this.f51083l = interfaceC48104rX2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C42894ik2 c42894ik2) {
            return m116233invokeZmokQxo(c42894ik2.m33518f());
        }

        /* renamed from: invoke-ZmokQxo */
        public final Boolean m116233invokeZmokQxo(KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
            boolean z = true;
            if (this.f51078g && C39928dk0.m43819g(keyEvent)) {
                if (!this.f51079h.containsKey(C36844Wj2.m77920k(C45266mk2.m25125a(keyEvent)))) {
                    Q14 q14 = new Q14(this.f51080i.getValue().m111935x(), null);
                    this.f51079h.put(C36844Wj2.m77920k(C45266mk2.m25125a(keyEvent)), q14);
                    Z30.m73800d(this.f51081j, null, null, new C10844a(this.f51083l, q14, null), 3, null);
                }
                z = false;
            } else {
                if (this.f51078g && C39928dk0.m43823c(keyEvent)) {
                    Q14 remove = this.f51079h.remove(C36844Wj2.m77920k(C45266mk2.m25125a(keyEvent)));
                    if (remove != null) {
                        Z30.m73800d(this.f51081j, null, null, new C10845b(this.f51083l, remove, null), 3, null);
                    }
                    this.f51082k.invoke();
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", m28418f = "Clickable.kt", m28417i = {0, 1, 2}, m28416l = {445, 447, 454, 455, 464}, m28415m = "invokeSuspend", m28414n = {"delayJob", "success", "releaseInteraction"}, m28413s = {"L$0", "Z$0", "L$0"})
    /* renamed from: ak0$i */
    /* loaded from: classes.dex */
    public static final class C10846i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public boolean f51090h;

        /* renamed from: i */
        public int f51091i;

        /* renamed from: j */
        public /* synthetic */ Object f51092j;

        /* renamed from: k */
        public final /* synthetic */ N14 f51093k;

        /* renamed from: l */
        public final /* synthetic */ long f51094l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC48104rX2 f51095m;

        /* renamed from: n */
        public final /* synthetic */ EX2<Q14> f51096n;

        /* renamed from: o */
        public final /* synthetic */ InterfaceC48627sP5<Function0<Boolean>> f51097o;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", m28418f = "Clickable.kt", m28417i = {1}, m28416l = {439, 442}, m28415m = "invokeSuspend", m28414n = {"pressInteraction"}, m28413s = {"L$0"})
        /* renamed from: ak0$i$a */
        /* loaded from: classes.dex */
        public static final class C10847a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public Object f51098h;

            /* renamed from: i */
            public int f51099i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC48627sP5<Function0<Boolean>> f51100j;

            /* renamed from: k */
            public final /* synthetic */ long f51101k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC48104rX2 f51102l;

            /* renamed from: m */
            public final /* synthetic */ EX2<Q14> f51103m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10847a(InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP5, long j, InterfaceC48104rX2 interfaceC48104rX2, EX2<Q14> ex2, Continuation<? super C10847a> continuation) {
                super(2, continuation);
                this.f51100j = interfaceC48627sP5;
                this.f51101k = j;
                this.f51102l = interfaceC48104rX2;
                this.f51103m = ex2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10847a(this.f51100j, this.f51101k, this.f51102l, this.f51103m, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C10847a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                Q14 q14;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f51099i;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            q14 = (Q14) this.f51098h;
                            ResultKt.throwOnFailure(obj);
                            this.f51103m.setValue(q14);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (this.f51100j.getValue().invoke().booleanValue()) {
                        long m43824b = C39928dk0.m43824b();
                        this.f51099i = 1;
                        if (C48120rZ0.m15768a(m43824b, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                Q14 q142 = new Q14(this.f51101k, null);
                InterfaceC48104rX2 interfaceC48104rX2 = this.f51102l;
                this.f51098h = q142;
                this.f51099i = 2;
                if (interfaceC48104rX2.mo14088c(q142, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                q14 = q142;
                this.f51103m.setValue(q14);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10846i(N14 n14, long j, InterfaceC48104rX2 interfaceC48104rX2, EX2<Q14> ex2, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP5, Continuation<? super C10846i> continuation) {
            super(2, continuation);
            this.f51093k = n14;
            this.f51094l = j;
            this.f51095m = interfaceC48104rX2;
            this.f51096n = ex2;
            this.f51097o = interfaceC48627sP5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10846i c10846i = new C10846i(this.f51093k, this.f51094l, this.f51095m, this.f51096n, this.f51097o, continuation);
            c10846i.f51092j = obj;
            return c10846i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C10846i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00b4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC52943zh2 m73800d;
            Object mo92995H0;
            InterfaceC39556d62 p14;
            boolean z;
            R14 r14;
            InterfaceC48104rX2 interfaceC48104rX2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51091i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 && i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.f51096n.setValue(null);
                            return Unit.INSTANCE;
                        }
                        r14 = (R14) this.f51092j;
                        ResultKt.throwOnFailure(obj);
                        interfaceC48104rX2 = this.f51095m;
                        this.f51092j = null;
                        this.f51091i = 4;
                        if (interfaceC48104rX2.mo14088c(r14, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.f51096n.setValue(null);
                        return Unit.INSTANCE;
                    }
                    z = this.f51090h;
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        Q14 q14 = new Q14(this.f51094l, null);
                        R14 r142 = new R14(q14);
                        InterfaceC48104rX2 interfaceC48104rX22 = this.f51095m;
                        this.f51092j = r142;
                        this.f51091i = 3;
                        if (interfaceC48104rX22.mo14088c(q14, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r14 = r142;
                        interfaceC48104rX2 = this.f51095m;
                        this.f51092j = null;
                        this.f51091i = 4;
                        if (interfaceC48104rX2.mo14088c(r14, this) == coroutine_suspended) {
                        }
                    }
                    this.f51096n.setValue(null);
                    return Unit.INSTANCE;
                }
                m73800d = (InterfaceC52943zh2) this.f51092j;
                ResultKt.throwOnFailure(obj);
                mo92995H0 = obj;
            } else {
                ResultKt.throwOnFailure(obj);
                m73800d = Z30.m73800d((ZC0) this.f51092j, null, null, new C10847a(this.f51097o, this.f51094l, this.f51095m, this.f51096n, null), 3, null);
                N14 n14 = this.f51093k;
                this.f51092j = m73800d;
                this.f51091i = 1;
                mo92995H0 = n14.mo92995H0(this);
                if (mo92995H0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            boolean booleanValue = ((Boolean) mo92995H0).booleanValue();
            if (m73800d.mo555b()) {
                this.f51092j = null;
                this.f51090h = booleanValue;
                this.f51091i = 2;
                if (C34018Kh2.m98505g(m73800d, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = booleanValue;
                if (z) {
                }
                this.f51096n.setValue(null);
                return Unit.INSTANCE;
            }
            Q14 value = this.f51096n.getValue();
            if (value != null) {
                InterfaceC48104rX2 interfaceC48104rX23 = this.f51095m;
                if (booleanValue) {
                    p14 = new R14(value);
                } else {
                    p14 = new P14(value);
                }
                this.f51092j = null;
                this.f51091i = 5;
                if (interfaceC48104rX23.mo14088c(p14, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f51096n.setValue(null);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final void m70818a(InterfaceC48104rX2 interactionSource, EX2<Q14> pressedInteraction, Map<C36844Wj2, Q14> currentKeyPressInteractions, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(pressedInteraction, "pressedInteraction");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1297229208);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1297229208, i, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        Y91.m75536c(interactionSource, new C10828a(pressedInteraction, currentKeyPressInteractions, interactionSource), mo89518u, i & 14);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C10830b(interactionSource, pressedInteraction, currentKeyPressInteractions, i));
        }
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m70817b(InterfaceC41563gV2 clickable, InterfaceC48104rX2 interactionSource, InterfaceC51956y12 interfaceC51956y12, boolean z, String str, C32095Cb5 c32095Cb5, Function0<Unit> onClick) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (K32.m99301c()) {
            m99303a = new C10838e(z, str, c32095Cb5, onClick, interfaceC51956y12, interactionSource);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(clickable, m99303a, new C10832d(onClick, z, interactionSource, interfaceC51956y12, str, c32095Cb5));
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC41563gV2 m70816c(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC51956y12 interfaceC51956y12, boolean z, String str, C32095Cb5 c32095Cb5, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m70817b(interfaceC41563gV2, interfaceC48104rX2, interfaceC51956y12, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : c32095Cb5, function0);
    }

    /* renamed from: d */
    public static final InterfaceC41563gV2 m70815d(InterfaceC41563gV2 clickable, boolean z, String str, C32095Cb5 c32095Cb5, Function0<Unit> onClick) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (K32.m99301c()) {
            m99303a = new C10839f(z, str, c32095Cb5, onClick);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(clickable, m99303a, new C10831c(z, str, c32095Cb5, onClick));
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC41563gV2 m70814e(InterfaceC41563gV2 interfaceC41563gV2, boolean z, String str, C32095Cb5 c32095Cb5, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            c32095Cb5 = null;
        }
        return m70815d(interfaceC41563gV2, z, str, c32095Cb5, function0);
    }

    /* renamed from: f */
    public static final InterfaceC41563gV2 m70813f(InterfaceC41563gV2 genericClickableWithoutGesture, InterfaceC41563gV2 gestureModifiers, InterfaceC48104rX2 interactionSource, InterfaceC51956y12 interfaceC51956y12, ZC0 indicationScope, Map<C36844Wj2, Q14> currentKeyPressInteractions, InterfaceC48627sP5<C32120Ce3> keyClickOffset, boolean z, String str, C32095Cb5 c32095Cb5, String str2, Function0<Unit> function0, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(indicationScope, "indicationScope");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        Intrinsics.checkNotNullParameter(keyClickOffset, "keyClickOffset");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return C38252aw1.m65235c(C45048mN1.m25794a(A12.m116197b(m70811h(m70812g(genericClickableWithoutGesture, c32095Cb5, str, function0, str2, z, onClick), z, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource), interactionSource, interfaceC51956y12), interactionSource, z), z, interactionSource).mo39266t0(gestureModifiers);
    }

    /* renamed from: g */
    public static final InterfaceC41563gV2 m70812g(InterfaceC41563gV2 interfaceC41563gV2, C32095Cb5 c32095Cb5, String str, Function0<Unit> function0, String str2, boolean z, Function0<Unit> function02) {
        return C41198fs5.m40621a(interfaceC41563gV2, true, new C10840g(c32095Cb5, str, function0, str2, z, function02));
    }

    /* renamed from: h */
    public static final InterfaceC41563gV2 m70811h(InterfaceC41563gV2 interfaceC41563gV2, boolean z, Map<C36844Wj2, Q14> map, InterfaceC48627sP5<C32120Ce3> interfaceC48627sP5, ZC0 zc0, Function0<Unit> function0, InterfaceC48104rX2 interfaceC48104rX2) {
        return C47638qk2.m17173a(interfaceC41563gV2, new C10843h(z, map, interfaceC48627sP5, zc0, function0, interfaceC48104rX2));
    }

    /* renamed from: i */
    public static final Object m70810i(N14 n14, long j, InterfaceC48104rX2 interfaceC48104rX2, EX2<Q14> ex2, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP5, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C10846i(n14, j, interfaceC48104rX2, ex2, interfaceC48627sP5, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }
}
