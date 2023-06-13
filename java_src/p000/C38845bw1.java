package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\"6\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00068\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "Lnm2;", "", "onPositioned", "b", "LV94;", C17296a.f69688o, "LV94;", "()LV94;", "getModifierLocalFocusedBoundsObserver$annotations", "()V", "ModifierLocalFocusedBoundsObserver", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n135#2:124\n*S KotlinDebug\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n*L\n50#1:124\n*E\n"})
/* renamed from: bw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38845bw1 {

    /* renamed from: a */
    public static final V94<Function1<InterfaceC45879nm2, Unit>> f59802a = C43342jV2.m30425a(C13345a.f59803g);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lkotlin/Function1;", "Lnm2;", "", "b", "()Lkotlin/jvm/functions/Function1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bw1$a */
    /* loaded from: classes.dex */
    public static final class C13345a extends Lambda implements Function0<Function1<? super InterfaceC45879nm2, ? extends Unit>> {

        /* renamed from: g */
        public static final C13345a f59803g = new C13345a();

        public C13345a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Function1<InterfaceC45879nm2, Unit> invoke() {
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n*L\n1#1,170:1\n51#2,3:171\n*E\n"})
    /* renamed from: bw1$b */
    /* loaded from: classes.dex */
    public static final class C13346b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1 f59804g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13346b(Function1 function1) {
            super(1);
            this.f59804g = function1;
        }

        /* renamed from: a */
        public final void m62118a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("onFocusedBoundsChanged");
            s42.m86038a().m104824a("onPositioned", this.f59804g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m62118a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt$onFocusedBoundsChanged$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,123:1\n36#2:124\n1114#3,6:125\n*S KotlinDebug\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt$onFocusedBoundsChanged$2\n*L\n55#1:124\n55#1:125,6\n*E\n"})
    /* renamed from: bw1$c */
    /* loaded from: classes.dex */
    public static final class C13347c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ Function1<InterfaceC45879nm2, Unit> f59805g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13347c(Function1<? super InterfaceC45879nm2, Unit> function1) {
            super(3);
            this.f59805g = function1;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m62117a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1176407768);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1176407768, i, -1, "androidx.compose.foundation.onFocusedBoundsChanged.<anonymous> (FocusedBounds.kt:53)");
            }
            Function1<InterfaceC45879nm2, Unit> function1 = this.f59805g;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function1);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C40048dw1(function1);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            C40048dw1 c40048dw1 = (C40048dw1) mo89635G;
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return c40048dw1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m62117a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final V94<Function1<InterfaceC45879nm2, Unit>> m62121a() {
        return f59802a;
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m62120b(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC45879nm2, Unit> onPositioned) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        if (K32.m99301c()) {
            m99303a = new C13346b(onPositioned);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C13347c(onPositioned));
    }
}
