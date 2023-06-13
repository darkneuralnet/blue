package com.stripe.android.paymentsheet.addresselement;

import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.FE0;
import p000.InterfaceC32018Bt0;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\u000b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, m28432d2 = {"", "primaryButtonEnabled", "", "primaryButtonText", "title", "Lkotlin/Function0;", "", "onPrimaryButtonClick", "onCloseClick", "Lkotlin/Function1;", "LPm0;", "Lkotlin/ExtensionFunctionType;", "formContent", "checkboxContent", "InputAddressScreen", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;I)V", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "(Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInputAddressScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputAddressScreen.kt\ncom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n76#2:145\n76#2:163\n81#3,11:146\n68#4,5:157\n73#4:188\n77#4:193\n75#5:162\n76#5,11:164\n89#5:192\n460#6,13:175\n473#6,3:189\n76#7:194\n76#7:195\n76#7:196\n76#7:197\n*S KotlinDebug\n*F\n+ 1 InputAddressScreen.kt\ncom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt\n*L\n39#1:145\n91#1:163\n84#1:146,11\n91#1:157,5\n91#1:188\n91#1:193\n91#1:162\n91#1:164,11\n91#1:192\n91#1:175,13\n91#1:189,3\n89#1:194\n99#1:195\n106#1:196\n107#1:197\n*E\n"})
/* loaded from: classes7.dex */
public final class InputAddressScreenKt {
    public static final void InputAddressScreen(boolean z, String primaryButtonText, String title, Function0<Unit> onPrimaryButtonClick, Function0<Unit> onCloseClick, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> formContent, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> checkboxContent, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(formContent, "formContent");
        Intrinsics.checkNotNullParameter(checkboxContent, "checkboxContent");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(642189468);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89536o(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo89518u.mo89539n(primaryButtonText) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= mo89518u.mo89539n(title) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= mo89518u.mo89539n(onPrimaryButtonClick) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= mo89518u.mo89539n(onCloseClick) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= mo89518u.mo89539n(formContent) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= mo89518u.mo89539n(checkboxContent) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((2995931 & i3) == 599186 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(642189468, i3, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:29)");
            }
            InterfaceC32037Bv1 interfaceC32037Bv1 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
            interfaceC32720Et02 = mo89518u;
            C36604Vi5.m79545a(C47326qC6.m17908a(BB5.m114259j(InterfaceC41563gV2.f82354b0, 0.0f, 1, null)), null, C43575jt0.m29791b(mo89518u, -833687647, true, new InputAddressScreenKt$InputAddressScreen$1(interfaceC32037Bv1, onCloseClick)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94896n(), 0L, C43575jt0.m29791b(interfaceC32720Et02, 973020890, true, new InputAddressScreenKt$InputAddressScreen$2(title, i3, formContent, checkboxContent, z, primaryButtonText, interfaceC32037Bv1, onPrimaryButtonClick)), interfaceC32720Et02, 384, 12582912, 98298);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new InputAddressScreenKt$InputAddressScreen$3(z, primaryButtonText, title, onPrimaryButtonClick, onCloseClick, formContent, checkboxContent, i));
    }

    private static final FormController InputAddressScreen$lambda$0(InterfaceC48627sP5<FormController> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<IdentifierSpec, FormFieldEntry> InputAddressScreen$lambda$5$lambda$2(InterfaceC48627sP5<? extends Map<IdentifierSpec, FormFieldEntry>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InputAddressScreen$lambda$5$lambda$3(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InputAddressScreen$lambda$5$lambda$4(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    public static final void InputAddressScreen(NonFallbackInjector injector, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FE0 fe0;
        Intrinsics.checkNotNullParameter(injector, "injector");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(673700947);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(673700947, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:80)");
        }
        InputAddressViewModel.Factory factory = new InputAddressViewModel.Factory(injector);
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(InputAddressViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            InputAddressViewModel inputAddressViewModel = (InputAddressViewModel) m84734b;
            InterfaceC48627sP5 m105205b = GM5.m105205b(inputAddressViewModel.getFormController(), null, mo89518u, 8, 1);
            if (InputAddressScreen$lambda$0(m105205b) == null) {
                mo89518u.mo89638F(-2003808432);
                InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
                InterfaceC41563gV2 m114257l = BB5.m114257l(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114257l);
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
                mo89518u.mo89638F(1145082932);
                K74.m99208b(null, 0L, 0.0f, mo89518u, 0, 7);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
            } else {
                mo89518u.mo89638F(-2003808249);
                FormController InputAddressScreen$lambda$0 = InputAddressScreen$lambda$0(m105205b);
                if (InputAddressScreen$lambda$0 != null) {
                    InterfaceC48627sP5 m105206a = GM5.m105206a(InputAddressScreen$lambda$0.getCompleteFormValues(), null, null, mo89518u, 56, 2);
                    AddressLauncher.Configuration config$paymentsheet_release = inputAddressViewModel.getArgs().getConfig$paymentsheet_release();
                    String buttonTitle = config$paymentsheet_release != null ? config$paymentsheet_release.getButtonTitle() : null;
                    mo89518u.mo89638F(-2003808111);
                    if (buttonTitle == null) {
                        buttonTitle = C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_address_element_primary_button, mo89518u, 0);
                    }
                    String str = buttonTitle;
                    mo89518u.mo89605Q();
                    AddressLauncher.Configuration config$paymentsheet_release2 = inputAddressViewModel.getArgs().getConfig$paymentsheet_release();
                    String title = config$paymentsheet_release2 != null ? config$paymentsheet_release2.getTitle() : null;
                    mo89518u.mo89638F(-2003807939);
                    if (title == null) {
                        title = C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_address_element_shipping_address, mo89518u, 0);
                    }
                    mo89518u.mo89605Q();
                    InterfaceC48627sP5 m105206a2 = GM5.m105206a(inputAddressViewModel.getFormEnabled(), Boolean.TRUE, null, mo89518u, 56, 2);
                    InterfaceC48627sP5 m105206a3 = GM5.m105206a(inputAddressViewModel.getCheckboxChecked(), Boolean.FALSE, null, mo89518u, 56, 2);
                    InputAddressScreen(InputAddressScreen$lambda$5$lambda$2(m105206a) != null, str, title, new InputAddressScreenKt$InputAddressScreen$5$1(inputAddressViewModel, m105206a, m105206a3), new InputAddressScreenKt$InputAddressScreen$5$2(inputAddressViewModel), C43575jt0.m29791b(mo89518u, -168262672, true, new InputAddressScreenKt$InputAddressScreen$5$3(InputAddressScreen$lambda$0, inputAddressViewModel)), C43575jt0.m29791b(mo89518u, -1056300209, true, new InputAddressScreenKt$InputAddressScreen$5$4(inputAddressViewModel, m105206a3, m105206a2)), mo89518u, 1769472);
                }
                mo89518u.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                return;
            }
            mo89512w.mo20405a(new InputAddressScreenKt$InputAddressScreen$6(injector, i));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
