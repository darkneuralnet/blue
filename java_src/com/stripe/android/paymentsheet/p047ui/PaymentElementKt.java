package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.p042ui.inline.InlineSignupViewState;
import com.stripe.android.link.p042ui.inline.LinkInlineSignedInKt;
import com.stripe.android.link.p042ui.inline.LinkInlineSignupKt;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.PaymentMethodsUIKt;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009f\u0001\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "sheetViewModel", "", "enabled", "", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "supportedPaymentMethods", "selectedItem", "showLinkInlineSignup", "Lcom/stripe/android/link/LinkPaymentLauncher;", "linkPaymentLauncher", "LEu1;", "showCheckboxFlow", "Lkotlin/Function1;", "", "onItemSelectedListener", "Lkotlin/Function2;", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "onLinkSignupStateChanged", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "formArguments", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "onFormFieldValuesChanged", "PaymentElement", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;LEt0;II)V", "Landroid/content/Context;", "Landroidx/activity/ComponentActivity;", "requireActivity", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentElement.kt\ncom/stripe/android/paymentsheet/ui/PaymentElementKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,123:1\n76#2:124\n76#2:139\n76#2:173\n25#3:125\n460#3,13:151\n460#3,13:185\n473#3,3:199\n473#3,3:206\n1057#4,6:126\n74#5,6:132\n80#5:164\n74#5,6:166\n80#5:198\n84#5:203\n84#5:210\n75#6:138\n76#6,11:140\n75#6:172\n76#6,11:174\n89#6:202\n89#6:209\n154#7:165\n154#7:204\n154#7:205\n*S KotlinDebug\n*F\n+ 1 PaymentElement.kt\ncom/stripe/android/paymentsheet/ui/PaymentElementKt\n*L\n46#1:124\n55#1:139\n72#1:173\n47#1:125\n55#1:151,13\n72#1:185,13\n72#1:199,3\n55#1:206,3\n47#1:126,6\n55#1:132,6\n55#1:164\n72#1:166,6\n72#1:198\n72#1:203\n55#1:210\n55#1:138\n55#1:140,11\n72#1:172\n72#1:174,11\n72#1:202\n55#1:209\n63#1:165\n96#1:204\n105#1:205\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentElementKt */
/* loaded from: classes7.dex */
public final class PaymentElementKt {
    public static final void PaymentElement(BaseSheetViewModel sheetViewModel, boolean z, List<LpmRepository.SupportedPaymentMethod> supportedPaymentMethods, LpmRepository.SupportedPaymentMethod selectedItem, boolean z2, LinkPaymentLauncher linkPaymentLauncher, InterfaceC32730Eu1<Boolean> showCheckboxFlow, Function1<? super LpmRepository.SupportedPaymentMethod, Unit> onItemSelectedListener, Function2<? super LinkPaymentLauncher.Configuration, ? super InlineSignupViewState, Unit> onLinkSignupStateChanged, FormArguments formArguments, Function1<? super FormFieldValues, Unit> onFormFieldValuesChanged, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2.C20912a c20912a;
        float f;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        InterfaceC41563gV2.C20912a c20912a2;
        Intrinsics.checkNotNullParameter(sheetViewModel, "sheetViewModel");
        Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
        Intrinsics.checkNotNullParameter(showCheckboxFlow, "showCheckboxFlow");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        Intrinsics.checkNotNullParameter(onLinkSignupStateChanged, "onLinkSignupStateChanged");
        Intrinsics.checkNotNullParameter(formArguments, "formArguments");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1253183541);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1253183541, i, i2, "com.stripe.android.paymentsheet.ui.PaymentElement (PaymentElement.kt:32)");
        }
        Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            mo89635G = new StripeImageLoader(applicationContext, null, null, null, null, 30, null);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        StripeImageLoader stripeImageLoader = (StripeImageLoader) mo89635G;
        float m104481a = H24.m104481a(C19159R.dimen.stripe_paymentsheet_outer_spacing_horizontal, mo89518u, 0);
        InterfaceC41563gV2.C20912a c20912a3 = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a3, 0.0f, 1, null);
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
        int i4 = 0;
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(1420695873);
        mo89518u.mo89638F(-1051219303);
        if (supportedPaymentMethods.size() > 1) {
            int indexOf = supportedPaymentMethods.indexOf(selectedItem);
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a3, 0.0f, C43705k61.m29303g(26), 0.0f, C43705k61.m29303g(12), 5, null);
            int i5 = ((i >> 12) & 7168) | ((i << 3) & 896) | 196616 | (StripeImageLoader.$stable << 12);
            c20912a = c20912a3;
            i4 = 0;
            PaymentMethodsUIKt.PaymentMethodsUI(supportedPaymentMethods, indexOf, z, onItemSelectedListener, stripeImageLoader, m94180m, null, mo89518u, i5, 64);
        } else {
            c20912a = c20912a3;
        }
        mo89518u.mo89605Q();
        if (Intrinsics.areEqual(selectedItem.getCode(), PaymentMethod.Type.USBankAccount.code)) {
            mo89518u.mo89638F(-1051218780);
            ComponentActivity requireActivity = requireActivity(context);
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.stripe.android.paymentsheet.ui.BaseSheetActivity<*>");
            ((BaseSheetActivity) requireActivity).setFormArgs(formArguments);
            InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, m104481a, 0.0f, 2, null);
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, i4);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94182k);
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
            C38680bf6.m64191b(m64192a2, m91546a2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf(i4));
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            mo89518u.mo89638F(-1697678711);
            C19814de.m43999a(PaymentElementKt$PaymentElement$1$1$1.INSTANCE, null, null, mo89518u, 0, 6);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            f = m104481a;
            interfaceC32720Et02 = mo89518u;
            c20912a2 = c20912a;
            i3 = 1;
        } else {
            mo89518u.mo89638F(-1051218384);
            f = m104481a;
            interfaceC32720Et02 = mo89518u;
            i3 = 1;
            c20912a2 = c20912a;
            PaymentMethodFormKt.PaymentMethodForm(formArguments, z, onFormFieldValuesChanged, showCheckboxFlow, sheetViewModel.getInjector(), ND3.m94182k(c20912a, m104481a, 0.0f, 2, null), interfaceC32720Et02, Amount.$stable | PaymentMethodCreateParams.$stable | 36864 | ((i >> 27) & 14) | (i & 112) | ((i2 << 6) & 896), 0);
            interfaceC32720Et02.mo89605Q();
        }
        InterfaceC32720Et0 interfaceC32720Et03 = interfaceC32720Et02;
        InterfaceC48627sP5 m105205b = GM5.m105205b(sheetViewModel.getLinkHandler().getLinkInlineSelection(), null, interfaceC32720Et03, 8, i3);
        if (z2) {
            if (m105205b.getValue() != null) {
                interfaceC32720Et03.mo89638F(-1051217817);
                LinkInlineSignedInKt.LinkInlineSignedIn(linkPaymentLauncher, new PaymentElementKt$PaymentElement$1$2(sheetViewModel), BB5.m114255n(ND3.m94183j(c20912a2, f, C43705k61.m29303g(6)), 0.0f, i3, null), interfaceC32720Et03, LinkPaymentLauncher.$stable | ((i >> 15) & 14), 0);
                interfaceC32720Et03.mo89605Q();
            } else {
                interfaceC32720Et03.mo89638F(-1051217377);
                LinkInlineSignupKt.LinkInlineSignup(linkPaymentLauncher, z, onLinkSignupStateChanged, BB5.m114255n(ND3.m94183j(c20912a2, f, C43705k61.m29303g(6)), 0.0f, i3, null), interfaceC32720Et03, LinkPaymentLauncher.$stable | ((i >> 15) & 14) | (i & 112) | ((i >> 18) & 896), 0);
                interfaceC32720Et03.mo89605Q();
            }
        }
        interfaceC32720Et03.mo89605Q();
        interfaceC32720Et03.mo89605Q();
        interfaceC32720Et03.mo89605Q();
        interfaceC32720Et03.mo89563f();
        interfaceC32720Et03.mo89605Q();
        interfaceC32720Et03.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et03.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PaymentElementKt$PaymentElement$2(sheetViewModel, z, supportedPaymentMethods, selectedItem, z2, linkPaymentLauncher, showCheckboxFlow, onItemSelectedListener, onLinkSignupStateChanged, formArguments, onFormFieldValuesChanged, i, i2));
    }

    private static final ComponentActivity requireActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "currentContext.baseContext");
        }
        throw new IllegalStateException("Failed to find an Activity from the current Context".toString());
    }
}
