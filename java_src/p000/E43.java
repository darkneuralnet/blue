package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, m28432d2 = {"LgV2;", "LB43;", "connection", "LC43;", "dispatcher", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestedScrollModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,344:1\n135#2:345\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n*L\n331#1:345\n*E\n"})
/* renamed from: E43 */
/* loaded from: classes.dex */
public final class E43 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n*L\n1#1,170:1\n332#2,4:171\n*E\n"})
    /* renamed from: E43$a */
    /* loaded from: classes.dex */
    public static final class C1733a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ B43 f6944g;

        /* renamed from: h */
        public final /* synthetic */ C43 f6945h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1733a(B43 b43, C43 c43) {
            super(1);
            this.f6944g = b43;
            this.f6945h = c43;
        }

        /* renamed from: a */
        public final void m109417a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("nestedScroll");
            s42.m86038a().m104824a("connection", this.f6944g);
            s42.m86038a().m104824a("dispatcher", this.f6945h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m109417a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestedScrollModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,344:1\n474#2,4:345\n478#2,2:353\n482#2:359\n25#3:349\n25#3:360\n67#3,3:367\n66#3:370\n1114#4,3:350\n1117#4,3:356\n1114#4,6:361\n1114#4,6:371\n474#5:355\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n*L\n337#1:345,4\n337#1:353,2\n337#1:359\n337#1:349\n339#1:360\n340#1:367,3\n340#1:370\n337#1:350,3\n337#1:356,3\n339#1:361,6\n340#1:371,6\n337#1:355\n*E\n"})
    /* renamed from: E43$b */
    /* loaded from: classes.dex */
    public static final class C1734b extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ C43 f6946g;

        /* renamed from: h */
        public final /* synthetic */ B43 f6947h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1734b(C43 c43, B43 b43) {
            super(3);
            this.f6946g = c43;
            this.f6947h = b43;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m109416a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(410346167);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(410346167, i, -1, "androidx.compose.ui.input.nestedscroll.nestedScroll.<anonymous> (NestedScrollModifier.kt:335)");
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
            C43 c43 = this.f6946g;
            interfaceC32720Et0.mo89638F(100475956);
            if (c43 == null) {
                interfaceC32720Et0.mo89638F(-492369756);
                Object mo89635G2 = interfaceC32720Et0.mo89635G();
                if (mo89635G2 == c2012a.m108267a()) {
                    mo89635G2 = new C43();
                    interfaceC32720Et0.mo89503z(mo89635G2);
                }
                interfaceC32720Et0.mo89605Q();
                c43 = (C43) mo89635G2;
            }
            interfaceC32720Et0.mo89605Q();
            B43 b43 = this.f6947h;
            interfaceC32720Et0.mo89638F(1618982084);
            boolean mo89539n = interfaceC32720Et0.mo89539n(b43) | interfaceC32720Et0.mo89539n(c43) | interfaceC32720Et0.mo89539n(m31665a);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G3 == c2012a.m108267a()) {
                c43.m112913h(m31665a);
                mo89635G3 = new F43(c43, b43);
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            F43 f43 = (F43) mo89635G3;
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return f43;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m109416a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m109419a(InterfaceC41563gV2 interfaceC41563gV2, B43 connection, C43 c43) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (K32.m99301c()) {
            m99303a = new C1733a(connection, c43);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C1734b(c43, connection));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m109418b(InterfaceC41563gV2 interfaceC41563gV2, B43 b43, C43 c43, int i, Object obj) {
        if ((i & 2) != 0) {
            c43 = null;
        }
        return m109419a(interfaceC41563gV2, b43, c43);
    }
}
