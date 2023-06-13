package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkAppBarKt$LinkAppBar$1$3$1 */
/* loaded from: classes7.dex */
public final class LinkAppBarKt$LinkAppBar$1$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onLogout;
    final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLinkAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,208:1\n50#2:209\n49#2:210\n36#2:217\n1057#3,6:211\n1057#3,6:218\n*S KotlinDebug\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt$LinkAppBar$1$3$1$1\n*L\n101#1:209\n101#1:210\n105#1:217\n101#1:211,6\n105#1:218,6\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.LinkAppBarKt$LinkAppBar$1$3$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190011 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function0<Unit> $onLogout;
        final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190011(Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, Function0<Unit> function0, int i) {
            super(3);
            this.$showBottomSheetContent = function1;
            this.$onLogout = function0;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC35231Pm0 invoke, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-217327523, i, -1, "com.stripe.android.link.ui.LinkAppBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkAppBar.kt:98)");
            }
            Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1 = this.$showBottomSheetContent;
            Function0<Unit> function0 = this.$onLogout;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function1) | interfaceC32720Et0.mo89539n(function0);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new LinkAppBarKt$LinkAppBar$1$3$1$1$1$1(function1, function0);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            Function0 function02 = (Function0) mo89635G;
            Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function12 = this.$showBottomSheetContent;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(function12);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = new LinkAppBarKt$LinkAppBar$1$3$1$1$2$1(function12);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            LinkLogoutSheetKt.LinkLogoutSheet(function02, (Function0) mo89635G2, interfaceC32720Et0, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkAppBarKt$LinkAppBar$1$3$1(Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, Function0<Unit> function0, int i) {
        super(0);
        this.$showBottomSheetContent = function1;
        this.$onLogout = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1 = this.$showBottomSheetContent;
        function1.invoke(C43575jt0.m29790c(-217327523, true, new C190011(function1, this.$onLogout, this.$$dirty)));
    }
}
