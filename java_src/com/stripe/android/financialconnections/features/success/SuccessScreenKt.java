package com.stripe.android.financialconnections.features.success;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutKt;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.p041ui.components.StringAnnotation;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u009d\u0001\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u0002\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\"\u0010\u0002¨\u0006#"}, m28432d2 = {"", "SuccessScreen", "(LEt0;I)V", "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;", "accessibleDataModel", "", "disconnectUrl", "", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "accounts", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "institution", "businessName", "", "loading", "skipSuccessPane", "Lkotlin/Function0;", "onDoneClick", "onLinkAnotherAccountClick", "showLinkAnotherAccount", "onLearnMoreAboutDataAccessClick", "onDisconnectLinkClick", "onCloseClick", "SuccessContent", "(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V", "SuccessLoading", "LXp5;", "scrollState", "SuccessLoaded", "(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V", "SuccessLoadedFooter", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "getSubtitle", "(Ljava/lang/String;Ljava/util/List;LEt0;I)Ljava/lang/String;", "SuccessScreenPreview", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuccessScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessScreen.kt\ncom/stripe/android/financialconnections/features/success/SuccessScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,342:1\n53#2:343\n54#2,15:345\n69#2,8:366\n79#2:377\n80#2,5:380\n76#3:344\n76#3:385\n76#3:393\n76#3:429\n76#3:487\n83#4,3:360\n50#4:378\n49#4:379\n460#4,13:405\n460#4,13:441\n36#4:459\n473#4,3:467\n473#4,3:472\n460#4,13:499\n473#4,3:514\n1057#5,3:363\n1060#5,3:374\n1057#5,6:460\n74#6,6:386\n80#6:418\n74#6,6:422\n80#6:454\n84#6:471\n84#6:476\n74#6,6:480\n80#6:512\n84#6:518\n75#7:392\n76#7,11:394\n75#7:428\n76#7,11:430\n89#7:470\n89#7:475\n75#7:486\n76#7,11:488\n89#7:517\n154#8:419\n154#8:420\n154#8:421\n154#8:455\n154#8:456\n154#8:457\n154#8:458\n154#8:466\n154#8:477\n154#8:478\n154#8:479\n154#8:513\n*S KotlinDebug\n*F\n+ 1 SuccessScreen.kt\ncom/stripe/android/financialconnections/features/success/SuccessScreenKt\n*L\n48#1:343\n48#1:345,15\n48#1:366,8\n48#1:377\n48#1:380,5\n48#1:344\n141#1:385\n142#1:393\n146#1:429\n219#1:487\n48#1:360,3\n48#1:378\n48#1:379\n142#1:405,13\n146#1:441,13\n182#1:459\n146#1:467,3\n142#1:472,3\n219#1:499,13\n219#1:514,3\n48#1:363,3\n48#1:374,3\n182#1:460,6\n142#1:386,6\n142#1:418\n146#1:422,6\n146#1:454\n146#1:471\n142#1:476\n219#1:480,6\n219#1:512\n219#1:518\n142#1:392\n142#1:394,11\n146#1:428\n146#1:430,11\n146#1:470\n142#1:475\n219#1:486\n219#1:488,11\n219#1:517\n151#1:419\n152#1:420\n153#1:421\n157#1:455\n162#1:456\n169#1:457\n177#1:458\n185#1:466\n221#1:477\n222#1:478\n223#1:479\n236#1:513\n*E\n"})
/* loaded from: classes7.dex */
public final class SuccessScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void SuccessContent(AccessibleDataCalloutModel accessibleDataCalloutModel, String str, List<PartnerAccount> list, FinancialConnectionsInstitution financialConnectionsInstitution, String str2, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, boolean z3, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-27112207);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-27112207, i, i2, "com.stripe.android.financialconnections.features.success.SuccessContent (SuccessScreen.kt:70)");
        }
        C37135Xp5 m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, -536243230, true, new SuccessScreenKt$SuccessContent$1(m80790a, function05, i2)), C43575jt0.m29791b(mo89518u, -664471138, true, new SuccessScreenKt$SuccessContent$2(z2, m80790a, str2, list, accessibleDataCalloutModel, str, financialConnectionsInstitution, z, z3, function03, function04, function02, function0, i, i2)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new SuccessScreenKt$SuccessContent$3(accessibleDataCalloutModel, str, list, financialConnectionsInstitution, str2, z, z2, function0, function02, z3, function03, function04, function05, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r15v20 */
    public static final void SuccessLoaded(C37135Xp5 c37135Xp5, String str, List<PartnerAccount> list, AccessibleDataCalloutModel accessibleDataCalloutModel, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        ?? r15;
        G26 m105921d;
        GN5 m105174a;
        Map mapOf;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-490778415);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-490778415, i, i2, "com.stripe.android.financialconnections.features.success.SuccessLoaded (SuccessScreen.kt:126)");
        }
        InterfaceC32366Df6 interfaceC32366Df6 = (InterfaceC32366Df6) mo89518u.mo89572c(C42399hu0.m35603p());
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114257l = BB5.m114257l(c20912a, 0.0f, 1, null);
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
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(-927097657);
        float f = 8;
        float f2 = 24;
        InterfaceC41563gV2 m94180m = ND3.m94180m(C36433Up5.m80787d(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), c37135Xp5, false, null, false, 14, null), C43705k61.m29303g(f2), C43705k61.m29303g(f), C43705k61.m29303g(f2), 0.0f, 8, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
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
        C38680bf6.m64191b(m64192a2, m91546a2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        mo89518u.mo89638F(874707389);
        InterfaceC41563gV2 m114246w = BB5.m114246w(c20912a, C43705k61.m29303g(40));
        AbstractC45562nE3 m19793d = C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_check_circle, mo89518u, 0);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        DP1.m110533b(m19793d, null, m114246w, financialConnectionsTheme.getColors(mo89518u, 6).m116475getTextSuccess0d7_KjU(), mo89518u, 440, 0);
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(16)), mo89518u, 6);
        C38909c26.m62000e(C40946fS5.m41310c(C18634R.string.stripe_success_title, mo89518u, 0), BB5.m114255n(c20912a, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getSubtitle(), mo89518u, 48, 0, 32764);
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
        C38909c26.m62000e(getSubtitle(str, list, mo89518u, ((i >> 3) & 14) | 64), BB5.m114255n(c20912a, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getBody(), mo89518u, 48, 0, 32764);
        mo89518u.mo89638F(93760252);
        if (!list.isEmpty()) {
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f2)), mo89518u, 6);
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(function0);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new SuccessScreenKt$SuccessLoaded$1$1$1$1(function0);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            r15 = 0;
            AccessibleDataCalloutKt.AccessibleDataCalloutWithAccounts(accessibleDataCalloutModel, financialConnectionsInstitution, list, (Function0) mo89635G, mo89518u, ((i >> 12) & 112) | 520);
        } else {
            r15 = 0;
        }
        mo89518u.mo89605Q();
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(12)), mo89518u, 6);
        TextResource.StringId stringId = new TextResource.StringId(C18634R.string.success_pane_disconnect, r15, 2, r15);
        SuccessScreenKt$SuccessLoaded$1$1$2 successScreenKt$SuccessLoaded$1$1$2 = new SuccessScreenKt$SuccessLoaded$1$1$2(function02, interfaceC32366Df6, str2);
        m105921d = r41.m105921d((r42 & 1) != 0 ? r41.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r41.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r41.f10827a.m105161n() : null, (r42 & 8) != 0 ? r41.f10827a.m105163l() : null, (r42 & 16) != 0 ? r41.f10827a.m105162m() : null, (r42 & 32) != 0 ? r41.f10827a.m105166i() : null, (r42 & 64) != 0 ? r41.f10827a.m105165j() : null, (r42 & 128) != 0 ? r41.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r41.f10827a.m105170e() : null, (r42 & 512) != 0 ? r41.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r41.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r41.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r41.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r41.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r41.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r41.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r41.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaption().f10828b.m110649m() : null);
        StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
        m105174a = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a));
        TextKt.AnnotatedText(stringId, successScreenKt$SuccessLoaded$1$1$2, m105921d, null, mapOf, mo89518u, 8, 8);
        DN5.m110552a(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), mo89518u, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        int i3 = i2 << 6;
        SuccessLoadedFooter(z2, z, function03, function04, mo89518u, ((i >> 21) & 14) | ((i >> 15) & 112) | (i3 & 896) | (i3 & 7168));
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
        mo89512w.mo20405a(new SuccessScreenKt$SuccessLoaded$2(c37135Xp5, str, list, accessibleDataCalloutModel, str2, financialConnectionsInstitution, z, z2, function0, function02, function03, function04, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SuccessLoadedFooter(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(546680407);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z2)) {
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
        int i8 = i2;
        if ((i8 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(546680407, i8, -1, "com.stripe.android.financialconnections.features.success.SuccessLoadedFooter (SuccessScreen.kt:212)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            float f = 24;
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, C43705k61.m29303g(f), 0.0f, C43705k61.m29303g(f), C43705k61.m29303g(f), 2, null);
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
            mo89518u.mo89638F(1940019277);
            mo89518u.mo89638F(-741697717);
            if (z) {
                i3 = i8;
                ButtonKt.FinancialConnectionsButton(function0, BB5.m114255n(c20912a, 0.0f, 1, null), FinancialConnectionsButton.Type.Secondary.INSTANCE, null, !z2, false, ComposableSingletons$SuccessScreenKt.INSTANCE.m116412getLambda1$financial_connections_release(), mo89518u, ((i8 >> 6) & 14) | 1573296, 40);
                DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(8)), mo89518u, 6);
            } else {
                i3 = i8;
            }
            mo89518u.mo89605Q();
            ButtonKt.FinancialConnectionsButton(function02, BB5.m114255n(c20912a, 0.0f, 1, null), null, null, false, z2, ComposableSingletons$SuccessScreenKt.INSTANCE.m116413getLambda2$financial_connections_release(), mo89518u, ((i3 >> 9) & 14) | 1572912 | ((i3 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 28);
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
            mo89512w.mo20405a(new SuccessScreenKt$SuccessLoadedFooter$2(z, z2, function0, function02, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SuccessLoading(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-385601937);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-385601937, i, -1, "com.stripe.android.financialconnections.features.success.SuccessLoading (SuccessScreen.kt:117)");
            }
            LoadingContentKt.LoadingContent(null, C40946fS5.m41310c(C18634R.string.stripe_success_pane_skip_title, mo89518u, 0), C40946fS5.m41310c(C18634R.string.stripe_success_pane_skip_desc, mo89518u, 0), mo89518u, 0, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SuccessScreenKt$SuccessLoading$1(i));
        }
    }

    public static final void SuccessScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment;
        Object c27850r6;
        Object obj;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1677297867);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1677297867, i, -1, "com.stripe.android.financialconnections.features.success.SuccessScreen (SuccessScreen.kt:46)");
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
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SuccessViewModel.class);
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
                            mo89635G2 = YN2.m75139c(yn2, javaClass, SuccessState.class, abstractC35282Pr6, name, false, null, 48, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        SuccessViewModel successViewModel = (SuccessViewModel) ((RN2) mo89635G2);
                        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
                        InterfaceC48627sP5 m12481b = C49199tN2.m12481b(successViewModel, mo89518u, 8);
                        C7582Sv.m84651a(true, SuccessScreenKt$SuccessScreen$1.INSTANCE, mo89518u, 54, 0);
                        SuccessState.Payload mo6788a = ((SuccessState) m12481b.getValue()).getPayload().mo6788a();
                        if (mo6788a == null) {
                            interfaceC32720Et02 = mo89518u;
                        } else {
                            AccessibleDataCalloutModel accessibleData = mo6788a.getAccessibleData();
                            String disconnectUrl = mo6788a.getDisconnectUrl();
                            List<PartnerAccount> data = mo6788a.getAccounts().getData();
                            FinancialConnectionsInstitution institution = mo6788a.getInstitution();
                            String businessName = mo6788a.getBusinessName();
                            boolean z2 = ((SuccessState) m12481b.getValue()).getCompleteSession() instanceof C31786At2;
                            boolean skipSuccessPane = mo6788a.getSkipSuccessPane();
                            SuccessScreenKt$SuccessScreen$2$1 successScreenKt$SuccessScreen$2$1 = new SuccessScreenKt$SuccessScreen$2$1(successViewModel);
                            SuccessScreenKt$SuccessScreen$2$2 successScreenKt$SuccessScreen$2$2 = new SuccessScreenKt$SuccessScreen$2$2(successViewModel);
                            boolean showLinkAnotherAccount = mo6788a.getShowLinkAnotherAccount();
                            SuccessScreenKt$SuccessScreen$2$3 successScreenKt$SuccessScreen$2$3 = new SuccessScreenKt$SuccessScreen$2$3(successViewModel);
                            SuccessScreenKt$SuccessScreen$2$4 successScreenKt$SuccessScreen$2$4 = new SuccessScreenKt$SuccessScreen$2$4(successViewModel);
                            SuccessScreenKt$SuccessScreen$2$5 successScreenKt$SuccessScreen$2$5 = new SuccessScreenKt$SuccessScreen$2$5(parentViewModel);
                            interfaceC32720Et02 = mo89518u;
                            SuccessContent(accessibleData, disconnectUrl, data, institution, businessName, z2, skipSuccessPane, successScreenKt$SuccessScreen$2$1, successScreenKt$SuccessScreen$2$2, showLinkAnotherAccount, successScreenKt$SuccessScreen$2$3, successScreenKt$SuccessScreen$2$4, successScreenKt$SuccessScreen$2$5, mo89518u, 520, 0);
                        }
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
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SuccessScreenKt$SuccessScreen$3(i));
        }
    }

    public static final void SuccessScreenPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1610868177);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1610868177, i, -1, "com.stripe.android.financialconnections.features.success.SuccessScreenPreview (SuccessScreen.kt:269)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$SuccessScreenKt.INSTANCE.m116414getLambda3$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SuccessScreenKt$SuccessScreenPreview$1(i));
        }
    }

    private static final String getSubtitle(String str, List<PartnerAccount> list, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String m41312a;
        interfaceC32720Et0.mo89638F(1009443858);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1009443858, i, -1, "com.stripe.android.financialconnections.features.success.getSubtitle (SuccessScreen.kt:250)");
        }
        if (str != null) {
            interfaceC32720Et0.mo89638F(-845789671);
            m41312a = C40946fS5.m41311b(C18634R.plurals.stripe_success_desc, list.size(), new Object[]{str}, interfaceC32720Et0, 512);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-845789544);
            m41312a = C40946fS5.m41312a(C18634R.plurals.stripe_success_desc_no_business, list.size(), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m41312a;
    }
}
