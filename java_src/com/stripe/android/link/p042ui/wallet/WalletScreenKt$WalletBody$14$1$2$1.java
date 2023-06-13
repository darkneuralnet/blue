package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14$1$2$1 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$14$1$2$1 extends Lambda implements Function1<ConsumerPaymentDetails.PaymentDetails, Unit> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ EX2<ConsumerPaymentDetails.PaymentDetails> $itemBeingRemoved$delegate;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onEditPaymentMethod;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefault;
    final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,545:1\n36#2:546\n1057#3,6:547\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1\n*L\n274#1:546\n274#1:547,6\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14$1$2$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190671 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $it;
        final /* synthetic */ EX2<ConsumerPaymentDetails.PaymentDetails> $itemBeingRemoved$delegate;
        final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onEditPaymentMethod;
        final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefault;
        final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14$1$2$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C190681 extends Lambda implements Function0<Unit> {
            final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $it;
            final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onEditPaymentMethod;
            final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C190681(Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
                super(0);
                this.$showBottomSheetContent = function1;
                this.$onEditPaymentMethod = function12;
                this.$it = paymentDetails;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showBottomSheetContent.invoke(null);
                this.$onEditPaymentMethod.invoke(this.$it);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14$1$2$1$1$2 */
        /* loaded from: classes7.dex */
        public static final class C190692 extends Lambda implements Function0<Unit> {
            final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $it;
            final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefault;
            final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C190692(Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
                super(0);
                this.$showBottomSheetContent = function1;
                this.$onSetDefault = function12;
                this.$it = paymentDetails;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showBottomSheetContent.invoke(null);
                this.$onSetDefault.invoke(this.$it);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14$1$2$1$1$3 */
        /* loaded from: classes7.dex */
        public static final class C190703 extends Lambda implements Function0<Unit> {
            final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $it;
            final /* synthetic */ EX2<ConsumerPaymentDetails.PaymentDetails> $itemBeingRemoved$delegate;
            final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C190703(Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, ConsumerPaymentDetails.PaymentDetails paymentDetails, EX2<ConsumerPaymentDetails.PaymentDetails> ex2) {
                super(0);
                this.$showBottomSheetContent = function1;
                this.$it = paymentDetails;
                this.$itemBeingRemoved$delegate = ex2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showBottomSheetContent.invoke(null);
                this.$itemBeingRemoved$delegate.setValue(this.$it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190671(ConsumerPaymentDetails.PaymentDetails paymentDetails, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, int i, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function13, EX2<ConsumerPaymentDetails.PaymentDetails> ex2) {
            super(3);
            this.$it = paymentDetails;
            this.$showBottomSheetContent = function1;
            this.$$dirty1 = i;
            this.$onEditPaymentMethod = function12;
            this.$onSetDefault = function13;
            this.$itemBeingRemoved$delegate = ex2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r11v0, types: [Et0] */
        public final void invoke(InterfaceC35231Pm0 invoke, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1286349135, i, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WalletScreen.kt:258)");
            }
            ConsumerPaymentDetails.PaymentDetails paymentDetails = this.$it;
            C190681 c190681 = new C190681(this.$showBottomSheetContent, this.$onEditPaymentMethod, paymentDetails);
            C190692 c190692 = new C190692(this.$showBottomSheetContent, this.$onSetDefault, this.$it);
            C190703 c190703 = new C190703(this.$showBottomSheetContent, this.$it, this.$itemBeingRemoved$delegate);
            Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1 = this.$showBottomSheetContent;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function1);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new WalletScreenKt$WalletBody$14$1$2$1$1$4$1(function1);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            WalletPaymentMethodMenuKt.WalletPaymentMethodMenu(paymentDetails, c190681, c190692, c190703, mo89635G, interfaceC32720Et0, ConsumerPaymentDetails.PaymentDetails.$stable);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$14$1$2$1(Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, int i, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function13, EX2<ConsumerPaymentDetails.PaymentDetails> ex2) {
        super(1);
        this.$showBottomSheetContent = function1;
        this.$$dirty1 = i;
        this.$onEditPaymentMethod = function12;
        this.$onSetDefault = function13;
        this.$itemBeingRemoved$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        invoke2(paymentDetails);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsumerPaymentDetails.PaymentDetails it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1 = this.$showBottomSheetContent;
        function1.invoke(C43575jt0.m29790c(1286349135, true, new C190671(it, function1, this.$$dirty1, this.$onEditPaymentMethod, this.$onSetDefault, this.$itemBeingRemoved$delegate)));
    }
}
