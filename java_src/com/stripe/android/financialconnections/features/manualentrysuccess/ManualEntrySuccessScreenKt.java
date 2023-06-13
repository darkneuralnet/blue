package com.stripe.android.financialconnections.features.manualentrysuccess;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC37727a30;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0012\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aV\u0010\u0018\u001a>\u0012:\u00128\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u0002*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\"\u001a\u00020\u0002*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\tH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u000f\u0010#\u001a\u00020\u0002H\u0001¢\u0006\u0004\b#\u0010$\u001a\u000f\u0010%\u001a\u00020\u0002H\u0001¢\u0006\u0004\b%\u0010$\u001a\u000f\u0010&\u001a\u00020\u0002H\u0001¢\u0006\u0004\b&\u0010$\u001a\u000f\u0010'\u001a\u00020\u0002H\u0001¢\u0006\u0004\b'\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, m28432d2 = {"LAY2;", "backStackEntry", "", "ManualEntrySuccessScreen", "(LAY2;LEt0;I)V", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "microdepositVerificationMethod", "", "last4", "", "loading", "Lkotlin/Function0;", "onCloseClick", "onDoneClick", "ManualEntrySuccessContent", "(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "resolveText", "(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/String;LEt0;I)Ljava/lang/String;", "TransactionHistoryTable", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;LEt0;I)V", "", "Lkotlin/Triple;", "Lkotlin/Pair;", "Lpm0;", "buildTableRows", "(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;LEt0;I)Ljava/util/List;", "LZc5;", Entry.TYPE_TEXT, "TitleCell", "(LZc5;Ljava/lang/String;LEt0;I)V", "color", "highlight", "TableCell-FNF3uiM", "(LZc5;Ljava/lang/String;JZLEt0;I)V", "TableCell", "ManualEntrySuccessScreenPreviewAmount", "(LEt0;I)V", "ManualEntrySuccessScreenPreviewDescriptor", "ManualEntrySuccessScreenPreviewAmountNoAccount", "ManualEntrySuccessScreenPreviewDescriptorNoAccount", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManualEntrySuccessScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntrySuccessScreen.kt\ncom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,344:1\n53#2:345\n54#2,15:347\n69#2,8:368\n79#2:379\n80#2,5:382\n76#3:346\n76#3:396\n76#3:430\n76#3:465\n76#3:505\n76#3:545\n83#4,3:362\n50#4:380\n49#4:381\n460#4,13:408\n460#4,13:442\n460#4,13:477\n473#4,3:491\n460#4,13:517\n473#4,3:531\n460#4,13:557\n473#4,3:571\n473#4,3:577\n473#4,3:583\n1057#5,3:365\n1060#5,3:376\n154#6:387\n154#6:388\n154#6:422\n154#6:456\n154#6:496\n154#6:536\n154#6:582\n154#6:588\n154#6:589\n67#7,6:389\n73#7:421\n77#7:587\n75#8:395\n76#8,11:397\n75#8:429\n76#8,11:431\n75#8:464\n76#8,11:466\n89#8:494\n75#8:504\n76#8,11:506\n89#8:534\n75#8:544\n76#8,11:546\n89#8:574\n89#8:580\n89#8:586\n74#9,6:423\n80#9:455\n84#9:581\n74#10,7:457\n81#10:490\n85#10:495\n74#10,7:497\n81#10:530\n85#10:535\n75#10,6:538\n81#10:570\n85#10:575\n1855#11:537\n1856#11:576\n*S KotlinDebug\n*F\n+ 1 ManualEntrySuccessScreen.kt\ncom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessScreenKt\n*L\n54#1:345\n54#1:347,15\n54#1:368,8\n54#1:379\n54#1:382,5\n54#1:346\n166#1:396\n175#1:430\n183#1:465\n199#1:505\n211#1:545\n54#1:362,3\n54#1:380\n54#1:381\n166#1:408,13\n175#1:442,13\n183#1:477,13\n183#1:491,3\n199#1:517,13\n199#1:531,3\n211#1:557,13\n211#1:571,3\n175#1:577,3\n166#1:583,3\n54#1:365,3\n54#1:376,3\n165#1:387\n171#1:388\n177#1:422\n185#1:456\n197#1:496\n205#1:536\n222#1:582\n268#1:588\n288#1:589\n166#1:389,6\n166#1:421\n166#1:587\n166#1:395\n166#1:397,11\n175#1:429\n175#1:431,11\n183#1:464\n183#1:466,11\n183#1:494\n199#1:504\n199#1:506,11\n199#1:534\n211#1:544\n211#1:546,11\n211#1:574\n175#1:580\n166#1:586\n175#1:423,6\n175#1:455\n175#1:581\n183#1:457,7\n183#1:490\n183#1:495\n199#1:497,7\n199#1:530\n199#1:535\n211#1:538,6\n211#1:570\n211#1:575\n208#1:537\n208#1:576\n*E\n"})
/* loaded from: classes7.dex */
public final class ManualEntrySuccessScreenKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.values().length];
            try {
                iArr[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.AMOUNTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.DESCRIPTOR_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ManualEntrySuccessContent(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod, String str, boolean z, Function0<Unit> onCloseClick, Function0<Unit> onDoneClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onDoneClick, "onDoneClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1116002205);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(microdepositVerificationMethod)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(onCloseClick)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (mo89518u.mo89539n(onDoneClick)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((46811 & i8) == 9362 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1116002205, i8, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessContent (ManualEntrySuccessScreen.kt:67)");
            }
            ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, -840709934, true, new ManualEntrySuccessScreenKt$ManualEntrySuccessContent$1(onCloseClick, i8)), C43575jt0.m29791b(mo89518u, 1663358358, true, new ManualEntrySuccessScreenKt$ManualEntrySuccessContent$2(microdepositVerificationMethod, str, i8, onDoneClick, z)), mo89518u, 54);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntrySuccessScreenKt$ManualEntrySuccessContent$3(microdepositVerificationMethod, str, z, onCloseClick, onDoneClick, i));
        }
    }

    public static final void ManualEntrySuccessScreen(AY2 backStackEntry, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z;
        AbstractC35282Pr6 c27850r6;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1854743143);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1854743143, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreen (ManualEntrySuccessScreen.kt:49)");
        }
        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
        mo89518u.mo89638F(512170640);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
        ComponentActivity m12477f = C49199tN2.m12477f((Context) mo89518u.mo89572c(C11411h.m68324g()));
        if (m12477f != null) {
            InterfaceC37154Xr6 interfaceC37154Xr6 = lifecycleOwner instanceof InterfaceC37154Xr6 ? (InterfaceC37154Xr6) lifecycleOwner : null;
            if (interfaceC37154Xr6 != null) {
                InterfaceC35200Pi5 interfaceC35200Pi5 = lifecycleOwner instanceof InterfaceC35200Pi5 ? (InterfaceC35200Pi5) lifecycleOwner : null;
                if (interfaceC35200Pi5 != null) {
                    C11966a savedStateRegistry = interfaceC35200Pi5.getSavedStateRegistry();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManualEntrySuccessViewModel.class);
                    View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                    Object[] objArr = {lifecycleOwner, m12477f, interfaceC37154Xr6, savedStateRegistry};
                    mo89518u.mo89638F(-568225417);
                    boolean z2 = false;
                    for (int i2 = 0; i2 < 4; i2++) {
                        z2 |= mo89518u.mo89539n(objArr[i2]);
                    }
                    Object mo89635G = mo89518u.mo89635G();
                    if (z2 || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        Fragment fragment = lifecycleOwner instanceof Fragment ? (Fragment) lifecycleOwner : null;
                        if (fragment == null) {
                            fragment = C49199tN2.m12476g(view);
                        }
                        Fragment fragment2 = fragment;
                        if (fragment2 != null) {
                            Bundle arguments = fragment2.getArguments();
                            z = true;
                            c27850r6 = new C33000Fy1(m12477f, arguments != null ? arguments.get("mavericks:arg") : null, fragment2, null, null, 24, null);
                        } else {
                            z = true;
                            Bundle extras = m12477f.getIntent().getExtras();
                            c27850r6 = new C27850r6(m12477f, extras != null ? extras.get("mavericks:arg") : null, interfaceC37154Xr6, savedStateRegistry);
                        }
                        mo89518u.mo89503z(c27850r6);
                    } else {
                        c27850r6 = mo89635G;
                        z = true;
                    }
                    mo89518u.mo89605Q();
                    AbstractC35282Pr6 abstractC35282Pr6 = c27850r6;
                    mo89518u.mo89638F(511388516);
                    boolean mo89539n = mo89518u.mo89539n(orCreateKotlinClass) | mo89518u.mo89539n(abstractC35282Pr6);
                    Object mo89635G2 = mo89518u.mo89635G();
                    if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                        YN2 yn2 = YN2.f45797a;
                        Class javaClass = JvmClassMappingKt.getJavaClass(orCreateKotlinClass);
                        String name = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "keyFactory?.invoke() ?: viewModelClass.java.name");
                        mo89635G2 = YN2.m75139c(yn2, javaClass, ManualEntrySuccessState.class, abstractC35282Pr6, name, false, null, 48, null);
                        mo89518u.mo89503z(mo89635G2);
                    }
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    ManualEntrySuccessViewModel manualEntrySuccessViewModel = (ManualEntrySuccessViewModel) ((RN2) mo89635G2);
                    C7582Sv.m84651a(z, ManualEntrySuccessScreenKt$ManualEntrySuccessScreen$1.INSTANCE, mo89518u, 54, 0);
                    InterfaceC48627sP5 m12479d = C49199tN2.m12479d(manualEntrySuccessViewModel, C18848x62e2add.INSTANCE, mo89518u, 72);
                    NavigationDirections.ManualEntrySuccess manualEntrySuccess = NavigationDirections.ManualEntrySuccess.INSTANCE;
                    ManualEntrySuccessContent(manualEntrySuccess.microdeposits(backStackEntry), manualEntrySuccess.last4(backStackEntry), m12479d.getValue() instanceof C31786At2, new ManualEntrySuccessScreenKt$ManualEntrySuccessScreen$2(parentViewModel), new ManualEntrySuccessScreenKt$ManualEntrySuccessScreen$3(manualEntrySuccessViewModel), mo89518u, 0);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                        return;
                    }
                    mo89512w.mo20405a(new ManualEntrySuccessScreenKt$ManualEntrySuccessScreen$4(backStackEntry, i));
                    return;
                }
                throw new IllegalStateException("LifecycleOwner must be a SavedStateRegistryOwner!".toString());
            }
            throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
        }
        throw new IllegalStateException("Composable is not hosted in a ComponentActivity!".toString());
    }

    public static final void ManualEntrySuccessScreenPreviewAmount(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1297639253);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1297639253, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenPreviewAmount (ManualEntrySuccessScreen.kt:294)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ManualEntrySuccessScreenKt.INSTANCE.m116400getLambda2$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18849x63fc1872(i));
        }
    }

    public static final void ManualEntrySuccessScreenPreviewAmountNoAccount(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1863800057);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1863800057, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenPreviewAmountNoAccount (ManualEntrySuccessScreen.kt:320)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ManualEntrySuccessScreenKt.INSTANCE.m116402getLambda4$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18850xa4add854(i));
        }
    }

    public static final void ManualEntrySuccessScreenPreviewDescriptor(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1634714914);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1634714914, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenPreviewDescriptor (ManualEntrySuccessScreen.kt:307)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ManualEntrySuccessScreenKt.INSTANCE.m116401getLambda3$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18851x11f0a349(i));
        }
    }

    public static final void ManualEntrySuccessScreenPreviewDescriptorNoAccount(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-249839202);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-249839202, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessScreenPreviewDescriptorNoAccount (ManualEntrySuccessScreen.kt:333)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ManualEntrySuccessScreenKt.INSTANCE.m116403getLambda5$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C18852x29e28f5d(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TableCell-FNF3uiM  reason: not valid java name */
    public static final void m116404TableCellFNF3uiM(InterfaceC37486Zc5 interfaceC37486Zc5, String str, long j, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        G26 captionCode;
        G26 m105921d;
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1696482046);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC37486Zc5)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89524s(j)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89536o(z)) {
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
                C35528Qt0.m87816Z(1696482046, i2, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.TableCell (ManualEntrySuccessScreen.kt:273)");
            }
            if (z) {
                mo89518u.mo89638F(1055855326);
                captionCode = FinancialConnectionsTheme.INSTANCE.getTypography(mo89518u, 6).getCaptionCodeEmphasized();
                mo89518u.mo89605Q();
            } else {
                mo89518u.mo89638F(1055855406);
                captionCode = FinancialConnectionsTheme.INSTANCE.getTypography(mo89518u, 6).getCaptionCode();
                mo89518u.mo89605Q();
            }
            m105921d = r16.m105921d((r42 & 1) != 0 ? r16.f10827a.m105168g() : j, (r42 & 2) != 0 ? r16.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r16.f10827a.m105161n() : null, (r42 & 8) != 0 ? r16.f10827a.m105163l() : null, (r42 & 16) != 0 ? r16.f10827a.m105162m() : null, (r42 & 32) != 0 ? r16.f10827a.m105166i() : null, (r42 & 64) != 0 ? r16.f10827a.m105165j() : null, (r42 & 128) != 0 ? r16.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r16.f10827a.m105170e() : null, (r42 & 512) != 0 ? r16.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r16.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r16.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r16.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r16.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r16.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r16.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r16.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? captionCode.f10828b.m110649m() : null);
            C38909c26.m62000e(str, InterfaceC37486Zc5.m72851b(interfaceC37486Zc5, ND3.m94182k(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(4), 1, null), 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m105921d, mo89518u, (i2 >> 3) & 14, 0, 32764);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntrySuccessScreenKt$TableCell$1(interfaceC37486Zc5, str, j, z, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TitleCell(InterfaceC37486Zc5 interfaceC37486Zc5, String str, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        G26 m105921d;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        String str2;
        int i4;
        int i5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(349181249);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC37486Zc5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i6 = i2;
        if ((i6 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            str2 = str;
            interfaceC32720Et02 = mo89518u;
            i3 = i;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(349181249, i6, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.TitleCell (ManualEntrySuccessScreen.kt:258)");
            }
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            m105921d = r16.m105921d((r42 & 1) != 0 ? r16.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r16.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r16.f10827a.m105161n() : null, (r42 & 8) != 0 ? r16.f10827a.m105163l() : null, (r42 & 16) != 0 ? r16.f10827a.m105162m() : null, (r42 & 32) != 0 ? r16.f10827a.m105166i() : null, (r42 & 64) != 0 ? r16.f10827a.m105165j() : null, (r42 & 128) != 0 ? r16.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r16.f10827a.m105170e() : null, (r42 & 512) != 0 ? r16.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r16.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r16.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r16.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r16.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r16.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r16.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r16.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaption().f10828b.m110649m() : null);
            interfaceC32720Et02 = mo89518u;
            i3 = i;
            str2 = str;
            C38909c26.m62000e(str, InterfaceC37486Zc5.m72851b(interfaceC37486Zc5, ND3.m94182k(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(4), 1, null), 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m105921d, interfaceC32720Et02, (i6 >> 3) & 14, 0, 32764);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntrySuccessScreenKt$TitleCell$1(interfaceC37486Zc5, str2, i3));
        }
    }

    public static final void TransactionHistoryTable(String str, LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        C25777lo c25777lo;
        C40689f10 c40689f10;
        G26 m105921d;
        FinancialConnectionsTheme financialConnectionsTheme;
        int i2;
        InterfaceC41563gV2.C20912a c20912a;
        InterfaceC32720Et0 interfaceC32720Et02;
        Iterable<IndexedValue> withIndex;
        List listOf;
        int lastIndex;
        Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(461824207);
        int i3 = (i & 14) == 0 ? (mo89518u.mo89539n(str) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i3 |= mo89518u.mo89539n(microdepositVerificationMethod) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(461824207, i3, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.TransactionHistoryTable (ManualEntrySuccessScreen.kt:160)");
            }
            float f = 8;
            C38649bc5 m61172d = C39242cc5.m61172d(C43705k61.m29303g(f));
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(c20912a2, m61172d);
            FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
            InterfaceC41563gV2 m44156f = C19783dZ.m44156f(C13342bw.m62124d(m88106a, financialConnectionsTheme2.getColors(mo89518u, 6).m116460getBackgroundContainer0d7_KjU(), null, 2, null), C20466fZ.m41178a(C43705k61.m29303g(1), financialConnectionsTheme2.getColors(mo89518u, 6).m116462getBorderDefault0d7_KjU()), m61172d);
            mo89518u.mo89638F(733328855);
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m44156f);
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
            C40689f10 c40689f102 = C40689f10.f79291a;
            mo89518u.mo89638F(1308362069);
            float f2 = 16;
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a2, C43705k61.m29303g(f2), C43705k61.m29303g(f2), C43705k61.m29303g(f2), 0.0f, 8, null);
            mo89518u.mo89638F(-483455358);
            C25777lo c25777lo2 = C25777lo.f96729a;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo2.m26802g(), c4361a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94180m);
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
            C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            mo89518u.mo89638F(-2053209141);
            long m116474getTextSecondary0d7_KjU = financialConnectionsTheme2.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU();
            List<Triple<Pair<String, C47063pm0>, Pair<String, C47063pm0>, Pair<String, C47063pm0>>> buildTableRows = buildTableRows(microdepositVerificationMethod, mo89518u, (i3 >> 3) & 14);
            mo89518u.mo89638F(-1434075904);
            if (str == null) {
                c25777lo = c25777lo2;
                financialConnectionsTheme = financialConnectionsTheme2;
                c20912a = c20912a2;
                interfaceC32720Et02 = mo89518u;
                c40689f10 = c40689f102;
                i2 = 6;
            } else {
                InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
                C25777lo.InterfaceC25782e m26795n = c25777lo2.m26795n(C43705k61.m29303g(f));
                mo89518u.mo89638F(693286680);
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26795n, m99138h, mo89518u, 54);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(c20912a2);
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
                C38680bf6.m64191b(m64192a3, m74813a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
                C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
                C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-678309503);
                C38066ad5 c38066ad5 = C38066ad5.f50835a;
                mo89518u.mo89638F(277921513);
                c25777lo = c25777lo2;
                c40689f10 = c40689f102;
                DP1.m110533b(C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_bank, mo89518u, 0), "Bank icon", null, financialConnectionsTheme2.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), mo89518u, 56, 4);
                String m41309d = C40946fS5.m41309d(C18634R.string.stripe_manualentrysuccess_table_title, new Object[]{str}, mo89518u, 64);
                m105921d = r30.m105921d((r42 & 1) != 0 ? r30.f10827a.m105168g() : m116474getTextSecondary0d7_KjU, (r42 & 2) != 0 ? r30.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r30.f10827a.m105161n() : null, (r42 & 8) != 0 ? r30.f10827a.m105163l() : null, (r42 & 16) != 0 ? r30.f10827a.m105162m() : null, (r42 & 32) != 0 ? r30.f10827a.m105166i() : null, (r42 & 64) != 0 ? r30.f10827a.m105165j() : null, (r42 & 128) != 0 ? r30.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r30.f10827a.m105170e() : null, (r42 & 512) != 0 ? r30.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r30.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r30.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r30.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r30.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r30.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r30.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r30.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getBodyCode().f10828b.m110649m() : null);
                financialConnectionsTheme = financialConnectionsTheme2;
                i2 = 6;
                C38909c26.m62000e(m41309d, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m105921d, mo89518u, 0, 0, 32766);
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                c20912a = c20912a2;
                interfaceC32720Et02 = mo89518u;
                DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), interfaceC32720Et02, 6);
                Unit unit = Unit.INSTANCE;
            }
            interfaceC32720Et02.mo89605Q();
            int i4 = 693286680;
            interfaceC32720Et02.mo89638F(693286680);
            InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(c25777lo.m26803f(), c4361a.m99135k(), interfaceC32720Et02, 0);
            interfaceC32720Et02.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g014 = (InterfaceC41273g01) interfaceC32720Et02.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq64 = (InterfaceC33869Jq6) interfaceC32720Et02.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a4 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a4 = C31723Am2.m115273a(c20912a);
            if (!(interfaceC32720Et02.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et02.mo89557h();
            if (interfaceC32720Et02.mo89521t()) {
                interfaceC32720Et02.mo89617M(m113415a4);
            } else {
                interfaceC32720Et02.mo89566e();
            }
            interfaceC32720Et02.mo89620L();
            InterfaceC32720Et0 m64192a4 = C38680bf6.m64192a(interfaceC32720Et02);
            C38680bf6.m64191b(m64192a4, m74813a2, c0757a.m113412d());
            C38680bf6.m64191b(m64192a4, interfaceC41273g014, c0757a.m113414b());
            C38680bf6.m64191b(m64192a4, enumC47065pm24, c0757a.m113413c());
            C38680bf6.m64191b(m64192a4, interfaceC33869Jq64, c0757a.m113410f());
            interfaceC32720Et02.mo89530q();
            m115273a4.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et02)), interfaceC32720Et02, 0);
            interfaceC32720Et02.mo89638F(2058660585);
            interfaceC32720Et02.mo89638F(-678309503);
            C38066ad5 c38066ad52 = C38066ad5.f50835a;
            interfaceC32720Et02.mo89638F(-1897279441);
            TitleCell(c38066ad52, "Transaction", interfaceC32720Et02, 54);
            TitleCell(c38066ad52, "Amount", interfaceC32720Et02, 54);
            TitleCell(c38066ad52, "Type", interfaceC32720Et02, 54);
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            int i5 = 2058660585;
            L51.m97795a(ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(4), 0.0f, C43705k61.m29303g(f), 5, null), financialConnectionsTheme.getColors(interfaceC32720Et02, i2).m116462getBorderDefault0d7_KjU(), 0.0f, 0.0f, interfaceC32720Et02, 6, 12);
            interfaceC32720Et02.mo89638F(-1595638686);
            withIndex = CollectionsKt___CollectionsKt.withIndex(buildTableRows);
            for (IndexedValue indexedValue : withIndex) {
                int component1 = indexedValue.component1();
                Triple triple = (Triple) indexedValue.component2();
                Pair pair = (Pair) triple.component1();
                Pair pair2 = (Pair) triple.component2();
                Pair pair3 = (Pair) triple.component3();
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(buildTableRows);
                boolean z = lastIndex != component1;
                InterfaceC41563gV2 m114255n = BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
                interfaceC32720Et02.mo89638F(i4);
                InterfaceC51579xO2 m74813a3 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), InterfaceC4360K9.f19170a.m99135k(), interfaceC32720Et02, 0);
                interfaceC32720Et02.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g015 = (InterfaceC41273g01) interfaceC32720Et02.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm25 = (EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq65 = (InterfaceC33869Jq6) interfaceC32720Et02.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a5 = c0757a2.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a5 = C31723Am2.m115273a(m114255n);
                if (!(interfaceC32720Et02.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                interfaceC32720Et02.mo89557h();
                if (interfaceC32720Et02.mo89521t()) {
                    interfaceC32720Et02.mo89617M(m113415a5);
                } else {
                    interfaceC32720Et02.mo89566e();
                }
                interfaceC32720Et02.mo89620L();
                InterfaceC32720Et0 m64192a5 = C38680bf6.m64192a(interfaceC32720Et02);
                C38680bf6.m64191b(m64192a5, m74813a3, c0757a2.m113412d());
                C38680bf6.m64191b(m64192a5, interfaceC41273g015, c0757a2.m113414b());
                C38680bf6.m64191b(m64192a5, enumC47065pm25, c0757a2.m113413c());
                C38680bf6.m64191b(m64192a5, interfaceC33869Jq65, c0757a2.m113410f());
                interfaceC32720Et02.mo89530q();
                m115273a5.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et02)), interfaceC32720Et02, 0);
                interfaceC32720Et02.mo89638F(i5);
                interfaceC32720Et02.mo89638F(-678309503);
                C38066ad5 c38066ad53 = C38066ad5.f50835a;
                interfaceC32720Et02.mo89638F(-633032154);
                boolean z2 = z;
                InterfaceC32720Et0 interfaceC32720Et03 = interfaceC32720Et02;
                m116404TableCellFNF3uiM(c38066ad53, (String) pair.getFirst(), ((C47063pm0) pair.getSecond()).m18733w(), z2, interfaceC32720Et03, 6);
                m116404TableCellFNF3uiM(c38066ad53, (String) pair2.getFirst(), ((C47063pm0) pair2.getSecond()).m18733w(), z2, interfaceC32720Et03, 6);
                m116404TableCellFNF3uiM(c38066ad53, (String) pair3.getFirst(), ((C47063pm0) pair3.getSecond()).m18733w(), z2, interfaceC32720Et03, 6);
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89563f();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                i5 = 2058660585;
                i4 = 693286680;
            }
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            InterfaceC41563gV2 mo35388c = c40689f10.mo35388c(BB5.m114254o(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), C43705k61.m29303g(26)), InterfaceC4360K9.f19170a.m99144b());
            AbstractC37727a30.C10553a c10553a = AbstractC37727a30.f49755b;
            FinancialConnectionsTheme financialConnectionsTheme3 = FinancialConnectionsTheme.INSTANCE;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C47063pm0[]{C47063pm0.m18747i(C47063pm0.m18743m(financialConnectionsTheme3.getColors(interfaceC32720Et02, 6).m116476getTextWhite0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), C47063pm0.m18747i(C47063pm0.m18743m(financialConnectionsTheme3.getColors(interfaceC32720Et02, 6).m116476getTextWhite0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))});
            C39504d10.m44736a(C13342bw.m62126b(mo35388c, AbstractC37727a30.C10553a.m71949d(c10553a, listOf, 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), interfaceC32720Et02, 0);
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
        mo89512w.mo20405a(new ManualEntrySuccessScreenKt$TransactionHistoryTable$2(str, microdepositVerificationMethod, i));
    }

    private static final List<Triple<Pair<String, C47063pm0>, Pair<String, C47063pm0>, Pair<String, C47063pm0>>> buildTableRows(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        List<Triple<Pair<String, C47063pm0>, Pair<String, C47063pm0>, Pair<String, C47063pm0>>> listOf;
        interfaceC32720Et0.mo89638F(-698682919);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-698682919, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.buildTableRows (ManualEntrySuccessScreen.kt:236)");
        }
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        long m116473getTextPrimary0d7_KjU = financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU();
        long m116469getTextBrand0d7_KjU = financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116469getTextBrand0d7_KjU();
        int i2 = WhenMappings.$EnumSwitchMapping$0[microdepositVerificationMethod.ordinal()];
        if (i2 == 1) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Triple[]{new Triple(TuplesKt.m28425to("AMTS", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)), TuplesKt.m28425to("$0.XX", C47063pm0.m18747i(m116469getTextBrand0d7_KjU)), TuplesKt.m28425to("ACH CREDIT", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU))), new Triple(TuplesKt.m28425to("AMTS", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)), TuplesKt.m28425to("$0.XX", C47063pm0.m18747i(m116469getTextBrand0d7_KjU)), TuplesKt.m28425to("ACH CREDIT", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU))), new Triple(TuplesKt.m28425to("GROCERIES", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)), TuplesKt.m28425to("$56.12", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)), TuplesKt.m28425to("VISA", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)))});
        } else if (i2 == 2) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Triple[]{new Triple(TuplesKt.m28425to("SMXXXX", C47063pm0.m18747i(m116469getTextBrand0d7_KjU)), TuplesKt.m28425to("$0.01", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)), TuplesKt.m28425to("ACH CREDIT", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU))), new Triple(TuplesKt.m28425to("GROCERIES", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)), TuplesKt.m28425to("$56.12", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)), TuplesKt.m28425to("VISA", C47063pm0.m18747i(m116473getTextPrimary0d7_KjU)))});
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalStateException("Unknown microdeposits type".toString());
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return listOf;
    }

    public static final String resolveText(LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod, String str, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String m41310c;
        Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
        interfaceC32720Et0.mo89638F(171539513);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(171539513, i, -1, "com.stripe.android.financialconnections.features.manualentrysuccess.resolveText (ManualEntrySuccessScreen.kt:138)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[microdepositVerificationMethod.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    interfaceC32720Et0.mo89638F(-828928933);
                    interfaceC32720Et0.mo89605Q();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC32720Et0.mo89638F(-828922359);
                interfaceC32720Et0.mo89605Q();
                throw new NotImplementedError(null, 1, null);
            }
            interfaceC32720Et0.mo89638F(-828922654);
            if (str != null) {
                interfaceC32720Et0.mo89638F(-828922622);
                m41310c = C40946fS5.m41309d(C18634R.string.stripe_manualentrysuccess_desc_descriptorcode, new Object[]{str}, interfaceC32720Et0, 64);
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(-828922493);
                m41310c = C40946fS5.m41310c(C18634R.string.stripe_manualentrysuccess_desc_noaccount_descriptorcode, interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89605Q();
            }
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-828922892);
            if (str != null) {
                interfaceC32720Et0.mo89638F(-828922860);
                m41310c = C40946fS5.m41309d(C18634R.string.stripe_manualentrysuccess_desc, new Object[]{str}, interfaceC32720Et0, 64);
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(-828922781);
                m41310c = C40946fS5.m41310c(C18634R.string.stripe_manualentrysuccess_desc_noaccount, interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89605Q();
            }
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m41310c;
    }
}
