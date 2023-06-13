package com.stripe.android.link.p042ui.wallet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorTextKt;
import com.stripe.android.link.p042ui.PrimaryButtonKt;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.p049ui.core.elements.CvcController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.text.HtmlKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,545:1\n154#2:546\n154#2:616\n154#2:617\n154#2:618\n67#3,6:547\n73#3:579\n77#3:615\n75#4:553\n76#4,11:555\n89#4:614\n76#5:554\n460#6,13:566\n50#6:580\n49#6:581\n83#6,3:588\n36#6:597\n36#6:604\n473#6,3:611\n1057#7,6:582\n1057#7,6:591\n1057#7,6:598\n1057#7,6:605\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14\n*L\n248#1:546\n303#1:616\n325#1:617\n330#1:618\n250#1:547,6\n250#1:579\n250#1:615\n250#1:553\n250#1:555,11\n250#1:614\n250#1:554\n250#1:566,13\n254#1:580\n254#1:581\n258#1:588,3\n281#1:597\n289#1:604\n250#1:611,3\n254#1:582,6\n258#1:591,6\n281#1:598,6\n289#1:605,6\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$14 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ CvcController $cvcController;
    final /* synthetic */ TextFieldController $expiryDateController;
    final /* synthetic */ EX2<ConsumerPaymentDetails.PaymentDetails> $itemBeingRemoved$delegate;
    final /* synthetic */ Function0<Unit> $onAddNewPaymentMethodClick;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onEditPaymentMethod;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onItemSelected;
    final /* synthetic */ Function0<Unit> $onPayAnotherWayClick;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefault;
    final /* synthetic */ String $primaryButtonLabel;
    final /* synthetic */ Function1<Boolean, Unit> $setExpanded;
    final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;
    final /* synthetic */ WalletUiState $uiState;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,545:1\n76#2:546\n154#3:547\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$2\n*L\n312#1:546\n315#1:547\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$14$2 */
    /* loaded from: classes7.dex */
    public static final class C190662 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ WalletUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190662(WalletUiState walletUiState) {
            super(3);
            this.$uiState = walletUiState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            String str;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(900524233, i, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous> (WalletScreen.kt:309)");
            }
            ErrorMessage errorMessage = this.$uiState.getErrorMessage();
            if (errorMessage != null) {
                Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
                str = errorMessage.getMessage(resources);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            ErrorTextKt.ErrorText(str, ND3.m94180m(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0.0f, C43705k61.m29303g(16), 0.0f, 0.0f, 13, null), null, interfaceC32720Et0, 48, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$14(WalletUiState walletUiState, String str, Function0<Unit> function0, int i, int i2, Function0<Unit> function02, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function13, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function14, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function15, EX2<ConsumerPaymentDetails.PaymentDetails> ex2, Function0<Unit> function03, TextFieldController textFieldController, CvcController cvcController) {
        super(3);
        this.$uiState = walletUiState;
        this.$primaryButtonLabel = str;
        this.$onPrimaryButtonClick = function0;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$onPayAnotherWayClick = function02;
        this.$onItemSelected = function1;
        this.$setExpanded = function12;
        this.$showBottomSheetContent = function13;
        this.$onEditPaymentMethod = function14;
        this.$onSetDefault = function15;
        this.$itemBeingRemoved$delegate = ex2;
        this.$onAddNewPaymentMethodClick = function03;
        this.$expiryDateController = textFieldController;
        this.$cvcController = cvcController;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r48v0, types: [Et0, java.lang.Object] */
    public final void invoke(InterfaceC35231Pm0 ScrollableTopLevelColumn, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        char c;
        boolean z;
        int i2;
        String replaceHyperlinks;
        Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        int i3 = (i & 14) == 0 ? i | (interfaceC32720Et0.mo89539n(ScrollableTopLevelColumn) ? 4 : 2) : i;
        if ((i3 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1128476687, i3, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous> (WalletScreen.kt:246)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 12;
        DN5.m110552a(BB5.m114254o(c20912a, C43705k61.m29303g(f)), interfaceC32720Et0, 6);
        InterfaceC41563gV2 m33621b = C23320if.m33621b(c20912a, null, null, 3, null);
        WalletUiState walletUiState = this.$uiState;
        Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function1 = this.$onItemSelected;
        Function1<Boolean, Unit> function12 = this.$setExpanded;
        int i4 = this.$$dirty;
        Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function13 = this.$showBottomSheetContent;
        Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function14 = this.$onEditPaymentMethod;
        Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function15 = this.$onSetDefault;
        EX2<ConsumerPaymentDetails.PaymentDetails> ex2 = this.$itemBeingRemoved$delegate;
        Function0<Unit> function0 = this.$onAddNewPaymentMethodClick;
        int i5 = this.$$dirty1;
        interfaceC32720Et0.mo89638F(733328855);
        int i6 = i3;
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m33621b);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        interfaceC32720Et0.mo89638F(-1645190153);
        if (!walletUiState.isExpanded() && walletUiState.getSelectedItem() != null) {
            interfaceC32720Et0.mo89638F(1053712611);
            ConsumerPaymentDetails.PaymentDetails selectedItem = walletUiState.getSelectedItem();
            boolean z2 = !walletUiState.getPrimaryButtonState().isBlocking();
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function12);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new WalletScreenKt$WalletBody$14$1$4$1(function12);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            WalletScreenKt.CollapsedPaymentDetails(selectedItem, z2, (Function0) mo89635G, interfaceC32720Et0, ConsumerPaymentDetails.PaymentDetails.$stable);
            interfaceC32720Et0.mo89605Q();
            c = 3;
        } else {
            interfaceC32720Et0.mo89638F(1053711120);
            int i7 = i4 >> 9;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(function1) | interfaceC32720Et0.mo89539n(function12);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = new WalletScreenKt$WalletBody$14$1$1$1(function1, function12);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            Function1 function16 = (Function1) mo89635G2;
            c = 3;
            Object[] objArr = {function13, function14, function15, ex2};
            interfaceC32720Et0.mo89638F(-568225417);
            boolean z3 = false;
            for (int i8 = 0; i8 < 4; i8++) {
                z3 |= interfaceC32720Et0.mo89539n(objArr[i8]);
            }
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (z3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G3 = new WalletScreenKt$WalletBody$14$1$2$1(function13, i5, function14, function15, ex2);
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            Function1 function17 = mo89635G3;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n3 = interfaceC32720Et0.mo89539n(function12);
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (mo89539n3 || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G4 = new WalletScreenKt$WalletBody$14$1$3$1(function12);
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            WalletScreenKt.ExpandedPaymentDetails(walletUiState, function16, function17, function0, mo89635G4, interfaceC32720Et0, (i7 & 7168) | 8);
            interfaceC32720Et0.mo89605Q();
        }
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89638F(-494977272);
        if (this.$uiState.getSelectedItem() instanceof ConsumerPaymentDetails.BankAccount) {
            replaceHyperlinks = WalletScreenKt.replaceHyperlinks(C40946fS5.m41310c(C18975R.string.wallet_bank_account_terms, interfaceC32720Et0, 0));
            TM2 tm2 = TM2.f35372a;
            int i9 = TM2.f35373b;
            long m94902h = tm2.m83731a(interfaceC32720Et0, i9).m94902h();
            G26 m104962f = tm2.m83729c(interfaceC32720Et0, i9).m104962f();
            z = true;
            i2 = i6;
            HtmlKt.m116769Htmlm4MizFo(replaceHyperlinks, ND3.m94180m(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0.0f, C43705k61.m29303g(f), 0.0f, 0.0f, 13, null), null, m94902h, m104962f, false, new GN5(tm2.m83731a(interfaceC32720Et0, i9).m94900j(), 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16382, (DefaultConstructorMarker) null), 0, null, interfaceC32720Et0, 48, 420);
        } else {
            z = true;
            i2 = i6;
        }
        interfaceC32720Et0.mo89605Q();
        boolean z4 = z;
        C7489Se.m85173b(ScrollableTopLevelColumn, this.$uiState.getErrorMessage() != null ? z : false, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 900524233, z, new C190662(this.$uiState)), interfaceC32720Et0, (i2 & 14) | 1572864, 30);
        ConsumerPaymentDetails.Card selectedCard = this.$uiState.getSelectedCard();
        interfaceC32720Et0.mo89638F(-494976360);
        if (selectedCard != null) {
            TextFieldController textFieldController = this.$expiryDateController;
            CvcController cvcController = this.$cvcController;
            int i10 = this.$$dirty;
            if (selectedCard.getRequiresCardDetailsRecollection()) {
                WalletScreenKt.CardDetailsRecollectionForm(textFieldController, cvcController, selectedCard.isExpired(), ND3.m94180m(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(16), 0.0f, 0.0f, 13, null), interfaceC32720Et0, (CvcController.$stable << 3) | 3080 | ((i10 >> 6) & 112), 0);
            }
            Unit unit = Unit.INSTANCE;
        }
        interfaceC32720Et0.mo89605Q();
        DN5.m110552a(BB5.m114254o(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(16)), interfaceC32720Et0, 6);
        PrimaryButtonKt.PrimaryButton(this.$primaryButtonLabel, this.$uiState.getPrimaryButtonState(), this.$onPrimaryButtonClick, null, Integer.valueOf(C18975R.C18976drawable.stripe_ic_lock), interfaceC32720Et0, ((this.$$dirty1 << 6) & 896) | ((this.$$dirty >> 3) & 14), 8);
        PrimaryButtonKt.SecondaryButton(this.$uiState.getPrimaryButtonState().isBlocking() ^ z4, C40946fS5.m41310c(C18975R.string.wallet_pay_another_way, interfaceC32720Et0, 0), this.$onPayAnotherWayClick, interfaceC32720Et0, (this.$$dirty1 << 3) & 896);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
