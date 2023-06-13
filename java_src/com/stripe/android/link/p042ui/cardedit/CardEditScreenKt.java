package com.stripe.android.link.p042ui.cardedit;

import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.CommonKt;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.uicore.elements.CheckboxElementUIKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.FE0;
import p000.InterfaceC32018Bt0;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0082\u0001\u0010\t\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00000\u0012¢\u0006\u0002\b\u0018H\u0001¢\u0006\u0004\b\t\u0010\u001a\u001a;\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\u0012H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m28432d2 = {"", "CardEditPreview", "(LEt0;I)V", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "", "paymentDetailsId", "CardEditBody", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Ljava/lang/String;LEt0;I)V", "", "isProcessing", "isDefault", "setAsDefaultChecked", "primaryButtonEnabled", "Lcom/stripe/android/link/ui/ErrorMessage;", "errorMessage", "Lkotlin/Function1;", "onSetAsDefaultClick", "Lkotlin/Function0;", "onPrimaryButtonClick", "onCancelClick", "LPm0;", "Lkotlin/ExtensionFunctionType;", "formContent", "(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V", "DefaultPaymentMethodCheckbox", "(ZZZLkotlin/jvm/functions/Function1;LEt0;I)V", "DEFAULT_PAYMENT_METHOD_CHECKBOX_TAG", "Ljava/lang/String;", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,193:1\n81#2,11:194\n68#3,5:205\n73#3:236\n77#3:241\n75#4:210\n76#4,11:212\n89#4:240\n76#5:211\n460#6,13:223\n473#6,3:237\n50#6:242\n49#6:243\n1057#7,6:244\n76#8:250\n76#8:251\n76#8:252\n76#8:253\n76#8:254\n*S KotlinDebug\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt\n*L\n69#1:194,11\n76#1:205,5\n76#1:236\n76#1:241\n76#1:210\n76#1:212,11\n76#1:240\n76#1:211\n76#1:223,13\n76#1:237,3\n188#1:242\n188#1:243\n188#1:244,6\n73#1:250\n86#1:251\n87#1:252\n88#1:253\n89#1:254\n*E\n"})
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt */
/* loaded from: classes7.dex */
public final class CardEditScreenKt {
    public static final String DEFAULT_PAYMENT_METHOD_CHECKBOX_TAG = "DEFAULT_PAYMENT_METHOD_CHECKBOX";

