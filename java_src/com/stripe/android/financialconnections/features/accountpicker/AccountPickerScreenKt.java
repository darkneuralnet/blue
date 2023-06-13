package com.stripe.android.financialconnections.features.accountpicker;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutKt;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import p000.C25777lo;
import p000.C45449n26;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a¡\u0001\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00000\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\u0002\u001a¥\u0001\u0010&\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0004\b&\u0010'\u001a?\u0010(\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u0005H\u0003¢\u0006\u0004\b(\u0010)\u001aU\u0010*\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u001b\u001a\u00020\u0015H\u0003¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0015H\u0003¢\u0006\u0004\b-\u0010.\u001a\u0017\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0015H\u0003¢\u0006\u0004\b/\u0010.\u001aL\u00105\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00152\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u00101\u001a\u00020\u00192\u0017\u00104\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0002\b3H\u0003¢\u0006\u0004\b5\u00106\u001a%\u00108\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\"072\u0006\u00101\u001a\u00020\u0019H\u0003¢\u0006\u0004\b8\u00109\u001a\u000f\u0010:\u001a\u00020\u0000H\u0001¢\u0006\u0004\b:\u0010\u0002\u001a\u000f\u0010;\u001a\u00020\u0000H\u0001¢\u0006\u0004\b;\u0010\u0002\u001a\u000f\u0010<\u001a\u00020\u0000H\u0001¢\u0006\u0004\b<\u0010\u0002¨\u0006="}, m28432d2 = {"", "AccountPickerScreen", "(LEt0;I)V", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", TransferTable.COLUMN_STATE, "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "onAccountClicked", "Lkotlin/Function0;", "onSubmit", "onSelectAllAccountsClicked", "onSelectAnotherBank", "onEnterDetailsManually", "onLoadAccountsAgain", "onCloseClick", "onLearnMoreAboutDataAccessClick", "", "onCloseFromErrorClick", "AccountPickerContent", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "AccountPickerLoading", "", "submitEnabled", "submitLoading", "", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;", "accounts", "allAccountsSelected", "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "accessibleDataCalloutModel", "requiresSingleAccountConfirmation", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;", "selectionMode", "", "", "selectedIds", "Lcom/stripe/android/financialconnections/ui/TextResource;", "subtitle", "AccountPickerLoaded", "(ZZLjava/util/List;ZLcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;LEt0;II)V", "SingleSelectContent", "(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;LEt0;I)V", "MultiSelectContent", "(Ljava/util/List;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLEt0;I)V", "checked", "FinancialConnectionCheckbox", "(ZLEt0;I)V", "FinancialConnectionRadioButton", "selected", "accountUI", "LZc5;", "Lkotlin/ExtensionFunctionType;", "selectorContent", "AccountItem", "(ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;Lkotlin/jvm/functions/Function3;LEt0;I)V", "Lkotlin/Pair;", "getAccountTexts", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;LEt0;I)Lkotlin/Pair;", "AccountPickerPreviewMultiSelect", "AccountPickerPreviewSingleSelect", "AccountPickerPreviewSingleSelectWithConfirm", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccountPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,521:1\n53#2:522\n54#2,15:524\n69#2,8:545\n79#2:556\n80#2,5:559\n76#3:523\n76#3:575\n76#3:608\n76#3:674\n76#3:708\n76#3:742\n83#4,3:539\n50#4:557\n49#4:558\n460#4,13:587\n460#4,13:620\n473#4,3:636\n473#4,3:642\n460#4,13:686\n460#4,13:720\n460#4,13:754\n473#4,3:769\n473#4,3:774\n473#4,3:779\n1057#5,3:542\n1060#5,3:553\n1057#5,3:651\n1060#5,3:655\n1057#5,3:658\n1060#5,3:662\n154#6:564\n154#6:565\n154#6:566\n154#6:567\n154#6:634\n154#6:635\n154#6:641\n154#6:647\n154#6:648\n154#6:649\n154#6:650\n154#6:654\n154#6:661\n154#6:665\n154#6:666\n154#6:734\n154#6:768\n74#7,6:568\n80#7:600\n74#7,6:601\n80#7:633\n84#7:640\n84#7:646\n74#7,6:735\n80#7:767\n84#7:773\n75#8:574\n76#8,11:576\n75#8:607\n76#8,11:609\n89#8:639\n89#8:645\n75#8:673\n76#8,11:675\n75#8:707\n76#8,11:709\n75#8:741\n76#8,11:743\n89#8:772\n89#8:777\n89#8:782\n67#9,6:667\n73#9:699\n77#9:783\n74#10,7:700\n81#10:733\n85#10:778\n*S KotlinDebug\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt\n*L\n69#1:522\n69#1:524,15\n69#1:545,8\n69#1:556\n69#1:559,5\n69#1:523\n180#1:575\n190#1:608\n385#1:674\n400#1:708\n407#1:742\n69#1:539,3\n69#1:557\n69#1:558\n180#1:587,13\n190#1:620,13\n190#1:636,3\n180#1:642,3\n385#1:686,13\n400#1:720,13\n407#1:754,13\n407#1:769,3\n400#1:774,3\n385#1:779,3\n69#1:542,3\n69#1:553,3\n383#1:651,3\n383#1:655,3\n384#1:658,3\n384#1:662,3\n184#1:564\n185#1:565\n186#1:566\n187#1:567\n209#1:634\n217#1:635\n241#1:641\n269#1:647\n270#1:648\n296#1:649\n297#1:650\n383#1:654\n384#1:661\n390#1:665\n398#1:666\n405#1:734\n422#1:768\n180#1:568,6\n180#1:600\n190#1:601,6\n190#1:633\n190#1:640\n180#1:646\n407#1:735,6\n407#1:767\n407#1:773\n180#1:574\n180#1:576,11\n190#1:607\n190#1:609,11\n190#1:639\n180#1:645\n385#1:673\n385#1:675,11\n400#1:707\n400#1:709,11\n407#1:741\n407#1:743,11\n407#1:772\n400#1:777\n385#1:782\n385#1:667,6\n385#1:699\n385#1:783\n400#1:700,7\n400#1:733\n400#1:778\n*E\n"})
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountPickerState.SelectionMode.values().length];
            try {
                iArr[AccountPickerState.SelectionMode.RADIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountPickerState.SelectionMode.CHECKBOXES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountItem(boolean z, Function1<? super PartnerAccount, Unit> function1, AccountPickerState.PartnerAccountUI partnerAccountUI, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float f;
        long m116462getBorderDefault0d7_KjU;
        int i3;
        long m116471getTextDisabled0d7_KjU;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(863743201);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(863743201, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountItem (AccountPickerScreen.kt:374)");
        }
        PartnerAccount account = partnerAccountUI.getAccount();
        boolean mo89539n = mo89518u.mo89539n(account);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            if (account.getDisplayableAccountNumbers() != null) {
                i2 = 10;
            } else {
                i2 = 12;
            }
            mo89635G = C43705k61.m29306d(C43705k61.m29303g(i2));
            mo89518u.mo89503z(mo89635G);
        }
        float m29298l = ((C43705k61) mo89635G).m29298l();
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = C39242cc5.m61172d(C43705k61.m29303g(8));
            mo89518u.mo89503z(mo89635G2);
        }
        C38649bc5 c38649bc5 = (C38649bc5) mo89635G2;
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(BB5.m114255n(c20912a, 0.0f, 1, null), c38649bc5);
        if (z) {
            f = 2;
        } else {
            f = 1;
        }
        float m29303g = C43705k61.m29303g(f);
        if (z) {
            m116462getBorderDefault0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU();
        } else {
            m116462getBorderDefault0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU();
        }
        InterfaceC41563gV2 m70814e = C38131ak0.m70814e(C19783dZ.m44155g(m88106a, m29303g, m116462getBorderDefault0d7_KjU, c38649bc5), partnerAccountUI.getAccount().getAllowSelection$financial_connections_release(), null, null, new AccountPickerScreenKt$AccountItem$1(function1, account), 6, null);
        float f2 = 16;
        InterfaceC41563gV2 m94183j = ND3.m94183j(m70814e, C43705k61.m29303g(f2), m29298l);
        mo89518u.mo89638F(733328855);
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94183j);
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
        mo89518u.mo89638F(326028571);
        C25777lo c25777lo = C25777lo.f96729a;
        C25777lo.InterfaceC25781d m26803f = c25777lo.m26803f();
        InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26803f, m99138h, mo89518u, 54);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(c20912a);
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
        mo89518u.mo89638F(-1920443593);
        function3.invoke(c38066ad5, mo89518u, Integer.valueOf(((i >> 6) & 112) | 6));
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f2)), mo89518u, 6);
        Pair<String, String> accountTexts = getAccountTexts(partnerAccountUI, mo89518u, 8);
        String component1 = accountTexts.component1();
        String component2 = accountTexts.component2();
        InterfaceC41563gV2 m72851b = InterfaceC37486Zc5.m72851b(c38066ad5, c20912a, 0.7f, false, 2, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m72851b);
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
        C38680bf6.m64191b(m64192a3, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(1733529089);
        C45449n26.C26354a c26354a = C45449n26.f99264a;
        int m24539b = c26354a.m24539b();
        if (partnerAccountUI.getAccount().getAllowSelection$financial_connections_release()) {
            mo89518u.mo89638F(1986309031);
            i3 = 6;
            m116471getTextDisabled0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU();
            mo89518u.mo89605Q();
        } else {
            i3 = 6;
            mo89518u.mo89638F(1986309103);
            m116471getTextDisabled0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116471getTextDisabled0d7_KjU();
            mo89518u.mo89605Q();
        }
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        C38909c26.m62000e(component1, null, m116471getTextDisabled0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, m24539b, false, 1, null, financialConnectionsTheme.getTypography(mo89518u, i3).getBodyEmphasized(), mo89518u, 0, 3120, 22522);
        if (component2 != null) {
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(4)), mo89518u, 6);
            C38909c26.m62000e(component2, null, financialConnectionsTheme.getColors(mo89518u, 6).m116471getTextDisabled0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, c26354a.m24539b(), false, 1, null, financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionTight(), mo89518u, 0, 3120, 22522);
            Unit unit = Unit.INSTANCE;
        }
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
            mo89512w.mo20405a(new AccountPickerScreenKt$AccountItem$3(z, function1, partnerAccountUI, function3, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountPickerContent(AccountPickerState accountPickerState, Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function1<? super Throwable, Unit> function12, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1964060466);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1964060466, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerContent (AccountPickerScreen.kt:87)");
        }
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, 1204520125, true, new AccountPickerScreenKt$AccountPickerContent$1(function06, i)), C43575jt0.m29791b(mo89518u, -1049787519, true, new AccountPickerScreenKt$AccountPickerContent$2(accountPickerState, function1, function02, function0, function07, i, function03, function04, function05, function12)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new AccountPickerScreenKt$AccountPickerContent$3(accountPickerState, function1, function0, function02, function03, function04, function05, function06, function07, function12, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountPickerLoaded(boolean z, boolean z2, List<AccountPickerState.PartnerAccountUI> list, boolean z3, AccessibleDataCalloutModel accessibleDataCalloutModel, boolean z4, AccountPickerState.SelectionMode selectionMode, Set<String> set, Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, TextResource textResource, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(312066498);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(312066498, i, i2, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoaded (AccountPickerScreen.kt:164)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 24;
        InterfaceC41563gV2 m94181l = ND3.m94181l(BB5.m114257l(c20912a, 0.0f, 1, null), C43705k61.m29303g(f), C43705k61.m29303g(16), C43705k61.m29303g(f), C43705k61.m29303g(f));
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
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94181l);
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
        mo89518u.mo89638F(-580766452);
        InterfaceC41563gV2 m89798b = InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m89798b);
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
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        mo89518u.mo89638F(-2065795242);
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
        if (z4) {
            i3 = C18634R.string.stripe_account_picker_confirm_account;
        } else if (!z4) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[selectionMode.ordinal()];
            if (i4 == 1) {
                i3 = C18634R.string.stripe_account_picker_singleselect_account;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                i3 = C18634R.string.stripe_account_picker_multiselect_account;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String m41310c = C40946fS5.m41310c(i3, mo89518u, 0);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        C38909c26.m62000e(m41310c, m114255n, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getSubtitle(), mo89518u, 48, 0, 32764);
        mo89518u.mo89638F(-28422731);
        if (textResource != null) {
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(8)), mo89518u, 6);
            C38909c26.m62000e(textResource.toText(mo89518u, 0).toString(), BB5.m114255n(c20912a, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getBody(), mo89518u, 48, 0, 32764);
            Unit unit = Unit.INSTANCE;
        }
        mo89518u.mo89605Q();
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
        int i5 = WhenMappings.$EnumSwitchMapping$0[selectionMode.ordinal()];
        if (i5 == 1) {
            mo89518u.mo89638F(-28422288);
            SingleSelectContent(list, set, function1, mo89518u, ((i >> 18) & 896) | 72);
            mo89518u.mo89605Q();
            Unit unit2 = Unit.INSTANCE;
        } else if (i5 != 2) {
            mo89518u.mo89638F(-28421725);
            mo89518u.mo89605Q();
            Unit unit3 = Unit.INSTANCE;
        } else {
            mo89518u.mo89638F(-28422060);
            int i6 = i >> 18;
            MultiSelectContent(list, set, function1, function0, z3, mo89518u, (i6 & 7168) | (i6 & 896) | 72 | ((i << 3) & 57344));
            mo89518u.mo89605Q();
            Unit unit4 = Unit.INSTANCE;
        }
        DN5.m110552a(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), mo89518u, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89638F(-1908883228);
        if (accessibleDataCalloutModel != null) {
            AccessibleDataCalloutKt.AccessibleDataCallout(accessibleDataCalloutModel, function03, mo89518u, (i2 & 112) | 8);
        }
        mo89518u.mo89605Q();
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(12)), mo89518u, 6);
        int i7 = i << 12;
        ButtonKt.FinancialConnectionsButton(function02, BB5.m114255n(c20912a, 0.0f, 1, null), null, null, z, z2, C43575jt0.m29791b(mo89518u, -1843467949, true, new AccountPickerScreenKt$AccountPickerLoaded$1$3(z4, set)), mo89518u, (i2 & 14) | 1572912 | (i7 & 57344) | (i7 & ImageMetadata.JPEG_GPS_COORDINATES), 12);
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
        mo89512w.mo20405a(new AccountPickerScreenKt$AccountPickerLoaded$2(z, z2, list, z3, accessibleDataCalloutModel, z4, selectionMode, set, function1, function0, function02, function03, textResource, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountPickerLoading(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(663154215);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(663154215, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoading (AccountPickerScreen.kt:155)");
            }
            LoadingContentKt.LoadingContent(null, C40946fS5.m41310c(C18634R.string.stripe_account_picker_loading_title, mo89518u, 0), C40946fS5.m41310c(C18634R.string.stripe_account_picker_loading_desc, mo89518u, 0), mo89518u, 0, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$AccountPickerLoading$1(i));
        }
    }

    public static final void AccountPickerPreviewMultiSelect(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1346693732);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1346693732, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreviewMultiSelect (AccountPickerScreen.kt:461)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccountPickerScreenKt.INSTANCE.m116353getLambda3$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$AccountPickerPreviewMultiSelect$1(i));
        }
    }

    public static final void AccountPickerPreviewSingleSelect(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1977748841);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1977748841, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreviewSingleSelect (AccountPickerScreen.kt:483)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccountPickerScreenKt.INSTANCE.m116354getLambda4$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$AccountPickerPreviewSingleSelect$1(i));
        }
    }

    public static final void AccountPickerPreviewSingleSelectWithConfirm(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1302060091);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1302060091, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerPreviewSingleSelectWithConfirm (AccountPickerScreen.kt:505)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$AccountPickerScreenKt.INSTANCE.m116355getLambda5$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18664x585ba9c2(i));
        }
    }

    public static final void AccountPickerScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment;
        Object c27850r6;
        Object obj;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-11072579);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-11072579, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreen (AccountPickerScreen.kt:67)");
            }
            mo89518u.mo89638F(512170640);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
            ComponentActivity m12477f = C49199tN2.m12477f((Context) mo89518u.mo89572c(C11411h.m68324g()));
            if (m12477f != null) {
                Object obj2 = null;
                if (lifecycleOwner instanceof InterfaceC37154Xr6) {
                    interfaceC37154Xr6 = (InterfaceC37154Xr6) lifecycleOwner;
                } else {
                    interfaceC37154Xr6 = null;
                }
                if (interfaceC37154Xr6 != null) {
                    if (lifecycleOwner instanceof InterfaceC35200Pi5) {
                        interfaceC35200Pi5 = (InterfaceC35200Pi5) lifecycleOwner;
                    } else {
                        interfaceC35200Pi5 = null;
                    }
                    if (interfaceC35200Pi5 != null) {
                        C11966a savedStateRegistry = interfaceC35200Pi5.getSavedStateRegistry();
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountPickerViewModel.class);
                        View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                        Object[] objArr = {lifecycleOwner, m12477f, interfaceC37154Xr6, savedStateRegistry};
                        mo89518u.mo89638F(-568225417);
                        boolean z = false;
                        for (int i2 = 0; i2 < 4; i2++) {
                            z |= mo89518u.mo89539n(objArr[i2]);
                        }
                        Object mo89635G = mo89518u.mo89635G();
                        if (z || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                            if (lifecycleOwner instanceof Fragment) {
                                fragment = (Fragment) lifecycleOwner;
                            } else {
                                fragment = null;
                            }
                            if (fragment == null) {
                                fragment = C49199tN2.m12476g(view);
                            }
                            Fragment fragment2 = fragment;
                            if (fragment2 != null) {
                                Bundle arguments = fragment2.getArguments();
                                if (arguments != null) {
                                    obj = arguments.get("mavericks:arg");
                                } else {
                                    obj = null;
                                }
                                c27850r6 = new C33000Fy1(m12477f, obj, fragment2, null, null, 24, null);
                            } else {
                                Bundle extras = m12477f.getIntent().getExtras();
                                if (extras != null) {
                                    obj2 = extras.get("mavericks:arg");
                                }
                                c27850r6 = new C27850r6(m12477f, obj2, interfaceC37154Xr6, savedStateRegistry);
                            }
                            mo89635G = c27850r6;
                            mo89518u.mo89503z(mo89635G);
                        }
                        mo89518u.mo89605Q();
                        AbstractC35282Pr6 abstractC35282Pr6 = (AbstractC35282Pr6) mo89635G;
                        mo89518u.mo89638F(511388516);
                        boolean mo89539n = mo89518u.mo89539n(orCreateKotlinClass) | mo89518u.mo89539n(abstractC35282Pr6);
                        Object mo89635G2 = mo89518u.mo89635G();
                        if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                            YN2 yn2 = YN2.f45797a;
                            Class javaClass = JvmClassMappingKt.getJavaClass(orCreateKotlinClass);
                            String name = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getName();
                            Intrinsics.checkNotNullExpressionValue(name, "keyFactory?.invoke() ?: viewModelClass.java.name");
                            mo89635G2 = YN2.m75139c(yn2, javaClass, AccountPickerState.class, abstractC35282Pr6, name, false, null, 48, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) ((RN2) mo89635G2);
                        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
                        C7582Sv.m84651a(true, AccountPickerScreenKt$AccountPickerScreen$1.INSTANCE, mo89518u, 54, 0);
                        AccountPickerContent((AccountPickerState) C49199tN2.m12481b(accountPickerViewModel, mo89518u, 8).getValue(), new AccountPickerScreenKt$AccountPickerScreen$2(accountPickerViewModel), new AccountPickerScreenKt$AccountPickerScreen$3(accountPickerViewModel), new AccountPickerScreenKt$AccountPickerScreen$4(accountPickerViewModel), new AccountPickerScreenKt$AccountPickerScreen$5(accountPickerViewModel), new AccountPickerScreenKt$AccountPickerScreen$6(accountPickerViewModel), new AccountPickerScreenKt$AccountPickerScreen$7(accountPickerViewModel), new AccountPickerScreenKt$AccountPickerScreen$10(parentViewModel), new AccountPickerScreenKt$AccountPickerScreen$9(accountPickerViewModel), new AccountPickerScreenKt$AccountPickerScreen$8(parentViewModel), mo89518u, 8);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                    } else {
                        throw new IllegalStateException("LifecycleOwner must be a SavedStateRegistryOwner!".toString());
                    }
                } else {
                    throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
                }
            } else {
                throw new IllegalStateException("Composable is not hosted in a ComponentActivity!".toString());
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$AccountPickerScreen$11(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinancialConnectionCheckbox(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1443170678);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1443170678, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.FinancialConnectionCheckbox (AccountPickerScreen.kt:337)");
            }
            SE0.m85819b(Boolean.valueOf(z), null, null, ComposableSingletons$AccountPickerScreenKt.INSTANCE.m116351getLambda1$financial_connections_release(), mo89518u, (i2 & 14) | 3072, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$FinancialConnectionCheckbox$1(z, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinancialConnectionRadioButton(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1240343362);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1240343362, i2, -1, "com.stripe.android.financialconnections.features.accountpicker.FinancialConnectionRadioButton (AccountPickerScreen.kt:355)");
            }
            SE0.m85819b(Boolean.valueOf(z), null, null, ComposableSingletons$AccountPickerScreenKt.INSTANCE.m116352getLambda2$financial_connections_release(), mo89518u, (i2 & 14) | 3072, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$FinancialConnectionRadioButton$1(z, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MultiSelectContent(List<AccountPickerState.PartnerAccountUI> list, Set<String> set, Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-128741363);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-128741363, i, -1, "com.stripe.android.financialconnections.features.accountpicker.MultiSelectContent (AccountPickerScreen.kt:287)");
        }
        float f = 12;
        C41738gn2.m37481a(null, null, ND3.m94188e(0.0f, 0.0f, 0.0f, C43705k61.m29303g(f), 7, null), false, C25777lo.f96729a.m26795n(C43705k61.m29303g(f)), null, null, false, new AccountPickerScreenKt$MultiSelectContent$1(list, z, function0, i, set, function1), mo89518u, 24960, 235);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$MultiSelectContent$2(list, set, function1, function0, z, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SingleSelectContent(List<AccountPickerState.PartnerAccountUI> list, Set<String> set, Function1<? super PartnerAccount, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2127539056);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2127539056, i, -1, "com.stripe.android.financialconnections.features.accountpicker.SingleSelectContent (AccountPickerScreen.kt:262)");
        }
        float f = 12;
        C41738gn2.m37481a(null, null, ND3.m94188e(0.0f, 0.0f, 0.0f, C43705k61.m29303g(f), 7, null), false, C25777lo.f96729a.m26795n(C43705k61.m29303g(f)), null, null, false, new AccountPickerScreenKt$SingleSelectContent$1(list, set, function1, i), mo89518u, 24960, 235);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AccountPickerScreenKt$SingleSelectContent$2(list, set, function1, i));
        }
    }

    private static final Pair<String, String> getAccountTexts(AccountPickerState.PartnerAccountUI partnerAccountUI, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String str;
        boolean z;
        String str2;
        interfaceC32720Et0.mo89638F(-60184840);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-60184840, i, -1, "com.stripe.android.financialconnections.features.accountpicker.getAccountTexts (AccountPickerScreen.kt:436)");
        }
        PartnerAccount account = partnerAccountUI.getAccount();
        if (account.getAllowSelection$financial_connections_release() && partnerAccountUI.getFormattedBalance() == null) {
            str = account.getName();
        } else {
            str = account.getName() + " " + account.getEncryptedNumbers$financial_connections_release();
        }
        if (!account.getAllowSelection$financial_connections_release()) {
            str2 = account.getAllowSelectionMessage();
        } else if (partnerAccountUI.getFormattedBalance() != null) {
            str2 = partnerAccountUI.getFormattedBalance();
        } else {
            if (account.getEncryptedNumbers$financial_connections_release().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = account.getEncryptedNumbers$financial_connections_release();
            } else {
                str2 = null;
            }
        }
        Pair<String, String> m28425to = TuplesKt.m28425to(str, str2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m28425to;
    }
}
