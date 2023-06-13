package com.stripe.android.financialconnections.features.institutionpicker;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.focus.C11298b;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.p041ui.components.TextFieldKt;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC39020cE1;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u009f\u0001\u0010\u0015\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00000\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0091\u0001\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00000\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00000\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a[\u0010\u001e\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u001d\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0003¢\u0006\u0004\b \u0010!\u001a+\u0010#\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\"\u001a\u00020\u000fH\u0003¢\u0006\u0004\b#\u0010$\u001a?\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000eH\u0003¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010+\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010-\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b-\u0010,\u001a\u0019\u0010.\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b.\u0010,\u001a\u0019\u0010/\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b/\u0010,\u001a\u0019\u00100\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b0\u0010,\u001a\u0019\u00101\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b1\u0010,\u001a\u0019\u00102\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b2\u0010,¨\u00063"}, m28432d2 = {"", "InstitutionPickerScreen", "(LEt0;I)V", "Ldp;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "payload", "Lkotlin/Function0;", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "institutionsProvider", "", "searchMode", "Lkotlin/Function1;", "", "onQueryChanged", "Lkotlin/Function2;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "onInstitutionSelected", "onCancelSearchClick", "onCloseClick", "onSearchFocused", "onManualEntryClick", "InstitutionPickerContent", "(Ldp;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "LoadedContent", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldp;Lkotlin/jvm/functions/Function0;LEt0;I)V", "LF16;", "query", "FinancialConnectionsSearchRow", "(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLEt0;I)V", "manualEntryEnabled", "SearchInstitutionsList", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLEt0;I)V", "SearchInstitutionsFailedRow", "(ZLkotlin/jvm/functions/Function0;LEt0;I)V", "institution", "InstitutionResultTile", "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;LEt0;I)V", "LgV2;", "modifier", "FeaturedInstitutionsGrid", "(LgV2;Ldp;Lkotlin/jvm/functions/Function2;LEt0;I)V", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", TransferTable.COLUMN_STATE, "InitialLoading", "(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V", "SearchModeSearchingInstitutions", "SearchModeWithResults", "SearchModeNoResults", "SearchModeFailed", "SearchModeNoQuery", "NoSearchMode", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInstitutionPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,617:1\n53#2:618\n54#2,15:620\n69#2,8:641\n79#2:652\n80#2,5:655\n76#3:619\n76#3:660\n76#3:690\n76#3:732\n76#3:741\n76#3:802\n76#3:855\n76#3:883\n76#3:893\n83#4,3:635\n50#4:653\n49#4:654\n36#4:661\n50#4:674\n49#4:675\n460#4,13:702\n50#4:719\n49#4:720\n473#4,3:727\n460#4,13:753\n36#4:767\n36#4:774\n473#4,3:781\n83#4,3:787\n460#4,13:814\n36#4:828\n473#4,3:835\n460#4,13:867\n460#4,13:905\n473#4,3:919\n473#4,3:924\n1057#5,3:638\n1060#5,3:649\n1057#5,6:662\n1057#5,6:668\n1057#5,6:676\n1057#5,6:721\n1057#5,6:768\n1057#5,6:775\n1057#5,6:790\n1057#5,6:829\n1057#5,6:840\n73#6,7:682\n80#6:715\n84#6:731\n78#6,2:799\n80#6:827\n84#6:839\n73#6,7:885\n80#6:918\n84#6:923\n75#7:689\n76#7,11:691\n89#7:730\n75#7:740\n76#7,11:742\n89#7:784\n75#7:801\n76#7,11:803\n89#7:838\n75#7:854\n76#7,11:856\n75#7:892\n76#7,11:894\n89#7:922\n89#7:927\n154#8:716\n154#8:717\n154#8:718\n154#8:733\n154#8:786\n154#8:796\n154#8:797\n154#8:798\n154#8:846\n154#8:847\n154#8:881\n154#8:882\n154#8:884\n154#8:929\n154#8:930\n154#8:931\n154#8:932\n154#8:933\n75#9,6:734\n81#9:766\n85#9:785\n75#9,6:848\n81#9:880\n85#9:928\n76#10:934\n76#10:935\n102#10,2:936\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt\n*L\n84#1:618\n84#1:620,15\n84#1:641,8\n84#1:652\n84#1:655,5\n84#1:619\n89#1:660\n155#1:690\n205#1:732\n206#1:741\n318#1:802\n365#1:855\n380#1:883\n387#1:893\n84#1:635,3\n84#1:653\n84#1:654\n97#1:661\n154#1:674\n154#1:675\n155#1:702,13\n171#1:719\n171#1:720\n155#1:727,3\n206#1:753,13\n237#1:767\n247#1:774\n206#1:781,3\n263#1:787,3\n318#1:814,13\n344#1:828\n318#1:835,3\n365#1:867,13\n387#1:905,13\n387#1:919,3\n365#1:924,3\n84#1:638,3\n84#1:649,3\n97#1:662,6\n153#1:668,6\n154#1:676,6\n171#1:721,6\n237#1:768,6\n247#1:775,6\n263#1:790,6\n344#1:829,6\n369#1:840,6\n155#1:682,7\n155#1:715\n155#1:731\n318#1:799,2\n318#1:827\n318#1:839\n387#1:885,7\n387#1:918\n387#1:923\n155#1:689\n155#1:691,11\n155#1:730\n206#1:740\n206#1:742,11\n206#1:784\n318#1:801\n318#1:803,11\n318#1:838\n365#1:854\n365#1:856,11\n387#1:892\n387#1:894,11\n387#1:922\n365#1:927\n157#1:716\n160#1:717\n166#1:718\n208#1:733\n262#1:786\n322#1:796\n323#1:797\n326#1:798\n371#1:846\n372#1:847\n376#1:881\n377#1:882\n386#1:884\n414#1:929\n415#1:930\n416#1:931\n418#1:932\n419#1:933\n206#1:734,6\n206#1:766\n206#1:785\n365#1:848,6\n365#1:880\n365#1:928\n86#1:934\n153#1:935\n153#1:936,2\n*E\n"})
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void FeaturedInstitutionsGrid(InterfaceC41563gV2 interfaceC41563gV2, AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1450890798);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1450890798, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.FeaturedInstitutionsGrid (InstitutionPickerScreen.kt:404)");
        }
        InterfaceC39020cE1.C13475a c13475a = new InterfaceC39020cE1.C13475a(2);
        float f = 24;
        PD3 m94188e = ND3.m94188e(C43705k61.m29303g(f), C43705k61.m29303g(16), C43705k61.m29303g(f), 0.0f, 8, null);
        C25777lo c25777lo = C25777lo.f96729a;
        float f2 = 8;
        C43517jn2.m29929a(c13475a, interfaceC41563gV2, null, m94188e, false, c25777lo.m26795n(C43705k61.m29303g(f2)), c25777lo.m26795n(C43705k61.m29303g(f2)), null, false, new InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1(abstractC19862dp, function2, i), mo89518u, ((i << 3) & 112) | 1769472, Constants.NO_SUCH_BUCKET_STATUS_CODE);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$FeaturedInstitutionsGrid$2(interfaceC41563gV2, abstractC19862dp, function2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinancialConnectionsSearchRow(F16 f16, Function1<? super F16, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Function2<InterfaceC32720Et0, Integer, Unit> m116383getLambda1$financial_connections_release;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(370144067);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(f16)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(function1)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(function02)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(370144067, i2, -1, "com.stripe.android.financialconnections.features.institutionpicker.FinancialConnectionsSearchRow (InstitutionPickerScreen.kt:197)");
            }
            InterfaceC32037Bv1 interfaceC32037Bv1 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
            InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, C43705k61.m29303g(24), 0.0f, 2, null);
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94182k);
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
            mo89518u.mo89638F(408472415);
            C38736bl2 c38736bl2 = new C38736bl2(0, false, C39329cl2.f61189b.m60908h(), FY1.f9619b.m107002b(), 3, null);
            if (z) {
                m116383getLambda1$financial_connections_release = C43575jt0.m29791b(mo89518u, 1938846502, true, new InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1(function0, interfaceC32037Bv1));
            } else {
                m116383getLambda1$financial_connections_release = ComposableSingletons$InstitutionPickerScreenKt.INSTANCE.m116383getLambda1$financial_connections_release();
            }
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(function02);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$2$1(function02);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 m72851b = InterfaceC37486Zc5.m72851b(c38066ad5, C11298b.m68823a(c20912a, (Function1) mo89635G), 1.0f, false, 2, null);
            mo89518u.mo89638F(1157296644);
            boolean mo89539n2 = mo89518u.mo89539n(function1);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = new InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$3$1(function1);
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            TextFieldKt.FinancialConnectionsOutlinedTextField(f16, m72851b, (Function1) mo89635G2, false, false, c38736bl2, ComposableSingletons$InstitutionPickerScreenKt.INSTANCE.m116384getLambda2$financial_connections_release(), null, null, m116383getLambda1$financial_connections_release, null, mo89518u, (i2 & 14) | 1572864, 0, 1432);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$FinancialConnectionsSearchRow$2(f16, function1, function0, function02, z, i));
        }
    }

    public static final void InitialLoading(InstitutionPickerState institutionPickerState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1227623707);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (i4 == 1 && (i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else if (i4 != 0) {
                institutionPickerState = InstitutionPickerStates.Companion.initialLoading();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1227623707, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.InitialLoading (InstitutionPickerScreen.kt:486)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, 307803435, true, new InstitutionPickerScreenKt$InitialLoading$1(institutionPickerState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$InitialLoading$2(institutionPickerState, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstitutionPickerContent(AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp, Function0<? extends AbstractC19862dp<InstitutionResponse>> function0, boolean z, Function1<? super String, Unit> function1, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1991573162);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1991573162, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerContent (InstitutionPickerScreen.kt:108)");
        }
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, -1798466297, true, new InstitutionPickerScreenKt$InstitutionPickerContent$1(z, function03, i)), C43575jt0.m29791b(mo89518u, 1065412547, true, new InstitutionPickerScreenKt$InstitutionPickerContent$2(z, function1, function04, function02, function0, function2, abstractC19862dp, function05, i)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$InstitutionPickerContent$3(abstractC19862dp, function0, z, function1, function2, function02, function03, function04, function05, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    public static final void InstitutionPickerScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment;
        Object c27850r6;
        Object obj;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-571125390);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-571125390, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreen (InstitutionPickerScreen.kt:82)");
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
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstitutionPickerViewModel.class);
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
                            mo89635G2 = YN2.m75139c(yn2, javaClass, InstitutionPickerState.class, abstractC35282Pr6, name, false, null, 48, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        InstitutionPickerViewModel institutionPickerViewModel = (InstitutionPickerViewModel) ((RN2) mo89635G2);
                        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
                        InterfaceC48627sP5 m12481b = C49199tN2.m12481b(institutionPickerViewModel, mo89518u, 8);
                        C7582Sv.m84651a(InstitutionPickerScreen$lambda$0(m12481b).getSearchMode(), new InstitutionPickerScreenKt$InstitutionPickerScreen$1((InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h()), institutionPickerViewModel), mo89518u, 0, 0);
                        AbstractC19862dp<InstitutionPickerState.Payload> payload = InstitutionPickerScreen$lambda$0(m12481b).getPayload();
                        mo89518u.mo89638F(1157296644);
                        boolean mo89539n2 = mo89518u.mo89539n(m12481b);
                        Object mo89635G3 = mo89518u.mo89635G();
                        if (mo89539n2 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                            mo89635G3 = new InstitutionPickerScreenKt$InstitutionPickerScreen$2$1(m12481b);
                            mo89518u.mo89503z(mo89635G3);
                        }
                        mo89518u.mo89605Q();
                        InstitutionPickerContent(payload, mo89635G3, InstitutionPickerScreen$lambda$0(m12481b).getSearchMode(), new InstitutionPickerScreenKt$InstitutionPickerScreen$3(institutionPickerViewModel), new InstitutionPickerScreenKt$InstitutionPickerScreen$4(institutionPickerViewModel), new InstitutionPickerScreenKt$InstitutionPickerScreen$5(institutionPickerViewModel), new InstitutionPickerScreenKt$InstitutionPickerScreen$6(parentViewModel), new InstitutionPickerScreenKt$InstitutionPickerScreen$7(institutionPickerViewModel), new InstitutionPickerScreenKt$InstitutionPickerScreen$8(institutionPickerViewModel), mo89518u, 8);
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
            mo89512w.mo20405a(new InstitutionPickerScreenKt$InstitutionPickerScreen$9(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstitutionPickerState InstitutionPickerScreen$lambda$0(InterfaceC48627sP5<InstitutionPickerState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstitutionResultTile(Function1<? super FinancialConnectionsInstitution, Unit> function1, FinancialConnectionsInstitution financialConnectionsInstitution, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(20776756);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89539n(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo89518u.mo89539n(financialConnectionsInstitution) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(20776756, i2, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:360)");
            }
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114257l = BB5.m114257l(c20912a, 0.0f, 1, null);
            boolean mo89539n = mo89518u.mo89539n(function1) | mo89518u.mo89539n(financialConnectionsInstitution);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new InstitutionPickerScreenKt$InstitutionResultTile$1$1(function1, financialConnectionsInstitution);
                mo89518u.mo89503z(mo89635G);
            }
            float f = 8;
            InterfaceC41563gV2 m94183j = ND3.m94183j(C38131ak0.m70814e(m114257l, false, null, null, (Function0) mo89635G, 7, null), C43705k61.m29303g(24), C43705k61.m29303g(f));
            mo89518u.mo89638F(693286680);
            C25777lo c25777lo = C25777lo.f96729a;
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(c25777lo.m26803f(), m99138h, mo89518u, 48);
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
            C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(-1234973544);
            InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(BB5.m114246w(c20912a, C43705k61.m29303g(36)), C39242cc5.m61172d(C43705k61.m29303g(6)));
            Image icon = financialConnectionsInstitution.getIcon();
            interfaceC32720Et02 = mo89518u;
            StripeImageKt.StripeImage((icon == null || (r4 = icon.getDefault()) == null) ? "" : "", (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, m88106a, BA0.f1929a.m114317a(), null, null, C43575jt0.m29791b(mo89518u, 2069831219, true, new InstitutionPickerScreenKt$InstitutionResultTile$2$1(m88106a)), null, mo89518u, (StripeImageLoader.$stable << 3) | 12607872, 352);
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), interfaceC32720Et02, 6);
            interfaceC32720Et02.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et02, 0);
            interfaceC32720Et02.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et02.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et02.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(c20912a);
            if (!(interfaceC32720Et02.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et02.mo89557h();
            if (interfaceC32720Et02.mo89521t()) {
                interfaceC32720Et02.mo89617M(m113415a2);
            } else {
                interfaceC32720Et02.mo89566e();
            }
            interfaceC32720Et02.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et02);
            C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            interfaceC32720Et02.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et02)), interfaceC32720Et02, 0);
            interfaceC32720Et02.mo89638F(2058660585);
            interfaceC32720Et02.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            interfaceC32720Et02.mo89638F(-301577458);
            String name = financialConnectionsInstitution.getName();
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            C38909c26.m62000e(name, null, financialConnectionsTheme.getColors(interfaceC32720Et02, 6).m116473getTextPrimary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(interfaceC32720Et02, 6).getBodyEmphasized(), interfaceC32720Et02, 0, 0, 32762);
            String url = financialConnectionsInstitution.getUrl();
            if (url == null) {
                url = "";
            }
            C38909c26.m62000e(url, null, financialConnectionsTheme.getColors(interfaceC32720Et02, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, C45449n26.f99264a.m24539b(), false, 1, null, financialConnectionsTheme.getTypography(interfaceC32720Et02, 6).getCaptionTight(), interfaceC32720Et02, 0, 3120, 22522);
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
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
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new InstitutionPickerScreenKt$InstitutionResultTile$3(function1, financialConnectionsInstitution, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContent(boolean z, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<? extends AbstractC19862dp<InstitutionResponse>> function03, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp, Function0<Unit> function04, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z2;
        int i2;
        boolean z3;
        InterfaceC41563gV2.C20912a c20912a;
        EX2 ex2;
        InterfaceC32720Et0 interfaceC32720Et02;
        boolean z4;
        boolean isBlank;
        InterfaceC32720Et0 interfaceC32720Et03;
        boolean z5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1969089391);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1969089391, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.LoadedContent (InstitutionPickerScreen.kt:142)");
        }
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = LM5.m97025e(new F16((String) null, 0L, (C48413s26) null, 7, (DefaultConstructorMarker) null), null, 2, null);
            mo89518u.mo89503z(mo89635G);
        }
        EX2 ex22 = (EX2) mo89635G;
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z);
        int i3 = i & 14;
        mo89518u.mo89638F(511388516);
        boolean mo89539n = mo89518u.mo89539n(valueOf2) | mo89518u.mo89539n(ex22);
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = new InstitutionPickerScreenKt$LoadedContent$1$1(z, ex22, null);
            mo89518u.mo89503z(mo89635G2);
        }
        mo89518u.mo89605Q();
        Y91.m75533f(valueOf, (Function2) mo89635G2, mo89518u, i3 | 64);
        mo89518u.mo89638F(-483455358);
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a2);
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
        mo89518u.mo89638F(268346981);
        mo89518u.mo89638F(-1933439909);
        if (!z) {
            DN5.m110552a(BB5.m114246w(c20912a2, C43705k61.m29303g(16)), mo89518u, 6);
            z2 = false;
            i2 = 511388516;
            C38909c26.m62000e(C40946fS5.m41310c(C18634R.string.stripe_institutionpicker_pane_select_bank, mo89518u, 0), BB5.m114255n(ND3.m94182k(c20912a2, C43705k61.m29303g(24), 0.0f, 2, null), 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, FinancialConnectionsTheme.INSTANCE.getTypography(mo89518u, 6).getSubtitle(), mo89518u, 48, 0, 32764);
        } else {
            z2 = false;
            i2 = 511388516;
        }
        mo89518u.mo89605Q();
        DN5.m110552a(BB5.m114246w(c20912a2, C43705k61.m29303g(16)), mo89518u, 6);
        mo89518u.mo89638F(-1933439463);
        InstitutionPickerState.Payload mo6788a = abstractC19862dp.mo6788a();
        if (mo6788a != null && !mo6788a.getSearchDisabled()) {
            z3 = true;
        } else {
            z3 = z2;
        }
        if (z3) {
            F16 LoadedContent$lambda$3 = LoadedContent$lambda$3(ex22);
            mo89518u.mo89638F(i2);
            boolean mo89539n2 = mo89518u.mo89539n(ex22) | mo89518u.mo89539n(function1);
            Object mo89635G3 = mo89518u.mo89635G();
            if (mo89539n2 || mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = new InstitutionPickerScreenKt$LoadedContent$2$1$1(function1, ex22);
                mo89518u.mo89503z(mo89635G3);
            }
            mo89518u.mo89605Q();
            c20912a = c20912a2;
            z4 = true;
            ex2 = ex22;
            interfaceC32720Et02 = mo89518u;
            FinancialConnectionsSearchRow(LoadedContent$lambda$3, (Function1) mo89635G3, function02, function0, z, mo89518u, ((i >> 3) & 896) | ((i << 3) & 7168) | ((i << 12) & 57344));
        } else {
            c20912a = c20912a2;
            ex2 = ex22;
            interfaceC32720Et02 = mo89518u;
            z4 = true;
        }
        interfaceC32720Et02.mo89605Q();
        isBlank = StringsKt__StringsJVMKt.isBlank(LoadedContent$lambda$3(ex2).m108102h());
        if (isBlank ^ z4) {
            interfaceC32720Et02.mo89638F(-1933439004);
            String m108102h = LoadedContent$lambda$3(ex2).m108102h();
            InstitutionPickerState.Payload mo6788a2 = abstractC19862dp.mo6788a();
            if (mo6788a2 != null) {
                z5 = mo6788a2.getAllowManualEntry();
            } else {
                z5 = z2;
            }
            int i4 = i >> 12;
            int i5 = (i4 & 14) | (i4 & 112) | (i4 & 7168);
            interfaceC32720Et03 = interfaceC32720Et02;
            SearchInstitutionsList(function03, function2, m108102h, function04, z5, interfaceC32720Et02, i5);
            interfaceC32720Et03.mo89605Q();
        } else {
            interfaceC32720Et03 = interfaceC32720Et02;
            interfaceC32720Et03.mo89638F(-1933438646);
            FeaturedInstitutionsGrid(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), abstractC19862dp, function2, interfaceC32720Et03, ((i >> 9) & 896) | 64);
            interfaceC32720Et03.mo89605Q();
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
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$LoadedContent$3(z, function1, function0, function02, function03, function2, abstractC19862dp, function04, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F16 LoadedContent$lambda$3(EX2<F16> ex2) {
        return ex2.getValue();
    }

    public static final void NoSearchMode(InstitutionPickerState institutionPickerState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1345044071);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (i4 == 1 && (i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else if (i4 != 0) {
                institutionPickerState = InstitutionPickerStates.Companion.noSearchMode();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1345044071, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.NoSearchMode (InstitutionPickerScreen.kt:600)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, 293808759, true, new InstitutionPickerScreenKt$NoSearchMode$1(institutionPickerState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$NoSearchMode$2(institutionPickerState, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchInstitutionsFailedRow(boolean z, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        G26 m105921d;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-8483354);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-8483354, i2, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchInstitutionsFailedRow (InstitutionPickerScreen.kt:313)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            float f = 8;
            InterfaceC41563gV2 m94183j = ND3.m94183j(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(24), C43705k61.m29303g(f));
            InterfaceC4360K9.InterfaceC4362b m99139g = InterfaceC4360K9.f19170a.m99139g();
            C25777lo.InterfaceC25782e m26795n = C25777lo.f96729a.m26795n(C43705k61.m29303g(f));
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26795n, m99139g, mo89518u, 54);
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
            C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            mo89518u.mo89638F(22002780);
            AbstractC45562nE3 m19793d = C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_warning, mo89518u, 0);
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            DP1.m110533b(m19793d, "Warning icon", null, financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), mo89518u, 56, 4);
            C38909c26.m62000e(C40946fS5.m41310c(C18634R.string.stripe_institutionpicker_pane_error_title, mo89518u, 0), null, financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getBody(), mo89518u, 0, 0, 32762);
            if (z) {
                mo89518u.mo89638F(1067983773);
                InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
                TextResource.StringId stringId = new TextResource.StringId(C18634R.string.stripe_institutionpicker_pane_error_desc_manual_entry, null, 2, null);
                m105921d = r16.m105921d((r42 & 1) != 0 ? r16.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r16.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r16.f10827a.m105161n() : null, (r42 & 8) != 0 ? r16.f10827a.m105163l() : null, (r42 & 16) != 0 ? r16.f10827a.m105162m() : null, (r42 & 32) != 0 ? r16.f10827a.m105166i() : null, (r42 & 64) != 0 ? r16.f10827a.m105165j() : null, (r42 & 128) != 0 ? r16.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r16.f10827a.m105170e() : null, (r42 & 512) != 0 ? r16.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r16.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r16.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r16.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r16.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r16.f10828b.m110652j() : C47801r06.m16685g(C47801r06.f106195b.m16678a()), (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r16.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r16.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getBody().f10828b.m110649m() : null);
                mo89518u.mo89638F(1157296644);
                boolean mo89539n = mo89518u.mo89539n(function0);
                Object mo89635G = mo89518u.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new InstitutionPickerScreenKt$SearchInstitutionsFailedRow$1$1$1(function0);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                TextKt.AnnotatedText(stringId, (Function1) mo89635G, m105921d, m114255n, null, mo89518u, 3080, 16);
                mo89518u.mo89605Q();
                interfaceC32720Et02 = mo89518u;
            } else {
                mo89518u.mo89638F(1067984310);
                interfaceC32720Et02 = mo89518u;
                C38909c26.m62000e(C40946fS5.m41310c(C18634R.string.stripe_institutionpicker_pane_error_desc, mo89518u, 0), null, financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getBody(), interfaceC32720Et02, 0, 0, 32762);
                interfaceC32720Et02.mo89605Q();
            }
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
            mo89512w.mo20405a(new InstitutionPickerScreenKt$SearchInstitutionsFailedRow$2(z, function0, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchInstitutionsList(Function0<? extends AbstractC19862dp<InstitutionResponse>> function0, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, String str, Function0<Unit> function02, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-773740442);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(function2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(str)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(function02)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((46811 & i8) == 9362 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-773740442, i8, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchInstitutionsList (InstitutionPickerScreen.kt:252)");
            }
            InterfaceC4360K9.InterfaceC4362b m99139g = InterfaceC4360K9.f19170a.m99139g();
            PD3 m94188e = ND3.m94188e(0.0f, C43705k61.m29303g(16), 0.0f, 0.0f, 13, null);
            Object[] objArr = {function0, Boolean.valueOf(z), function02, str, function2};
            mo89518u.mo89638F(-568225417);
            boolean z2 = false;
            for (int i9 = 0; i9 < 5; i9++) {
                z2 |= mo89518u.mo89539n(objArr[i9]);
            }
            Object mo89635G = mo89518u.mo89635G();
            if (z2 || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                InstitutionPickerScreenKt$SearchInstitutionsList$1$1 institutionPickerScreenKt$SearchInstitutionsList$1$1 = new InstitutionPickerScreenKt$SearchInstitutionsList$1$1(function0, z, function02, i8, str, function2);
                mo89518u.mo89503z(institutionPickerScreenKt$SearchInstitutionsList$1$1);
                mo89635G = institutionPickerScreenKt$SearchInstitutionsList$1$1;
            }
            mo89518u.mo89605Q();
            interfaceC32720Et02 = mo89518u;
            C41738gn2.m37481a(null, null, m94188e, false, null, m99139g, null, false, (Function1) mo89635G, interfaceC32720Et02, 196992, 219);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$SearchInstitutionsList$2(function0, function2, str, function02, z, i));
        }
    }

    public static final void SearchModeFailed(InstitutionPickerState institutionPickerState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1086862229);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (i4 == 1 && (i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else if (i4 != 0) {
                institutionPickerState = InstitutionPickerStates.Companion.searchModeFailed();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1086862229, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeFailed (InstitutionPickerScreen.kt:562)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, -270880645, true, new InstitutionPickerScreenKt$SearchModeFailed$1(institutionPickerState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$SearchModeFailed$2(institutionPickerState, i, i2));
        }
    }

    public static final void SearchModeNoQuery(InstitutionPickerState institutionPickerState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1493805325);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (i4 == 1 && (i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else if (i4 != 0) {
                institutionPickerState = InstitutionPickerStates.Companion.searchModeNoQuery();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1493805325, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeNoQuery (InstitutionPickerScreen.kt:581)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, -1968179997, true, new InstitutionPickerScreenKt$SearchModeNoQuery$1(institutionPickerState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$SearchModeNoQuery$2(institutionPickerState, i, i2));
        }
    }

    public static final void SearchModeNoResults(InstitutionPickerState institutionPickerState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2098663803);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (i4 == 1 && (i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else if (i4 != 0) {
                institutionPickerState = InstitutionPickerStates.Companion.searchModeNoResults();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2098663803, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeNoResults (InstitutionPickerScreen.kt:543)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, 1588777077, true, new InstitutionPickerScreenKt$SearchModeNoResults$1(institutionPickerState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$SearchModeNoResults$2(institutionPickerState, i, i2));
        }
    }

    public static final void SearchModeSearchingInstitutions(InstitutionPickerState institutionPickerState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1551726565);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (i4 == 1 && (i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else if (i4 != 0) {
                institutionPickerState = InstitutionPickerStates.Companion.searchModeSearchingInstitutions();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1551726565, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeSearchingInstitutions (InstitutionPickerScreen.kt:505)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, -1772883499, true, new InstitutionPickerScreenKt$SearchModeSearchingInstitutions$1(institutionPickerState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$SearchModeSearchingInstitutions$2(institutionPickerState, i, i2));
        }
    }

    public static final void SearchModeWithResults(InstitutionPickerState institutionPickerState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1613829386);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 2;
        } else {
            i3 = i;
        }
        if (i4 == 1 && (i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else if (i4 != 0) {
                institutionPickerState = InstitutionPickerStates.Companion.searchModeWithResults();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1613829386, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeWithResults (InstitutionPickerScreen.kt:524)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, 1896495866, true, new InstitutionPickerScreenKt$SearchModeWithResults$1(institutionPickerState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new InstitutionPickerScreenKt$SearchModeWithResults$2(institutionPickerState, i, i2));
        }
    }
}
