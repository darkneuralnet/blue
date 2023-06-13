package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C11759u;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseElementUIKt;
import com.stripe.android.p049ui.core.elements.SimpleDialogElementUIKt;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.elements.H6TextKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
import p000.C25777lo;
import p000.FY1;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u0019H\u0002J\u0012\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J$\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010<\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00108R\u001d\u0010A\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u0010@R\u001b\u0010E\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u0010DR\u001d\u0010J\u001a\u0004\u0018\u00010F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bM\u0010N¨\u0006R"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;", "screenState", "", "handleScreenStateChanged", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;", "NameAndEmailCollectionScreen", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;LEt0;I)V", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;", "MandateCollectionScreen", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;LEt0;I)V", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;", "VerifyWithMicrodepositsScreen", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;LEt0;I)V", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;", "SavedAccountScreen", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;LEt0;I)V", "", "name", "email", "NameAndEmailForm", "(Ljava/lang/String;Ljava/lang/String;LEt0;I)V", "bankName", "last4", "", "saveForFutureUsage", "AccountDetailsForm", "(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V", Entry.TYPE_TEXT, "Lkotlin/Function0;", "onClick", "shouldShowProcessingWhenClicked", "enabled", "updatePrimaryButton", "mandateText", "updateMandateText", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onDetach", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "formArgs$delegate", "Lkotlin/Lazy;", "getFormArgs", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "formArgs", "Landroidx/lifecycle/u$b;", "paymentSheetViewModelFactory$delegate", "getPaymentSheetViewModelFactory", "()Landroidx/lifecycle/u$b;", "paymentSheetViewModelFactory", "paymentOptionsViewModelFactory$delegate", "getPaymentOptionsViewModelFactory", "paymentOptionsViewModelFactory", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "sheetViewModel$delegate", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "sheetViewModel", "completePayment$delegate", "getCompletePayment", "()Z", "completePayment", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret$delegate", "getClientSecret", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;", "viewModel", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUSBankAccountFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,486:1\n172#2,9:487\n74#3,6:496\n80#3:528\n84#3:533\n74#3,6:534\n80#3:566\n84#3:571\n74#3,6:572\n80#3:604\n84#3:609\n74#3,6:610\n80#3:642\n84#3:647\n74#3,6:648\n80#3:680\n84#3:762\n74#3,6:770\n80#3:802\n84#3:809\n75#4:502\n76#4,11:504\n89#4:532\n75#4:540\n76#4,11:542\n89#4:570\n75#4:578\n76#4,11:580\n89#4:608\n75#4:616\n76#4,11:618\n89#4:646\n75#4:654\n76#4,11:656\n75#4:688\n76#4,11:690\n89#4:718\n75#4:726\n76#4,11:728\n89#4:756\n89#4:761\n75#4:776\n76#4,11:778\n89#4:808\n76#5:503\n76#5:541\n76#5:579\n76#5:617\n76#5:655\n76#5:689\n76#5:727\n76#5:777\n460#6,13:515\n473#6,3:529\n460#6,13:553\n473#6,3:567\n460#6,13:591\n473#6,3:605\n460#6,13:629\n473#6,3:643\n460#6,13:667\n460#6,13:701\n473#6,3:715\n460#6,13:739\n473#6,3:753\n473#6,3:758\n460#6,13:789\n473#6,3:805\n36#6:810\n154#7:681\n154#7:682\n154#7:720\n154#7:769\n154#7:803\n154#7:804\n68#8,5:683\n73#8:714\n77#8:719\n68#8,5:721\n73#8:752\n77#8:757\n1057#9,6:763\n1057#9,6:811\n1#10:817\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment\n*L\n121#1:487,9\n257#1:496,6\n257#1:528\n257#1:533\n266#1:534,6\n266#1:566\n266#1:571\n280#1:572,6\n280#1:604\n280#1:609\n294#1:610,6\n294#1:642\n294#1:647\n310#1:648,6\n310#1:680\n310#1:762\n356#1:770,6\n356#1:802\n356#1:809\n257#1:502\n257#1:504,11\n257#1:532\n266#1:540\n266#1:542,11\n266#1:570\n280#1:578\n280#1:580,11\n280#1:608\n294#1:616\n294#1:618,11\n294#1:646\n310#1:654\n310#1:656,11\n315#1:688\n315#1:690,11\n315#1:718\n329#1:726\n329#1:728,11\n329#1:756\n310#1:761\n356#1:776\n356#1:778,11\n356#1:808\n257#1:503\n266#1:541\n280#1:579\n294#1:617\n310#1:655\n315#1:689\n329#1:727\n356#1:777\n257#1:515,13\n257#1:529,3\n266#1:553,13\n266#1:567,3\n280#1:591,13\n280#1:605,3\n294#1:629,13\n294#1:643,3\n310#1:667,13\n315#1:701,13\n315#1:715,3\n329#1:739,13\n329#1:753,3\n310#1:758,3\n356#1:789,13\n356#1:805,3\n432#1:810\n313#1:681\n318#1:682\n332#1:720\n359#1:769\n363#1:803\n408#1:804\n315#1:683,5\n315#1:714\n315#1:719\n329#1:721,5\n329#1:752\n329#1:757\n352#1:763,6\n432#1:811,6\n*E\n"})
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment extends Fragment {
    private final Lazy clientSecret$delegate;
    private final Lazy completePayment$delegate;
    private final Lazy formArgs$delegate;
    private final Lazy paymentOptionsViewModelFactory$delegate;
    private final Lazy paymentSheetViewModelFactory$delegate;
    private final Lazy sheetViewModel$delegate;
    private final Lazy viewModel$delegate;

    public USBankAccountFormFragment() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        lazy = LazyKt__LazyJVMKt.lazy(new USBankAccountFormFragment$formArgs$2(this));
        this.formArgs$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new USBankAccountFormFragment$paymentSheetViewModelFactory$2(this));
        this.paymentSheetViewModelFactory$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new USBankAccountFormFragment$paymentOptionsViewModelFactory$2(this));
        this.paymentOptionsViewModelFactory$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new USBankAccountFormFragment$sheetViewModel$2(this));
        this.sheetViewModel$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new USBankAccountFormFragment$completePayment$2(this));
        this.completePayment$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new USBankAccountFormFragment$clientSecret$2(this));
        this.clientSecret$delegate = lazy6;
        this.viewModel$delegate = C33234Gy1.m104545b(this, Reflection.getOrCreateKotlinClass(USBankAccountFormViewModel.class), new C19246x93d8de9d(this), new C19247x93d8de9e(null, this), new USBankAccountFormFragment$viewModel$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AccountDetailsForm(String str, String str2, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-387008785);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-387008785, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.AccountDetailsForm (USBankAccountFormFragment.kt:346)");
        }
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = LM5.m97025e(Boolean.FALSE, null, 2, null);
            mo89518u.mo89503z(mo89635G);
        }
        EX2 ex2 = (EX2) mo89635G;
        int invoke = TransformToBankIcon.Companion.invoke(str);
        InterfaceC48627sP5 m105206a = GM5.m105206a(getViewModel().getProcessing(), Boolean.FALSE, null, mo89518u, 56, 2);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 8;
        InterfaceC41563gV2 m94180m = ND3.m94180m(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C43705k61.m29303g(f), 7, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94180m);
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
        mo89518u.mo89638F(584978021);
        H6TextKt.H6Text(C40946fS5.m41310c(C19159R.string.title_bank_account, mo89518u, 0), ND3.m94182k(c20912a, 0.0f, C43705k61.m29303g(f), 1, null), mo89518u, 48, 0);
        SectionUIKt.m116748SectionCardT042LqI(BB5.m114255n(c20912a, 0.0f, 1, null), false, 0L, null, C43575jt0.m29791b(mo89518u, 976709835, true, new USBankAccountFormFragment$AccountDetailsForm$1$1(m105206a, ex2, invoke, str, str2)), mo89518u, 24582, 14);
        mo89518u.mo89638F(-1523209478);
        if (getFormArgs().getShowCheckbox()) {
            SaveForFutureUseElement saveForFutureUseElement = getViewModel().getSaveForFutureUseElement();
            saveForFutureUseElement.getController().onValueChange(z);
            Unit unit = Unit.INSTANCE;
            SaveForFutureUseElementUIKt.SaveForFutureUseElementUI(true, saveForFutureUseElement, ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f), 0.0f, 0.0f, 13, null), mo89518u, (SaveForFutureUseElement.$stable << 3) | 390, 0);
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (str2 != null) {
            String m41310c = C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_remove_bank_account_title, mo89518u, 0);
            String m41309d = C40946fS5.m41309d(C19159R.string.bank_account_ending_in, new Object[]{str2}, mo89518u, 64);
            String m41310c2 = C40946fS5.m41310c(C19159R.string.remove, mo89518u, 0);
            String m41310c3 = C40946fS5.m41310c(C19159R.string.cancel, mo89518u, 0);
            USBankAccountFormFragment$AccountDetailsForm$2$1 uSBankAccountFormFragment$AccountDetailsForm$2$1 = new USBankAccountFormFragment$AccountDetailsForm$2$1(ex2, this);
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(ex2);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new USBankAccountFormFragment$AccountDetailsForm$2$2$1(ex2);
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            SimpleDialogElementUIKt.SimpleDialogElementUI(ex2, m41310c, m41309d, m41310c2, m41310c3, uSBankAccountFormFragment$AccountDetailsForm$2$1, (Function0) mo89635G2, mo89518u, 6, 0);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new USBankAccountFormFragment$AccountDetailsForm$3(this, str, str2, z, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MandateCollectionScreen(USBankAccountFormScreenState.MandateCollection mandateCollection, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-55447596);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-55447596, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.MandateCollectionScreen (USBankAccountFormFragment.kt:262)");
        }
        InterfaceC41563gV2 m114255n = BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
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
        mo89518u.mo89638F(11372318);
        NameAndEmailForm(mandateCollection.getName(), mandateCollection.getEmail(), mo89518u, 512);
        AccountDetailsForm(mandateCollection.getPaymentAccount().getInstitutionName(), mandateCollection.getPaymentAccount().getLast4(), mandateCollection.getSaveForFutureUsage(), mo89518u, 4096);
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
            mo89512w.mo20405a(new USBankAccountFormFragment$MandateCollectionScreen$2(this, mandateCollection, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void NameAndEmailCollectionScreen(USBankAccountFormScreenState.NameAndEmailCollection nameAndEmailCollection, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-320058200);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-320058200, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.NameAndEmailCollectionScreen (USBankAccountFormFragment.kt:253)");
        }
        InterfaceC41563gV2 m114255n = BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
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
        mo89518u.mo89638F(1655885682);
        NameAndEmailForm(nameAndEmailCollection.getName(), nameAndEmailCollection.getEmail(), mo89518u, 512);
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
            mo89512w.mo20405a(new USBankAccountFormFragment$NameAndEmailCollectionScreen$2(this, nameAndEmailCollection, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void NameAndEmailForm(String str, String str2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2097962352);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2097962352, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.NameAndEmailForm (USBankAccountFormFragment.kt:304)");
        }
        InterfaceC48627sP5 m105206a = GM5.m105206a(getViewModel().getProcessing(), Boolean.FALSE, null, mo89518u, 56, 2);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
        mo89518u.mo89638F(-483455358);
        C25777lo.InterfaceC25789l m26802g = C25777lo.f96729a.m26802g();
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
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(-317868666);
        H6TextKt.H6Text(C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_pay_with_bank_title, mo89518u, 0), ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(16), 0.0f, C43705k61.m29303g(8), 5, null), mo89518u, 48, 0);
        float f = 0;
        InterfaceC41563gV2 m94184i = ND3.m94184i(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(f));
        InterfaceC4360K9 m99140f = c4361a.m99140f();
        mo89518u.mo89638F(733328855);
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99140f, false, mo89518u, 6);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94184i);
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
        C38680bf6.m64191b(m64192a2, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        mo89518u.mo89638F(-1887262452);
        TextFieldController nameController = getViewModel().getNameController();
        nameController.onRawValueChange(str);
        FY1.C2347a c2347a = FY1.f9619b;
        TextFieldUIKt.m116751TextFieldSectionuGujYS0(nameController, c2347a.m107000d(), !((Boolean) m105206a.getValue()).booleanValue(), null, null, null, mo89518u, 8, 56);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        InterfaceC41563gV2 m94184i2 = ND3.m94184i(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(f));
        InterfaceC4360K9 m99140f2 = c4361a.m99140f();
        mo89518u.mo89638F(733328855);
        InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(m99140f2, false, mo89518u, 6);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m94184i2);
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
        C38680bf6.m64191b(m64192a3, m44729h2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-2137368960);
        mo89518u.mo89638F(1284550275);
        TextFieldController emailController = getViewModel().getEmailController();
        emailController.onRawValueChange(str2 == null ? "" : str2);
        TextFieldUIKt.m116751TextFieldSectionuGujYS0(emailController, c2347a.m107002b(), !((Boolean) m105206a.getValue()).booleanValue(), null, null, null, mo89518u, 8, 56);
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
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new USBankAccountFormFragment$NameAndEmailForm$2(this, str, str2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SavedAccountScreen(USBankAccountFormScreenState.SavedAccount savedAccount, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1118027480);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1118027480, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.SavedAccountScreen (USBankAccountFormFragment.kt:290)");
        }
        InterfaceC41563gV2 m114255n = BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
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
        mo89518u.mo89638F(-1769698062);
        NameAndEmailForm(savedAccount.getName(), savedAccount.getEmail(), mo89518u, 512);
        AccountDetailsForm(savedAccount.getBankName(), savedAccount.getLast4(), savedAccount.getSaveForFutureUsage(), mo89518u, 4096);
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
            mo89512w.mo20405a(new USBankAccountFormFragment$SavedAccountScreen$2(this, savedAccount, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void VerifyWithMicrodepositsScreen(USBankAccountFormScreenState.VerifyWithMicrodeposits verifyWithMicrodeposits, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1449098348);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1449098348, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.VerifyWithMicrodepositsScreen (USBankAccountFormFragment.kt:276)");
        }
        InterfaceC41563gV2 m114255n = BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
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
        mo89518u.mo89638F(1955624118);
        NameAndEmailForm(verifyWithMicrodeposits.getName(), verifyWithMicrodeposits.getEmail(), mo89518u, 512);
        AccountDetailsForm(verifyWithMicrodeposits.getPaymentAccount().getBankName(), verifyWithMicrodeposits.getPaymentAccount().getLast4(), verifyWithMicrodeposits.getSaveForFutureUsage(), mo89518u, 4096);
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
            mo89512w.mo20405a(new USBankAccountFormFragment$VerifyWithMicrodepositsScreen$2(this, verifyWithMicrodeposits, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClientSecret getClientSecret() {
        return (ClientSecret) this.clientSecret$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCompletePayment() {
        return ((Boolean) this.completePayment$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormArguments getFormArgs() {
        return (FormArguments) this.formArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C11759u.InterfaceC11763b getPaymentOptionsViewModelFactory() {
        return (C11759u.InterfaceC11763b) this.paymentOptionsViewModelFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C11759u.InterfaceC11763b getPaymentSheetViewModelFactory() {
        return (C11759u.InterfaceC11763b) this.paymentSheetViewModelFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseSheetViewModel getSheetViewModel() {
        return (BaseSheetViewModel) this.sheetViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final USBankAccountFormViewModel getViewModel() {
        return (USBankAccountFormViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScreenStateChanged(USBankAccountFormScreenState uSBankAccountFormScreenState) {
        boolean z;
        BaseSheetViewModel sheetViewModel = getSheetViewModel();
        if (sheetViewModel != null) {
            sheetViewModel.onError(uSBankAccountFormScreenState.getError());
        }
        boolean z2 = uSBankAccountFormScreenState instanceof USBankAccountFormScreenState.NameAndEmailCollection;
        boolean z3 = true;
        if (!z2 && !getCompletePayment()) {
            z = false;
        } else {
            z = true;
        }
        if (z2) {
            z3 = getViewModel().getRequiredFields().getValue().booleanValue();
        }
        updatePrimaryButton(uSBankAccountFormScreenState.getPrimaryButtonText(), new USBankAccountFormFragment$handleScreenStateChanged$1(this, uSBankAccountFormScreenState), z, z3);
        updateMandateText(uSBankAccountFormScreenState.getMandateText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r5 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateMandateText(String str) {
        String str2;
        String str3;
        if (getViewModel().getCurrentScreenState().getValue() instanceof USBankAccountFormScreenState.VerifyWithMicrodeposits) {
            str2 = getString(C19159R.string.stripe_paymentsheet_microdeposit, getViewModel().formattedMerchantName());
        } else {
            str2 = "";
        }
        Intrinsics.checkNotNullExpressionValue(str2, "if (viewModel.currentScr…         \"\"\n            }");
        if (str != null) {
            str3 = StringsKt__IndentKt.trimIndent("\n                " + str2 + "\n                \n                " + str + "\n            ");
        }
        str3 = null;
        BaseSheetViewModel sheetViewModel = getSheetViewModel();
        if (sheetViewModel != null) {
            sheetViewModel.updateBelowButtonText(str3);
        }
    }

    private final void updatePrimaryButton(String str, Function0<Unit> function0, boolean z, boolean z2) {
        BaseSheetViewModel sheetViewModel = getSheetViewModel();
        if (sheetViewModel != null) {
            sheetViewModel.updatePrimaryButtonState(PrimaryButton.State.Ready.INSTANCE);
        }
        BaseSheetViewModel sheetViewModel2 = getSheetViewModel();
        if (sheetViewModel2 != null) {
            sheetViewModel2.updateCustomPrimaryButtonUiState(new USBankAccountFormFragment$updatePrimaryButton$1(str, z2, this, z, function0));
        }
    }

    public static /* synthetic */ void updatePrimaryButton$default(USBankAccountFormFragment uSBankAccountFormFragment, String str, Function0 function0, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        uSBankAccountFormFragment.updatePrimaryButton(str, function0, z, z2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getViewModel().registerFragment(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new USBankAccountFormFragment$onCreateView$1$1(this, null), 3, null);
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new USBankAccountFormFragment$onCreateView$1$2(this, null), 3, null);
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new USBankAccountFormFragment$onCreateView$1$3(this, null), 3, null);
        composeView.setContent(C43575jt0.m29790c(-347787972, true, new USBankAccountFormFragment$onCreateView$1$4(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        BaseSheetViewModel sheetViewModel = getSheetViewModel();
        if (sheetViewModel != null) {
            sheetViewModel.resetUSBankPrimaryButton();
        }
        getViewModel().onDestroy();
        super.onDetach();
    }
}
