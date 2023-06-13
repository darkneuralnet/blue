package com.stripe.android.link.p042ui.wallet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.CommonKt;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.PrimaryButtonKt;
import com.stripe.android.link.p042ui.wallet.WalletViewModel;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.CvcCheck;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.elements.CvcController;
import com.stripe.android.p049ui.core.elements.CvcElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.RowController;
import com.stripe.android.uicore.elements.RowElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C25777lo;
import p000.FE0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001aL\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052+\u0010\u000b\u001a'\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00000\u0007H\u0001¢\u0006\u0004\b\f\u0010\r\u001aê\u0001\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001a2+\u0010\u000b\u001a'\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00000\u0007H\u0001¢\u0006\u0004\b\f\u0010!\u001a1\u0010%\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b%\u0010&\u001a-\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aH\u0001¢\u0006\u0004\b*\u0010+\u001a[\u0010.\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aH\u0003¢\u0006\u0004\b.\u0010/\u001a\f\u00100\u001a\u00020\u0010*\u00020\u0010H\u0002¨\u00061"}, m28432d2 = {"", "WalletBodyPreview", "(LEt0;I)V", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lkotlin/Function1;", "LPm0;", "Lcom/stripe/android/link/ui/BottomSheetContent;", "Lkotlin/ExtensionFunctionType;", "showBottomSheetContent", "WalletBody", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function1;LEt0;I)V", "Lcom/stripe/android/link/ui/wallet/WalletUiState;", "uiState", "", "primaryButtonLabel", "Lcom/stripe/android/uicore/elements/TextFieldController;", "expiryDateController", "Lcom/stripe/android/ui/core/elements/CvcController;", "cvcController", "", "setExpanded", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "onItemSelected", "Lkotlin/Function0;", "onAddNewPaymentMethodClick", "onEditPaymentMethod", "onSetDefault", "onDeletePaymentMethod", "onPrimaryButtonClick", "onPayAnotherWayClick", "(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;II)V", "isCardExpired", "LgV2;", "modifier", "CardDetailsRecollectionForm", "(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLgV2;LEt0;II)V", "selectedPaymentMethod", "enabled", "onClick", "CollapsedPaymentDetails", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function0;LEt0;I)V", "onMenuButtonClick", "onCollapse", "ExpandedPaymentDetails", "(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "replaceHyperlinks", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,545:1\n81#2,11:546\n68#3,5:557\n73#3:588\n77#3:593\n75#4:562\n76#4,11:564\n89#4:592\n75#4:629\n76#4,11:631\n89#4:661\n75#4:670\n76#4,11:672\n75#4:704\n76#4,11:706\n89#4:736\n75#4:747\n76#4,11:749\n89#4:779\n89#4:784\n76#5:563\n76#5:594\n76#5:614\n76#5:630\n76#5:671\n76#5:705\n76#5:748\n460#6,13:575\n473#6,3:589\n36#6:607\n460#6,13:642\n473#6,3:658\n460#6,13:683\n460#6,13:717\n473#6,3:733\n460#6,13:760\n473#6,3:776\n473#6,3:781\n1057#7,6:595\n1057#7,6:601\n1057#7,6:608\n1057#7,6:615\n154#8:621\n154#8:622\n154#8:656\n154#8:657\n154#8:663\n154#8:697\n154#8:731\n154#8:732\n154#8:740\n154#8:774\n154#8:775\n75#9,6:623\n81#9:655\n85#9:662\n75#9,6:698\n81#9:730\n85#9:737\n75#9,6:741\n81#9:773\n85#9:780\n74#10,6:664\n80#10:696\n84#10:785\n1855#11,2:738\n76#12:786\n76#12:787\n102#12,2:788\n76#12:790\n102#12,2:791\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt\n*L\n144#1:546,11\n169#1:557,5\n169#1:588\n169#1:593\n169#1:562\n169#1:564,11\n169#1:592\n407#1:629\n407#1:631,11\n407#1:661\n459#1:670\n459#1:672,11\n473#1:704\n473#1:706,11\n473#1:736\n518#1:747\n518#1:749,11\n518#1:779\n459#1:784\n169#1:563\n182#1:594\n239#1:614\n407#1:630\n459#1:671\n473#1:705\n518#1:748\n169#1:575,13\n169#1:589,3\n222#1:607\n407#1:642,13\n407#1:658,3\n459#1:683,13\n473#1:717,13\n473#1:733,3\n518#1:760,13\n518#1:776,3\n459#1:781,3\n215#1:595,6\n218#1:601,6\n222#1:608,6\n354#1:615,6\n410#1:621\n412#1:622\n431#1:656\n440#1:657\n463#1:663\n475#1:697\n482#1:731\n491#1:732\n521#1:740\n528#1:774\n533#1:775\n407#1:623,6\n407#1:655\n407#1:662\n473#1:698,6\n473#1:730\n473#1:737\n518#1:741,6\n518#1:773\n518#1:780\n459#1:664,6\n459#1:696\n459#1:785\n502#1:738,2\n151#1:786\n215#1:787\n215#1:788,2\n218#1:790\n218#1:791,2\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt */
/* loaded from: classes7.dex */
public final class WalletScreenKt {
    public static final void CardDetailsRecollectionForm(TextFieldController expiryDateController, CvcController cvcController, boolean z, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        List createListBuilder;
        List build;
        int i3;
        Intrinsics.checkNotNullParameter(expiryDateController, "expiryDateController");
        Intrinsics.checkNotNullParameter(cvcController, "cvcController");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(226988494);
        if ((i2 & 8) != 0) {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(226988494, i, -1, "com.stripe.android.link.ui.wallet.CardDetailsRecollectionForm (WalletScreen.kt:347)");
        }
        boolean mo89539n = mo89518u.mo89539n(expiryDateController) | mo89518u.mo89539n(cvcController);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (z) {
                createListBuilder.add(new SimpleTextElement(IdentifierSpec.Companion.Generic("date"), expiryDateController));
            }
            IdentifierSpec.Companion companion = IdentifierSpec.Companion;
            createListBuilder.add(new CvcElement(companion.getCardCvc(), cvcController));
            build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
            mo89635G = new RowElement(companion.Generic("row_" + leastSignificantBits), build, new RowController(build));
            mo89518u.mo89503z(mo89635G);
        }
        RowElement rowElement = (RowElement) mo89635G;
        if (z) {
            i3 = C18975R.string.wallet_update_expired_card_error;
        } else {
            i3 = C18975R.string.wallet_recollect_cvc_error;
        }
        ColorKt.StripeThemeForLink(C43575jt0.m29791b(mo89518u, -66632326, true, new WalletScreenKt$CardDetailsRecollectionForm$1(interfaceC41563gV22, i, i3, rowElement)), mo89518u, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new WalletScreenKt$CardDetailsRecollectionForm$2(expiryDateController, cvcController, z, interfaceC41563gV22, i, i2));
        }
    }

    public static final void CollapsedPaymentDetails(ConsumerPaymentDetails.PaymentDetails selectedPaymentMethod, boolean z, Function0<Unit> onClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-439536952);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(selectedPaymentMethod)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onClick)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-439536952, i6, -1, "com.stripe.android.link.ui.wallet.CollapsedPaymentDetails (WalletScreen.kt:401)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114254o = BB5.m114254o(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(64));
            float m29303g = C43705k61.m29303g(1);
            TM2 tm2 = TM2.f35372a;
            int i7 = TM2.f35373b;
            InterfaceC41563gV2 m70814e = C38131ak0.m70814e(C13342bw.m62125c(C35447Qk0.m88106a(C19783dZ.m44155g(m114254o, m29303g, ThemeKt.getLinkColors(tm2, mo89518u, i7).m116533getComponentBorder0d7_KjU(), ThemeKt.getLinkShapes(tm2, mo89518u, i7).getLarge()), ThemeKt.getLinkShapes(tm2, mo89518u, i7).getLarge()), ThemeKt.getLinkColors(tm2, mo89518u, i7).m116532getComponentBackground0d7_KjU(), ThemeKt.getLinkShapes(tm2, mo89518u, i7).getLarge()), z, null, null, onClick, 6, null);
            InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70814e);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(984100836);
            C38909c26.m62000e(C40946fS5.m41310c(C18975R.string.wallet_collapsed_payment, mo89518u, 0), ND3.m94180m(c20912a, ThemeKt.getHorizontalPadding(), 0.0f, C43705k61.m29303g(8), 0.0f, 10, null), ThemeKt.getLinkColors(tm2, mo89518u, i7).m116535getDisabledText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, mo89518u, 48, 0, 65528);
            interfaceC32720Et02 = mo89518u;
            PaymentDetailsKt.PaymentDetails(c38066ad5, selectedPaymentMethod, true, interfaceC32720Et02, (ConsumerPaymentDetails.PaymentDetails.$stable << 3) | 390 | ((i6 << 3) & 112));
            DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_chevron, interfaceC32720Et02, 0), C40946fS5.m41310c(C18975R.string.wallet_expand_accessibility, interfaceC32720Et02, 0), C41198fs5.m40620b(ND3.m94180m(c20912a, 0.0f, 0.0f, C43705k61.m29303g(22), 0.0f, 11, null), false, WalletScreenKt$CollapsedPaymentDetails$1$1.INSTANCE, 1, null), ThemeKt.getLinkColors(tm2, interfaceC32720Et02, i7).m116535getDisabledText0d7_KjU(), interfaceC32720Et02, 8, 0);
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new WalletScreenKt$CollapsedPaymentDetails$2(selectedPaymentMethod, z, onClick, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExpandedPaymentDetails(WalletUiState walletUiState, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String str;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1362172402);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1362172402, i, -1, "com.stripe.android.link.ui.wallet.ExpandedPaymentDetails (WalletScreen.kt:449)");
        }
        boolean z = !walletUiState.getPrimaryButtonState().isBlocking();
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
        float m29303g = C43705k61.m29303g(1);
        TM2 tm2 = TM2.f35372a;
        int i2 = TM2.f35373b;
        InterfaceC41563gV2 m62125c = C13342bw.m62125c(C35447Qk0.m88106a(C19783dZ.m44155g(m114255n, m29303g, ThemeKt.getLinkColors(tm2, mo89518u, i2).m116533getComponentBorder0d7_KjU(), ThemeKt.getLinkShapes(tm2, mo89518u, i2).getLarge()), ThemeKt.getLinkShapes(tm2, mo89518u, i2).getLarge()), ThemeKt.getLinkColors(tm2, mo89518u, i2).m116532getComponentBackground0d7_KjU(), ThemeKt.getLinkShapes(tm2, mo89518u, i2).getLarge());
        mo89518u.mo89638F(-483455358);
        C25777lo c25777lo = C25777lo.f96729a;
        C25777lo.InterfaceC25789l m26802g = c25777lo.m26802g();
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m62125c);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
            mo89518u.mo89617M(m113415a);
        } else {
            mo89518u.mo89566e();
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(-1526225988);
        InterfaceC41563gV2 m70814e = C38131ak0.m70814e(BB5.m114254o(c20912a, C43705k61.m29303g(44)), z, null, null, function02, 6, null);
        InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(c25777lo.m26803f(), m99138h, mo89518u, 48);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m70814e);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
            mo89518u.mo89617M(m113415a2);
        } else {
            mo89518u.mo89566e();
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2, m74813a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad5 = C38066ad5.f50835a;
        mo89518u.mo89638F(947578072);
        float f = 20;
        C38909c26.m62000e(C40946fS5.m41310c(C18975R.string.wallet_expanded_title, mo89518u, 0), ND3.m94180m(c20912a, ThemeKt.getHorizontalPadding(), C43705k61.m29303g(f), 0.0f, 0.0f, 12, null), tm2.m83731a(mo89518u, i2).m94903g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(mo89518u, i2).m104963e(), mo89518u, 48, 0, 32760);
        DN5.m110552a(InterfaceC37486Zc5.m72851b(c38066ad5, c20912a, 1.0f, false, 2, null), mo89518u, 0);
        DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_chevron, mo89518u, 0), C40946fS5.m41310c(C18975R.string.wallet_expand_accessibility, mo89518u, 0), C41198fs5.m40620b(C35839Sb5.m85205a(ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f), C43705k61.m29303g(22), 0.0f, 9, null), 180.0f), false, WalletScreenKt$ExpandedPaymentDetails$1$1$1.INSTANCE, 1, null), tm2.m83731a(mo89518u, i2).m94903g(), mo89518u, 8, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89638F(-193414615);
        for (ConsumerPaymentDetails.PaymentDetails paymentDetails : walletUiState.getPaymentDetailsList()) {
            boolean contains = walletUiState.getSupportedTypes().contains(paymentDetails.getType());
            ConsumerPaymentDetails.PaymentDetails selectedItem = walletUiState.getSelectedItem();
            if (selectedItem != null) {
                str = selectedItem.getId();
            } else {
                str = null;
            }
            PaymentDetailsKt.PaymentDetailsListItem(paymentDetails, z, contains, Intrinsics.areEqual(str, paymentDetails.getId()), Intrinsics.areEqual(walletUiState.getPaymentMethodIdBeingUpdated(), paymentDetails.getId()), new WalletScreenKt$ExpandedPaymentDetails$1$2$1(function1, paymentDetails), new WalletScreenKt$ExpandedPaymentDetails$1$2$2(function12, paymentDetails), mo89518u, ConsumerPaymentDetails.PaymentDetails.$stable);
        }
        mo89518u.mo89605Q();
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m70814e2 = C38131ak0.m70814e(BB5.m114254o(BB5.m114255n(c20912a2, 0.0f, 1, null), C43705k61.m29303g(60)), z, null, null, function0, 6, null);
        InterfaceC4360K9.InterfaceC4363c m99138h2 = InterfaceC4360K9.f19170a.m99138h();
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h2, mo89518u, 48);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m70814e2);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
            mo89518u.mo89617M(m113415a3);
        } else {
            mo89518u.mo89566e();
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a3, m74813a2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad52 = C38066ad5.f50835a;
        mo89518u.mo89638F(-1834743615);
        DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_add_green, mo89518u, 0), null, ND3.m94180m(c20912a2, ThemeKt.getHorizontalPadding(), 0.0f, C43705k61.m29303g(12), 0.0f, 10, null), C47063pm0.f104050b.m18726g(), mo89518u, 3512, 0);
        String m41310c = C40946fS5.m41310c(C18975R.string.add_payment_method, mo89518u, 0);
        InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a2, 0.0f, 0.0f, ThemeKt.getHorizontalPadding(), C43705k61.m29303g(4), 3, null);
        TM2 tm22 = TM2.f35372a;
        int i3 = TM2.f35373b;
        C38909c26.m62000e(m41310c, m94180m, ThemeKt.getLinkColors(tm22, mo89518u, i3).m116528getActionLabel0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm22.m83729c(mo89518u, i3).m104963e(), mo89518u, 48, 0, 32760);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new WalletScreenKt$ExpandedPaymentDetails$2(walletUiState, function1, function12, function0, function02, i));
        }
    }

    public static final void WalletBody(LinkAccount linkAccount, NonFallbackInjector injector, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> showBottomSheetContent, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FE0 fe0;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(injector, "injector");
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "showBottomSheetContent");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-465655975);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-465655975, i, -1, "com.stripe.android.link.ui.wallet.WalletBody (WalletScreen.kt:138)");
        }
        WalletViewModel.Factory factory = new WalletViewModel.Factory(linkAccount, injector);
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(WalletViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            WalletViewModel walletViewModel = (WalletViewModel) m84734b;
            InterfaceC48627sP5 m105205b = GM5.m105205b(walletViewModel.getUiState(), null, mo89518u, 8, 1);
            ErrorMessage alertMessage = WalletBody$lambda$0(m105205b).getAlertMessage();
            mo89518u.mo89638F(-1813701153);
            if (alertMessage != null) {
                C25725lb.m27121a(new WalletScreenKt$WalletBody$1$1(walletViewModel), C43575jt0.m29791b(mo89518u, -1544125823, true, new WalletScreenKt$WalletBody$1$2(walletViewModel)), null, null, null, C43575jt0.m29791b(mo89518u, -1110162179, true, new WalletScreenKt$WalletBody$1$3(alertMessage)), null, 0L, 0L, null, mo89518u, 196656, 988);
                Unit unit = Unit.INSTANCE;
            }
            mo89518u.mo89605Q();
            if (WalletBody$lambda$0(m105205b).getPaymentDetailsList().isEmpty()) {
                mo89518u.mo89638F(-1813700586);
                InterfaceC41563gV2 m114255n = BB5.m114255n(BB5.m114259j(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0.0f, 1, null);
                InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-2137368960);
                C40689f10 c40689f10 = C40689f10.f79291a;
                mo89518u.mo89638F(1733871320);
                K74.m99208b(null, 0L, 0.0f, mo89518u, 0, 7);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                interfaceC32720Et02 = mo89518u;
            } else {
                mo89518u.mo89638F(-1813700352);
                WalletUiState WalletBody$lambda$0 = WalletBody$lambda$0(m105205b);
                StripeIntent stripeIntent$link_release = walletViewModel.getArgs().getStripeIntent$link_release();
                Resources resources = ((Context) mo89518u.mo89572c(C11411h.m68324g())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
                interfaceC32720Et02 = mo89518u;
                WalletBody(WalletBody$lambda$0, PrimaryButtonKt.completePaymentButtonLabel(stripeIntent$link_release, resources), walletViewModel.getExpiryDateController(), walletViewModel.getCvcController(), new WalletScreenKt$WalletBody$3(walletViewModel), new WalletScreenKt$WalletBody$4(walletViewModel), new WalletScreenKt$WalletBody$5(walletViewModel), new WalletScreenKt$WalletBody$6(walletViewModel), new WalletScreenKt$WalletBody$7(walletViewModel), new WalletScreenKt$WalletBody$8(walletViewModel), new WalletScreenKt$WalletBody$9(walletViewModel), new WalletScreenKt$WalletBody$10(walletViewModel), showBottomSheetContent, interfaceC32720Et02, (SimpleTextFieldController.$stable << 6) | 8 | (CvcController.$stable << 9), i & 896);
                interfaceC32720Et02.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                return;
            }
            mo89512w.mo20405a(new WalletScreenKt$WalletBody$11(linkAccount, injector, showBottomSheetContent, i));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final WalletUiState WalletBody$lambda$0(InterfaceC48627sP5<WalletUiState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final ConsumerPaymentDetails.PaymentDetails WalletBody$lambda$4(EX2<ConsumerPaymentDetails.PaymentDetails> ex2) {
        return ex2.getValue();
    }

    private static final boolean WalletBody$lambda$7(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WalletBody$lambda$8(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WalletBodyPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        List listOf;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2008074154);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2008074154, i, -1, "com.stripe.android.link.ui.wallet.WalletBodyPreview (WalletScreen.kt:81)");
            }
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ConsumerPaymentDetails.PaymentDetails[]{new ConsumerPaymentDetails.Card("id1", false, 2030, 12, CardBrand.Visa, "4242", CvcCheck.Fail, null, 128, null), new ConsumerPaymentDetails.Card("id2", false, 2022, 1, CardBrand.MasterCard, "4444", CvcCheck.Pass, null, 128, null), new ConsumerPaymentDetails.BankAccount("id2", true, "icon", "Stripe Bank With Long Name", "6789")});
            ThemeKt.DefaultLinkTheme(false, C43575jt0.m29791b(mo89518u, -504004946, true, new WalletScreenKt$WalletBodyPreview$1(listOf)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new WalletScreenKt$WalletBodyPreview$2(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replaceHyperlinks(String str) {
        String replace$default;
        String replace$default2;
        replace$default = StringsKt__StringsJVMKt.replace$default(str, "<terms>", "<a href=\"https://stripe.com/legal/ach-payments/authorization\">", false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "</terms>", "</a>", false, 4, (Object) null);
        return replace$default2;
    }

    public static final void WalletBody(WalletUiState uiState, String primaryButtonLabel, TextFieldController expiryDateController, CvcController cvcController, Function1<? super Boolean, Unit> setExpanded, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onItemSelected, Function0<Unit> onAddNewPaymentMethodClick, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onEditPaymentMethod, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onSetDefault, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onDeletePaymentMethod, Function0<Unit> onPrimaryButtonClick, Function0<Unit> onPayAnotherWayClick, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> showBottomSheetContent, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        Intrinsics.checkNotNullParameter(expiryDateController, "expiryDateController");
        Intrinsics.checkNotNullParameter(cvcController, "cvcController");
        Intrinsics.checkNotNullParameter(setExpanded, "setExpanded");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Intrinsics.checkNotNullParameter(onAddNewPaymentMethodClick, "onAddNewPaymentMethodClick");
        Intrinsics.checkNotNullParameter(onEditPaymentMethod, "onEditPaymentMethod");
        Intrinsics.checkNotNullParameter(onSetDefault, "onSetDefault");
        Intrinsics.checkNotNullParameter(onDeletePaymentMethod, "onDeletePaymentMethod");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onPayAnotherWayClick, "onPayAnotherWayClick");
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "showBottomSheetContent");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1505688600);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1505688600, i, i2, "com.stripe.android.link.ui.wallet.WalletBody (WalletScreen.kt:199)");
        }
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = LM5.m97025e(null, null, 2, null);
            mo89518u.mo89503z(mo89635G);
        }
        EX2 ex2 = (EX2) mo89635G;
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = LM5.m97025e(Boolean.FALSE, null, 2, null);
            mo89518u.mo89503z(mo89635G2);
        }
        EX2 ex22 = (EX2) mo89635G2;
        ConsumerPaymentDetails.PaymentDetails WalletBody$lambda$4 = WalletBody$lambda$4(ex2);
        mo89518u.mo89638F(-1813698570);
        if (WalletBody$lambda$4 != null) {
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(ex22);
            Object mo89635G3 = mo89518u.mo89635G();
            if (mo89539n || mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = new WalletScreenKt$WalletBody$12$1$1(ex22, null);
                mo89518u.mo89503z(mo89635G3);
            }
            mo89518u.mo89605Q();
            int i3 = ConsumerPaymentDetails.PaymentDetails.$stable;
            Y91.m75533f(WalletBody$lambda$4, (Function2) mo89635G3, mo89518u, i3 | 64);
            ConfirmRemoveDialogKt.ConfirmRemoveDialog(WalletBody$lambda$4, WalletBody$lambda$7(ex22), new WalletScreenKt$WalletBody$12$2(onDeletePaymentMethod, WalletBody$lambda$4, ex22, ex2), mo89518u, i3);
            Unit unit = Unit.INSTANCE;
        }
        mo89518u.mo89605Q();
        Y91.m75533f(Boolean.valueOf(uiState.isProcessing()), new WalletScreenKt$WalletBody$13(uiState, (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h()), null), mo89518u, 64);
        CommonKt.ScrollableTopLevelColumn(C43575jt0.m29791b(mo89518u, -1128476687, true, new WalletScreenKt$WalletBody$14(uiState, primaryButtonLabel, onPrimaryButtonClick, i, i2, onPayAnotherWayClick, onItemSelected, setExpanded, showBottomSheetContent, onEditPaymentMethod, onSetDefault, ex2, onAddNewPaymentMethodClick, expiryDateController, cvcController)), mo89518u, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new WalletScreenKt$WalletBody$15(uiState, primaryButtonLabel, expiryDateController, cvcController, setExpanded, onItemSelected, onAddNewPaymentMethodClick, onEditPaymentMethod, onSetDefault, onDeletePaymentMethod, onPrimaryButtonClick, onPayAnotherWayClick, showBottomSheetContent, i, i2));
    }
}
