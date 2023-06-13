package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.components.StringAnnotation;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.sdui.BulletUI;
import com.stripe.android.financialconnections.p041ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\u001ak\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "dataDialog", "Lkotlin/Function1;", "", "", "onClickableTextClick", "Lkotlin/Function0;", "onConfirmModalClick", "DataAccessBottomSheetContent", "(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "legalDetails", "LegalDetailsBottomSheetContent", "(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V", "Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "title", "subtitle", "", "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;", "bullets", "Lcom/stripe/android/financialconnections/ui/TextResource;", "connectedAccountNotice", "cta", "learnMore", "ModalBottomSheetContent", "(Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;LEt0;I)V", "bullet", "BulletItem", "(Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;Lkotlin/jvm/functions/Function1;LEt0;I)V", "iconUrl", "BulletIcon", "(Ljava/lang/String;LEt0;I)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModalBottomSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,315:1\n1057#2,6:316\n1057#2,3:322\n1060#2,3:326\n1057#2,6:329\n1057#2,6:335\n1057#2,3:341\n1060#2,3:348\n1057#2,6:351\n1057#2,6:357\n1057#2,3:363\n1060#2,3:370\n1057#2,6:489\n1057#2,6:591\n1#3:325\n1549#4:344\n1620#4,3:345\n1549#4:366\n1620#4,3:367\n1855#4:442\n1856#4:444\n73#5,7:373\n80#5:406\n74#5,6:408\n80#5:440\n84#5:449\n74#5,6:453\n80#5:485\n84#5:499\n84#5:504\n73#5,7:540\n80#5:573\n84#5:579\n75#6:380\n76#6,11:382\n75#6:414\n76#6,11:416\n89#6:448\n75#6:459\n76#6,11:461\n89#6:498\n89#6:503\n75#6:512\n76#6,11:514\n75#6:547\n76#6,11:549\n89#6:578\n89#6:583\n76#7:381\n76#7:415\n76#7:460\n76#7:513\n76#7:548\n76#7:597\n460#8,13:393\n460#8,13:427\n473#8,3:445\n460#8,13:472\n36#8:488\n473#8,3:495\n473#8,3:500\n460#8,13:525\n460#8,13:560\n473#8,3:575\n473#8,3:580\n36#8:590\n154#9:407\n154#9:441\n154#9:443\n154#9:450\n154#9:451\n154#9:452\n154#9:486\n154#9:487\n154#9:539\n154#9:574\n154#9:585\n154#9:586\n154#9:587\n154#9:588\n154#9:589\n74#10,7:505\n81#10:538\n85#10:584\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt\n*L\n40#1:316,6\n43#1:322,3\n43#1:326,3\n46#1:329,6\n49#1:335,6\n52#1:341,3\n52#1:348,3\n73#1:351,6\n76#1:357,6\n79#1:363,3\n79#1:370,3\n189#1:489,6\n295#1:591,6\n53#1:344\n53#1:345,3\n80#1:366\n80#1:367,3\n139#1:442\n139#1:444\n106#1:373,7\n106#1:406\n107#1:408,6\n107#1:440\n107#1:449\n147#1:453,6\n147#1:485\n147#1:499\n106#1:504\n206#1:540,7\n206#1:573\n206#1:579\n106#1:380\n106#1:382,11\n107#1:414\n107#1:416,11\n107#1:448\n147#1:459\n147#1:461,11\n147#1:498\n106#1:503\n203#1:512\n203#1:514,11\n206#1:547\n206#1:549,11\n206#1:578\n203#1:583\n106#1:381\n107#1:415\n147#1:460\n203#1:513\n206#1:548\n309#1:597\n106#1:393,13\n107#1:427,13\n107#1:445,3\n147#1:472,13\n189#1:488\n147#1:495,3\n106#1:500,3\n203#1:525,13\n206#1:560,13\n206#1:575,3\n203#1:580,3\n295#1:590\n111#1:407\n122#1:441\n140#1:443\n149#1:450\n150#1:451\n151#1:452\n170#1:486\n187#1:487\n205#1:539\n225#1:574\n286#1:585\n287#1:586\n292#1:587\n293#1:588\n294#1:589\n203#1:505,7\n203#1:538\n203#1:584\n*E\n"})
/* loaded from: classes7.dex */
public final class ModalBottomSheetContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BulletIcon(String str, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(225830753);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(str)) {
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
                C35528Qt0.m87816Z(225830753, i2, -1, "com.stripe.android.financialconnections.features.common.BulletIcon (ModalBottomSheetContent.kt:283)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            float f = 16;
            float f2 = 2;
            InterfaceC41563gV2 m106815c = C32822Fe3.m106815c(BB5.m114246w(c20912a, C43705k61.m29303g(f)), 0.0f, C43705k61.m29303g(f2), 1, null);
            if (str == null) {
                mo89518u.mo89638F(754185021);
                long m116473getTextPrimary0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU();
                InterfaceC41563gV2 m106815c2 = C32822Fe3.m106815c(ND3.m94184i(BB5.m114246w(c20912a, C43705k61.m29303g(f)), C43705k61.m29303g(6)), 0.0f, C43705k61.m29303g(f2), 1, null);
                C47063pm0 m18747i = C47063pm0.m18747i(m116473getTextPrimary0d7_KjU);
                mo89518u.mo89638F(1157296644);
                boolean mo89539n = mo89518u.mo89539n(m18747i);
                Object mo89635G = mo89518u.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new ModalBottomSheetContentKt$BulletIcon$1$1(m116473getTextPrimary0d7_KjU);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                C48169re0.m15656a(m106815c2, (Function1) mo89635G, mo89518u, 6);
                mo89518u.mo89605Q();
            } else {
                mo89518u.mo89638F(754185277);
                StripeImageKt.StripeImage(str, (StripeImageLoader) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, m106815c, null, null, null, ComposableSingletons$ModalBottomSheetContentKt.INSTANCE.m116378getLambda1$financial_connections_release(), null, mo89518u, 12586368 | (i2 & 14) | (StripeImageLoader.$stable << 3), 368);
                mo89518u.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ModalBottomSheetContentKt$BulletIcon$2(str, i));
        }
    }

    public static final void BulletItem(BulletUI bullet, Function1<? super String, Unit> onClickableTextClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        G26 m105921d;
        GN5 m105174a;
        GN5 m105174a2;
        Map mapOf;
        G26 m105921d2;
        GN5 m105174a3;
        GN5 m105174a4;
        Map mapOf2;
        G26 m105921d3;
        GN5 m105174a5;
        GN5 m105174a6;
        Map mapOf3;
        G26 m105921d4;
        GN5 m105174a7;
        GN5 m105174a8;
        Map mapOf4;
        Intrinsics.checkNotNullParameter(bullet, "bullet");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-948325975);
        if ((i & 14) == 0) {
            i2 = (mo89518u.mo89539n(bullet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo89518u.mo89539n(onClickableTextClick) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-948325975, i2, -1, "com.stripe.android.financialconnections.features.common.BulletItem (ModalBottomSheetContent.kt:198)");
            }
            mo89518u.mo89638F(693286680);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            C25777lo c25777lo = C25777lo.f96729a;
            C25777lo.InterfaceC25781d m26803f = c25777lo.m26803f();
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26803f, c4361a.m99135k(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
            mo89518u.mo89638F(-493786683);
            BulletIcon(bullet.getIcon(), mo89518u, 0);
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(8)), mo89518u, 6);
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
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
            C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            mo89518u.mo89638F(507399055);
            if (bullet.getTitle() != null && bullet.getContent() != null) {
                mo89518u.mo89638F(2107397796);
                TextResource title = bullet.getTitle();
                FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                m105921d3 = r17.m105921d((r42 & 1) != 0 ? r17.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), (r42 & 2) != 0 ? r17.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r17.f10827a.m105161n() : null, (r42 & 8) != 0 ? r17.f10827a.m105163l() : null, (r42 & 16) != 0 ? r17.f10827a.m105162m() : null, (r42 & 32) != 0 ? r17.f10827a.m105166i() : null, (r42 & 64) != 0 ? r17.f10827a.m105165j() : null, (r42 & 128) != 0 ? r17.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r17.f10827a.m105170e() : null, (r42 & 512) != 0 ? r17.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r17.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r17.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r17.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r17.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r17.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r17.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r17.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getBody().f10828b.m110649m() : null);
                StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
                m105174a5 = r17.m105174a((r35 & 1) != 0 ? r17.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r17.f11830b : 0L, (r35 & 4) != 0 ? r17.f11831c : null, (r35 & 8) != 0 ? r17.f11832d : null, (r35 & 16) != 0 ? r17.f11833e : null, (r35 & 32) != 0 ? r17.f11834f : null, (r35 & 64) != 0 ? r17.f11835g : null, (r35 & 128) != 0 ? r17.f11836h : 0L, (r35 & 256) != 0 ? r17.f11837i : null, (r35 & 512) != 0 ? r17.f11838j : null, (r35 & 1024) != 0 ? r17.f11839k : null, (r35 & 2048) != 0 ? r17.f11840l : 0L, (r35 & 4096) != 0 ? r17.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                StringAnnotation stringAnnotation2 = StringAnnotation.BOLD;
                m105174a6 = r17.m105174a((r35 & 1) != 0 ? r17.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), (r35 & 2) != 0 ? r17.f11830b : 0L, (r35 & 4) != 0 ? r17.f11831c : null, (r35 & 8) != 0 ? r17.f11832d : null, (r35 & 16) != 0 ? r17.f11833e : null, (r35 & 32) != 0 ? r17.f11834f : null, (r35 & 64) != 0 ? r17.f11835g : null, (r35 & 128) != 0 ? r17.f11836h : 0L, (r35 & 256) != 0 ? r17.f11837i : null, (r35 & 512) != 0 ? r17.f11838j : null, (r35 & 1024) != 0 ? r17.f11839k : null, (r35 & 2048) != 0 ? r17.f11840l : 0L, (r35 & 4096) != 0 ? r17.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                mapOf3 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a5), TuplesKt.m28425to(stringAnnotation2, m105174a6));
                int i3 = i2 & 112;
                TextKt.AnnotatedText(title, onClickableTextClick, m105921d3, null, mapOf3, mo89518u, i3, 8);
                DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(2)), mo89518u, 6);
                TextResource content = bullet.getContent();
                m105921d4 = r44.m105921d((r42 & 1) != 0 ? r44.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r44.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r44.f10827a.m105161n() : null, (r42 & 8) != 0 ? r44.f10827a.m105163l() : null, (r42 & 16) != 0 ? r44.f10827a.m105162m() : null, (r42 & 32) != 0 ? r44.f10827a.m105166i() : null, (r42 & 64) != 0 ? r44.f10827a.m105165j() : null, (r42 & 128) != 0 ? r44.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r44.f10827a.m105170e() : null, (r42 & 512) != 0 ? r44.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r44.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r44.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r44.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r44.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r44.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r44.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r44.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetail().f10828b.m110649m() : null);
                m105174a7 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetailEmphasized().m105925L().f11842n : null);
                m105174a8 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetailEmphasized().m105925L().f11842n : null);
                mapOf4 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a7), TuplesKt.m28425to(stringAnnotation2, m105174a8));
                TextKt.AnnotatedText(content, onClickableTextClick, m105921d4, null, mapOf4, mo89518u, i3, 8);
                mo89518u.mo89605Q();
            } else if (bullet.getTitle() != null) {
                mo89518u.mo89638F(2107399515);
                TextResource title2 = bullet.getTitle();
                FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
                m105921d2 = r19.m105921d((r42 & 1) != 0 ? r19.f10827a.m105168g() : financialConnectionsTheme2.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), (r42 & 2) != 0 ? r19.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r19.f10827a.m105161n() : null, (r42 & 8) != 0 ? r19.f10827a.m105163l() : null, (r42 & 16) != 0 ? r19.f10827a.m105162m() : null, (r42 & 32) != 0 ? r19.f10827a.m105166i() : null, (r42 & 64) != 0 ? r19.f10827a.m105165j() : null, (r42 & 128) != 0 ? r19.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r19.f10827a.m105170e() : null, (r42 & 512) != 0 ? r19.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r19.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r19.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r19.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r19.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r19.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r19.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r19.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getBody().f10828b.m110649m() : null);
                StringAnnotation stringAnnotation3 = StringAnnotation.CLICKABLE;
                m105174a3 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme2.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                StringAnnotation stringAnnotation4 = StringAnnotation.BOLD;
                m105174a4 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme2.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation3, m105174a3), TuplesKt.m28425to(stringAnnotation4, m105174a4));
                TextKt.AnnotatedText(title2, onClickableTextClick, m105921d2, null, mapOf2, mo89518u, i2 & 112, 8);
                mo89518u.mo89605Q();
            } else if (bullet.getContent() != null) {
                mo89518u.mo89638F(2107400388);
                TextResource content2 = bullet.getContent();
                FinancialConnectionsTheme financialConnectionsTheme3 = FinancialConnectionsTheme.INSTANCE;
                m105921d = r19.m105921d((r42 & 1) != 0 ? r19.f10827a.m105168g() : financialConnectionsTheme3.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r19.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r19.f10827a.m105161n() : null, (r42 & 8) != 0 ? r19.f10827a.m105163l() : null, (r42 & 16) != 0 ? r19.f10827a.m105162m() : null, (r42 & 32) != 0 ? r19.f10827a.m105166i() : null, (r42 & 64) != 0 ? r19.f10827a.m105165j() : null, (r42 & 128) != 0 ? r19.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r19.f10827a.m105170e() : null, (r42 & 512) != 0 ? r19.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r19.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r19.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r19.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r19.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r19.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r19.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r19.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme3.getTypography(mo89518u, 6).getBody().f10828b.m110649m() : null);
                StringAnnotation stringAnnotation5 = StringAnnotation.CLICKABLE;
                m105174a = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme3.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme3.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                StringAnnotation stringAnnotation6 = StringAnnotation.BOLD;
                m105174a2 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme3.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme3.getTypography(mo89518u, 6).getBodyEmphasized().m105925L().f11842n : null);
                mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation5, m105174a), TuplesKt.m28425to(stringAnnotation6, m105174a2));
                TextKt.AnnotatedText(content2, onClickableTextClick, m105921d, null, mapOf, mo89518u, i2 & 112, 8);
                mo89518u.mo89605Q();
            } else {
                mo89518u.mo89638F(2107401206);
                mo89518u.mo89605Q();
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
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new ModalBottomSheetContentKt$BulletItem$2(bullet, onClickableTextClick, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
        if (r3 == p000.InterfaceC32720Et0.f8257a.m108267a()) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DataAccessBottomSheetContent(DataAccessNotice dataDialog, Function1<? super String, Unit> onClickableTextClick, Function0<Unit> onConfirmModalClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int collectionSizeOrDefault;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dataDialog, "dataDialog");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(onConfirmModalClick, "onConfirmModalClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1941374581);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1941374581, i, -1, "com.stripe.android.financialconnections.features.common.DataAccessBottomSheetContent (ModalBottomSheetContent.kt:34)");
        }
        boolean mo89539n = mo89518u.mo89539n(dataDialog.getTitle());
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new TextResource.Text(ServerDrivenUiKt.fromHtml(dataDialog.getTitle()));
            mo89518u.mo89503z(mo89635G);
        }
        TextResource.Text text = (TextResource.Text) mo89635G;
        boolean mo89539n2 = mo89518u.mo89539n(dataDialog.getSubtitle());
        Object mo89635G2 = mo89518u.mo89635G();
        TextResource.Text text2 = null;
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            String subtitle = dataDialog.getSubtitle();
            if (subtitle != null) {
                mo89635G2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(subtitle));
            } else {
                mo89635G2 = null;
            }
            mo89518u.mo89503z(mo89635G2);
        }
        TextResource.Text text3 = (TextResource.Text) mo89635G2;
        boolean mo89539n3 = mo89518u.mo89539n(dataDialog.getLearnMore());
        Object mo89635G3 = mo89518u.mo89635G();
        if (mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G3 = new TextResource.Text(ServerDrivenUiKt.fromHtml(dataDialog.getLearnMore()));
            mo89518u.mo89503z(mo89635G3);
        }
        TextResource.Text text4 = (TextResource.Text) mo89635G3;
        boolean mo89539n4 = mo89518u.mo89539n(dataDialog.getConnectedAccountNotice());
        Object mo89635G4 = mo89518u.mo89635G();
        if (mo89539n4 || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
            String connectedAccountNotice = dataDialog.getConnectedAccountNotice();
            if (connectedAccountNotice != null) {
                text2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(connectedAccountNotice));
            }
            mo89518u.mo89503z(text2);
            mo89635G4 = text2;
        }
        TextResource.Text text5 = (TextResource.Text) mo89635G4;
        boolean mo89539n5 = mo89518u.mo89539n(dataDialog.getBody().getBullets());
        Object mo89635G5 = mo89518u.mo89635G();
        if (!mo89539n5) {
            arrayList = mo89635G5;
        }
        List<Bullet> bullets = dataDialog.getBody().getBullets();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bullets, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Bullet bullet : bullets) {
            arrayList2.add(BulletUI.Companion.from(bullet));
        }
        mo89518u.mo89503z(arrayList2);
        arrayList = arrayList2;
        ModalBottomSheetContent(text, text3, onClickableTextClick, (List) arrayList, text5, dataDialog.getCta(), text4, onConfirmModalClick, mo89518u, ((i << 3) & 896) | 2134088 | ((i << 15) & 29360128));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ModalBottomSheetContentKt$DataAccessBottomSheetContent$1(dataDialog, onClickableTextClick, onConfirmModalClick, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r2 == p000.InterfaceC32720Et0.f8257a.m108267a()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegalDetailsBottomSheetContent(LegalDetailsNotice legalDetails, Function1<? super String, Unit> onClickableTextClick, Function0<Unit> onConfirmModalClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int collectionSizeOrDefault;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(legalDetails, "legalDetails");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(onConfirmModalClick, "onConfirmModalClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(12288811);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(12288811, i, -1, "com.stripe.android.financialconnections.features.common.LegalDetailsBottomSheetContent (ModalBottomSheetContent.kt:67)");
        }
        boolean mo89539n = mo89518u.mo89539n(legalDetails.getTitle());
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new TextResource.Text(ServerDrivenUiKt.fromHtml(legalDetails.getTitle()));
            mo89518u.mo89503z(mo89635G);
        }
        TextResource.Text text = (TextResource.Text) mo89635G;
        boolean mo89539n2 = mo89518u.mo89539n(legalDetails.getLearnMore());
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(legalDetails.getLearnMore()));
            mo89518u.mo89503z(mo89635G2);
        }
        TextResource.Text text2 = (TextResource.Text) mo89635G2;
        boolean mo89539n3 = mo89518u.mo89539n(legalDetails.getBody().getBullets());
        Object mo89635G3 = mo89518u.mo89635G();
        if (!mo89539n3) {
            arrayList = mo89635G3;
        }
        List<Bullet> bullets = legalDetails.getBody().getBullets();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bullets, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Bullet bullet : bullets) {
            arrayList2.add(BulletUI.Companion.from(bullet));
        }
        mo89518u.mo89503z(arrayList2);
        arrayList = arrayList2;
        ModalBottomSheetContent(text, null, onClickableTextClick, (List) arrayList, null, legalDetails.getCta(), text2, onConfirmModalClick, mo89518u, ((i << 3) & 896) | 2125880 | ((i << 15) & 29360128));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ModalBottomSheetContentKt$LegalDetailsBottomSheetContent$1(legalDetails, onClickableTextClick, onConfirmModalClick, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalBottomSheetContent(TextResource.Text text, TextResource.Text text2, Function1<? super String, Unit> function1, List<BulletUI> list, TextResource textResource, String str, TextResource textResource2, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        G26 m105921d;
        Map emptyMap;
        G26 m105921d2;
        GN5 m105174a;
        GN5 m105174a2;
        Map mapOf;
        int i2;
        int i3;
        G26 m105921d3;
        GN5 m105174a3;
        GN5 m105174a4;
        Map mapOf2;
        G26 m105921d4;
        GN5 m105174a5;
        GN5 m105174a6;
        Map mapOf3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1153043607);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1153043607, i, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetContent (ModalBottomSheetContent.kt:94)");
        }
        C37135Xp5 m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
        mo89518u.mo89638F(-483455358);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
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
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
        mo89518u.mo89638F(286916915);
        float f = 24;
        InterfaceC41563gV2 m94184i = ND3.m94184i(C36433Up5.m80787d(c35465Qm0.mo87992a(c20912a, 1.0f, false), m80790a, false, null, false, 14, null), C43705k61.m29303g(f));
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
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
        C38680bf6.m64191b(m64192a2, m91546a2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        mo89518u.mo89638F(1346477565);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        m105921d = r20.m105921d((r42 & 1) != 0 ? r20.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), (r42 & 2) != 0 ? r20.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r20.f10827a.m105161n() : null, (r42 & 8) != 0 ? r20.f10827a.m105163l() : null, (r42 & 16) != 0 ? r20.f10827a.m105162m() : null, (r42 & 32) != 0 ? r20.f10827a.m105166i() : null, (r42 & 64) != 0 ? r20.f10827a.m105165j() : null, (r42 & 128) != 0 ? r20.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r20.f10827a.m105170e() : null, (r42 & 512) != 0 ? r20.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r20.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r20.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r20.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r20.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r20.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r20.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r20.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getHeading().f10828b.m110649m() : null);
        emptyMap = MapsKt__MapsKt.emptyMap();
        int i4 = (i >> 3) & 112;
        TextKt.AnnotatedText(text, function1, m105921d, null, emptyMap, mo89518u, i4 | 24584, 8);
        mo89518u.mo89638F(446955288);
        if (text2 == null) {
            i2 = 2;
        } else {
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(4)), mo89518u, 6);
            m105921d2 = r21.m105921d((r42 & 1) != 0 ? r21.f10827a.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), (r42 & 2) != 0 ? r21.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r21.f10827a.m105161n() : null, (r42 & 8) != 0 ? r21.f10827a.m105163l() : null, (r42 & 16) != 0 ? r21.f10827a.m105162m() : null, (r42 & 32) != 0 ? r21.f10827a.m105166i() : null, (r42 & 64) != 0 ? r21.f10827a.m105165j() : null, (r42 & 128) != 0 ? r21.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r21.f10827a.m105170e() : null, (r42 & 512) != 0 ? r21.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r21.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r21.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r21.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r21.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r21.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r21.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r21.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getBody().f10828b.m110649m() : null);
            StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
            m105174a = r21.m105174a((r35 & 1) != 0 ? r21.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r21.f11830b : 0L, (r35 & 4) != 0 ? r21.f11831c : null, (r35 & 8) != 0 ? r21.f11832d : null, (r35 & 16) != 0 ? r21.f11833e : null, (r35 & 32) != 0 ? r21.f11834f : null, (r35 & 64) != 0 ? r21.f11835g : null, (r35 & 128) != 0 ? r21.f11836h : 0L, (r35 & 256) != 0 ? r21.f11837i : null, (r35 & 512) != 0 ? r21.f11838j : null, (r35 & 1024) != 0 ? r21.f11839k : null, (r35 & 2048) != 0 ? r21.f11840l : 0L, (r35 & 4096) != 0 ? r21.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetail().m105925L().f11842n : null);
            StringAnnotation stringAnnotation2 = StringAnnotation.BOLD;
            m105174a2 = r21.m105174a((r35 & 1) != 0 ? r21.m105168g() : financialConnectionsTheme.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), (r35 & 2) != 0 ? r21.f11830b : 0L, (r35 & 4) != 0 ? r21.f11831c : null, (r35 & 8) != 0 ? r21.f11832d : null, (r35 & 16) != 0 ? r21.f11833e : null, (r35 & 32) != 0 ? r21.f11834f : null, (r35 & 64) != 0 ? r21.f11835g : null, (r35 & 128) != 0 ? r21.f11836h : 0L, (r35 & 256) != 0 ? r21.f11837i : null, (r35 & 512) != 0 ? r21.f11838j : null, (r35 & 1024) != 0 ? r21.f11839k : null, (r35 & 2048) != 0 ? r21.f11840l : 0L, (r35 & 4096) != 0 ? r21.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(mo89518u, 6).getDetailEmphasized().m105925L().f11842n : null);
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a), TuplesKt.m28425to(stringAnnotation2, m105174a2));
            i2 = 2;
            TextKt.AnnotatedText(text2, function1, m105921d2, null, mapOf, mo89518u, i4 | 8, 8);
            Unit unit = Unit.INSTANCE;
        }
        mo89518u.mo89605Q();
        mo89518u.mo89638F(1188055061);
        for (BulletUI bulletUI : list) {
            DN5.m110552a(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(16)), mo89518u, 6);
            BulletItem(bulletUI, function1, mo89518u, i4);
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a2, C43705k61.m29303g(f), 0.0f, C43705k61.m29303g(f), C43705k61.m29303g(f), 2, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a3 = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m94180m);
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
        C38680bf6.m64191b(m64192a3, m91546a3, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm02 = C35465Qm0.f30887a;
        mo89518u.mo89638F(1264826470);
        mo89518u.mo89638F(446956494);
        if (textResource != null) {
            FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
            m105921d4 = r19.m105921d((r42 & 1) != 0 ? r19.f10827a.m105168g() : financialConnectionsTheme2.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r19.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r19.f10827a.m105161n() : null, (r42 & 8) != 0 ? r19.f10827a.m105163l() : null, (r42 & 16) != 0 ? r19.f10827a.m105162m() : null, (r42 & 32) != 0 ? r19.f10827a.m105166i() : null, (r42 & 64) != 0 ? r19.f10827a.m105165j() : null, (r42 & 128) != 0 ? r19.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r19.f10827a.m105170e() : null, (r42 & 512) != 0 ? r19.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r19.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r19.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r19.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r19.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r19.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r19.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r19.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getCaption().f10828b.m110649m() : null);
            Pair[] pairArr = new Pair[i2];
            StringAnnotation stringAnnotation3 = StringAnnotation.CLICKABLE;
            m105174a5 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme2.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
            pairArr[0] = TuplesKt.m28425to(stringAnnotation3, m105174a5);
            StringAnnotation stringAnnotation4 = StringAnnotation.BOLD;
            m105174a6 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme2.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme2.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
            pairArr[1] = TuplesKt.m28425to(stringAnnotation4, m105174a6);
            mapOf3 = MapsKt__MapsKt.mapOf(pairArr);
            i3 = 16;
            TextKt.AnnotatedText(textResource, function1, m105921d4, null, mapOf3, mo89518u, ((i >> 12) & 14) | ((i >> 3) & 112), 8);
            DN5.m110552a(BB5.m114246w(c20912a2, C43705k61.m29303g(12)), mo89518u, 6);
        } else {
            i3 = 16;
        }
        mo89518u.mo89605Q();
        FinancialConnectionsTheme financialConnectionsTheme3 = FinancialConnectionsTheme.INSTANCE;
        m105921d3 = r19.m105921d((r42 & 1) != 0 ? r19.f10827a.m105168g() : financialConnectionsTheme3.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r42 & 2) != 0 ? r19.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r19.f10827a.m105161n() : null, (r42 & 8) != 0 ? r19.f10827a.m105163l() : null, (r42 & 16) != 0 ? r19.f10827a.m105162m() : null, (r42 & 32) != 0 ? r19.f10827a.m105166i() : null, (r42 & 64) != 0 ? r19.f10827a.m105165j() : null, (r42 & 128) != 0 ? r19.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r19.f10827a.m105170e() : null, (r42 & 512) != 0 ? r19.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r19.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r19.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r19.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r19.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r19.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r19.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r19.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme3.getTypography(mo89518u, 6).getCaption().f10828b.m110649m() : null);
        Pair[] pairArr2 = new Pair[i2];
        StringAnnotation stringAnnotation5 = StringAnnotation.CLICKABLE;
        m105174a3 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme3.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme3.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
        pairArr2[0] = TuplesKt.m28425to(stringAnnotation5, m105174a3);
        StringAnnotation stringAnnotation6 = StringAnnotation.BOLD;
        m105174a4 = r19.m105174a((r35 & 1) != 0 ? r19.m105168g() : financialConnectionsTheme3.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), (r35 & 2) != 0 ? r19.f11830b : 0L, (r35 & 4) != 0 ? r19.f11831c : null, (r35 & 8) != 0 ? r19.f11832d : null, (r35 & 16) != 0 ? r19.f11833e : null, (r35 & 32) != 0 ? r19.f11834f : null, (r35 & 64) != 0 ? r19.f11835g : null, (r35 & 128) != 0 ? r19.f11836h : 0L, (r35 & 256) != 0 ? r19.f11837i : null, (r35 & 512) != 0 ? r19.f11838j : null, (r35 & 1024) != 0 ? r19.f11839k : null, (r35 & 2048) != 0 ? r19.f11840l : 0L, (r35 & 4096) != 0 ? r19.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme3.getTypography(mo89518u, 6).getCaptionEmphasized().m105925L().f11842n : null);
        pairArr2[1] = TuplesKt.m28425to(stringAnnotation6, m105174a4);
        mapOf2 = MapsKt__MapsKt.mapOf(pairArr2);
        TextKt.AnnotatedText(textResource2, function1, m105921d3, null, mapOf2, mo89518u, ((i >> 18) & 14) | ((i >> 3) & 112), 8);
        DN5.m110552a(BB5.m114246w(c20912a2, C43705k61.m29303g(i3)), mo89518u, 6);
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(function0);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new ModalBottomSheetContentKt$ModalBottomSheetContent$1$2$1$1(function0);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        ButtonKt.FinancialConnectionsButton((Function0) mo89635G, BB5.m114255n(c20912a2, 0.0f, 1, null), null, null, false, false, C43575jt0.m29791b(mo89518u, 177168173, true, new ModalBottomSheetContentKt$ModalBottomSheetContent$1$2$2(str, i)), mo89518u, 1572912, 60);
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
        mo89512w.mo20405a(new ModalBottomSheetContentKt$ModalBottomSheetContent$2(text, text2, function1, list, textResource, str, textResource2, function0, i));
    }
}
