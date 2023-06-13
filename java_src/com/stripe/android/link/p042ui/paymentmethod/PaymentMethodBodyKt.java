package com.stripe.android.link.p042ui.paymentmethod;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import androidx.lifecycle.InterfaceC11718e;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForLinkContract;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.CommonKt;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.PrimaryButtonState;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
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
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0090\u0001\u0010\t\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00000\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00000\u0016¢\u0006\u0002\b\u001cH\u0001¢\u0006\u0004\b\t\u0010\u001e\u001aC\u0010&\u001a\u00020\u0000*\u00020\u001f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b&\u0010'¨\u0006("}, m28432d2 = {"", "PaymentMethodBodyPreview", "(LEt0;I)V", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "", LinkScreen.PaymentMethod.loadArg, "PaymentMethodBody", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;ZLEt0;I)V", "", "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;", "supportedPaymentMethods", "selectedPaymentMethod", "", "primaryButtonLabel", "Lcom/stripe/android/link/ui/PrimaryButtonState;", "primaryButtonState", "secondaryButtonLabel", "Lcom/stripe/android/link/ui/ErrorMessage;", "errorMessage", "Lkotlin/Function1;", "onPaymentMethodSelected", "Lkotlin/Function0;", "onPrimaryButtonClick", "onSecondaryButtonClick", "LPm0;", "Lkotlin/ExtensionFunctionType;", "formContent", "(Ljava/util/List;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Ljava/lang/String;Lcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V", "LZc5;", "paymentMethod", "selected", "enabled", "onSelected", "LgV2;", "modifier", "PaymentMethodTypeCell", "(LZc5;Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;ZZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,288:1\n81#2,11:289\n76#3:300\n76#3:308\n1#4:301\n68#5,5:302\n73#5:333\n77#5:338\n75#6:307\n76#6,11:309\n89#6:337\n460#7,13:320\n473#7,3:334\n76#8:339\n76#8:340\n76#8:341\n76#8:342\n76#8:343\n76#8:344\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt\n*L\n84#1:289,11\n121#1:300\n142#1:308\n142#1:302,5\n142#1:333\n142#1:338\n142#1:307\n142#1:309,11\n142#1:337\n142#1:320,13\n142#1:334,3\n93#1:339\n108#1:340\n111#1:341\n112#1:342\n113#1:343\n114#1:344\n*E\n"})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt {
    public static final void PaymentMethodBody(LinkAccount linkAccount, NonFallbackInjector injector, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FE0 fe0;
        Object obj;
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(injector, "injector");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(198882714);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(198882714, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody (PaymentMethodBody.kt:78)");
        }
        PaymentMethodViewModel.Factory factory = new PaymentMethodViewModel.Factory(linkAccount, injector, z);
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(PaymentMethodViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            PaymentMethodViewModel paymentMethodViewModel = (PaymentMethodViewModel) m84734b;
            TH2 m110957a = C1362D5.m110957a(new FinancialConnectionsSheetForLinkContract(), new PaymentMethodBodyKt$PaymentMethodBody$activityResultLauncher$1(paymentMethodViewModel), mo89518u, FinancialConnectionsSheetForLinkContract.$stable);
            Unit unit = null;
            String PaymentMethodBody$lambda$0 = PaymentMethodBody$lambda$0(GM5.m105205b(paymentMethodViewModel.getFinancialConnectionsSessionClientSecret(), null, mo89518u, 8, 1));
            mo89518u.mo89638F(-1025646064);
            if (PaymentMethodBody$lambda$0 != null) {
                Y91.m75533f(PaymentMethodBody$lambda$0, new PaymentMethodBodyKt$PaymentMethodBody$1$1(m110957a, PaymentMethodBody$lambda$0, paymentMethodViewModel, null), mo89518u, 64);
                Unit unit2 = Unit.INSTANCE;
            }
            mo89518u.mo89605Q();
            FormController PaymentMethodBody$lambda$2 = PaymentMethodBody$lambda$2(GM5.m105205b(paymentMethodViewModel.getFormController(), null, mo89518u, 8, 1));
            mo89518u.mo89638F(-1025645548);
            if (PaymentMethodBody$lambda$2 == null) {
                i2 = 1;
                obj = null;
                interfaceC32720Et02 = mo89518u;
            } else {
                InterfaceC48627sP5 m105206a = GM5.m105206a(PaymentMethodBody$lambda$2.getCompleteFormValues(), null, null, mo89518u, 56, 2);
                InterfaceC48627sP5 m105205b = GM5.m105205b(paymentMethodViewModel.getPrimaryButtonState(), null, mo89518u, 8, 1);
                InterfaceC48627sP5 m105205b2 = GM5.m105205b(paymentMethodViewModel.getErrorMessage(), null, mo89518u, 8, 1);
                InterfaceC48627sP5 m105205b3 = GM5.m105205b(paymentMethodViewModel.getPaymentMethod(), null, mo89518u, 8, 1);
                List<SupportedPaymentMethod> supportedTypes = paymentMethodViewModel.getSupportedTypes();
                SupportedPaymentMethod PaymentMethodBody$lambda$8$lambda$6 = PaymentMethodBody$lambda$8$lambda$6(m105205b3);
                SupportedPaymentMethod PaymentMethodBody$lambda$8$lambda$62 = PaymentMethodBody$lambda$8$lambda$6(m105205b3);
                StripeIntent stripeIntent$link_release = paymentMethodViewModel.getArgs().getStripeIntent$link_release();
                Resources resources = ((Context) mo89518u.mo89572c(C11411h.m68324g())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
                String primaryButtonLabel = PaymentMethodBody$lambda$8$lambda$62.primaryButtonLabel(stripeIntent$link_release, resources);
                PrimaryButtonState PaymentMethodBody$lambda$8$lambda$4 = PaymentMethodBody$lambda$8$lambda$4(m105205b);
                if (!(PaymentMethodBody$lambda$8$lambda$3(m105206a) != null)) {
                    PaymentMethodBody$lambda$8$lambda$4 = null;
                }
                if (PaymentMethodBody$lambda$8$lambda$4 == null) {
                    PaymentMethodBody$lambda$8$lambda$4 = PrimaryButtonState.Disabled;
                }
                obj = null;
                i2 = 1;
                interfaceC32720Et02 = mo89518u;
                PaymentMethodBody(supportedTypes, PaymentMethodBody$lambda$8$lambda$6, primaryButtonLabel, PaymentMethodBody$lambda$8$lambda$4, C40946fS5.m41310c(paymentMethodViewModel.getSecondaryButtonLabel(), mo89518u, 0), PaymentMethodBody$lambda$8$lambda$5(m105205b2), new PaymentMethodBodyKt$PaymentMethodBody$2$2(paymentMethodViewModel), new PaymentMethodBodyKt$PaymentMethodBody$2$3(m105206a, paymentMethodViewModel), new PaymentMethodBodyKt$PaymentMethodBody$2$4(paymentMethodViewModel), C43575jt0.m29791b(mo89518u, 1667105240, true, new PaymentMethodBodyKt$PaymentMethodBody$2$5(PaymentMethodBody$lambda$2, paymentMethodViewModel)), mo89518u, 805306376);
                unit = Unit.INSTANCE;
            }
            interfaceC32720Et02.mo89605Q();
            if (unit == null) {
                InterfaceC41563gV2 m114255n = BB5.m114255n(BB5.m114259j(InterfaceC41563gV2.f82354b0, 0.0f, i2, obj), 0.0f, i2, obj);
                InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
                interfaceC32720Et02.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, interfaceC32720Et02, 6);
                interfaceC32720Et02.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et02.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et02.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
                if (!(interfaceC32720Et02.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et02.mo89557h();
                if (interfaceC32720Et02.mo89521t()) {
                    interfaceC32720Et02.mo89617M(m113415a);
                } else {
                    interfaceC32720Et02.mo89566e();
                }
                interfaceC32720Et02.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et02);
                C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et02.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et02)), interfaceC32720Et02, 0);
                interfaceC32720Et02.mo89638F(2058660585);
                interfaceC32720Et02.mo89638F(-2137368960);
                C40689f10 c40689f10 = C40689f10.f79291a;
                interfaceC32720Et02.mo89638F(672151683);
                K74.m99208b(null, 0L, 0.0f, interfaceC32720Et02, 0, 7);
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89563f();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                return;
            }
            mo89512w.mo20405a(new PaymentMethodBodyKt$PaymentMethodBody$4(linkAccount, injector, z, i));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final String PaymentMethodBody$lambda$0(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final FormController PaymentMethodBody$lambda$2(InterfaceC48627sP5<FormController> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<IdentifierSpec, FormFieldEntry> PaymentMethodBody$lambda$8$lambda$3(InterfaceC48627sP5<? extends Map<IdentifierSpec, FormFieldEntry>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final PrimaryButtonState PaymentMethodBody$lambda$8$lambda$4(InterfaceC48627sP5<? extends PrimaryButtonState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final ErrorMessage PaymentMethodBody$lambda$8$lambda$5(InterfaceC48627sP5<? extends ErrorMessage> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final SupportedPaymentMethod PaymentMethodBody$lambda$8$lambda$6(InterfaceC48627sP5<? extends SupportedPaymentMethod> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaymentMethodBodyPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1937594972);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1937594972, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyPreview (PaymentMethodBody.kt:59)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$PaymentMethodBodyKt.INSTANCE.m116561getLambda3$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentMethodBodyKt$PaymentMethodBodyPreview$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodTypeCell(InterfaceC37486Zc5 interfaceC37486Zc5, SupportedPaymentMethod supportedPaymentMethod, boolean z, boolean z2, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        InterfaceC41563gV2.C20912a c20912a;
        float f;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-595957028);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC37486Zc5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(supportedPaymentMethod)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89536o(z2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= ImageMetadata.EDGE_MODE;
        } else if ((458752 & i) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i9 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
            if ((i3 & 374491) != 74898 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC41563gV22 = obj;
            } else {
                if (i10 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-595957028, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodTypeCell (PaymentMethodBody.kt:222)");
                }
                W94[] w94Arr = new W94[1];
                U94<Float> m75931a = C37220Xz0.m75931a();
                if (!z2) {
                    f = 1.0f;
                } else {
                    f = 0.6f;
                }
                w94Arr[0] = m75931a.m81907c(Float.valueOf(f));
                C41806gu0.m37353a(w94Arr, C43575jt0.m29791b(mo89518u, -208904676, true, new PaymentMethodBodyKt$PaymentMethodTypeCell$1(interfaceC37486Zc5, c20912a, z, z2, function0, supportedPaymentMethod)), mo89518u, 56);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC41563gV22 = c20912a;
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new PaymentMethodBodyKt$PaymentMethodTypeCell$2(interfaceC37486Zc5, supportedPaymentMethod, z, z2, function0, interfaceC41563gV22, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((i3 & 374491) != 74898) {
        }
        if (i10 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        W94[] w94Arr2 = new W94[1];
        U94<Float> m75931a2 = C37220Xz0.m75931a();
        if (!z2) {
        }
        w94Arr2[0] = m75931a2.m81907c(Float.valueOf(f));
        C41806gu0.m37353a(w94Arr2, C43575jt0.m29791b(mo89518u, -208904676, true, new PaymentMethodBodyKt$PaymentMethodTypeCell$1(interfaceC37486Zc5, c20912a, z, z2, function0, supportedPaymentMethod)), mo89518u, 56);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = c20912a;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    public static final void PaymentMethodBody(List<? extends SupportedPaymentMethod> supportedPaymentMethods, SupportedPaymentMethod selectedPaymentMethod, String primaryButtonLabel, PrimaryButtonState primaryButtonState, String secondaryButtonLabel, ErrorMessage errorMessage, Function1<? super SupportedPaymentMethod, Unit> onPaymentMethodSelected, Function0<Unit> onPrimaryButtonClick, Function0<Unit> onSecondaryButtonClick, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> formContent, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        Intrinsics.checkNotNullParameter(secondaryButtonLabel, "secondaryButtonLabel");
        Intrinsics.checkNotNullParameter(onPaymentMethodSelected, "onPaymentMethodSelected");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(formContent, "formContent");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-678299449);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-678299449, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody (PaymentMethodBody.kt:153)");
        }
        CommonKt.ScrollableTopLevelColumn(C43575jt0.m29791b(mo89518u, 1990249040, true, new PaymentMethodBodyKt$PaymentMethodBody$5(supportedPaymentMethods, selectedPaymentMethod, errorMessage, primaryButtonLabel, primaryButtonState, onPrimaryButtonClick, i, secondaryButtonLabel, onSecondaryButtonClick, onPaymentMethodSelected, formContent)), mo89518u, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PaymentMethodBodyKt$PaymentMethodBody$6(supportedPaymentMethods, selectedPaymentMethod, primaryButtonLabel, primaryButtonState, secondaryButtonLabel, errorMessage, onPaymentMethodSelected, onPrimaryButtonClick, onSecondaryButtonClick, formContent, i));
    }
}