    public static final void CardEditBody(LinkAccount linkAccount, NonFallbackInjector injector, String paymentDetailsId, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FE0 fe0;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(injector, "injector");
        Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1689620592);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1689620592, i, -1, "com.stripe.android.link.ui.cardedit.CardEditBody (CardEditScreen.kt:63)");
        }
        CardEditViewModel.Factory factory = new CardEditViewModel.Factory(linkAccount, injector, paymentDetailsId);
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(CardEditViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            CardEditViewModel cardEditViewModel = (CardEditViewModel) m84734b;
            InterfaceC48627sP5 m105205b = GM5.m105205b(cardEditViewModel.getFormController(), null, mo89518u, 8, 1);
            if (CardEditBody$lambda$0(m105205b) == null) {
                mo89518u.mo89638F(473599160);
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
                mo89518u.mo89638F(-508769135);
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
                mo89518u.mo89638F(473599394);
                FormController CardEditBody$lambda$0 = CardEditBody$lambda$0(m105205b);
                if (CardEditBody$lambda$0 == null) {
                    interfaceC32720Et02 = mo89518u;
                } else {
                    boolean z = false;
                    InterfaceC48627sP5 m105206a = GM5.m105206a(CardEditBody$lambda$0.getCompleteFormValues(), null, null, mo89518u, 56, 2);
                    InterfaceC48627sP5 m105205b2 = GM5.m105205b(cardEditViewModel.isProcessing(), null, mo89518u, 8, 1);
                    InterfaceC48627sP5 m105205b3 = GM5.m105205b(cardEditViewModel.getErrorMessage(), null, mo89518u, 8, 1);
                    InterfaceC48627sP5 m105205b4 = GM5.m105205b(cardEditViewModel.getSetAsDefault(), null, mo89518u, 8, 1);
                    boolean CardEditBody$lambda$6$lambda$3 = CardEditBody$lambda$6$lambda$3(m105205b2);
                    boolean isDefault = cardEditViewModel.isDefault();
                    boolean CardEditBody$lambda$6$lambda$5 = CardEditBody$lambda$6$lambda$5(m105205b4);
                    if (CardEditBody$lambda$6$lambda$2(m105206a) != null) {
                        z = true;
                    }
                    interfaceC32720Et02 = mo89518u;
                    CardEditBody(CardEditBody$lambda$6$lambda$3, isDefault, CardEditBody$lambda$6$lambda$5, z, CardEditBody$lambda$6$lambda$4(m105205b3), new CardEditScreenKt$CardEditBody$2$1(cardEditViewModel), new CardEditScreenKt$CardEditBody$2$2(m105206a, cardEditViewModel), new CardEditScreenKt$CardEditBody$2$3(cardEditViewModel), C43575jt0.m29791b(mo89518u, -90737084, true, new CardEditScreenKt$CardEditBody$2$4(CardEditBody$lambda$0, cardEditViewModel)), mo89518u, 100663296);
                }
                interfaceC32720Et02.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                return;
            }
            mo89512w.mo20405a(new CardEditScreenKt$CardEditBody$3(linkAccount, injector, paymentDetailsId, i));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final FormController CardEditBody$lambda$0(InterfaceC48627sP5<FormController> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<IdentifierSpec, FormFieldEntry> CardEditBody$lambda$6$lambda$2(InterfaceC48627sP5<? extends Map<IdentifierSpec, FormFieldEntry>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean CardEditBody$lambda$6$lambda$3(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final ErrorMessage CardEditBody$lambda$6$lambda$4(InterfaceC48627sP5<? extends ErrorMessage> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean CardEditBody$lambda$6$lambda$5(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    public static final void CardEditPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1657101433);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1657101433, i, -1, "com.stripe.android.link.ui.cardedit.CardEditPreview (CardEditScreen.kt:44)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$CardEditScreenKt.INSTANCE.m116556getLambda3$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new CardEditScreenKt$CardEditPreview$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPaymentMethodCheckbox(boolean z, boolean z2, boolean z3, Function1<? super Boolean, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-782259237);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z3)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(function1)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-782259237, i2, -1, "com.stripe.android.link.ui.cardedit.DefaultPaymentMethodCheckbox (CardEditScreen.kt:173)");
            }
            if (!z2 && !z) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && !z3) {
                z5 = true;
            } else {
                z5 = false;
            }
            String m41310c = C40946fS5.m41310c(C18975R.string.pm_set_as_default, mo89518u, 0);
            Boolean valueOf = Boolean.valueOf(z);
            mo89518u.mo89638F(511388516);
            boolean mo89539n = mo89518u.mo89539n(valueOf) | mo89518u.mo89539n(function1);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new CardEditScreenKt$DefaultPaymentMethodCheckbox$1$1(function1, z);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            CheckboxElementUIKt.CheckboxElementUI(null, DEFAULT_PAYMENT_METHOD_CHECKBOX_TAG, z4, m41310c, z5, (Function1) mo89635G, mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new CardEditScreenKt$DefaultPaymentMethodCheckbox$2(z, z2, z3, function1, i));
        }
    }

    public static final void CardEditBody(boolean z, boolean z2, boolean z3, boolean z4, ErrorMessage errorMessage, Function1<? super Boolean, Unit> onSetAsDefaultClick, Function0<Unit> onPrimaryButtonClick, Function0<Unit> onCancelClick, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> formContent, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(onSetAsDefaultClick, "onSetAsDefaultClick");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(formContent, "formContent");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1746110882);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89536o(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo89518u.mo89536o(z2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= mo89518u.mo89536o(z3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= mo89518u.mo89536o(z4) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= mo89518u.mo89539n(errorMessage) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= mo89518u.mo89539n(onSetAsDefaultClick) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= mo89518u.mo89539n(onPrimaryButtonClick) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= mo89518u.mo89539n(onCancelClick) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= mo89518u.mo89539n(formContent) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((191739611 & i3) == 38347922 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1746110882, i3, -1, "com.stripe.android.link.ui.cardedit.CardEditBody (CardEditScreen.kt:116)");
            }
            interfaceC32720Et02 = mo89518u;
            CommonKt.ScrollableTopLevelColumn(C43575jt0.m29791b(interfaceC32720Et02, 2091799335, true, new CardEditScreenKt$CardEditBody$4(errorMessage, z, z4, onPrimaryButtonClick, i3, onCancelClick, formContent, z3, z2, onSetAsDefaultClick)), interfaceC32720Et02, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new CardEditScreenKt$CardEditBody$5(z, z2, z3, z4, errorMessage, onSetAsDefaultClick, onPrimaryButtonClick, onCancelClick, formContent, i));
    }
}
