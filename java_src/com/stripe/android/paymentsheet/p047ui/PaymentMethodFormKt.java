package com.stripe.android.paymentsheet.p047ui;

import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.FormUIKt;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001ay\u0010\u000e\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "args", "", "enabled", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "", "onFormFieldValuesChanged", "LEu1;", "showCheckboxFlow", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "LgV2;", "modifier", "PaymentMethodForm", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZLkotlin/jvm/functions/Function1;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;LgV2;LEt0;II)V", "", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "completeFormValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/FormElement;", "elements", "lastTextFieldIdentifier", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodForm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodForm.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodFormKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,78:1\n81#2,11:79\n76#3:90\n76#3:91\n76#3:92\n*S KotlinDebug\n*F\n+ 1 PaymentMethodForm.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodFormKt\n*L\n28#1:79,11\n37#1:90\n38#1:91\n39#1:92\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentMethodFormKt */
/* loaded from: classes7.dex */
public final class PaymentMethodFormKt {
    public static final void PaymentMethodForm(FormArguments args, boolean z, Function1<? super FormFieldValues, Unit> onFormFieldValuesChanged, InterfaceC32730Eu1<Boolean> showCheckboxFlow, NonFallbackInjector injector, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        FE0 fe0;
        Set emptySet;
        List emptyList;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Intrinsics.checkNotNullParameter(showCheckboxFlow, "showCheckboxFlow");
        Intrinsics.checkNotNullParameter(injector, "injector");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(983512233);
        InterfaceC41563gV2 interfaceC41563gV22 = (i2 & 32) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(983512233, i, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:19)");
        }
        String paymentMethodCode = args.getPaymentMethodCode();
        FormViewModel.Factory factory = new FormViewModel.Factory(args, showCheckboxFlow, injector);
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(FormViewModel.class, m18429a, paymentMethodCode, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            FormViewModel formViewModel = (FormViewModel) m84734b;
            InterfaceC32730Eu1<Set<IdentifierSpec>> hiddenIdentifiers$paymentsheet_release = formViewModel.getHiddenIdentifiers$paymentsheet_release();
            emptySet = SetsKt__SetsKt.emptySet();
            InterfaceC48627sP5 m105206a = GM5.m105206a(hiddenIdentifiers$paymentsheet_release, emptySet, null, mo89518u, 56, 2);
            InterfaceC32730Eu1<List<FormElement>> elementsFlow = formViewModel.getElementsFlow();
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            PaymentMethodForm(args.getPaymentMethodCode(), z, onFormFieldValuesChanged, formViewModel.getCompleteFormValues(), PaymentMethodForm$lambda$0(m105206a), PaymentMethodForm$lambda$1(GM5.m105206a(elementsFlow, emptyList, null, mo89518u, 56, 2)), PaymentMethodForm$lambda$2(GM5.m105206a(formViewModel.getLastTextFieldIdentifier(), null, null, mo89518u, 56, 2)), interfaceC41563gV22, mo89518u, (i & 112) | 299008 | (i & 896) | (IdentifierSpec.$stable << 18) | ((i << 6) & 29360128), 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                return;
            }
            mo89512w.mo20405a(new PaymentMethodFormKt$PaymentMethodForm$1(args, z, onFormFieldValuesChanged, showCheckboxFlow, injector, interfaceC41563gV22, i, i2));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    private static final Set<IdentifierSpec> PaymentMethodForm$lambda$0(InterfaceC48627sP5<? extends Set<IdentifierSpec>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final List<FormElement> PaymentMethodForm$lambda$1(InterfaceC48627sP5<? extends List<? extends FormElement>> interfaceC48627sP5) {
        return (List) interfaceC48627sP5.getValue();
    }

    private static final IdentifierSpec PaymentMethodForm$lambda$2(InterfaceC48627sP5<IdentifierSpec> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    public static final void PaymentMethodForm(String paymentMethodCode, boolean z, Function1<? super FormFieldValues, Unit> onFormFieldValuesChanged, InterfaceC32730Eu1<FormFieldValues> completeFormValues, Set<IdentifierSpec> hiddenIdentifiers, List<? extends FormElement> elements, IdentifierSpec identifierSpec, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Intrinsics.checkNotNullParameter(completeFormValues, "completeFormValues");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        Intrinsics.checkNotNullParameter(elements, "elements");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(958947257);
        InterfaceC41563gV2.C20912a c20912a = (i2 & 128) != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(958947257, i, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:53)");
        }
        Y91.m75533f(paymentMethodCode, new PaymentMethodFormKt$PaymentMethodForm$2(completeFormValues, onFormFieldValuesChanged, null), mo89518u, (i & 14) | 64);
        int i3 = i >> 9;
        FormUIKt.FormUI(hiddenIdentifiers, z, elements, identifierSpec, c20912a, mo89518u, (i & 112) | 520 | (IdentifierSpec.$stable << 9) | (i3 & 7168) | (i3 & 57344), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new PaymentMethodFormKt$PaymentMethodForm$3(paymentMethodCode, z, onFormFieldValuesChanged, completeFormValues, hiddenIdentifiers, elements, identifierSpec, c20912a, i, i2));
    }
}
