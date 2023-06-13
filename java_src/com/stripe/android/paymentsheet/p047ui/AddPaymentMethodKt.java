package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import androidx.compose.p003ui.platform.C11411h;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.p042ui.inline.InlineSignupViewState;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\"\u001c\u0010\u0017\u001a\u00060\u0007j\u0002`\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "sheetViewModel", "LgV2;", "modifier", "", "AddPaymentMethod", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V", "", "paymentMethodCode", "Lcom/stripe/android/link/model/AccountStatus;", "linkAccountStatus", "", "showLinkInlineSignupView", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "paymentMethod", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "transformToPaymentSelection", "Lcom/stripe/android/model/PaymentMethodCode;", "getInitiallySelectedPaymentMethodType", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Ljava/lang/String;", "initiallySelectedPaymentMethodType", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddPaymentMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,178:1\n76#2:179\n76#2:218\n25#3:180\n36#3:187\n50#3:196\n49#3:197\n25#3:204\n460#3,13:230\n473#3,3:244\n1057#4,6:181\n1057#4,3:188\n1060#4,3:193\n1057#4,6:198\n1057#4,6:205\n223#5,2:191\n74#6,6:211\n80#6:243\n84#6:248\n75#7:217\n76#7,11:219\n89#7:247\n540#8:249\n525#8,6:250\n76#9:256\n76#9:257\n76#9:258\n76#9:259\n102#9,2:260\n76#9:262\n76#9:263\n76#9:264\n102#9,2:265\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt\n*L\n37#1:179\n89#1:218\n39#1:180\n52#1:187\n63#1:196\n63#1:197\n73#1:204\n89#1:230,13\n89#1:244,3\n39#1:181,6\n52#1:188,3\n52#1:193,3\n63#1:198,6\n73#1:205,6\n53#1:191,2\n89#1:211,6\n89#1:243\n89#1:248\n89#1:217\n89#1:219,11\n89#1:247\n154#1:249\n154#1:250,6\n41#1:256\n43#1:257\n44#1:258\n48#1:259\n48#1:260,2\n71#1:262\n72#1:263\n73#1:264\n73#1:265,2\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt */
/* loaded from: classes7.dex */
public final class AddPaymentMethodKt {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
        if (r2 == r9.m108267a()) goto L44;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.coroutines.Continuation, java.lang.Object, EM5, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddPaymentMethod(BaseSheetViewModel baseSheetViewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2.C20912a c20912a;
        EM5 em5;
        Object obj;
        ?? r0;
        BaseSheetViewModel sheetViewModel = baseSheetViewModel;
        Intrinsics.checkNotNullParameter(sheetViewModel, "sheetViewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1783501117);
        if ((i2 & 2) != 0) {
            c20912a = InterfaceC41563gV2.f82354b0;
        } else {
            c20912a = interfaceC41563gV2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1783501117, i, -1, "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:32)");
        }
        Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
        LinkHandler linkHandler = baseSheetViewModel.getLinkHandler();
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = C50405vP5.m8742a(Boolean.FALSE);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        GX2 gx2 = (GX2) mo89635G;
        InterfaceC48627sP5 m105206a = GM5.m105206a(baseSheetViewModel.getProcessing(), Boolean.FALSE, null, mo89518u, 56, 2);
        InterfaceC48627sP5 interfaceC48627sP5 = null;
        LinkPaymentLauncher.Configuration AddPaymentMethod$lambda$2 = AddPaymentMethod$lambda$2(GM5.m105205b(linkHandler.getLinkConfiguration(), null, mo89518u, 8, 1));
        mo89518u.mo89638F(157293650);
        if (AddPaymentMethod$lambda$2 == null) {
            em5 = null;
        } else {
            em5 = null;
            interfaceC48627sP5 = GM5.m105206a(linkHandler.getLinkLauncher().getAccountStatusFlow(AddPaymentMethod$lambda$2), null, null, mo89518u, 56, 2);
        }
        mo89518u.mo89605Q();
        if (interfaceC48627sP5 == null) {
            interfaceC48627sP5 = LM5.m97025e(em5, em5, 2, em5);
        }
        InterfaceC48627sP5 interfaceC48627sP52 = interfaceC48627sP5;
        EX2 ex2 = (EX2) C35550Qv4.m87571b(new Object[0], null, null, new AddPaymentMethodKt$AddPaymentMethod$selectedPaymentMethodCode$2(sheetViewModel), mo89518u, 8, 6);
        String AddPaymentMethod$lambda$5 = AddPaymentMethod$lambda$5(ex2);
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(AddPaymentMethod$lambda$5);
        Object mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n) {
            r0 = em5;
            obj = mo89635G2;
        }
        EM5 em52 = em5;
        for (LpmRepository.SupportedPaymentMethod supportedPaymentMethod : baseSheetViewModel.getSupportedPaymentMethods$paymentsheet_release()) {
            if (Intrinsics.areEqual(supportedPaymentMethod.getCode(), AddPaymentMethod$lambda$5(ex2))) {
                mo89518u.mo89503z(supportedPaymentMethod);
                r0 = em52;
                obj = supportedPaymentMethod;
                mo89518u.mo89605Q();
                LpmRepository.SupportedPaymentMethod supportedPaymentMethod2 = (LpmRepository.SupportedPaymentMethod) obj;
                boolean showLinkInlineSignupView = showLinkInlineSignupView(sheetViewModel, AddPaymentMethod$lambda$5(ex2), AddPaymentMethod$lambda$4(interfaceC48627sP52));
                Boolean valueOf = Boolean.valueOf(showLinkInlineSignupView);
                int i3 = LpmRepository.SupportedPaymentMethod.$stable;
                mo89518u.mo89638F(511388516);
                boolean mo89539n2 = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(supportedPaymentMethod2);
                Object mo89635G3 = mo89518u.mo89635G();
                if (mo89539n2 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G3 = sheetViewModel.createFormArguments(supportedPaymentMethod2, showLinkInlineSignupView);
                    mo89518u.mo89503z(mo89635G3);
                }
                mo89518u.mo89605Q();
                FormArguments formArguments = (FormArguments) mo89635G3;
                AddPaymentMethodKt$AddPaymentMethod$1 addPaymentMethodKt$AddPaymentMethod$1 = new AddPaymentMethodKt$AddPaymentMethod$1(gx2, formArguments, r0);
                int i4 = Amount.$stable;
                int i5 = PaymentMethodCreateParams.$stable;
                Y91.m75533f(formArguments, addPaymentMethodKt$AddPaymentMethod$1, mo89518u, i4 | i5 | 64);
                InterfaceC48627sP5 m105205b = GM5.m105205b(baseSheetViewModel.getSelection$paymentsheet_release(), r0, mo89518u, 8, 1);
                InterfaceC48627sP5 m105205b2 = GM5.m105205b(linkHandler.getLinkInlineSelection(), r0, mo89518u, 8, 1);
                mo89518u.mo89638F(-492369756);
                Object mo89635G4 = mo89518u.mo89635G();
                if (mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G4 = LM5.m97025e(r0, r0, 2, r0);
                    mo89518u.mo89503z(mo89635G4);
                }
                mo89518u.mo89605Q();
                EX2 ex22 = (EX2) mo89635G4;
                Y91.m75535d(AddPaymentMethod$lambda$10(m105205b), AddPaymentMethod$lambda$13(ex22), AddPaymentMethod$lambda$11(m105205b2), new AddPaymentMethodKt$AddPaymentMethod$2(baseSheetViewModel, ex22, m105205b2, m105205b, null), mo89518u, (InlineSignupViewState.$stable << 3) | 4096 | (((LinkPaymentDetails.New.$stable | ConsumerPaymentDetails.PaymentDetails.$stable) | i5) << 6));
                InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, r0);
                mo89518u.mo89638F(-483455358);
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
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
                C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-1163856341);
                C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
                mo89518u.mo89638F(131558835);
                C41806gu0.m37353a(new W94[]{TextFieldUIKt.getLocalAutofillEventReporter().m81907c(new AddPaymentMethodKt$AddPaymentMethod$3$1(baseSheetViewModel.getEventReporter$paymentsheet_release()))}, C43575jt0.m29791b(mo89518u, -754720141, true, new AddPaymentMethodKt$AddPaymentMethod$3$2(baseSheetViewModel, supportedPaymentMethod2, showLinkInlineSignupView, linkHandler, gx2, ex22, formArguments, m105206a, ex2, context)), mo89518u, 56);
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
                    mo89512w.mo20405a(new AddPaymentMethodKt$AddPaymentMethod$4(baseSheetViewModel, c20912a, i, i2));
                    return;
                }
                return;
            }
            em52 = em52;
            sheetViewModel = sheetViewModel;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AddPaymentMethod$lambda$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentSelection AddPaymentMethod$lambda$10(InterfaceC48627sP5<? extends PaymentSelection> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentSelection.New.LinkInline AddPaymentMethod$lambda$11(InterfaceC48627sP5<PaymentSelection.New.LinkInline> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineSignupViewState AddPaymentMethod$lambda$13(EX2<InlineSignupViewState> ex2) {
        return ex2.getValue();
    }

    private static final LinkPaymentLauncher.Configuration AddPaymentMethod$lambda$2(InterfaceC48627sP5<LinkPaymentLauncher.Configuration> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final AccountStatus AddPaymentMethod$lambda$4(InterfaceC48627sP5<? extends AccountStatus> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddPaymentMethod$lambda$5(EX2<String> ex2) {
        return ex2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInitiallySelectedPaymentMethodType(BaseSheetViewModel baseSheetViewModel) {
        boolean z;
        Object first;
        PaymentSelection.New newPaymentSelection = baseSheetViewModel.getNewPaymentSelection();
        if (newPaymentSelection instanceof PaymentSelection.New.LinkInline) {
            return PaymentMethod.Type.Card.code;
        }
        boolean z2 = true;
        if (newPaymentSelection instanceof PaymentSelection.New.Card) {
            z = true;
        } else {
            z = newPaymentSelection instanceof PaymentSelection.New.USBankAccount;
        }
        if (!z) {
            z2 = newPaymentSelection instanceof PaymentSelection.New.GenericPaymentMethod;
        }
        if (!z2) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) baseSheetViewModel.getSupportedPaymentMethods$paymentsheet_release());
            return ((LpmRepository.SupportedPaymentMethod) first).getCode();
        }
        return newPaymentSelection.getPaymentMethodCreateParams().getTypeCode();
    }

    private static final boolean showLinkInlineSignupView(BaseSheetViewModel baseSheetViewModel, String str, AccountStatus accountStatus) {
        Set of;
        boolean z;
        boolean z2;
        boolean contains;
        List<String> linkFundingSources;
        of = SetsKt__SetsKt.setOf((Object[]) new AccountStatus[]{AccountStatus.Verified, AccountStatus.NeedsVerification, AccountStatus.VerificationStarted, AccountStatus.SignedOut});
        if (baseSheetViewModel.getLinkHandler().getLinkInlineSelection().getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!Intrinsics.areEqual(baseSheetViewModel.getLinkHandler().isLinkEnabled().getValue(), Boolean.TRUE)) {
            return false;
        }
        StripeIntent value = baseSheetViewModel.getStripeIntent$paymentsheet_release().getValue();
        if (value != null && (linkFundingSources = value.getLinkFundingSources()) != null && linkFundingSources.contains(PaymentMethod.Type.Card.code)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !Intrinsics.areEqual(str, PaymentMethod.Type.Card.code)) {
            return false;
        }
        contains = CollectionsKt___CollectionsKt.contains(of, accountStatus);
        if (!contains && !z) {
            return false;
        }
        return true;
    }

    public static final PaymentSelection.New transformToPaymentSelection(FormFieldValues formFieldValues, Context context, LpmRepository.SupportedPaymentMethod paymentMethod) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(formFieldValues, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        FieldValuesToParamsMapConverter.Companion companion = FieldValuesToParamsMapConverter.Companion;
        Map<IdentifierSpec, FormFieldEntry> fieldValuePairs = formFieldValues.getFieldValuePairs();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
            IdentifierSpec key = entry.getKey();
            IdentifierSpec.Companion companion2 = IdentifierSpec.Companion;
            if (!Intrinsics.areEqual(key, companion2.getSaveForFutureUse()) && !Intrinsics.areEqual(entry.getKey(), companion2.getCardBrand())) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        PaymentMethodCreateParams transformToPaymentMethodCreateParams = companion.transformToPaymentMethodCreateParams(linkedHashMap, paymentMethod.getCode(), paymentMethod.getRequiresMandate());
        if (Intrinsics.areEqual(paymentMethod.getCode(), PaymentMethod.Type.Card.code)) {
            CardBrand.Companion companion3 = CardBrand.Companion;
            FormFieldEntry formFieldEntry = formFieldValues.getFieldValuePairs().get(IdentifierSpec.Companion.getCardBrand());
            if (formFieldEntry != null) {
                str = formFieldEntry.getValue();
            } else {
                str = null;
            }
            return new PaymentSelection.New.Card(transformToPaymentMethodCreateParams, companion3.fromCode(str), formFieldValues.getUserRequestedReuse());
        }
        String string = context.getString(paymentMethod.getDisplayNameResource());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(paymen…thod.displayNameResource)");
        return new PaymentSelection.New.GenericPaymentMethod(string, paymentMethod.getIconResource(), paymentMethod.getLightThemeIconUrl(), paymentMethod.getDarkThemeIconUrl(), transformToPaymentMethodCreateParams, formFieldValues.getUserRequestedReuse());
    }
}
