package com.stripe.android.financialconnections.features.consent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.net.SyslogConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.p041ui.components.StringAnnotation;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.sdui.BulletUI;
import com.stripe.android.financialconnections.p041ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.C47801r06;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a]\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0002\u001aU\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001au\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001aG\u0010#\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b'\u0010&\u001a\u0019\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b(\u0010&\u001a\u0019\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b)\u0010&\u001a\u000f\u0010*\u001a\u00020\u0000H\u0001¢\u0006\u0004\b*\u0010\u0002\u001a\u000f\u0010+\u001a\u00020\u0000H\u0001¢\u0006\u0004\b+\u0010\u0002\u001a\u0019\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b,\u0010&¨\u0006-"}, m28432d2 = {"", "ConsentScreen", "(LEt0;I)V", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", TransferTable.COLUMN_STATE, "LGU2;", "bottomSheetState", "Lkotlin/Function0;", "onContinueClick", "Lkotlin/Function1;", "", "onClickableTextClick", "onConfirmModalClick", "onCloseClick", "ConsentContent", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "ConsentLoadingContent", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;", "payload", "Ldp;", "acceptConsent", "ConsentMainContent", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "LgV2;", "modifier", "", "logos", "ConsentLogoHeader", "(LgV2;Ljava/util/List;LEt0;II)V", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;", "bottomSheetMode", "LoadedContent", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;LEt0;I)V", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "consent", "ConsentFooter", "(Ldp;Lcom/stripe/android/financialconnections/model/ConsentPane;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V", "ContentPreview", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V", "ContentWithNoLogosPreview", "ContentWithPlatformLogosPreview", "ContentWithConnectedAccountLogosPreview", "ContentRequestedDataPreview", "ContentLegalDetailsPreview", "ContentManualEntryPlusMicrodeposits", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,558:1\n53#2:559\n54#2,15:561\n69#2,8:582\n79#2:593\n80#2,5:596\n76#3:560\n76#3:601\n76#3:623\n76#3:676\n76#3:706\n76#3:739\n83#4,3:576\n50#4:594\n49#4:595\n25#4:606\n460#4,13:635\n473#4,3:649\n36#4:654\n36#4:661\n460#4,13:688\n473#4,3:709\n460#4,13:751\n473#4,3:768\n1057#5,3:579\n1060#5,3:590\n1057#5,3:607\n1060#5,3:613\n1057#5,6:655\n1057#5,3:662\n1060#5,3:669\n1057#5,6:715\n1057#5,3:721\n1060#5,3:725\n474#6,4:602\n478#6,2:610\n482#6:616\n474#7:612\n68#8,5:617\n73#8:648\n77#8:653\n75#9:622\n76#9,11:624\n89#9:652\n75#9:675\n76#9,11:677\n89#9:712\n75#9:738\n76#9,11:740\n89#9:771\n1549#10:665\n1620#10,3:666\n1864#10,2:704\n1866#10:708\n154#11:672\n154#11:702\n154#11:703\n154#11:707\n154#11:714\n154#11:728\n154#11:729\n154#11:730\n154#11:731\n154#11:765\n154#11:766\n154#11:767\n79#12,2:673\n81#12:701\n85#12:713\n1#13:724\n74#14,6:732\n80#14:764\n84#14:772\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt\n*L\n82#1:559\n82#1:561,15\n82#1:582,8\n82#1:593\n82#1:596,5\n82#1:560\n86#1:601\n148#1:623\n256#1:676\n294#1:706\n371#1:739\n82#1:576,3\n82#1:594\n82#1:595\n87#1:606\n148#1:635,13\n148#1:649,3\n165#1:654\n168#1:661\n256#1:688,13\n256#1:709,3\n371#1:751,13\n371#1:768,3\n82#1:579,3\n82#1:590,3\n87#1:607,3\n87#1:613,3\n165#1:655,6\n168#1:662,3\n168#1:669,3\n365#1:715,6\n368#1:721,3\n368#1:725,3\n87#1:602,4\n87#1:610,2\n87#1:616\n87#1:612\n148#1:617,5\n148#1:648\n148#1:653\n148#1:622\n148#1:624,11\n148#1:652\n256#1:675\n256#1:677,11\n256#1:712\n371#1:738\n371#1:740,11\n371#1:771\n169#1:665\n169#1:666,3\n276#1:704,2\n276#1:708\n259#1:672\n271#1:702\n272#1:703\n298#1:707\n327#1:714\n373#1:728\n374#1:729\n375#1:730\n376#1:731\n395#1:765\n405#1:766\n423#1:767\n256#1:673,2\n256#1:701\n256#1:713\n371#1:732,6\n371#1:764\n371#1:772\n*E\n"})
/* loaded from: classes7.dex */
public final class ConsentScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConsentContent(ConsentState consentState, GU2 gu2, Function0<Unit> function0, Function1<? super String, Unit> function1, Function0<Unit> function02, Function0<Unit> function03, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(344131055);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(344131055, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentContent (ConsentScreen.kt:116)");
        }
        AbstractC19862dp<ConsentState.Payload> consent = consentState.getConsent();
        if (Intrinsics.areEqual(consent, C34454Md6.f23316e)) {
            z = true;
        } else {
            z = consent instanceof C31786At2;
        }
        if (z) {
            mo89518u.mo89638F(1235091469);
            ConsentLoadingContent(mo89518u, 0);
            mo89518u.mo89605Q();
        } else if (consent instanceof C51034wT5) {
            mo89518u.mo89638F(1235091515);
            int i2 = i << 6;
            LoadedContent((ConsentState.Payload) ((C51034wT5) consent).mo6788a(), gu2, consentState.getAcceptConsent(), function0, function03, function1, function02, consentState.getCurrentBottomSheet(), mo89518u, (i & 112) | 520 | ((i << 3) & 7168) | (57344 & (i >> 3)) | (458752 & i2) | (i2 & 3670016));
            mo89518u.mo89605Q();
        } else if (consent instanceof C32163Cj1) {
            mo89518u.mo89638F(1235091946);
            ErrorContentKt.UnclassifiedErrorContent(((C32163Cj1) consent).m111793b(), ConsentScreenKt$ConsentContent$1.INSTANCE, mo89518u, 56);
            mo89518u.mo89605Q();
        } else {
            mo89518u.mo89638F(1235092027);
            mo89518u.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ConsentContent$2(consentState, gu2, function0, function1, function02, function03, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConsentFooter(AbstractC19862dp<Unit> abstractC19862dp, ConsentPane consentPane, Function1<? super String, Unit> function1, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        G26 m105921d;
        GN5 m105174a;
        GN5 m105174a2;
        Map mapOf;
        G26 m105921d2;
        GN5 m105174a3;
        GN5 m105174a4;
        Map mapOf2;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-143566856);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-143566856, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentFooter (ConsentScreen.kt:358)");
        }
        boolean mo89539n = mo89518u.mo89539n(consentPane.getAboveCta());
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new TextResource.Text(ServerDrivenUiKt.fromHtml(consentPane.getAboveCta()));
            mo89518u.mo89503z(mo89635G);
        }
        TextResource.Text text = (TextResource.Text) mo89635G;
        boolean mo89539n2 = mo89518u.mo89539n(consentPane.getBelowCta());
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            if (consentPane.getBelowCta() != null) {
                mo89635G2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(consentPane.getBelowCta()));
            } else {
                mo89635G2 = null;
            }
            mo89518u.mo89503z(mo89635G2);
        }
        TextResource.Text text2 = (TextResource.Text) mo89635G2;
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 24;
        float f2 = 16;
        InterfaceC41563gV2 m94181l = ND3.m94181l(c20912a, C43705k61.m29303g(f), C43705k61.m29303g(f2), C43705k61.m29303g(f), C43705k61.m29303g(f));
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
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
        mo89518u.mo89638F(-652382994);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        G26 detail = financialConnectionsTheme.getTypography(mo89518u, 6).getDetail();
        C47801r06.C27748a c27748a = C47801r06.f106195b;
        m105921d = detail.m105921d((r42 & 1) != 0 ? detail.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? detail.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? detail.f10827a.m105161n() : null, (r42 & 8) != 0 ? detail.f10827a.m105163l() : null, (r42 & 16) != 0 ? detail.f10827a.m105162m() : null, (r42 & 32) != 0 ? detail.f10827a.m105166i() : null, (r42 & 64) != 0 ? detail.f10827a.m105165j() : null, (r42 & 128) != 0 ? detail.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? detail.f10827a.m105170e() : null, (r42 & 512) != 0 ? detail.f10827a.m105154u() : null, (r42 & 1024) != 0 ? detail.f10827a.m105159p() : null, (r42 & 2048) != 0 ? detail.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? detail.f10827a.m105156s() : null, (r42 & 8192) != 0 ? detail.f10827a.m105157r() : null, (r42 & 16384) != 0 ? detail.f10828b.m110652j() : C47801r06.m16685g(c27748a.m16678a()), (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? detail.f10828b.m110650l() : null, (r42 & 65536) != 0 ? detail.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? detail.f10828b.m110649m() : null);
        StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
        m105174a = r16.m105174a((r35 & 1) != 0 ? r16.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r16.f11830b : 0L, (r35 & 4) != 0 ? r16.f11831c : null, (r35 & 8) != 0 ? r16.f11832d : null, (r35 & 16) != 0 ? r16.f11833e : null, (r35 & 32) != 0 ? r16.f11834f : null, (r35 & 64) != 0 ? r16.f11835g : null, (r35 & 128) != 0 ? r16.f11836h : 0L, (r35 & 256) != 0 ? r16.f11837i : null, (r35 & 512) != 0 ? r16.f11838j : null, (r35 & 1024) != 0 ? r16.f11839k : null, (r35 & 2048) != 0 ? r16.f11840l : 0L, (r35 & 4096) != 0 ? r16.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetailEmphasized().m105925L().f11842n : null);
        StringAnnotation stringAnnotation2 = StringAnnotation.BOLD;
        m105174a2 = r17.m105174a((r35 & 1) != 0 ? r17.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r17.f11830b : 0L, (r35 & 4) != 0 ? r17.f11831c : null, (r35 & 8) != 0 ? r17.f11832d : null, (r35 & 16) != 0 ? r17.f11833e : null, (r35 & 32) != 0 ? r17.f11834f : null, (r35 & 64) != 0 ? r17.f11835g : null, (r35 & 128) != 0 ? r17.f11836h : 0L, (r35 & 256) != 0 ? r17.f11837i : null, (r35 & 512) != 0 ? r17.f11838j : null, (r35 & 1024) != 0 ? r17.f11839k : null, (r35 & 2048) != 0 ? r17.f11840l : 0L, (r35 & 4096) != 0 ? r17.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetailEmphasized().m105925L().f11842n : null);
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a), TuplesKt.m28425to(stringAnnotation2, m105174a2));
        int i2 = (i >> 3) & 112;
        TextKt.AnnotatedText(text, function1, m105921d, null, mapOf, mo89518u, i2 | 8, 8);
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f2)), mo89518u, 6);
        ButtonKt.FinancialConnectionsButton(function0, BB5.m114255n(c20912a, 0.0f, 1, null), null, null, false, abstractC19862dp instanceof C31786At2, C43575jt0.m29791b(mo89518u, 1777513479, true, new ConsentScreenKt$ConsentFooter$1$1(consentPane)), mo89518u, ((i >> 9) & 14) | 1572912, 28);
        if (text2 != null) {
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
            InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
            m105921d2 = r46.m105921d((r42 & 1) != 0 ? r46.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r46.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r46.f10827a.m105161n() : null, (r42 & 8) != 0 ? r46.f10827a.m105163l() : null, (r42 & 16) != 0 ? r46.f10827a.m105162m() : null, (r42 & 32) != 0 ? r46.f10827a.m105166i() : null, (r42 & 64) != 0 ? r46.f10827a.m105165j() : null, (r42 & 128) != 0 ? r46.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r46.f10827a.m105170e() : null, (r42 & 512) != 0 ? r46.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r46.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r46.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r46.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r46.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r46.f10828b.m110652j() : C47801r06.m16685g(c27748a.m16678a()), (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r46.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r46.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetail().f10828b.m110649m() : null);
            m105174a3 = r21.m105174a((r35 & 1) != 0 ? r21.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r21.f11830b : 0L, (r35 & 4) != 0 ? r21.f11831c : null, (r35 & 8) != 0 ? r21.f11832d : null, (r35 & 16) != 0 ? r21.f11833e : null, (r35 & 32) != 0 ? r21.f11834f : null, (r35 & 64) != 0 ? r21.f11835g : null, (r35 & 128) != 0 ? r21.f11836h : 0L, (r35 & 256) != 0 ? r21.f11837i : null, (r35 & 512) != 0 ? r21.f11838j : null, (r35 & 1024) != 0 ? r21.f11839k : null, (r35 & 2048) != 0 ? r21.f11840l : 0L, (r35 & 4096) != 0 ? r21.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetailEmphasized().m105925L().f11842n : null);
            m105174a4 = r21.m105174a((r35 & 1) != 0 ? r21.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r21.f11830b : 0L, (r35 & 4) != 0 ? r21.f11831c : null, (r35 & 8) != 0 ? r21.f11832d : null, (r35 & 16) != 0 ? r21.f11833e : null, (r35 & 32) != 0 ? r21.f11834f : null, (r35 & 64) != 0 ? r21.f11835g : null, (r35 & 128) != 0 ? r21.f11836h : 0L, (r35 & 256) != 0 ? r21.f11837i : null, (r35 & 512) != 0 ? r21.f11838j : null, (r35 & 1024) != 0 ? r21.f11839k : null, (r35 & 2048) != 0 ? r21.f11840l : 0L, (r35 & 4096) != 0 ? r21.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetailEmphasized().m105925L().f11842n : null);
            mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a3), TuplesKt.m28425to(stringAnnotation2, m105174a4));
            TextKt.AnnotatedText(text2, function1, m105921d2, m114255n, mapOf2, mo89518u, i2 | 3080, 0);
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f2)), mo89518u, 6);
        }
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
            mo89512w.mo20405a(new ConsentScreenKt$ConsentFooter$2(abstractC19862dp, consentPane, function1, function0, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConsentLoadingContent(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(348268749);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(348268749, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentLoadingContent (ConsentScreen.kt:146)");
            }
            InterfaceC41563gV2 m114257l = BB5.m114257l(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
            InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
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
            mo89518u.mo89638F(819084935);
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
            mo89512w.mo20405a(new ConsentScreenKt$ConsentLoadingContent$2(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConsentLogoHeader(InterfaceC41563gV2 interfaceC41563gV2, List<String> list, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2.C20912a c20912a;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC32720Et0 interfaceC32720Et02;
        int lastIndex;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1109014787);
        if ((i2 & 1) != 0) {
            c20912a = InterfaceC41563gV2.f82354b0;
        } else {
            c20912a = interfaceC41563gV2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1109014787, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentLogoHeader (ConsentScreen.kt:251)");
        }
        InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
        C25777lo.InterfaceC25782e m26795n = C25777lo.f96729a.m26795n(C43705k61.m29303g(16));
        int i4 = (i & 14) | 432;
        mo89518u.mo89638F(693286680);
        int i5 = i4 >> 3;
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26795n, m99138h, mo89518u, (i5 & 112) | (i5 & 14));
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
        int i6 = ((((i4 << 3) & 112) << 9) & 7168) | 6;
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
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i6 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        if (((i6 >> 9) & 14 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC41563gV22 = c20912a;
            interfaceC32720Et02 = mo89518u;
        } else {
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(-647448991);
            if (((((i4 >> 6) & 112) | 6) & 81) == 16 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
            } else {
                int i7 = 0;
                char c = 3;
                if (list.size() != 2 && list.size() != 3) {
                    mo89518u.mo89638F(1415531759);
                    C51659xX1.m5069a(C46748pE3.m19793d(C18634R.C18635drawable.stripe_logo, mo89518u, 0), null, C35447Qk0.m88106a(BB5.m114254o(BB5.m114273A(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(60)), C43705k61.m29303g(25)), C39242cc5.m61171e()), null, null, 0.0f, null, mo89518u, 56, 120);
                    mo89518u.mo89605Q();
                } else {
                    mo89518u.mo89638F(1415532059);
                    Iterator it = list.iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        int i10 = i8;
                        char c2 = c;
                        InterfaceC41563gV2 interfaceC41563gV23 = c20912a;
                        Iterator it2 = it;
                        InterfaceC32720Et0 interfaceC32720Et03 = mo89518u;
                        StripeImageKt.StripeImage((String) next, (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, C35447Qk0.m88106a(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(40)), C39242cc5.m61171e()), BA0.f1929a.m114317a(), null, C46748pE3.m19793d(C18634R.C18635drawable.stripe_ic_brandicon_institution_circle, mo89518u, i7), null, ComposableSingletons$ConsentScreenKt.INSTANCE.m116379getLambda1$financial_connections_release(), mo89518u, (StripeImageLoader.$stable << 3) | 102785408, SyslogConstants.LOG_LOCAL4);
                        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
                        if (i10 != lastIndex) {
                            i3 = 0;
                            C51659xX1.m5069a(C46748pE3.m19793d(C18634R.C18635drawable.stripe_consent_logo_ellipsis, interfaceC32720Et03, 0), null, null, null, null, 0.0f, null, interfaceC32720Et03, 56, 124);
                        } else {
                            i3 = 0;
                        }
                        mo89518u = interfaceC32720Et03;
                        i7 = i3;
                        i8 = i9;
                        c = c2;
                        c20912a = interfaceC41563gV23;
                        it = it2;
                    }
                    interfaceC41563gV22 = c20912a;
                    interfaceC32720Et02 = mo89518u;
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                }
            }
            interfaceC41563gV22 = c20912a;
            interfaceC32720Et02 = mo89518u;
            interfaceC32720Et02.mo89605Q();
        }
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89563f();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ConsentLogoHeader$2(interfaceC41563gV22, list, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r2 == p000.InterfaceC32720Et0.f8257a.m108267a()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConsentMainContent(ConsentState.Payload payload, AbstractC19862dp<Unit> abstractC19862dp, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int collectionSizeOrDefault;
        ArrayList arrayList;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2001726915);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2001726915, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentMainContent (ConsentScreen.kt:156)");
        }
        C37135Xp5 m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
        String title = payload.getConsent().getTitle();
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(title);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new TextResource.Text(ServerDrivenUiKt.fromHtml(payload.getConsent().getTitle()));
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        TextResource.Text text = (TextResource.Text) mo89635G;
        List<Bullet> bullets = payload.getConsent().getBody().getBullets();
        mo89518u.mo89638F(1157296644);
        boolean mo89539n2 = mo89518u.mo89539n(bullets);
        Object mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n2) {
            arrayList = mo89635G2;
        }
        List<Bullet> bullets2 = payload.getConsent().getBody().getBullets();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bullets2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Bullet bullet : bullets2) {
            arrayList2.add(BulletUI.Companion.from(bullet));
        }
        mo89518u.mo89503z(arrayList2);
        arrayList = arrayList2;
        mo89518u.mo89605Q();
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, 1431168558, true, new ConsentScreenKt$ConsentMainContent$1(payload, m80790a, function02, i)), C43575jt0.m29791b(mo89518u, 1247451114, true, new ConsentScreenKt$ConsentMainContent$2(m80790a, payload, abstractC19862dp, function1, function0, i, text, (List) arrayList)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ConsentMainContent$3(payload, abstractC19862dp, function1, function0, function02, i));
        }
    }

    public static final void ConsentScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment;
        Object c27850r6;
        Object obj;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-132392226);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-132392226, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentScreen (ConsentScreen.kt:79)");
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
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConsentViewModel.class);
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
                            mo89635G2 = YN2.m75139c(yn2, javaClass, ConsentState.class, abstractC35282Pr6, name, false, null, 48, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        ConsentViewModel consentViewModel = (ConsentViewModel) ((RN2) mo89635G2);
                        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
                        InterfaceC48627sP5 m12481b = C49199tN2.m12481b(consentViewModel, mo89518u, 8);
                        InterfaceC32366Df6 interfaceC32366Df6 = (InterfaceC32366Df6) mo89518u.mo89572c(C42399hu0.m35603p());
                        mo89518u.mo89638F(773894976);
                        mo89518u.mo89638F(-492369756);
                        Object mo89635G3 = mo89518u.mo89635G();
                        if (mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                            C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
                            mo89518u.mo89503z(c42992iu0);
                            mo89635G3 = c42992iu0;
                        }
                        mo89518u.mo89605Q();
                        ZC0 m31665a = ((C42992iu0) mo89635G3).m31665a();
                        mo89518u.mo89605Q();
                        GU2 m107098p = FU2.m107098p(HU2.Hidden, null, true, null, mo89518u, 390, 10);
                        C7582Sv.m84651a(m107098p.m105058l(), new ConsentScreenKt$ConsentScreen$1(m31665a, m107098p), mo89518u, 0, 0);
                        ConsentState.ViewEffect viewEffect = ((ConsentState) m12481b.getValue()).getViewEffect();
                        mo89518u.mo89638F(737606041);
                        if (viewEffect != null) {
                            Y91.m75533f(viewEffect, new ConsentScreenKt$ConsentScreen$2$1(viewEffect, interfaceC32366Df6, m107098p, consentViewModel, null), mo89518u, 64);
                            Unit unit = Unit.INSTANCE;
                        }
                        mo89518u.mo89605Q();
                        ConsentContent((ConsentState) m12481b.getValue(), m107098p, new ConsentScreenKt$ConsentScreen$3(consentViewModel), new ConsentScreenKt$ConsentScreen$4(consentViewModel), new ConsentScreenKt$ConsentScreen$5(m31665a, m107098p), new ConsentScreenKt$ConsentScreen$6(parentViewModel), mo89518u, 8);
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
            mo89512w.mo20405a(new ConsentScreenKt$ConsentScreen$7(i));
        }
    }

    public static final void ContentLegalDetailsPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-289840798);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-289840798, i, -1, "com.stripe.android.financialconnections.features.consent.ContentLegalDetailsPreview (ConsentScreen.kt:525)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ConsentScreenKt.INSTANCE.m116381getLambda3$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ContentLegalDetailsPreview$1(i));
        }
    }

    public static final void ContentManualEntryPlusMicrodeposits(ConsentState consentState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-720249361);
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
                consentState = ConsentStates.Companion.manualEntryPlusMicrodeposits();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-720249361, i, -1, "com.stripe.android.financialconnections.features.consent.ContentManualEntryPlusMicrodeposits (ConsentScreen.kt:541)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, -615193633, true, new ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1(consentState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ContentManualEntryPlusMicrodeposits$2(consentState, i, i2));
        }
    }

    public static final void ContentPreview(ConsentState consentState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2099486800);
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
                consentState = ConsentStates.Companion.canonical();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2099486800, i, -1, "com.stripe.android.financialconnections.features.consent.ContentPreview (ConsentScreen.kt:429)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, 462652352, true, new ConsentScreenKt$ContentPreview$1(consentState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ContentPreview$2(consentState, i, i2));
        }
    }

    public static final void ContentRequestedDataPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1452316251);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1452316251, i, -1, "com.stripe.android.financialconnections.features.consent.ContentRequestedDataPreview (ConsentScreen.kt:507)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ConsentScreenKt.INSTANCE.m116380getLambda2$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ContentRequestedDataPreview$1(i));
        }
    }

    public static final void ContentWithConnectedAccountLogosPreview(ConsentState consentState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1526242392);
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
                consentState = ConsentStates.Companion.withConnectedAccountLogos();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1526242392, i, -1, "com.stripe.android.financialconnections.features.consent.ContentWithConnectedAccountLogosPreview (ConsentScreen.kt:486)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, -613995960, true, new ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1(consentState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ContentWithConnectedAccountLogosPreview$2(consentState, i, i2));
        }
    }

    public static final void ContentWithNoLogosPreview(ConsentState consentState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1311925925);
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
                consentState = ConsentStates.Companion.withNoLogos();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1311925925, i, -1, "com.stripe.android.financialconnections.features.consent.ContentWithNoLogosPreview (ConsentScreen.kt:448)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, -955102389, true, new ConsentScreenKt$ContentWithNoLogosPreview$1(consentState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ContentWithNoLogosPreview$2(consentState, i, i2));
        }
    }

    public static final void ContentWithPlatformLogosPreview(ConsentState consentState, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1936393815);
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
                consentState = ConsentStates.Companion.withPlatformLogos();
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1936393815, i, -1, "com.stripe.android.financialconnections.features.consent.ContentWithPlatformLogosPreview (ConsentScreen.kt:467)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, C43575jt0.m29791b(mo89518u, 1705539481, true, new ConsentScreenKt$ContentWithPlatformLogosPreview$1(consentState)), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$ContentWithPlatformLogosPreview$2(consentState, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContent(ConsentState.Payload payload, GU2 gu2, AbstractC19862dp<Unit> abstractC19862dp, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Function0<Unit> function03, ConsentState.BottomSheetContent bottomSheetContent, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(464462356);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(464462356, i, -1, "com.stripe.android.financialconnections.features.consent.LoadedContent (ConsentScreen.kt:313)");
        }
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        long m116461getBackgroundSurface0d7_KjU = financialConnectionsTheme.getColors(mo89518u, 6).m116461getBackgroundSurface0d7_KjU();
        FU2.m107111c(C43575jt0.m29791b(mo89518u, 663984294, true, new ConsentScreenKt$LoadedContent$1(bottomSheetContent, payload, function1, function03, i)), null, gu2, C39242cc5.m61172d(C43705k61.m29303g(8)), 0.0f, m116461getBackgroundSurface0d7_KjU, 0L, C47063pm0.m18743m(financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), C43575jt0.m29791b(mo89518u, 2100077358, true, new ConsentScreenKt$LoadedContent$2(payload, abstractC19862dp, function1, function0, function02, i)), mo89518u, ((i << 3) & 896) | 100663302, 82);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConsentScreenKt$LoadedContent$3(payload, gu2, abstractC19862dp, function0, function02, function1, function03, bottomSheetContent, i));
        }
    }
}
