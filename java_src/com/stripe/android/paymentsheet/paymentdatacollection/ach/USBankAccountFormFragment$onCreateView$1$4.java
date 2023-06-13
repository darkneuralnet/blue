package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$onCreateView$1$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nUSBankAccountFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,486:1\n76#2:487\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1\n*L\n203#1:487\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$4$1 */
    /* loaded from: classes7.dex */
    public static final class C192541 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$4$1$1", m28418f = "USBankAccountFormFragment.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$4$1$1 */
        /* loaded from: classes7.dex */
        public static final class C192551 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC48627sP5<USBankAccountFormScreenState> $currentScreenState$delegate;
            int label;
            final /* synthetic */ USBankAccountFormFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C192551(USBankAccountFormFragment uSBankAccountFormFragment, InterfaceC48627sP5<? extends USBankAccountFormScreenState> interfaceC48627sP5, Continuation<? super C192551> continuation) {
                super(2, continuation);
                this.this$0 = uSBankAccountFormFragment;
                this.$currentScreenState$delegate = interfaceC48627sP5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C192551(this.this$0, this.$currentScreenState$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C192551) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.handleScreenStateChanged(C192541.invoke$lambda$0(this.$currentScreenState$delegate));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192541(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(2);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final USBankAccountFormScreenState invoke$lambda$0(InterfaceC48627sP5<? extends USBankAccountFormScreenState> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            USBankAccountFormViewModel viewModel;
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(78989134, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (USBankAccountFormFragment.kt:201)");
            }
            viewModel = this.this$0.getViewModel();
            InterfaceC48627sP5 m105205b = GM5.m105205b(viewModel.getCurrentScreenState(), null, interfaceC32720Et0, 8, 1);
            Y91.m75533f(invoke$lambda$0(m105205b), new C192551(this.this$0, m105205b, null), interfaceC32720Et0, 64);
            USBankAccountFormScreenState invoke$lambda$0 = invoke$lambda$0(m105205b);
            if (invoke$lambda$0 instanceof USBankAccountFormScreenState.NameAndEmailCollection) {
                interfaceC32720Et0.mo89638F(1590867898);
                this.this$0.NameAndEmailCollectionScreen((USBankAccountFormScreenState.NameAndEmailCollection) invoke$lambda$0, interfaceC32720Et0, 64);
                interfaceC32720Et0.mo89605Q();
            } else if (invoke$lambda$0 instanceof USBankAccountFormScreenState.MandateCollection) {
                interfaceC32720Et0.mo89638F(1590868061);
                this.this$0.MandateCollectionScreen((USBankAccountFormScreenState.MandateCollection) invoke$lambda$0, interfaceC32720Et0, FinancialConnectionsAccount.$stable | 64);
                interfaceC32720Et0.mo89605Q();
            } else if (invoke$lambda$0 instanceof USBankAccountFormScreenState.VerifyWithMicrodeposits) {
                interfaceC32720Et0.mo89638F(1590868225);
                this.this$0.VerifyWithMicrodepositsScreen((USBankAccountFormScreenState.VerifyWithMicrodeposits) invoke$lambda$0, interfaceC32720Et0, BankAccount.$stable | 64);
                interfaceC32720Et0.mo89605Q();
            } else if (invoke$lambda$0 instanceof USBankAccountFormScreenState.SavedAccount) {
                interfaceC32720Et0.mo89638F(1590868384);
                this.this$0.SavedAccountScreen((USBankAccountFormScreenState.SavedAccount) invoke$lambda$0, interfaceC32720Et0, 64);
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(1590868481);
                interfaceC32720Et0.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$onCreateView$1$4(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(2);
        this.this$0 = uSBankAccountFormFragment;
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
            C35528Qt0.m87816Z(-347787972, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.onCreateView.<anonymous>.<anonymous> (USBankAccountFormFragment.kt:200)");
        }
        StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 78989134, true, new C192541(this.this$0)), interfaceC32720Et0, 3072, 7);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
