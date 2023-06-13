package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.domain.PartnerNotice;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.StringAnnotation;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"LgV2;", "modifier", "Lcom/stripe/android/financialconnections/domain/PartnerNotice;", "partnerNotice", "Lkotlin/Function1;", "", "", "onClickableTextClick", "PartnerCallout", "(LgV2;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lkotlin/jvm/functions/Function1;LEt0;II)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartnerCallout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerCallout.kt\ncom/stripe/android/financialconnections/features/common/PartnerCalloutKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,64:1\n154#2:65\n154#2:66\n154#2:101\n154#2:102\n154#2:103\n75#3,6:67\n81#3:99\n85#3:108\n75#4:73\n76#4,11:75\n89#4:107\n76#5:74\n76#5:100\n460#6,13:86\n473#6,3:104\n*S KotlinDebug\n*F\n+ 1 PartnerCallout.kt\ncom/stripe/android/financialconnections/features/common/PartnerCalloutKt\n*L\n32#1:65\n34#1:66\n41#1:101\n42#1:102\n44#1:103\n29#1:67,6\n29#1:99\n29#1:108\n29#1:73\n29#1:75,11\n29#1:107\n29#1:74\n38#1:100\n29#1:86,13\n29#1:104,3\n*E\n"})
/* loaded from: classes7.dex */
public final class PartnerCalloutKt {
    public static final void PartnerCallout(InterfaceC41563gV2 interfaceC41563gV2, PartnerNotice partnerNotice, Function1<? super String, Unit> onClickableTextClick, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        G26 m105921d;
        GN5 m105174a;
        GN5 m105174a2;
        Map mapOf;
        Intrinsics.checkNotNullParameter(partnerNotice, "partnerNotice");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1954214451);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            obj = interfaceC41563gV2;
        } else if ((i & 14) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = interfaceC41563gV2;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(partnerNotice)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onClickableTextClick)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i7 != 0) {
                c20912a = InterfaceC41563gV2.f82354b0;
            } else {
                c20912a = obj;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1954214451, i3, -1, "com.stripe.android.financialconnections.features.common.PartnerCallout (PartnerCallout.kt:23)");
            }
            InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(BB5.m114255n(c20912a, 0.0f, 1, null), C39242cc5.m61172d(C43705k61.m29303g(8)));
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            InterfaceC41563gV2 m94184i = ND3.m94184i(C13342bw.m62124d(m88106a, financialConnectionsTheme.getColors(mo89518u, 6).m116460getBackgroundContainer0d7_KjU(), null, 2, null), C43705k61.m29303g(12));
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), InterfaceC4360K9.f19170a.m99135k(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94184i);
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
            mo89518u.mo89638F(2074391857);
            String str = partnerNotice.getPartnerIcon().getDefault();
            if (str == null) {
                str = "";
            }
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            StripeImageKt.StripeImage(str, (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, C35447Qk0.m88106a(BB5.m114246w(c20912a2, C43705k61.m29303g(24)), C39242cc5.m61172d(C43705k61.m29303g(6))), null, null, null, null, null, mo89518u, (StripeImageLoader.$stable << 3) | 384, 496);
            DN5.m110552a(BB5.m114246w(c20912a2, C43705k61.m29303g(16)), mo89518u, 6);
            TextResource.Text text = new TextResource.Text(ServerDrivenUiKt.fromHtml(partnerNotice.getText()));
            m105921d = r26.m105921d((r42 & 1) != 0 ? r26.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r26.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r26.f10827a.m105161n() : null, (r42 & 8) != 0 ? r26.f10827a.m105163l() : null, (r42 & 16) != 0 ? r26.f10827a.m105162m() : null, (r42 & 32) != 0 ? r26.f10827a.m105166i() : null, (r42 & 64) != 0 ? r26.f10827a.m105165j() : null, (r42 & 128) != 0 ? r26.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r26.f10827a.m105170e() : null, (r42 & 512) != 0 ? r26.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r26.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r26.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r26.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r26.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r26.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r26.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r26.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaption().f10828b.m110649m() : null);
            StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
            m105174a = r14.m105174a((r35 & 1) != 0 ? r14.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r14.f11830b : 0L, (r35 & 4) != 0 ? r14.f11831c : null, (r35 & 8) != 0 ? r14.f11832d : null, (r35 & 16) != 0 ? r14.f11833e : null, (r35 & 32) != 0 ? r14.f11834f : null, (r35 & 64) != 0 ? r14.f11835g : null, (r35 & 128) != 0 ? r14.f11836h : 0L, (r35 & 256) != 0 ? r14.f11837i : null, (r35 & 512) != 0 ? r14.f11838j : null, (r35 & 1024) != 0 ? r14.f11839k : null, (r35 & 2048) != 0 ? r14.f11840l : 0L, (r35 & 4096) != 0 ? r14.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
            StringAnnotation stringAnnotation2 = StringAnnotation.BOLD;
            m105174a2 = r13.m105174a((r35 & 1) != 0 ? r13.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r13.f11830b : 0L, (r35 & 4) != 0 ? r13.f11831c : null, (r35 & 8) != 0 ? r13.f11832d : null, (r35 & 16) != 0 ? r13.f11833e : null, (r35 & 32) != 0 ? r13.f11834f : null, (r35 & 64) != 0 ? r13.f11835g : null, (r35 & 128) != 0 ? r13.f11836h : 0L, (r35 & 256) != 0 ? r13.f11837i : null, (r35 & 512) != 0 ? r13.f11838j : null, (r35 & 1024) != 0 ? r13.f11839k : null, (r35 & 2048) != 0 ? r13.f11840l : 0L, (r35 & 4096) != 0 ? r13.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a), TuplesKt.m28425to(stringAnnotation2, m105174a2));
            InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
            TextKt.AnnotatedText(text, onClickableTextClick, m105921d, null, mapOf, mo89518u, ((i3 >> 3) & 112) | 8, 8);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            obj = interfaceC41563gV22;
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PartnerCalloutKt$PartnerCallout$2(obj, partnerNotice, onClickableTextClick, i, i2));
        }
    }
}
