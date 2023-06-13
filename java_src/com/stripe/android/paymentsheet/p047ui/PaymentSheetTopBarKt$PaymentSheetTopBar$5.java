package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentSheetTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,198:1\n50#2:199\n49#2:200\n1057#3,6:201\n*S KotlinDebug\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$PaymentSheetTopBar$5\n*L\n86#1:199\n86#1:200\n86#1:201,6\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$5 */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarKt$PaymentSheetTopBar$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC45645nN5 $keyboardController;
    final /* synthetic */ Function0<Unit> $onNavigationIconPressed;
    final /* synthetic */ PaymentSheetTopBarState $state;
    final /* synthetic */ long $tintColor;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$5$2 */
    /* loaded from: classes7.dex */
    public static final class C193222 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ PaymentSheetTopBarState $state;
        final /* synthetic */ long $tintColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193222(PaymentSheetTopBarState paymentSheetTopBarState, long j) {
            super(2);
            this.$state = paymentSheetTopBarState;
            this.$tintColor = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(30889422, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous>.<anonymous> (PaymentSheetTopBar.kt:89)");
            }
            DP1.m110533b(C46748pE3.m19793d(this.$state.getIcon(), interfaceC32720Et0, 0), C40946fS5.m41310c(this.$state.getContentDescription(), interfaceC32720Et0, 0), null, this.$tintColor, interfaceC32720Et0, 8, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetTopBarKt$PaymentSheetTopBar$5(PaymentSheetTopBarState paymentSheetTopBarState, InterfaceC45645nN5 interfaceC45645nN5, Function0<Unit> function0, int i, long j) {
        super(2);
        this.$state = paymentSheetTopBarState;
        this.$keyboardController = interfaceC45645nN5;
        this.$onNavigationIconPressed = function0;
        this.$$dirty = i;
        this.$tintColor = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Et0] */
    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-203109326, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:82)");
        }
        boolean isEnabled = this.$state.isEnabled();
        InterfaceC45645nN5 interfaceC45645nN5 = this.$keyboardController;
        Function0<Unit> function0 = this.$onNavigationIconPressed;
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(interfaceC45645nN5) | interfaceC32720Et0.mo89539n(function0);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new PaymentSheetTopBarKt$PaymentSheetTopBar$5$1$1(interfaceC45645nN5, function0);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C47438qP1.m17541a(mo89635G, null, isEnabled, null, C43575jt0.m29791b(interfaceC32720Et0, 30889422, true, new C193222(this.$state, this.$tintColor)), interfaceC32720Et0, 24576, 10);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
